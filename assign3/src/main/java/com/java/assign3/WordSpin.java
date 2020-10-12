package com.java.assign3;

public class WordSpin {
	public String spinWord(String str)
	   {
		String[] words = str.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++)
	        {
	           String word = words[i]; 
	           String reverseWord = "";
	           for (int j = word.length()-1; j >= 0; j--) 
		   {
			reverseWord = reverseWord + word.charAt(j);
		   }
		   reversedString = reversedString + reverseWord + " ";
		}
		/*System.out.println(str);
		System.out.println(reversedString);*/
		return reversedString;
	   }
	  /* public static void main(String[] args) 
	   {
		   AssignThree obj = new AssignThree();
		obj.spinWord("Welcome to BeginnersBook");
		obj.spinWord("This is an easy Java Program");
	   }*/
}

