package Srings;

import java.util.Scanner;

public class Counting {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	//System.out.println(s.length());
	
//	int count=1;
//	for(int i=0;i<s.length();i++) {
//		if(s.charAt(i)==' ') {
//			count++;
//		}
//	}
//	System.out.println(count);
	int i=0;
	int j=s.length()-1;
	boolean count=true;
	while(i<j) {
		if( s.charAt(i)!=s.charAt(j)) {
			count=false;
			break;
		}
		
		i++;
		j--;
	}
	
	System.out.println(count);

	
	}

}
