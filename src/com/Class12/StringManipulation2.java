package com.Class12;

public class StringManipulation2 {

public static void main(String[] args) {
        
        String str="Good Morning, students!";
        boolean contains=str.contains("Morning");//Statement is true b/c above String has “Morning” and not”morning”
        System.out.println(contains);//case sensitive so if it is off it will be false
        
        String present="Welcome, Yessica";
        String neededValue="Welcome,";
        
        boolean flag=present.contains(neededValue);
        System.out.println(flag);
        
        boolean flag1=present.toLowerCase().contains(neededValue);
        System.out.println(flag1);
        
        
        System.out.println("-----Starts with and Ends with-------");
        String str1="syntax";
        
        boolean starts=str1.startsWith("s");
        System.out.println(starts);//true
        
        System.out.println(str1.endsWith("y"));//false
        
        
        System.out.println("----isEmpty----");
        String str2= "Hello";
        boolean isEmpty=str2.isEmpty();
        System.out.println(isEmpty);
        
        System.out.println("----Concat-----");
        String str3="Hello ";
        String str4="Christian";
        
        System.out.println(str3+str4);//OR
        System.out.println(str3.concat(str4));//faster way puts both together
        
        
        System.out.println("-------------");
        String expected= "You may qualify for a multi-policy discount!";
        String actual= " You may qualify for a multi-policy discount!    ";
                
        System.out.println(expected.contentEquals(actual));
        
        actual= actual.trim();
        System.out.println(expected.contentEquals(actual));
        System.out.println(actual.trim());//this straight up trims the whole statement and prints it out.
}
}