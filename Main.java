public class Main {
    public static void main(String[] args) {
        GameBoard test = new GameBoard();
        test.board[1][2] = new Coin(1, 2, 1);
        System.out.println(test.board[0][0]);
    }
}
