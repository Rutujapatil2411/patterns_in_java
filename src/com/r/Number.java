package com.r;

public class Number {
public static void main(String[] args) {
	
	
	System.out.println("*********************************");
	for(int i=1;i<=5;i++) 
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(i);
			System.out.print(" ");

		}
		System.out.println( );
	}
	int num=5;
	
	for(int i=num;i>=1;i--) 
	{
		for(int j=num;j>=i;j--)
		{
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println( );
	}
	
	System.out.println("*********************************");
	
  int n=5;
	
	for(int i=n;i>=1;i--) 
	{
		for(int j=n;j>=i;j--)
		{
			System.out.print("" +j);
			System.out.print(" ");
		}
		System.out.println( );
	}
	System.out.println("*********************************");
	
	 for(int i=1;i<=5;i++) {
		 for(int j=1;j<=i;j++) {
			 System.out.print(j);
			 System.out.print(" ");
		 }System.out.println( );
	 }
	
	
	 
	 System.out.println("*********************************");
		
	 for(int i=1;i<=5;i++) {
		 for(int j=1;j<=i;j++) {
			 System.out.print(i);
			 System.out.print(" ");
		 }System.out.println( );
	 }
	
	 System.out.println("*********************************");
	 
	 String str="INDIA";
	 for(int i=0;i<str.length();i++) {
		 for(int j=0;j<=i;j++) {
			 System.out.print(str.charAt(j));
			 System.out.print(" ");
		 }
		 System.out.println();		 
	 }
	 
	System.out.println("*********************************");
	
	char i; char j;
	for(i='A';i<='E';i++) {
		for(j='A';j<=i;j++) {
			System.out.print(j);
			System.out.print(" ");
		}
		System.out.print(" \n");
	}
	
	
	
	System.out.println("*********************************");


	for(i='A';i<='E';i++) {
		for(j='A';j<=i;j++) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.print(" \n");
	}
	System.out.println("*********************************");
	char ch='A';
      
	for(int rows=1;rows<=5;rows++) {
            	
            	for(int col=1;col<=rows;col++) {
            		System.err.print(ch+" ");
            		ch++;
            	}
            	System.out.println();
            	
            }
	System.out.println("*********************************");
	char chr = 'A';
	for(i=1;i<=5;i++) {
		
		for(j=1;j<=i;j++) {
			
			System.out.print(chr+" ");
		
		}
		chr++;
		System.out.println();
	}

}
}
