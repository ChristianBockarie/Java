package myownpractice;

public class P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating two matrices  
		int y[][]={{1,1,1},{2,2,2},{3,3,3}};  
		int z[][]={{1,1,1},{2,2,2},{3,3,3}};  
		  
		//creating another matrix to store the multiplication of two matrices  
		int c[][]=new int[3][3];  //3 rows and 3 columns
		  
		//multiplying and printing multiplication of 2 matrices  
		for(int i=0;i<3;i++){  
		for(int j=0;j<3;j++){  
		c[i][j]=0;    
		for(int k=0;k<3;k++)    
		{    
		c[i][j]+=z[i][k]*y[k][j];    
		}//end of k loop
		System.out.print(c[i][j]+" ");  //printing matrix element
		}//end of j loop
		System.out.println();//new line  
		}  
		
		
		
		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };
		int b = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if ((a[i][j] < 0) && (a[i][j] % 2 != 0)) {
					b = b + 1;
				}
			}
		}
		System.out.println(b);

	}
}