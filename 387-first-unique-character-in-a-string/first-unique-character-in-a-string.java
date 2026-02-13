class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> dict = new HashMap<>();

        // Pass 1: count frequency
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            dict.put(ch, dict.getOrDefault(ch, 0) + 1);
        }

        // Pass 2: find first unique in original order
        for (int i = 0; i < s.length(); i++) {
            if (dict.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}