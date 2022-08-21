package week3.day1.assignment3;

import org.apache.poi.util.SystemOutLogger;

public class ReverseEvenWords {
	public static void main(String[] args) {
		
	
		String test="I am a Software Tester who learned from Testleaf";
		String[] s= test.split(" ");
		String rev="";
		
		for (int i=0;i<=s.length-1;i++) {
			if(i%2!=0) {
				char[] word=s[i].toCharArray();
				for(int j=word.length-1;j>=0;j--) {
					rev=rev+word[j];
				}
					System.out.print(rev);
					System.out.print(" ");
					rev=" ";
				}
			else {
				
				System.out.print(s[i]);
				System.out.print(" ");
			}
		}
	}
}