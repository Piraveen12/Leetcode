class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int n=matrix.size();
        int n1=matrix[0].size();
        bool ans=false;
        for(int i=0;i<n;i++){
            bool ans=false;
            for(int j=0;j<n1;j++){
                if(matrix[i][j]==target){
                    ans=true;
                }
            }
            if(ans){
                return true;
            }

        }
        return false;
    }
};