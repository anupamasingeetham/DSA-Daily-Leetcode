class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int left = 0;
        int right = 0;
        for(int i = 0;i < s.length();i++){

            if(s.charAt(i) =='L'){
                left++;
            }else{
                right++;
            }
            if(left == right){
                count++;
            }
        }
        return count;
    }
}