
	/*
	 * Copyright (c) 2018, Synopsys, Inc. All rights reserved worldwide.
	 */

	import java.util.ArrayList;
import java.util.*;

	/**
	 * In 1 hour do the following tasks.
	 *
	 * For each of the tasks below, write test cases that do a good job of testing the code.  Test cases should be written
	 * in the InternQuestionsTest class located in src/test/java.
	 */
	public class InternQuestionsCopy {

	    /**
	     * Write a method that takes a list of numbers as an input and returns the pairs of numbers that add up to 10.
	     * For example, given the input 1, 2, 3, 4, 5, 6, 7 the output would be (3,7), (4,6)
	     * @param numbers a list of numbers
	     * @return returns a list of the pairs of numbers that add up to 10 from the input numbers
	     */
	   /* First I sorted the list in ascending order, then I just added adjacent numbers together, checked to 
	    * see if their sum was equal to 10, if it was I then put it into my pairs ArrayList.
	    * 
	    */
		public  List<?> sumOfPairs(List<Integer> numbers) {
	    	int count = 0;
	        
	    	Collections.sort(numbers);

	    	ArrayList<String> pairs = new ArrayList<String>();

	    	for (int i = 0; i < numbers.size(); i++)
	             for (int j = i + 1; j < numbers.size(); j++)
	                 if ((numbers.get(i) + numbers.get(j)) == 10){
	                     count++;
	    				 String newPair = numbers.get(i).toString() + "," +  numbers.get(j).toString();
	    				 pairs.add(newPair);
	                 }
	    	return pairs;
	    }

	    /**
	     * Write a method that tests whether a testString is a substring of the input string.
	     *
	     * NOTE: Do not use any special language built-ins
	     *
	     * @param input the input string to check
	     * @param testString the test string
	     * @return true if testString is a substring of input, false otherwise
	     */
	    public  boolean isSubString(String input, String testString) {
	        String[] inputArray = input.split("(?!^)");
	        String[] testStringArray = testString.split("(?!^)");
	        boolean answer = false;
	        int i =0;
	        
	        /* I basically just checked if the first element of the testString matched any element in the 
	         * input string, if I found a match, I then checked if the rest of the letters after that also
	         * matched the test string. If it does then I return true, otherwise I return false
	         */
	        while(i<inputArray.length){
	        	if( testStringArray[0].equals(inputArray[i])){
	        		String[] possibleSubstring = new String[testStringArray.length];
	        		int h = 0;
	        		int j = i;
	        		int limit = i + testStringArray.length-1;
	        		
	        		while( j <= limit){
	        			
	        			possibleSubstring[h] = inputArray[j];
	        			h++;
	        			j++;
	        		}
	        		
	        		if (Arrays.equals(testStringArray, possibleSubstring)){
		        		answer = true;
		        		return answer;
		        	}
	        	}
	        	
	        	i++;
	        }
	        return answer;
	    }

	    /**
	     * Write a method that returns true if the testString is a palindrome
	     *
	     * A palindrome is a string that is the same either forward or backwards.  For example, 'Anna' is a palindrome.
	     * Note that the test for palindrome should be case insensitive.
	     *
	     * @param testString the string to test
	     * @return true if the testString is a palindrome
	     */
	    public boolean isPalindrome(String testString) {
	        String[] testStringArray = testString.split("(?!^)");
	    	int start = 0;
	        int end = testStringArray.length -1;
	        while(end > start){
	        	
	        	if (!testStringArray[start].equals(testStringArray[end])){
	        		return false;
	        	}
	        	start++;
	        	end--;
	        }
	        return true;
	    }
	    
	
	
	
	}


