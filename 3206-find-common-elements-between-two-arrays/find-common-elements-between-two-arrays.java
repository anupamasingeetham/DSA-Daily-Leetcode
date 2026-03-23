class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int[] ans = new int[2];
        int c1 = 0;
        int c2 = 0;
        Set<Integer> set1 = new HashSet();
        for(int num1 : nums1){
            set1.add(num1);
        }
        Set<Integer> set2 = new HashSet();
        for(int num2 : nums2){
            set2.add(num2);
        }
        for(int i = 0;i < nums1.length;i++){
            if(set2.contains(nums1[i])){
                c2++;
            }
        }
        for(int i = 0;i < nums2.length;i++){
            if(set1.contains(nums2[i])){
                c1++;
            }
        }
        ans[0] = c2;
        ans[1] = c1;

        return ans;
    }
}