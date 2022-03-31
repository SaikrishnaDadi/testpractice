package com.Stringbasics;
import java.util.*;
import java.lang.*;
import java.io.*;

public class reverseString{
 public static void main(String[] args) {

  String str = "Saikrishna";
  String reversed = reverseString(str);                        //create Method and pass input string as parameter
  System.out.println("The reversed string is: " + reversed);
  
 }
 
 public static String reverseString(String input)       //Method take string parameter and check string is empty or not
 {
  if (input.isEmpty()){
   return input;
  }
  return reverseString(input.substring(1)) + input.charAt(0);       //Calling Function Recursively
 }  
 
}