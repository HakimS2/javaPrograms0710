package com.top.programs;

import java.util.Scanner;

public class WAP_For_Vowels_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter string for count vowels...");

		Scanner sc = new Scanner(System.in);

		String input_String = sc.nextLine();

		System.out.println("Number charatcers in string --" + input_String.length());


		//Call count vowel method
		int vowelCount = countVowels(input_String);	
		System.out.println("Vowel count is = :" + vowelCount);


		sc.close();

	}



	private static int countVowels(String input_String) {
		// TODO Auto-generated method stub
		int count =0;
		for(int i=0; i<input_String.length(); i++) {

			char ch = Character.toLowerCase(input_String.charAt(i));

			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		return count;

	}

}
