package com.nobodyhub.leetcode;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 04/12/2017
 */
public class GroupAnagramsTest {
    @Test

    public void test1() {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagrams solution = new GroupAnagrams();
        List<List<String>> actual = solution.groupAnagrams(str);
        List<List<String>> expected = Lists.newArrayList();
        expected.add(Lists.newArrayList("tan", "nat"));
        expected.add(Lists.newArrayList("bat"));
        expected.add(Lists.newArrayList("eat", "tea", "ate"));
        checkResult(expected, actual);
    }

    //["doc"],["bar"],["buy"],["ill"],["may"],["tin"],["cab"],["pew"],["max"],["duh"]
    @Test
    public void test2() {
        String[] str = {"cab", "tin", "pew", "duh", "may", "ill", "buy", "bar", "max", "doc"};
        GroupAnagrams solution = new GroupAnagrams();
        List<List<String>> actual = solution.groupAnagrams(str);
        List<List<String>> expected = Lists.newArrayList();
        expected.add(Lists.newArrayList("duh"));
        expected.add(Lists.newArrayList("bar"));
        expected.add(Lists.newArrayList("cab"));
        expected.add(Lists.newArrayList("buy"));
        expected.add(Lists.newArrayList("ill"));
        expected.add(Lists.newArrayList("may"));
        expected.add(Lists.newArrayList("pew"));
        expected.add(Lists.newArrayList("max"));
        expected.add(Lists.newArrayList("tin"));
        expected.add(Lists.newArrayList("doc"));

        checkResult(expected, actual);
    }

    private void checkResult(List<List<String>> expected, List<List<String>> actual) {
        assertEquals(expected.size(), actual.size());
        for (int idx = 0; idx < expected.size(); idx++) {
            compareList(expected.get(idx), actual.get(idx));
        }
    }

    private void compareList(List<String> expected, List<String> actual) {
        assertEquals(expected.size(), actual.size());
        for (int idx = 0; idx < expected.size(); idx++) {
            assertEquals(expected.get(idx), actual.get(idx));
        }
    }

}