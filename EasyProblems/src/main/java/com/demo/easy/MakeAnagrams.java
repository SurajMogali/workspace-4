package com.demo.easy;

import java.util.Arrays;

public class MakeAnagrams {
	
	public int makeAnagrams(String str1,String str2)
	{
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(ch1.length>ch2.length)
		{
			return ch1.length-ch2.length;
		}
		
			
			return ch2.length-ch1.length;
			
		
	
	}

	public static void main(String[] args) {
		
		MakeAnagrams makeAnagrams=new MakeAnagrams();
		System.out.println(makeAnagrams.makeAnagrams("rat", "rat678"));
		

	}

}
