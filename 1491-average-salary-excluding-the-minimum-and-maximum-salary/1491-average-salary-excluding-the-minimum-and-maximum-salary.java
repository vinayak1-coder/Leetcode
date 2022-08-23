class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double s=0;
        double avg=0;
        for(int i=1;i<=salary.length-2;i++){
            s=s+salary[i];
        }
        avg=s/(salary.length-2);
        return avg;
    }
}