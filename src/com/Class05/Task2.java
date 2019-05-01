package com.Class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("quiz score");
	int quiz = input.nextInt();
	System.out.println("midterm score");
	int midTerm = input.nextInt();
	System.out.println("final score");
	int finalScore = input.nextInt();
	
	int avgScore = quiz+midTerm+finalScore/3;
	System.out.println("Average score is "+avgScore);
	
	if (avgScore>=90) {
		System.out.println("grade = A");
	}else if (avgScore>=70 && avgScore<90) {
		System.out.println("grade = B");
	}else if (avgScore>=50 && avgScore<70) {
		System.out.println("grade = C");
	}else {
		System.out.println("grade = F");
	}

	}

}
