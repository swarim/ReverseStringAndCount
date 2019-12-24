package com.deloitte;
import java.util.*;
class ReverseString 
{

	public static void main(String[] args) 
	    {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String original=sc.nextLine();
		Reverser reverse=new Reverser();
		CountingVowel count=new CountingVowel();	
		System.out.println("Reverse of the string: " + reverse.reversal(original));
	    System.out.println("Number of vowels in the string: " +count.counter(original) );
		}
}

	
		
	