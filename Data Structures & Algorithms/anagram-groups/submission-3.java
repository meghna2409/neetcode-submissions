class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] arr = new char[26];
            for (char c : str.toCharArray()) {
                arr[c - 'a']++;
            }
            String key = new String(arr);
            if (map.containsKey(key)) map.get(key).add(str);
            else {
                List<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(key, temp);
            }
        }
        return new ArrayList<>(map.values());
    }
}
