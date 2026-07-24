class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();

        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        int c1 = 0;
        int c2 = 0;
        for(int i = 0;i < n /2;i++){
            char c = s.charAt(i);

            if(set.contains(c)){
                c1++;
            }
        }

        for(int i = n/2;i < n;i++){
            char c = s.charAt(i);

            if(set.contains(c)){
                c2++;
            }
        }

        return c1 == c2;
    }
}