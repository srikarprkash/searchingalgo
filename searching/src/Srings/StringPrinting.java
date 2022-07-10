package Srings;

public class StringPrinting {

	public static void main(String[] args) {
	String s="ab";
	int k=1;
			for(int i=0;i<s.length();i++) {
				for(int j=i;j<s.length();j++) {
				System.out.println(s.substring(i, j+1));
			}
				//k++;
				}
//			int k=1;
//			for(int i=0;i<s.length();i++) {
//				System.out.println(s.substring(0, k));
//			k++;
//			}
	
//	int i=0;int j=0;int k=1;
//	while(i<s.length()&&j<s.length()&&k<s.length()) {
//		j=i;
//		System.out.println(s.substring(j, k));
//		i++;
//		k++;
//	}
	
	}

}
