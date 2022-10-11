package zoho;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Calendar;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class summa {
    public static void main(String[] args) throws IOException {
    	
    	String s = "praveen";
        int i,j=0;
        String str="";
        int len = s.length()-1;
        
        for(i=0;i<s.length();i++){
        	if(j < len)
              if(i==j) {                
                    System.out.print(s.charAt(i));
                }
                else if(i+j == s.length()-1){
                
                    System.out.print(s.charAt(j));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        
    
    }
}
