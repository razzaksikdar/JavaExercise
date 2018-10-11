
//Given a String[] with strings in the format, starting with a letter between A-D and ending with a 1-5 digit number.
//
//A123
//B111
//C453
//C3331
//D3456
//D2245
//C111
//A1
//B22
//
//remove all strings that start with the letter "D"
//convert all remaining strings to integers by applying the following logic based on the preceding letter:
//A: multiply by 2
//B: add 100
//C: subtract 100
//Remove all numbers that are divisible by 5
//return the largest number in the collection

package com.qa;

import java.util.ArrayList;

public class LamdaExpressionStringOperation {

	
	public static void main(String[] args) {
		
		
		 ArrayList<String> al= new ArrayList<String>();
		    al.add("A123");
	        al.add("B111");
	        al.add("C453");
	        al.add("C3331");
	        al.add("D3456");
	        al.add("C111");
	        al.add("A1");
	        al.add("B22");
	        
	        System.out.println("Primary List: "+al);

	        
        
        al.stream().filter((x)-> x.charAt(0) != 'D').map(num -> num.substring(1, num.length())).map(num -> Integer.parseInt(num)).map(num -> num*2).map(num -> num+100).map(num -> num-100).forEach(System.out::println);
		
		
	}
	
	
}
