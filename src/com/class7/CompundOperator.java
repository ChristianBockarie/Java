package com.class7;

public class CompundOperator {
	public static void main(String[] args) {
		
		/*1. Declare variable and increase by 100 using shorthand operator
        * 2. Declare variable and decrease by 67 using shorthand operator
        * 3. Declare variable cakePiece=11 and divide cakePiece between 4 people using shorthand operator each person should get an equal piece of cake
        * 4. Declare variable cakePiece=25 and divide cakePiece between 7 people
        *using shorthand operator found out how many pieces of cake left after it was distributed equally among 7 people
		*/
		
		int a=100;
		a+=100;
		System.out.println(a);
		
		int b=100;
		b-=67;
		System.out.println(b);
		
		double cakePiece=11;
		cakePiece/=4;
		System.out.println(cakePiece);
		
		double cakePieces=25;
		cakePieces%=7;
		System.out.println(cakePieces);
		
		
		
		
		
		
	}
}
