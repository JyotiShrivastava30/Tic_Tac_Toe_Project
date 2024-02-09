package Game;

public class LaunchGame {
      public static void main(String[] args) {
            TicTacToe t = new TicTacToe();

            HumanPlayer p1 = new HumanPlayer("Bob", 'X');
            AIPlayer p2 = new AIPlayer("AI", 'O');
            Player cp;
            cp = p1;

            while (true) {
                  System.out.println(cp.name + " turn");
                  cp.makeMove();
                  TicTacToe.dispBoard();
                  if (TicTacToe.checkColWin() || TicTacToe.checkRowWin() || TicTacToe.checkDiagWin()) {
                        System.out.println(cp.name + "has won");
                        break;
                  } else if (TicTacToe.checkDraw()) {
                        System.out.println("Game is a draw");
                        break;
                  } else {
                        if (cp == p1) {
                              cp = p2;
                        } else {
                              cp = p1;
                        }
                  }

            }
      }

}
