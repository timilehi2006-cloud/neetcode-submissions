class Solution {
    public boolean isAnagram(String s, String t) 
    {
        //convert s and t Strings to arrays using toCharArray()
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        //sort the characters in array s and t where a = 0 b = 1 
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        // check if the elements in the array sChars and tChars are equal
        return Arrays.equals(sChars,tChars);
    }
}
