class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
	if(nums.length == 0) return false;
	TreeSet<Long> window = new TreeSet<>();
	for(int i=0; i<nums.length; i++) {
		long num = nums[i];
		Long floor = window.floor(num+t);
		Long ceiling = window.ceiling(num-t);
		if(floor != null && floor >= num) return true;
		if(ceiling !=null && ceiling <= num) return true;
		window.add(num);
		if(i >= k) window.remove((long)nums[i-k]);
	}
	return false;
    }
}