class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;
        int ele=0;
        for(int i=0; i<n; i++)
        {
            ele = nums[i];
            if(String.valueOf(ele).length() % 2 == 0)
            {
                count++;
            }
        }
        return count;
    }
}