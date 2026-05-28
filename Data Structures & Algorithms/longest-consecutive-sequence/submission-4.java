class Solution {
    public int longestConsecutive(int[] nums) 
    {
        if (nums.length == 0)
        {
            return 0;
        }

        Arrays.sort(nums);

        int counter = 1;
        int longest = 1;

        for (int i = 0; i < nums.length - 1; i++)
        {
            // skip duplicates
            if (nums[i] == nums[i + 1])
            {
                continue;
            }

            if (nums[i] + 1 == nums[i + 1])
            {
                counter++;
            }
            else
            {
                counter = 1; // reset streak
            }

            longest = Math.max(longest, counter);
        }

        return longest;
    }
}

