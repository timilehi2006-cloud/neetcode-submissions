class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int[] output = new int[nums.length];
        int meter = 0;
        for ( int i = 0; i < nums.length; i++ )
        {
            int amount = 1;
            int j = nums.length - 1;
            while( j >= 0 )
            {
                if ( j != i  )
                {
                    amount = amount * nums[j];
                }
                j--;
            }
            output[meter] = amount;
            meter++;
        }
        return output;
    }
}  
