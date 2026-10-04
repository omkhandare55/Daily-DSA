class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer>set=new HashSet<>();
        int n=grid.length;
        int re=0;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              if(set.contains(grid[i][j]))re=grid[i][j];
              else {
                set.add(grid[i][j]);
                sum+=grid[i][j];
              }

            }
           
        }
         long actualsum=(n*n)*((n*n)+1)/2-sum;
            int []arr=new int[2];
            arr[0]=re;
            arr[1]=(int)actualsum;
            return arr;
    }
}