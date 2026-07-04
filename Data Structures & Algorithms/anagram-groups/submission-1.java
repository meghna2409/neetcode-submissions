class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> arr = new ArrayList<List<String>>();
        for (String str : strs) {
            arr = isAnagram(str, arr);
        }
        return arr;
    }

    public List<List<String>> isAnagram(String str, List<List<String>> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).get(0) != null && arr.get(i).get(0).length() == str.length()) {
                char[] arr1 = str.toCharArray();
                char[] arr2 = arr.get(i).get(0).toCharArray();
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                if (Arrays.equals(arr1, arr2)) {
                    arr.get(i).add(str);
                    return arr;
                }
            } 
        }
        arr.add(new ArrayList<String>());
        arr.get(arr.size() - 1).add(str);
        return arr;
    }
}
