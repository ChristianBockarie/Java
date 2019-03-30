package com.Class14;

public class NewStringManipulation {

	public static void main(String[] args) {
		// 1 replace()-->will replace all that matches

		String str="I am good tester!1";
		String newStr=str.replace("a", "e");
		System.out.println(newStr);
		
		String newStr1=str.replace("good", "great");
		System.out.println(newStr1);
		//what we are looking for to replace , new value
		String newStr2=str.replace("tester", "programmer");
		System.out.println(newStr2);
		
		String newStr3=str.replace("Tester", "programmer");
		System.out.println(newStr3);
		
		str=str.replace("!", "?");
		System.out.println(str);
		
		str=str.replace("1", "2");
		System.out.println(str);
		
		//2
		
		String str1="12Hello 3234 World 465%^%";
		String replacedNoNumber=str1.replaceAll("[0-9]", "");//when you use integer, only numbers in the statement will be replaced
		System.out.println(replacedNoNumber);
		
		String newString=replacedNoNumber.replaceAll("[^A-Z a-z]", "");//^ means not
		System.out.println(newString);
		
		String replaceNoCharacter=replacedNoNumber.replaceAll("[A-Za-z]", "");
		System.out.println(replaceNoCharacter);
		
		String rep="1Hello123";
		System.out.println(rep.replaceAll("[^0-9]", ""));
	}

}
