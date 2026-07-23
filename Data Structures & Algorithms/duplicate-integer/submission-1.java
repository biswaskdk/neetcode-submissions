class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length < 2){
            return false;
        }
        HashSet<Integer> inTheBox = new HashSet<Integer>();
        for (int num: nums){
            if (!inTheBox.add(num)){
                return true;
            }
        }
        return false;
    }
}