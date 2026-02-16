class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> dict = new HashMap<>();
        int count = 0;
        for(int i = 0;i < jewels.length();i++){
            dict.put(jewels.charAt(i) , dict.getOrDefault(jewels.charAt(i) , 0) + 1);
        }
        for(int i = 0;i < stones.length();i++){
            if(dict.containsKey(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
}