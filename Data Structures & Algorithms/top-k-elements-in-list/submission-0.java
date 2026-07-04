class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) map.put(nums[i], map.get(nums[i]) + 1);
            else map.put(nums[i], 1);
        }
        
        List<List<Integer>> count = new ArrayList<List<Integer>>();
        for (int i = 0; i <= nums.length; i++) {
            count.add(new ArrayList<>());
        }

        map.forEach((value, index) -> {
            count.get(index).add(value);
        });

        int c = 0;
        int[] result = new int[k];
        for (int i = count.size() - 1; i >= 0 && c < k; i--) {
            if (count.get(i) != null) {
                for (int num : count.get(i)) {
                    result[c] = num;
                    c++;
                    if (c == k) break;
                }
            }
        }
        return result;
    }
}
