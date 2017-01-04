package leetcode.easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
//Given an array of integers where 1 <= a[i] <= n (n = size of array), some elements appear twice and others appear once.
//Find all the elements of [1, n] inclusive that do not appear in this array.
//Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
public class FindAllDisappeared {

	public static void main(String[] args) {

	int[] array = new int[] {1,1,3,3,5};
	System.out.println(findDisappearedNumbers(array).toString());

	}
	
    public static List<Integer> findDisappearedNumbers(int[] nums) {
//    	Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
//    	List<Integer> list = new ArrayList<Integer>();
//    	for(int i = 1; i <= nums.length;i++){
//			map.put(i, 0);
//    	}
//    	for(int i = 0; i <= nums.length-1;i++){
//    		if(map.containsKey(nums[i])){
//    			Integer val = map.get(nums[i]);
//    			map.put(nums[i], ++val);
//    		}
//    	}
//    	
//    	for(Integer it: map.keySet()){
//    		if( map.get(it) == 0 ){
//    			list.add(it);
//    		}
//    	}
//   
//    	
//        return list;
    	List<Integer> result = new ArrayList<Integer>();
        for( int i=0;i< nums.length; i++){
            int index = nums[i];
            if(nums[Math.abs(index)-1] > 0){
                nums[Math.abs(index)-1]= -nums[Math.abs(index)-1];
            }
        }
        
        for(int j =1 ;j <= nums.length ; j++){
            if(nums[j-1] > 0){
                result.add(j);
            }
        }
        return result;
    }
	
}
