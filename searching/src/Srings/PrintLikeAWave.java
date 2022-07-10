package Srings;

import java.util.Scanner;

public class PrintLikeAWave {

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
				if(c%2==0) {
					
						for(int j=0;j<col;j++) {
							 System.out.print(arr[j][c]+" ");
						}
				}else {
					
						for(int j=col-1;j>=0;j--) {

							 System.out.print(arr[j][c]+" ");
						}
				}
			
			}
}

}