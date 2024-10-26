class Solution {
    public int min(int a,int b,int c){
        if(a<b && a<c){
            return a;
        }
        else if(b<c &&b<a){
            return b;
        }
        else{
            return c;
        }
    }
    public int numberOfSubstrings(String s) {
    int[] arr =new int[3];
    Arrays.fill(arr,-1);
    int r=0;
    int n=s.length();
    int count =0;
    while(r<n){
        arr[s.charAt(r)-'a']=r;
        if(arr[0]!=-1 && arr[1]!=-1 && arr[2]!=-1){
            count=count+(1+min(arr[0],arr[1],arr[2]));

        }
        r++;
    }
    return count;
    }
}