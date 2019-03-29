package myownpractice;

public class ReplIt {

	public static void main(String[] args) {
		int[] num = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };
		 for (int i = 0; i < num.length; i++) {

		 if (num[i] % 2 == 0)
		 num[i]+=0;
		 System.out.print(num[i++]);

		 }System.out.println();

		char[] letters = { 's', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x' };
		for (int i = 0; i <= letters.length; i += 2) {
			System.out.print(letters[i]);
		}System.out.println();


	    String [] array={"This", "is", "array", "of", "strings"};
	    
	      System.out.print(array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4]);
	    
	      System.out.println();
	      
	      int[] size = new int[11];
	      size[0]=2010;
	      size[1]=2011;
	      size[2]=2012;
	      size[3]=2013;
	      size[4]=2014;
	      size[5]=2015;
	      size[6]=2016;
	      size[7]=2017;
	      size[8]=2018;
	      size[9]=2019;
	      size[10]=2020;
	      for (int i=0; i<size.length; i++) {
	        System.out.println(size[i]);
	      }
	}

}
