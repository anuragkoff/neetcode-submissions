class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String word: strs) {
            char arr[] = word.toCharArray();
            Arrays.sort(arr);
            String sign = new String(arr);
            if(map.containsKey(sign)) {
                map.get(sign).add(word);
            } else {
                List<String> wordL = new ArrayList<>();
                wordL.add(word);
                map.put(sign, wordL);
            }
            // map.put(sign, map.getOrDefault(arr, new ArrayList<>()).add(word));
        }

        return new ArrayList<>(map.values());
    }
}
