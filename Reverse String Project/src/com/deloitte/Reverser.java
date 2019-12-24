package com.deloitte;
class Reverser
{
   
	String reversal(String getString)
	{   int length=getString.length();
	    String reverse = "";
		for (int i = length - 1 ; i >= 0 ; i--)
		{
		     reverse = reverse + getString.charAt(i);
		}
		     return reverse;
		
	}



}