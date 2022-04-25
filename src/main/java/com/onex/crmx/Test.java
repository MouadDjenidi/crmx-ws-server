package com.onex.crmx;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	  public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";
	        char[] array = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','v','w','x','y','z'};
	        
	        String[] stringArray = new String[s.length()-(k-1)];
	        System.out.println(s.length());
	        for(int i = 0; i < s.length()-(k+1); i++){
	             stringArray[i] = s.substring(i,k+i);
	        }
	        System.out.println(Arrays.toString(stringArray));
	        int smai = 0;
	        int bigi = 0;
	        int tmp = 0;
	        
	        int[] ttt = new int[s.length()];
            for(int i = 0 ; i < stringArray.length ; i++) { 
            	tmp = 0;
            	for(int t = 0 ; t < array.length; t++ ) {
            		  if(stringArray[i].charAt(0) == array[t]) {
            			  tmp = t ; 
            			  break;
            		  }            		
            	}
                if(i == 0) {
                	smai = tmp;
                	bigi = tmp;
                	smallest = stringArray[i];
                	largest = stringArray[i];
                }
                if(smai  > tmp) {
                	smai = tmp;
                	smallest = stringArray[i];
                }
                if(bigi < tmp) {
                	bigi = tmp ;
          	        largest = stringArray[i];
                }
            	ttt[i] = tmp;
            }
            System.out.println(Arrays.toString(ttt));
	        return smallest + "\n" + largest;
	    }
	  
	  


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
	    }

}
