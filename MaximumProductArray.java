class MaximumProductArray{

    public int maxProduct(int[] nums) {
        
        if(nums.length == 0)
            return 0;
        
        int continuous = nums[0];
        int maxContinuous = continuous;
        
        for (int i = 1; i < nums.length; i++)
        {
            continuous = continuous == 0 ? nums[i] : continuous * nums[i]; 
            maxContinuous = Math.max(maxContinuous, continuous);
        }
        
        continuous = nums[nums.length -1];
        maxContinuous = Math.max(maxContinuous, continuous);
        
        for (int i = nums.length - 2; i >= 0; i--)
        {
            continuous = continuous == 0 ? nums[i] : continuous * nums[i]; 
            maxContinuous = Math.max(maxContinuous, continuous);
        }
        
        return maxContinuous;
        
    }
}