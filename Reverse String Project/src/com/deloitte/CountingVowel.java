package com.deloitte;
class CountingVowel
{
   int counter(String getStr)
   {   int length=getStr.length();
       int count=0;
	   for (int i = length - 1 ; i >= 0 ; i--)
	    {
	    	if(     getStr.charAt(i)=='a' || getStr.charAt(i)=='e' || 
	    			getStr.charAt(i)=='i' || getStr.charAt(i)=='o' ||
	    			getStr.charAt(i)=='u' ||
	    			getStr.charAt(i)=='A' || getStr.charAt(i)=='E' || 
	    			getStr.charAt(i)=='I' || getStr.charAt(i)=='O' ||
	    			getStr.charAt(i)=='U')
	    	{
	    		count++;
	    	}
	    }
	   return count;
   }
}