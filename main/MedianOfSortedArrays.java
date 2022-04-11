/**
 * 
 */
package main;

/**
 * @author Paulo
 *
 */
public class MedianOfSortedArrays 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
    	double result = 0;
    	int m = nums1.length;
    	int n = nums2.length;
    	int o = m+n;
    	
    	if (m >= 0 && m <= 1000 && n >= 0 && n <= 1000 && o >= 1 && o <= 2000)
    	{
        	int[] numList = new int[o];
        	double sum = 0;
        	
        	System.arraycopy(nums1, 0, numList, 0, nums1.length);  
        	System.arraycopy(nums2, 0, numList, nums1.length, nums2.length);  
        	
        	quickSort(numList, 0, numList.length-1);
        	
        	if(numList.length % 2 == 0)
        	{
        		int i = numList.length/2;
        		sum = numList[i - 1] + numList[i];
        		result = sum / 2;
        	}
        	else
        	{
            	result = numList[Math.round(numList.length/2)];    		
        	}
    	}

		return result;   
    }
    
    /**
     * Takes the last element as the pivot. 
     * Checks each element and swaps it before the pivot if its value is smaller.
     */
    private int partition(int arr[], int begin, int end) 
    {
        int pivot = arr[end];
        int i = (begin-1);
        for (int j = begin; j < end; j++) 
        {
            if (arr[j] <= pivot) 
            {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        
        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
    
    /**
     * Take the array to be sorted, the first and the last index. 
     * Check the indices and continue only if there are still elements to be sorted.
     */
    public void quickSort(int nums[], int begin, int end) 
    {
        if (begin < end) 
        {
            int partitionIndex = partition(nums, begin, end);

            quickSort(nums, begin, partitionIndex-1);
            quickSort(nums, partitionIndex+1, end);
        }
    }
}
