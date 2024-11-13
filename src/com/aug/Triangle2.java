package com.aug;

public class Triangle2 {
	public static void main(String[] args)
	{
		System.out.println("UPPER TRIANGLE    :");
		System.out.println("  ");

		
		for(int i=1;i<=5;i++) {
			for(int s=1;s<=5-i;s++)   //space
				{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)   //*
				{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("LOWER TRIANGLE  : ");
		System.out.println("  ");

		
		for(int i=5;i>=1;i--) {
			for(int s=1;s<=5-i;s++)   //space
				{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)   //*
				{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		System.out.println("DIAMOND ");
		System.out.println("  ");
		
		for(int i=1;i<=5;i++) {
			for(int s=1;s<=5-i;s++)   //space
				{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)   //*
				{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--) {
			for(int s=1;s<=5-i;s++)   //space
				{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)   //*
				{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
