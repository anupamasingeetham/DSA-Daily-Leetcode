class Solution {
    public int countEven(int num) {
        int ans = 0;
        for(int i = 1;i <= num;i++){
            if(sumOfDigits(i) % 2 == 0){
                ans++;
            }
        }
        return ans;
    }
    private int sumOfDigits(int n){
        int sum = 0;
        while(n != 0){
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        return sum;
    }
}