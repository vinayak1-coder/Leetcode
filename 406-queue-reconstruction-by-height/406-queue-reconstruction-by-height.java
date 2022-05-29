class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->{
            return (a[0]!=b[0]) ? b[0]-a[0] : a[1]-b[1];
        });
        List<int[]> res = new LinkedList<>();
        for(int[] cur : people)
            res.add(cur[1],cur);
        return res.toArray(new int[people.length][]);
    }
}