class Solution {
    public double average(int[] salary) {
        double min=salary[0];
        double max=salary[0];
        for(int i=0;i<salary.length;i++){
            if(salary[i]>max){
                max=salary[i];
            }
            if(salary[i]<min){
                min=salary[i];
            }
        }
        double sum=0;
        for(int i=0;i<salary.length;i++){
            sum=sum+salary[i];
        }
        double sum2=(sum-min)-max;
        double avg=sum2/(salary.length-2);
        return avg;
    }
}