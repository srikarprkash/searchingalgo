package Srings;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayRowSum {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int [row][col];
		int a[]=new int[row];
		for (int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
			}
		int sum=0;
			for (int i=0;i<row;i++) {
				sum=0;
				for(int j=0;j<col;j++) {
					sum+=arr[j][i];
				}
				a[i]=sum;
				System.out.println(sum);
		}
			Arrays.sort(a);
			System.out.println(a[row-1]);
	}

}
