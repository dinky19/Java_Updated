package com.java.lambda;

import java.util.ArrayList;  
import java.util.List; 

public class ForeachDemo
{  
    public static void main(String[] args)
    {  
        List<String> gamesList = new ArrayList<String>();  
        gamesList.add("Football");  
        gamesList.add("Cricket");  
        gamesList.add("Chess");  
        gamesList.add("Hocky");  
        //System.out.println("Iterating by passing method reference");  
        gamesList.forEach(System.out::println);  
    }  
}  

/*Arrays.asList("a1", "a2", "a3")
.stream()
.findFirst()
.ifPresent(System.out::println); */
