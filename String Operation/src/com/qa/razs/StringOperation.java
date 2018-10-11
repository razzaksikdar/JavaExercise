package com.qa.razs;

import java.util.ArrayList;
import java.util.Arrays;

public class StringOperation {
	public static void main(String[] args) {
		
	
		 ArrayList<String> al= new ArrayList<String>();
		    al.add("Ram");
	        al.add("Shyam");
	        al.add("10");
	        al.add("8");
	        al.add("8888");
	        al.add("Steve");
	        al.add("Rj");
	        
	        System.out.println("Primary List: "+al);
		
	        for(int i=0; i<al.size(); i++) {
	        	String s=al.get(i);
	           	
           	if(s.length()>2) {
	        		al.remove(i);
	        	}
	        }
	        
           System.out.println("after removal, doesnt do the operation though, very strange!"+al);
	        
           
           al.stream().filter((x)->x.length()<3).map(num->{
        	   try {return Integer.parseInt(num);}
        	   catch (Exception e) {
        		   return 0;
        	   }}).filter(num -> num>0).map(num -> num*10).forEach(System.out::println);
		
	}

}
