package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 31/12/2017
 */
public class EncodeAndDecodeTinyURLTest {

    @Test
    public void test() {
        EncodeAndDecodeTinyURL solution = new EncodeAndDecodeTinyURL();
        String url = "https://docs.oracle.com/javase/Pattern.html";
        assertEquals("docs.oracle.com", solution.getHost(url));
        assertEquals("/javase/Pattern.html", solution.getPath(url));
    }


    @Test
    public void test1() {
        EncodeAndDecodeTinyURL solution = new EncodeAndDecodeTinyURL();
        solution.encode("https://docs.oracle.com/javase/Pattern.html");
        for (String key : solution.urlMap.keySet()) {
            assertEquals("https://docs.oracle.com/javase/Pattern.html", solution.decode("http://docs.oracle.com/" + key));
        }
    }
}