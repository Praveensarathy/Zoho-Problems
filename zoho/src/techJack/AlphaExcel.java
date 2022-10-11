package techJack;

import java.util.ArrayList;
import java.util.Scanner;

public class AlphaExcel {

	public static void main(String[] args) {
		 String s="";
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
	     char c;
	     
	     int m =0;
	     while(n <=0) {
	    	 if(n > 26) {
		    	  m = n-26;
		    	 s += str(m);
		     }
	    	 n = m - 26;
	     }
	     System.out.println(s);
	     
	}
	public static String str (int m) {
		ArrayList<String> list = new ArrayList();
		String s = "";
		char c;
		while(m <= 26) {
	    	 c = (char)(64 + m);
	    	 m = m/26;
	     }
		return s;
	}

}
