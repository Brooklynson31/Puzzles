package leetcode.arrays;

import java.util.Arrays;

public class MergeSortedArray {
//	Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
//
//	Note:
//	You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
//	The number of elements initialized in nums1 and nums2 are m and n respectively.

	public static void main(String[] args) {

			int[] nums1 = new int[] {2,0};
			int m = 1;
			int[] nums2 = new int[] {1};
			int n = 1;
			merge(nums1,m,nums2,n);
			System.out.println(Arrays.toString(nums2));
			System.out.println(Arrays.toString(nums1));

	}
		//if time/memory limit exceeded, and need to in place, store values in nums1 before replacing/removing
		public static void merge(int[] nums1, int m, int[] nums2, int n) {
			int[] temp = new int[m+n];
			temp = nums1;
			  if(n == 0){
				
		            return;
			  }		
				if(m == 0){
						for(int i = 0; i <= nums1.length-1;i++ ){
							nums1[i] = nums2[i];
						}
						return;
					}
					
				int left = 0;
				int right = 0;
				int k = 0;
				//cant assign temp to nums1 in end, but can set temp before to nums1 and 
				while(left < m && right < n){
					if(temp[left] < nums2[right]){
						nums1[k] = temp[left];
						left++;
					} else {
						nums1[k] = nums2[right];
						right++;
					}
					k++;
				}
				if(left < m){
					while(left < m){
						nums1[k] = temp[left];
						left++;
					}
				} else if (right < n){
					while(right < n){
						nums1[k] = nums2[right];
						right++;
					}
				}
			
				
				}
		
		

}
