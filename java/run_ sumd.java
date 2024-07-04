
/*
  Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
  Return the running sum of nums.
  
  date: ??/??/???? ??:?? PM/AM
  I'm: Normal?
  
  Runtime: 02 ms
  Memory Usage: 42.8 MB
  
*/

class Solution {
    public int[] runningSum(int[] nums) {
        
        int[] output = new int[nums.length];
        int count = 1;
        output[0] = nums[0];
        
        while( count < nums.length ) {
            int temp = 0;
            
            for ( int x=0; x < count+1; x++) {
                temp += nums[x];
            }
            
            output[count] = temp;
            count+=1;
        }
        return output;
    
    }
}
