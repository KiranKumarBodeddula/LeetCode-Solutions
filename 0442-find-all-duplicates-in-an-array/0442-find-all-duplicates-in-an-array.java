class Solution {
    public List<Integer> findDuplicates(int[] nums) {
      
        List<Integer> res=new ArrayList<>();

        for(int x: nums){
            int idx=Math.abs(x)-1;
            if(nums[idx]<0){
                res.add(idx+1);
            }
            else{
                nums[idx]=-nums[idx];
            }
        }
        return res;
    }
}