class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        Map<Integer,Integer>s=new HashMap<>();
        Deque<Integer>t=new ArrayDeque<>();
        int []res=new int[n1];
        for(int i=0;i<n2;i++){
            while(!t.isEmpty()&& nums2[i]>t.peek()){
                s.put(t.pop(),nums2[i]);
            }
            t.push(nums2[i]);
        }
        while(!t.isEmpty()){
            s.put(t.pop(),-1);
        }
        for(int i=0;i<n1;i++){
            res[i]=s.get(nums1[i]);
        }
        return res;
    }
}