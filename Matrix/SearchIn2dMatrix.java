class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row=matrix.length;
       
        if(row==0){
            return false;
        }
         int col=matrix[0].length;
        if(col==0){
            return false;
        }
        int start=0;
        int end=col-1;
        int root=matrix[start][end];
        while(row>start && col>end && start>=0 && end>=0){
            if(root==target){
                return true;
            }else if(root>target){
                end--;
                if(end < 0 || end >= col){
                    return false;
                }
                root=matrix[start][end];
            }else{
                start++;
                if(start < 0 || start >= row){
                    return false;
                }
                root=matrix[start][end];
            }
        }
        return false;
        
    }
}

