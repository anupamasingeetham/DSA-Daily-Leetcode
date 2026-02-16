class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                word.append(c);
            } else {
                result.append(word.reverse());
                result.append(" ");
                word.setLength(0);
            }
        }
        
        result.append(word.reverse());  // last word
        return result.toString();
    }
}