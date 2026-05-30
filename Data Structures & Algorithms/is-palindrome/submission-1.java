class Solution {
    public boolean isPalindrome(String s) 
    {
        // remove spaces first 
       s = s.toLowerCase().replaceAll("[^a-z0-9]","");
          // build left and right indicator 
      int left = 0;
      int right = s.length() - 1;

      // check if the char at each point of left and right are the same 
      // if not then not a palindrome 
      // if it is till left == right then palindrome 

      while ( left < right )
      {
        if ( s.charAt(left) != s.charAt(right))
        {
            return false;
        }
        left++;
        right--;
      }
      return true;  
    }
}
