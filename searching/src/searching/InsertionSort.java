package searching;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int array[]=new int[size];
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=1;i<size;i++) {
		int j=i-1,temp=array[i];
		while(j>=0&&array[j]>temp) {
			array[j+1]=array[j];
			j--;
		}
		array[j+1]=temp;
		}
			for(int i=0;i<size;i++) {
				System.out.print(array[i]+" ");
			}
		
	}
}
