package com;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Test1 {

	public static void main(String[] args) {
		Pattern pt =Pattern.compile("Java");
		Matcher mt =pt.matcher("Java");
		if (mt.matches()) {
			System.out.println("Both are equal");
		}else {
			System.out.println("Notequal");
		}
	}

}
