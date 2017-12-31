package com.nobodyhub.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Ryan
 * @since 30/12/2017
 */
public class EncodeAndDecodeTinyURL {
    protected final Map<String, String> urlMap = new HashMap<String, String>();
    protected static final String urlPattern = "(^[^\\/]+)://([^\\/:]+)(?::(\\d+)?)?(.*)";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        urlMap.put(uuid, longUrl);
        return "http://" + getHost(longUrl) + "/" + uuid;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String token = getPath(shortUrl).substring(1);
        return urlMap.get(token);
    }

    protected String getHost(String url) {
        Matcher m = Pattern.compile(urlPattern).matcher(url);
        if (!m.find()) {
            throw new RuntimeException("Malformatted URL!");
        }
        return m.group(2);
    }

    protected String getPath(String url) {
        Matcher m = Pattern.compile(urlPattern).matcher(url);
        if (!m.find()) {
            throw new RuntimeException("Malformatted URL!");
        }
        return m.group(4);
    }


}
