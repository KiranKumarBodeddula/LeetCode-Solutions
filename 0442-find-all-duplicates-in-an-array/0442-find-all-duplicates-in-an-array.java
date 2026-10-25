class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> seen=new HashSet<>();
        List<Integer> res=new ArrayList<>();

        for(int x:nums){
            if(!seen.add(x)){
                res.add(x);
            }
        }
        return res;
    }
}