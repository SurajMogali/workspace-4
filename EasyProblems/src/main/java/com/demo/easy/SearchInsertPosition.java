package com.demo.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchInsertPosition {
	
	int givePosition(int key)
	{
		
		int arr[]= {1,2,4,5};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}	
			
				
				List<Integer> list1=new ArrayList<>();
				for(int j=0;j<arr.length;j++)
				{
					list1.add(arr[j]);
					
				}
				list1.add(key);
				
				Collections.sort(list1);
				
				if(list1.contains(key))
					return list1.indexOf(key);
				else
					return 0;
				
				
				
				
		
		
	
	
	}

	public static void main(String[] args) {
		
		SearchInsertPosition sip=new SearchInsertPosition();
		System.out.println(sip.givePosition(6));
		
		
		

	}

}
