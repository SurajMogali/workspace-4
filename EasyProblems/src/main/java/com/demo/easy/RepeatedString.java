package com.demo.easy;

public class RepeatedString {
	private int repeatedString(String str1,int n)
	{
		
		
		String str2="";
		char ch1[]=str1.toCharArray();
		
		for(int i=0;i<=n*2;i++)
		{
			str2 = str2.concat(str1);
			
		}
		
		System.out.println(str2);
		
		char ch2[]=str2.toCharArray();
		int count=0;
		
		
		
		
		for(int i=0;i<n;i++)
		{
			if(ch2[i]=='a')
			{
				count++;
			}
		}
		
		return count;
		
		
		
	}

	public static void main(String[] args) {
		
		RepeatedString rs=new RepeatedString();
		System.out.println(rs.repeatedString("abcac", 10));
		

	}

}
