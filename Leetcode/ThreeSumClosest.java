class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        int currSum = nums[0] + nums[1] + nums[nums.length - 1];
        int currDiff = Math.abs(currSum - target);
        Arrays.sort(nums);
        int prevDiff = currDiff;
        int sum; 
        int diff;
        for(int i = 1; i < nums.length -2 ; i++){
            int start = 0; 
            int end = nums.length - 1;
            while( start < end ){
                sum = nums[start] + nums[end] + nums[i];
                diff = Math.abs(sum - target);
                if( prevDiff > diff ){
                    break;
                }
                if( sum > target ){
                    end--;
                } else {
                    start++;
                }
                if( diff < currDiff ){
                    currDiff = diff;
                    currSum = sum;
                }
                prevDiff = diff;
            }
        }
        return currSum;
    }
}