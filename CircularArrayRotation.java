package com.Nani;

public class CircularArrayRotation {

	public static void main(String[] args) {
		
		int[]a= {3,4,5};
		int k=2;
		int []res=isCircularArrayRotation(a,k);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
	

	}
	
	
	public static int[] isCircularArrayRotation(int[]a, int k)
	{
		int[]b=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[(i+k)%a.length]=a[i];
			
		}
		return b;
	}

}
