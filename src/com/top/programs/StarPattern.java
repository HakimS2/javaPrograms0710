package com.top.programs;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Pattern 1---------------");	
		
		for(int i=1; i<=20; i++) {
			
			for(int j=1; j<=i; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("Pattern 2---------------");	
		
for(int i=1; i<=20; i++) {
			
	if(i==1 && i ==20) {
		for(int j=1; j<=20; j++) {
			
			System.out.print("*");
		}
		
		System.out.println();
	}
		
	}

	}

}
