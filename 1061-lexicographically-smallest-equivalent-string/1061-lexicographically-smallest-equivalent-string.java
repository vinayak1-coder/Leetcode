class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
         int[] ch = new int[26];
        for(int i = 0; i<26 ; i++) ch[i] = i;
        int len = s1.length();
        for(int ind = 0; ind<len ; ind++){
            int ch1 = s1.charAt(ind)-'a';
            int ch2 = s2.charAt(ind)-'a';
            int parent1 = findParent(ch1,ch);
            int parent2 = findParent(ch2,ch);

            if(parent1<parent2){
                ch[ch2] = parent1;
                ch[parent2] = parent1;
            }
            else{
                ch[ch1] = parent2;
                ch[parent1] = parent2;
            }
        }
        StringBuilder sb = new StringBuilder();

        int l = baseStr.length();
        for(int ind = 0; ind<l ; ind++){
            int parent = findParent(baseStr.charAt(ind)-'a',ch);
            sb.append((char)(parent+'a'));
        }
        return sb.toString();
    }

    public int findParent(int child , int[] parent){
        if(parent[child]==child) return child;
        else return parent[child] = findParent(parent[child],parent);
    }
    
}