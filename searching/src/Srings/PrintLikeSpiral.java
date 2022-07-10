package Srings;

import java.util.Scanner;

public class PrintLikeSpiral {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int[row][col];

		for (int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
				for(int c=0;c<row;c++) {
					
				for(int j=0;j<col;j++) {
					if(c==0||j==2)
							 System.out.print(arr[c][j]+" ");
							
						}
				}
				for(int c=0;c<row;c++) {
					
					for(int j=0;j<col;j++) {
						if(c==2||j==0)
								 System.out.print(arr[c][j]+" ");
								
							}
					
					
					}
			
			
	}

}
