import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;


public class InternQuestionsCopyTest {
	
	InternQuestionsCopy InternQuestions = new InternQuestionsCopy();

	/*Tests if the method works on a normal list, with numbers 1-9
	 */
	@Test
	public void testNormalList() {
		List<Integer> testList = new ArrayList<Integer>();
    	testList.add(1);
    	testList.add(2);
    	testList.add(3);
    	testList.add(4);
    	testList.add(5);
    	testList.add(6);
    	testList.add(7);
    	testList.add(8);
    	testList.add(9);
    	List<String> result = new ArrayList<String>();
    	result.add("1,9");
    	result.add("2,8");
    	result.add("3,7");
    	result.add("4,6");
    	
    	assertEquals(result, InternQuestions.sumOfPairs(testList));
    	
	}
	/* Tests to see if the method can handle negative numbers
	 */
	@Test
	public void testListWithNegativeNum() {
		List<Integer> testList = new ArrayList<Integer>();
    	testList.add(1);
    	testList.add(2);
    	testList.add(3);
    	testList.add(4);
    	testList.add(5);
    	testList.add(6);
    	testList.add(7);
    	testList.add(8);
    	testList.add(9);
    	testList.add(-2);
    	testList.add(12);
    	testList.add(-20);
    	testList.add(30);
    	List<String> result = new ArrayList<String>();
    	result.add("-20,30");
    	result.add("-2,12");
    	result.add("1,9");
    	result.add("2,8");
    	result.add("3,7");
    	result.add("4,6");
    	
    	
    	assertEquals(result, InternQuestions.sumOfPairs(testList));
    	
	}
	/* Test to see how the method functions with an unsorted list as input
	 * 
	 */
	@Test
	public void testUnsortedList() {
		List<Integer> testList = new ArrayList<Integer>();
    	testList.add(5);
    	testList.add(6);
    	testList.add(3);
    	testList.add(8);
    	testList.add(1);
    	testList.add(2);
    	testList.add(9);
    	testList.add(4);
    	testList.add(7);
    	
    	
    	List<String> result = new ArrayList<String>();
    	result.add("1,9");
    	result.add("2,8");
    	result.add("3,7");
    	result.add("4,6");
    	

    	assertEquals(result, InternQuestions.sumOfPairs(testList));
    	
	}
	/*Tests if it works with a substring at the beginning
	 * 
	 */
	@Test
	public void testSubstringStart() {
		String input = "antartica";
		String testString = "ant";
    	

		assertTrue(InternQuestions.isSubString(input, testString));
	}
	/*Tests if it gets a non substring
	 * 
	 */
	@Test
	public void testNonSubstring() {
		String input = "basketball";
		String testString = "kit";
    	

		assertFalse(InternQuestions.isSubString(input, testString));
	}
	/* Tests if it works with a substring at the end
	 * 
	 */
	@Test
	public void testSubstringEnd() {
		String input = "outstanding";
		String testString = "ding";
    	

		assertTrue(InternQuestions.isSubString(input, testString));
	}
	/*Tests to see if the method works with a palindrome
	 * 
	 */
	@Test
	public void testPalindrome() {
		String testString = "anna";
    	

		assertTrue(InternQuestions.isPalindrome(testString));
	}
	/*Tests to see if something close to a palindrome slips through
	 * 
	 */
	@Test
	public void testNotPalindrome() {
		String testString = "Civdic";
    	

		assertFalse(InternQuestions.isPalindrome(testString));
	}
	
	/*Tests to see if an empty string works, it should work since
	 * it doesn't violate palidrome rules
	 * 
	 */
	@Test
	public void testEmptyPalindrome() {
		String testString = "";
    	

		assertTrue(InternQuestions.isPalindrome(testString));
	}
}
