package SnakeAndLadder;

public class SnakeAndLadderGame {
    public static final int NO_PLAY = 1;
    public static final int LADDER = 2;
    public static final int SNAKE = 3;
  public static final int START = 0;
    public static void main(String[] args) {
        int StartingPosition = 0;
        System.out.println("Welcome to Snake And Ladder Game");
        System.out.println("Current position is= " + START);
        while (StartingPosition <= 100) {

            int RollDice = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("player rolls a dice= " + RollDice);

            int Options = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println("player checking for a option= " + Options);

            switch (Options) {
                case NO_PLAY:
                    System.out.println("Player's new Position is " + StartingPosition);
                    break;
                case LADDER:
                   StartingPosition = StartingPosition + RollDice;
                    System.out.println("Player's new Position after got LADDER is " + StartingPosition);
                    break;

                case SNAKE:
                    StartingPosition = StartingPosition - RollDice;
                    if (StartingPosition >= 0)
                        System.out.println("Player's new Position after got SNAKE is " + StartingPosition);
                    else
                        StartingPosition = 0;
                    System.out.println("Player's new position is " + StartingPosition);
                    break;
                default:
                    System.out.println("Player Wants to Quit The Game");
            }
        }
        System.out.println();
        if (StartingPosition == 100)
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Player Won The Game");
    }
}
