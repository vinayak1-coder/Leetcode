class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> num_set = new HashSet<Integer>();
        for(int num : nums){
            num_set.add(num);
        }
        int max_len=0;
        for(int i=0;i<nums.length;i++){
            int cur_len = 1;
            int cur_num= nums[i];
            if(!num_set.contains(cur_num-1)){
            while(num_set.contains(cur_num + 1)){
                cur_len +=1;
                cur_num +=1;
            }
            }
            max_len= Math.max(cur_len,max_len);
        }
        return max_len;
    }
        private boolean number_exist(int[] arr,int num){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==num){
                    return true;
                }
            }
                    return false;
        }
    
}