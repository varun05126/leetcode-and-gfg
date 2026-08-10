class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int count = 0;
        int newnumber = 0;

        for(int i=0; i<len; i++)
        {
            if(count == 0)
                newnumber = nums[i];

            if(nums[i] == newnumber)
                count++;

            else
                count--;
        }
        return newnumber;
    }
}