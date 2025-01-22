class Solution {
    public int firstUniqChar(String s) {
        Queue <Integer>q1=new LinkedList<>();
        HashMap<Character,Integer> result= new HashMap<>();
        int len=s.length();
        int st=0;
        while(st<len){
            char ch=s.charAt(st);
            result.put(ch, result.getOrDefault(ch, 0) + 1);
            q1.add(st);
            st++;
        }
       while (!q1.isEmpty()) {
            if (result.get(s.charAt(q1.peek())) > 1) {
                q1.poll();
            } else {
                break;
            }
        }
     return q1.isEmpty()?-1:q1.poll();
    }
}