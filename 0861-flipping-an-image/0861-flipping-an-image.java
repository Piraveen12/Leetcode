class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int len = image.length;
        int len1 = image[0].length;
        for(int i = 0;i<len ;i++){
            int left = 0, right = image[i].length - 1;
            while (left <= right) {   
                int temp = image[i][left] ^ 1;
                image[i][left] = image[i][right] ^ 1;
                image[i][right] = temp;
                left++;
                right--;
            }
        } 
        return image;
    }
}