class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> values=new HashSet<>();
        Set<Integer> common=new HashSet<>();

        for(int num:nums1){
            values.add(num);
        }

        for(int num:nums2){
            if(values.contains(num)){
                common.add(num);
            }
        }
        int[] res=new int[common.size()];
        int i=0;
        for(int num:common){
            res[i++]=num;
        }
        return res;

    }
}