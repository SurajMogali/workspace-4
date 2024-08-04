package com.demo.arrays;


public class Bubble
{

    public void bubblesort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }


        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }


    public static void main( String[] args )
    {
        int arr[]={10,7,9,2,3,4,};
        Bubble bubble=new Bubble();
        bubble.bubblesort(arr);

    }
}
