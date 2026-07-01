class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> result = new HashMap<String, List<String>>();
        for (String str : strs) {
            isAnagram(result, str);
        }
        return new ArrayList<List<String>>(result.values());
    }

    public void isAnagram(HashMap<String, List<String>> result, String str) {
        char[] arr = new char[128];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }
        String answer = new String(arr);
        if (result.containsKey(answer)) result.get(answer).add(str);
        else {
            List<String> list = new ArrayList<String>();
            list.add(str);
            result.put(answer, list);
        }
    }
}
