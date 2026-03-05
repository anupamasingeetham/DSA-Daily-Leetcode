class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String , Integer> dict = new HashMap<>();
        for(int i = 0;i < arr.length;i++){
            dict.put(arr[i] , dict.getOrDefault(arr[i] , 0) + 1);
        }

        int count =0;
        for (String s : arr) {
            if (dict.get(s) == 1) {
                count++;
                if (count == k) {
                    return s;
                }
            }
        }

        return "";
    }
}