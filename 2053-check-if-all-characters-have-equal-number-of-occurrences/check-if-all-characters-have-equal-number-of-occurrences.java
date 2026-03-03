class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character , Integer> dict = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            dict.put(s.charAt(i) , dict.getOrDefault(s.charAt(i) , 0) + 1);
        }
        int n = dict.get(s.charAt(0));
        for(Map.Entry<Character , Integer> entry : dict.entrySet()){
            if(entry.getValue() != n){
                return false;
            }
        }
        return true;
    }
}