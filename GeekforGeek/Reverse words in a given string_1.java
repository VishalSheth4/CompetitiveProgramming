/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class GFG {
	public static void main (String[] args) {
	    Scanner myObj = new Scanner(System.in);
	    int itr = myObj.nextInt(); 
	    for(int i=0;i<=itr;i++)
	    {
               StringBuilder reverse = new StringBuilder();
    	       String str = myObj.nextLine();
    	       String[] words = str.split("\\.");
    	       int strlength = words.length;
               for(int j = strlength-1; j>=0; j--){
                   if(j!=0){
                   reverse.append(words[j]); 
                   reverse.append('.');
                   }else{
                   reverse.append(words[j]); 
                   }
               }
	       if(i!=0){    	  
    	    System.out.println(reverse);
	       }	    
       }
	}
}