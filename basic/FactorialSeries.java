package com.java.basic;

public class FactorialSeries {

	public static void main(String[] args)
	{
		
		int j = 1 ;
		
		
		for(int i = 5 ; i >= 1 ; i--)
		{
			j = i * j;
			
			if(i == 1)
			{
				System.out.println(j);
			}
		}
	}
}
