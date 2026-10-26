class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for(int i = 0; i < strs.length; i++){
            int[] arr = new int[26];
            for(char c : strs[i].toCharArray()){
                arr[c - 'a'] +=1;
            }
            String curr = Arrays.toString(arr);
            if(map.containsKey(curr)){
                map.get(curr).add(strs[i]);
            }else{
                map.put(curr,new ArrayList<>());
                map.get(curr).add(strs[i]);
            }
        }

        for(String key : map.keySet()){
            result.add(map.get(key));
        }
            return result;
    }
}
