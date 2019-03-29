package com.class7;

public class PostIncrementAndDecrement {

	public static void main(String[] args) {
		// post increment and post decrement
		/*a++; increment
		 *a--; decrement
		 */
		
		//post increment
		int a=299;
		int b=a++;//first assign then increment (int a=b; b=a+1)
		
		System.out.println(a);//300
		System.out.println(b);//299
		
		//post decrement
		int c=10;
		int d=c--;//first assign then decrement (int d=c; c=c-1)
		
		System.out.println(c);//9
		System.out.println(d);//10
	}

}
