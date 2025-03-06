class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] a=new int[2];
        int n=grid.length;
        int m=grid[0].length;
        ArrayList<Integer> t=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               t.add(grid[i][j]);
            }
        }
        int[] count=new int[t.size()+1];
        for(int g:t){
            count[g]++;
        }
        for(int i=1;i<count.length;i++){
           if(count[i]>1){
            a[0]=i;
           }
        }
        for(int i=1;i<count.length;i++){
            if(count[i]==0){
                a[1]=i;
            }
        }
       return a;
    }
}