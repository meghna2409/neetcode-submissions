class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indices = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (indices.containsKey(target - nums[i])) {
                return new int[]{indices.get(target - nums[i]), i};
            } else {
                indices.put(nums[i], i);
            }
        }
        return new int[]{0,0};
    }
}
