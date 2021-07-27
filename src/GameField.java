import java.util.Scanner;

public class GameField {
    // 0 - "_"
    // 1 - "Player1"
    // 2 - "Player2"
    // 012, 345, 678, 036, 147, 258, 048, 246 <-- Варианты победы

    private int[] field = new int[] {0,0,0,
                                     0,0,0,
                                     0,0,0};

    private void initGame() {
        boolean inGame;
       do {
            drawField();
            int n = getNumber();
            inGame = !isGameOver(n);
        } while (inGame);
    }

    private void drawField() {
        System.out.println("     |     |     ");
        for (int i = 0; i < field.length; i++) {
            if (i != 0) {
                if (i % 3 == 0) {
                    System.out.println("\n_____|_____|_____");
                    System.out.println("     |     |     ");
                } else
                    System.out.print("|");
            }
            if (field[i] == 0) System.out.print("  " + i + "  ");
            if (field[i] == 1) System.out.print("  " + "X" + "  ");
            if (field[i] == 2) System.out.print("  " + "O" + "  ");
        }
        System.out.println("\n     |     |     ");
    }

    private int getNumber() {
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                int n = Integer.parseInt(in.nextLine());
                if (n >= 0 && n < field.length && field[n] == 0)
                    return n;
            } catch (NumberFormatException e) {
                System.out.println("Введите число!");
            }
        }
    }

    private boolean isGameOver(int n) {
        int row;

        return false;
    }

    public static void main(String[] args) {
        new GameField().initGame();
    }
}
