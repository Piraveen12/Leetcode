class Solution {
    public boolean isValid(String s) {
        Stack<Character>ans=new Stack<>();
        int st=0;
        int len=s.length();
        while(st<len){
            if(s.charAt(st)=='('|| s.charAt(st)=='['||s.charAt(st)=='{'){
                ans.push(s.charAt(st));
            }
            else{
                char a=' ';
                if(!ans.isEmpty())
                {
                    a=ans.peek();
                    }
                if(ans.isEmpty()==true){
                    
                    return false;
                }
                else if(a=='('){
                    if (s.charAt(st)!=')') {
                      
                        return false;
                    } 
                     else ans.pop();
                }
                else if(a=='['){
                    if( s.charAt(st)!=']'){
                       
                        return false;
                    }  
                    else ans.pop();
                }
                else {
                     if (s.charAt(st)!='}')  {
                        
                        return false; 
                     }
                     else
                      ans.pop();
                }
                 
            }
            st++;
        }
        if((ans.isEmpty())==true){
            return true;
        }
        
        return false;
    }
}