class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.size()!=t.size()){
            return false;
        }
        int freq[256]={0};
        int freq1[256]={0};
        for(int i=0;i<s.size();i++){
            char s1=s[i];
            char t1=t[i];
            if(freq[s1]!=freq1[t1]){
                return false;
            }
            freq[s1]=i+1;
            freq1[t1]=i+1;
        }
        return true;
    }
};