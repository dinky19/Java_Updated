package com.java.lambda;

interface sayable{  
    void say(String msg);  
}  

public class FunctionalInterface {
	 
	    public void say(String msg){  
	        System.out.println(msg);  
	    }  
	    
	    public static void main(String[] args) {  
	        FunctionalInterface fie = new FunctionalInterface();  
	        fie.say("Hello there");  
	    }  
	}  
