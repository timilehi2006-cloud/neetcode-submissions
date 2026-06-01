class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        for ( int i = 0; i < numbers.length; i++ )
        {
            int missing = target - numbers[i];
            int j = 0;
            while ( j < numbers.length )
            {
                if ( numbers[j] == missing  && j != i )
                {
                    return new int []{i+1,j+1};
                }
                j++;
            }
        }
        return new int []{};
    }
}
