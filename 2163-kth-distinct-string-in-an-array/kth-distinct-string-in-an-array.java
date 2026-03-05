

class Solution {
    public String kthDistinct(String[] arr, int k) {

        Map<String, Integer> dict = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {
            dict.put(arr[i], dict.getOrDefault(arr[i], 0) + 1);
        }

        int count = 0;

        for (Map.Entry<String, Integer> entry : dict.entrySet()) {
            if (entry.getValue() == 1) {
                count++;
                if (count == k) {
                    return entry.getKey();
                }
            }
        }

        return "";
    }
}
