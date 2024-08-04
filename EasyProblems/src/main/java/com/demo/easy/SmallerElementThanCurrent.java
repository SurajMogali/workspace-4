package com.demo.easy;

public class SmallerElementThanCurrent {
	
	int[] smallerElementsthanCurrent(int[] arr)
	{
		int buckets[]=new int[102];
		
		for(int num:arr)
		{
			buckets[num]++;
			
			
		}
		
		for(int i=1;i<buckets.length;i++)
		{
			buckets[i]=+buckets[i-1];
		}
		
		int result[]=new int[arr.length];
		
		
		for(int i=0;i<result.length;i++)
		{
			if(arr[i]==0)
			{
				result[i]=0;
			}
			else
			{
				result[i]=buckets[arr[i]-1];
			}
			
		}
		
		return result;
		
	}
	

	public static void main(String[] args) {
		
		SmallerElementThanCurrent setc=new  SmallerElementThanCurrent();
		int arr[]= {8,1,2,2,3};
		System.out.println(setc.smallerElementsthanCurrent(arr));
		
		
		
	
		
		
		
		
		
		

	}

}
