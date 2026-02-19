class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        int sm = 0;
        for(int num : nums){
            if(num > max){
                int temp = max;
                max = num;
                sm = temp;
            }else if(num > sm && num <= max){
                sm = num;
            }
        }
        return (sm - 1) * (max - 1);
    }
}