class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        for ( int i = 0; i < nums.length; i++ )
        {
            int remaining = target - nums[i];
            for ( int j = 0; j < nums.length; j++ )
            {
                if ( nums[j] == remaining && i != j )
                {
                    return new int[]{i,j};
                }
            }
        }  
        return new int[]{};
    }
}
