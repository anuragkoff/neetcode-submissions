class Solution {

    public String encode(List<String> strs) {
        if (strs.size() == 0) return "";

        StringBuilder sb = new StringBuilder();
        for(String str: strs) {
            sb.append(str).append("-");
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        String arr[] = str.split("-", -1);

        for (int i=0; i<arr.length-1; i++) {
            result.add(arr[i]);
        }

        return result;
    }
}
