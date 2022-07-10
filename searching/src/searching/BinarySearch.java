package searching;

import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int array[]=new int[size];
	for(int i=0;i<size;i++) {
		array[i]=sc.nextInt();
	}
	Arrays.sort(array);
	for(int i=0;i<size;i++) {
		System.out.print(array[i]+" ");
	}
	boolean b=false;
	int t=sc.nextInt();
	for(int j=0;j<=t;j++) {
	int s=sc.nextInt();
	int start=0;
	int end=size-1;
	int mid=(start+end)/2;
	while(start<=end) {
		mid=(start+end)/2;
		if(s==array[mid]) {
			b=true;
			System.out.println(mid);
		System.out.println(array[mid]);
		break;
		}
		 if(s>array[mid]) {
				start=mid+1;
			}
		else  {
			end=mid-1;
		}
	}
	if(b==false) {
	System.out.println("-1");
	}
	}
	}
}
