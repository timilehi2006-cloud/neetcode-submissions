class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        // sort the Array
        Arrays.sort(nums);
        // implement the list of Integer in a list interface using a LinkedList data
        //structure 
       List<List<Integer>> output = new LinkedList();

        // if duplicates exist skip 
       for ( int i = 0; i < nums.length - 2; i++ )
       {
            if ( i == 0 ||(i > 0 && nums[i] != nums[i - 1]))
            {
                int low = i + 1;
                int high = nums.length - 1;
                int sum = 0 - nums[i];

                    while ( low < high )
                {
                    // if the number has been found that would sum it to the output 
                    //add to the Linkedlist 
                    // if a duplicate is found decrement high and increment low 
                    if ( nums[low] + nums[high] == sum )
                    {
                        output.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while ( low < high && nums[low] == nums[low + 1] ) low++;
                        while ( low < high && nums[high] == nums[high - 1] ) high--;
                        low++;
                        high--;
                    }
                    // if no number has been found that would sum it to the output 
                    // decrement high and increment low 
                    else if ( nums[low] + nums[high] > sum )
                    {
                        high--;
                    }
                    else
                    {
                        low++;
                    }
                }
            }
       }
       return output;
    }
}
