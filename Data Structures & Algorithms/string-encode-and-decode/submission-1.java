class Solution {

    public String encode(List<String> strs) {
        if (strs.size() == 0) return "";

        StringBuilder res = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();
        for (String str: strs) {
            sizes.add(str.length());
        }

        for (int size: sizes) {
            res.append(size).append(',');
        }

        res.append('#');

        for (String str: strs) {
            res.append(str);
        }

        return res.toString();
        // return String.join("#", strs);
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        if (str.length() == 0){
            return result;
        }

        List<Integer> list = new ArrayList<>();

        int i = 0;
        while (str.charAt(i) != '#'){
            StringBuilder sb = new StringBuilder();
            while (str.charAt(i) != ','){
                sb.append(str.charAt(i));
                i++; 
            }

            list.add(Integer.parseInt(sb.toString()));
            i++;
        }
        i++;
        for (int val: list) {
            result.add(str.substring(i, i+val));
            i+=val;
        }

        return result;
    }
}
