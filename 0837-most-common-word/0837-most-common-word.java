class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String normalized = paragraph.toLowerCase().replaceAll("[^a-z ]", " ");
        String[] strArray = normalized.split("\\s+"); 
        HashMap<String,Integer> ans = new HashMap<>();
        int count  = 0;
        String result = "";
        for(String s : strArray){
            boolean isBanned = false;
            for (int i = 0; i < banned.length; i++) {
                if (s.equals(banned[i])) {
                    isBanned = true;
                    break;
                }
            }
            if (isBanned) {
                continue;
            }
            ans.put(s,ans.getOrDefault(s,0)+1);
            int max=ans.get(s);
            if(max > count){
                count = max;
                result = s;
            }
        }
        return result;
    }
}