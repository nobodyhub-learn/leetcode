package com.nobodyhub.leetcode;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 31/12/2017
 */
public class EncodeAndDecodeTinyURLTest {
    @Test
    public void test() {
        Matcher m = Pattern.compile(EncodeAndDecodeTinyURL.urlPattern).matcher("https://docs.oracle.com:8080/javase/Pattern.html");
        assertEquals(true, m.find());
        assertEquals("https", m.group(1));
        assertEquals("docs.oracle.com", m.group(2));
        assertEquals("8080", m.group(3));
        assertEquals("/javase/Pattern.html", m.group(4));
    }

    @Test
    public void test01() {
        Matcher m = Pattern.compile(EncodeAndDecodeTinyURL.urlPattern).matcher("http://docs.oracle.com/5072545abff64e7db492fb3c3f907d35");
        assertEquals(true, m.find());
        assertEquals("http", m.group(1));
        assertEquals("docs.oracle.com", m.group(2));
        assertEquals(null, m.group(3));
        assertEquals("/5072545abff64e7db492fb3c3f907d35", m.group(4));
    }

    @Test
    public void test1() {
        EncodeAndDecodeTinyURL solution = new EncodeAndDecodeTinyURL();
        solution.encode("https://docs.oracle.com:8080/javase/Pattern.html");
        for (String key : solution.urlMap.keySet()) {
            assertEquals("https://docs.oracle.com:8080/javase/Pattern.html", solution.decode("http://docs.oracle.com/" + key));
        }
    }
}