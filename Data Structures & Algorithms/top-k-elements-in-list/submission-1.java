class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Inputs:
        // 1. An array of numbers
        // 2. An integer k representing the top k occurring elements to return
        
        // Create a HashMap
        // Key -> number 
        // Value -> how often number occurs
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (map.get(num) != null) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        // Create an array
        // index -> frequency of number 
        // value -> list of all numbers with that frequency
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();  
        for (int i = 0; i <= nums.length; i++) {
            arr.add(new ArrayList<Integer>());
        }  
        map.forEach((key, value) -> {
            arr.get(value).add(key);
        });

        int count = k;
        int[] to_return = new int[k];
        for (int i = arr.size() - 1; i >= 0 && count != 0; i--) {
            for (int num : arr.get(i)) {
                if (count != 0) {
                    to_return[count - 1] = num;
                    count--;
                }
            }
        }

        return to_return;
    }
}
