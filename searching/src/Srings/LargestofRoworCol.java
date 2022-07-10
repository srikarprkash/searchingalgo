package Srings;

import java.time.chrono.MinguoChronology;
import java.util.Scanner;

public class LargestofRoworCol {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int [row][col];
		int a[]=new int[row];
		int a1[]=new int[col];
		int t=0;
		int t1=0;
		int largest = Integer.MIN_VALUE;
		int largest1 = Integer.MIN_VALUE;
		for (int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
			}
		
			for (int i=0;i<row;i++) {
				int sum=0;
				for(int j=0;j<col;j++) {
					sum+=arr[i][j];
				}
				a[i]=sum;
				if(sum>largest) {
					largest=sum;
				    t=i;
				}
	}
			
				for (int i=0;i<row;i++) {
					int sum1=0;
					for(int j=0;j<col;j++) {
						sum1+=arr[j][i];
					}
					a1[i]=sum1;
					if(sum1>largest1) {
						largest1=sum1;
					    t1=i;
					}
					}
				
//				for(int i=0;i<a.length;i++) {
//					if(largest==a[i]) {
//							 t=i;
//						}
//					}
//				
//				for(int i=0;i<a.length;i++) {
//					if(largest==a1[i]) {
//							 t1=i;
//						}
//					}
//				
				if(largest>largest1) {
					System.out.println("row  "+t+" "+largest);
				}else {
					System.out.println("colum  "+t1+ " "+ largest1);
				}
				
	}

}
