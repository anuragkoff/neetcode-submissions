class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word: strs) {
            char arr[] = word.toCharArray();
            Arrays.sort(arr);
            String sign = new String(arr);
            if(!map.containsKey(sign)){
                map.put(sign, new ArrayList<>());
            }

            map.get(sign).add(word);

            // map.computeIfAbsent(sign, key -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
