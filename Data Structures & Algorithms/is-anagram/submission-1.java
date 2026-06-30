class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] arr1 = new char[128];
        char[] arr2 = new char[128];
        for (int i = 0; i < s.length(); i++) {
            arr1[s.charAt(i)]++;
            arr2[t.charAt(i)]++;
        }
        return Arrays.equals(arr1, arr2);
    }
}
