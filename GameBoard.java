public class GameBoard {
    private int columns = 7;
    private int colLength = 6;
    public Coin[][] board = new Coin[7][6];
























    // returns -1 if invalid, 1 if valid
    public int addCoin(int x, int color){
        for(int i = 0; i < 6; i++){
            if (board[x][i].equals(null)){
                board[x][i] = new Coin(color, x, i);
                return 1;
            }
        }
        return -1;
    }
}
