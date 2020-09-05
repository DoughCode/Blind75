class MaximumSubArray{

    public int maxSubArray(int[] nums) {
        
        int res[] = new int[nums.length];
        int temp = nums[0];
        res[0]= nums[0];
        
        for (int i = 1; i < nums.length; i++)
        {
            res[i] = Math.max(nums[i], nums[i] + res[i-1]);
            temp = Math.max(temp, res[i]);
        }
        return temp;
        
    }
}