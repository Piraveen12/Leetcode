class Solution {
public:
    int reverse(int x) {
       int result=0;
       while(x!=0){
        int digit=x%10;
        result=result*10+digit;
        x=x/10;
       } 
       if(result>INT_MAX || result<INT_MIN) 
            return 0; 
       return result; 
    }
};