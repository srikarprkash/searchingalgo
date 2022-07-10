package searching;

import java.util.Scanner;

public class SelectingSort {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int array[]=new int[size];
	for(int i=0;i<size;i++) {
		array[i]=sc.nextInt();
		}
	
	for(int j=0;j<size-1;j++) {
		int minIndex=j,min=array[j];
		for(int i=j+1;i<size;i++) {
		if(array[i]<min) {
			min=array[i];
			minIndex=i;
		}
		}
		if(minIndex!=j) {
			array[minIndex]=array[j];
			array[j]=min;
		}
	}
	for(int i=0;i<size;i++) {
		System.out.print(array[i]+" ");
		}
	}

}
