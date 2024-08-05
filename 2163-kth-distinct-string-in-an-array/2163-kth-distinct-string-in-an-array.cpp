class Solution {
public:
    string kthDistinct(vector<string>& arr, int k) {
        int c=0;
      
        for(int i=0;i<arr.size();i++ ){
              bool distinct=true;
            for(int j=0;j<arr.size();j++){
                if(i!=j&&arr[i]==arr[j]){
                   distinct=false;
                   break;
                }
            }
            if(distinct){
            c++;
            if(c==k){
                return arr[i];
            }
            }
            
        }
        return "";
    }
};