package com.leet.easy;

/*
 * Implement strStr().
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */

public class ImplementstrStr {
	public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
	
	public static void main(String[] args) {
		ImplementstrStr impStr = new ImplementstrStr();
		System.out.println(impStr.strStr("hello", "ll"));
	}
}
