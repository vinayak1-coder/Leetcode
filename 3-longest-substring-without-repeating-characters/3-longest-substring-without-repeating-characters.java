class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
		Set<Character> set=new HashSet<>();
		int max=1;
		int st=0,end=0;
		while(end<s.length())
		{
			if(!set.contains(s.charAt(end)))
			{
				set.add(s.charAt(end));
				max=Math.max(max,set.size());
				end++;
			}
			else
			{
				st++;
				end=st;
				set.clear();
			}
		}
		return max;
    }
}