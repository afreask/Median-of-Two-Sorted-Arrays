/**
 * 
 */
package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.MedianOfSortedArrays;

/**
 * @author Paulo
 *
 */
class MedianOfSortedArraysTest {

	/**
	 * Test method for {@link main.MedianOfSortedArrays#findMedianSortedArrays(int[], int[])}.
	 * Example 1:
	 * Input: nums1 = [1,3], nums2 = [2]
	 * Output: 2.00000
	 * Explanation: merged array = [1,2,3] and median is 2.
	 */
	@Test
	public void testFindMedianSortedArrays1() 
	{
		int[] nums1 = {1,3};
		int[] nums2 = {2};
		MedianOfSortedArrays mosa = new MedianOfSortedArrays();
		double result = mosa.findMedianSortedArrays(nums1, nums2);
		assertEquals(2.00000, result);
	}

	
	/**
	 * Test method for {@link main.MedianOfSortedArrays#findMedianSortedArrays(int[], int[])}.
	 * Example 2:
	 * Input: nums1 = [1,2], nums2 = [3,4]
	 * Output: 2.50000
	 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
	 */
	@Test
	public void testFindMedianSortedArrays2() 
	{
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		MedianOfSortedArrays mosa = new MedianOfSortedArrays();
		double result = mosa.findMedianSortedArrays(nums1, nums2);
		assertEquals(2.50000, result);
	}
}
