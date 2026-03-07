class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        Map<Integer, String> map = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }

        Integer[] h = new Integer[heights.length];
        for (int i = 0; i < heights.length; i++) {
            h[i] = heights[i];
        }

        Arrays.sort(h, Collections.reverseOrder());

        String[] arr = new String[names.length];

        for (int i = 0; i < h.length; i++) {
            arr[i] = map.get(h[i]);
        }

        return arr;
    }
}
