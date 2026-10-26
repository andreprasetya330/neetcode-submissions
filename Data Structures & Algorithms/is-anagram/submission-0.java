class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> letters1 = new HashMap<>();
        Map<Character, Integer> letters2 = new HashMap<>();
        for (int i = 0; i< s.length(); i++){
            char curr = s.charAt(i);
            if(letters1.containsKey(curr)){
                letters1.put(curr,letters1.get(curr)+1);
            } else{
                letters1.put(curr,1);
            }
        }

         for (int i = 0; i< t.length(); i++){
            char curr = t.charAt(i);
            if(letters2.containsKey(curr)){
                letters2.put(curr,letters2.get(curr)+1);
            } else{
                letters2.put(curr,1);
            }
        }

        return letters1.equals(letters2);
    }
}
