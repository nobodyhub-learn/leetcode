package com.nobodyhub.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ryan
 * @since 30/12/2017
 */
public class EncodeAndDecodeTinyURL {
    protected final Map<String, String> urlMap = new HashMap<String, String>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String uuid = getPath(longUrl);
        urlMap.put(uuid, longUrl);
        return "http://" + getHost(longUrl) + "/" + uuid;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String token = getPath(shortUrl).substring(1);
        return urlMap.get(token);
    }

    protected String getHost(String url) {
        int pos1 = url.indexOf("/");
        int pos2 = url.substring(pos1 + 1).indexOf("/") + pos1 + 1;
        int pos3 = url.substring(pos2 + 1).indexOf("/") + pos2 + 1;
        return url.substring(pos2 + 1, pos3);
    }

    protected String getPath(String url) {
        int pos1 = url.indexOf("/");
        int pos2 = url.substring(pos1 + 1).indexOf("/") + pos1 + 1;
        int pos3 = url.substring(pos2 + 1).indexOf("/") + pos2 + 1;
        return url.substring(pos3);
    }
}
