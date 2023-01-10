package org.launchcode.java.studios.areaofacircle;


//There are multiple ways to approach this task, but one way involves the following steps:
//Loop through the string one character at a time,
//Store and/or update the count for a given character using an appropriate data structure.
//Loop through the data structure to print the results (one character and its count per line).
//Which type of data structure (ArrayList, HashMap, or Array) should you use to store character counts? there is a BEST choice.
//You’ll need to initialize the counts for the characters in some fashion.
// It’s probably better to do this as you go through the string instead of doing so before you loop through it. (WHY?)

import java.util.HashMap;
import java.util.Map;


public class ThirdClassStudio {
     public static void main(String... args){

     HashMap<Character, Integer>  charCount = new HashMap<>();

     String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

    char[] charactersInString = quote.toCharArray();


    for(char c: charactersInString) {
        if(charCount.containsKey(c)){
            charCount.put(c, charCount.get(c) + 1);
        }else {
            charCount.put(c, 1);
        }
    }

    for(Map.Entry entry : charCount.entrySet()){
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }

  }
}