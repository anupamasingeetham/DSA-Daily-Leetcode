class Solution {
    public int similarPairs(String[] words) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isSimilar(words[i], words[j])) {
                    count++;
                }
            }
        }

        return count;
    }

    public boolean isSimilar(String a, String b) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char c : a.toCharArray()) {
            set1.add(c);
        }

        for (char c : b.toCharArray()) {
            set2.add(c);
        }

        return set1.equals(set2);
    }
}
