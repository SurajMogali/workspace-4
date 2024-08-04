package com.demo.easy;

public class CountCamelCaseWords {
	
	int countCamelCaseWords(String str)
	{
		int count=0;
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isUpperCase(ch[i]))
			{
				count++;
				
			}
		}
		
		return count+1;
	}

	public static void main(String[] args) {
	CountCamelCaseWords ccw=new CountCamelCaseWords();
	System.out.println(ccw.countCamelCaseWords("oneTwoThreeJack"));
		

	}

}
