class Solution {
    public double minAreaFreeRect(int[][] points) {
         int n = points.length;
        Map<String, List<Integer>> map = new HashMap<>();
        double s = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                double x = ((double)points[i][0]+points[j][0])/2;
                double y = ((double)points[i][1]+points[j][1])/2;
                double l = Math.pow(points[i][0]-points[j][0],2) + Math.pow(points[i][1]-points[j][1],2);
                String key = l + " " + x + " " + y;
                if(map.containsKey(key)){
                    for(Integer z : map.get(key)){
                        s = Math.min(s, calcSquare(i,j,z, points));
                    }
                }
                map.computeIfAbsent(key, nil->new ArrayList<>()).add(i);
            }
        }
        return s == Integer.MAX_VALUE ? 0 : s;
    }
    
    private double calcSquare(int x, int y, int z, int[][] points){
        double l = Math.pow(Math.pow(points[x][0]-points[z][0],2)+Math.pow(points[x][1] - points[z][1],2),0.5);
        double w = Math.pow(Math.pow(points[y][0]-points[z][0],2)+Math.pow(points[y][1] - points[z][1],2),0.5);
        return l*w;
    }
}