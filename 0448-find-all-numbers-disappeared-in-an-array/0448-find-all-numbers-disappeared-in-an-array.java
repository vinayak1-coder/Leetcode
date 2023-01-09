class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set= new HashSet<>();
        List<Integer> list=new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int c=0;
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}