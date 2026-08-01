class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        // using a Map interface implemented with a HashMap
        Map<String,List<String>> res = new HashMap<>();
        // convert each String to a new char and store in
        // charArray 
        for ( String k : strs )
        {
            char[] charArray = k.toCharArray();
            // sort the array of char
            Arrays.sort(charArray);
            // convert the charArray back to a String 
            String sortedChar = new String(charArray);
            // map the has to the currently empty list 
            res.putIfAbsent(sortedChar, new ArrayList<>());
            res.get(sortedChar).add(k);
        }
        // returns a collection of all characters held in the
        // hashmap and this is wrapped in a ArrayList 
        //(return type ) is of type List
        return new ArrayList<>(res.values());

    }
}
