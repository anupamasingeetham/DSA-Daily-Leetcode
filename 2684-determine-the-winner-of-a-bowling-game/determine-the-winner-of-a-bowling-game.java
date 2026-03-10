class Solution {
    public int isWinner(int[] player1, int[] player2) {

        int score1 = score(player1);
        int score2 = score(player2);

        if (score1 > score2) return 1;
        if (score2 > score1) return 2;
        return 0;
    }

    private int score(int[] player) {
        int sum = 0;

        for (int i = 0; i < player.length; i++) {
            if ((i > 0 && player[i-1] == 10) || (i > 1 && player[i-2] == 10)) {
                sum += player[i] * 2;
            } else {
                sum += player[i];
            }
        }

        return sum;
    }
}
