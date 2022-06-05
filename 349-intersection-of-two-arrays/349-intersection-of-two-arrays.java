class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n1=nums1.length,n2=nums2.length;
        int count=0;
         Set<Integer> set1 = new HashSet<>();
         Set<Integer> set2 = new HashSet<>();
        for(int i=0;i<n1;i++){
            set1.add(nums1[i]);
        }
        for(int j=0;j<n2;j++){
            if(set1.contains(nums2[j])){
                set2.add(nums2[j]);
            }
        }
        int[] res=new int[set2.size()];
        for(Integer k:set2){
            res[count++]=k;
        }
        return res;
    }
}