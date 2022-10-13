package SnakeAndLadder;

public class SnakeAndLadderGame {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Game");
        int StartingPosition = 0;
        System.out.println("Current position is= " + StartingPosition);

        int RollDice = (int)Math.floor(Math.random()*10)%6+1;
        System.out.println("player rolls a dice= " +RollDice);


        int Options = (int)Math.floor(Math.random()*10)%3;
        System.out.println("player checking for a option= "+ Options);

        switch (Options){
            case 1:
                StartingPosition = RollDice+StartingPosition;
                System.out.println("player got a Ladder");
                System.out.println("player's position after got a ladder is "+ RollDice);
            break;
            case 2:
                System.out.println("Player Got a Snake");
                System.out.println("player's position after got a Snake is "+ StartingPosition);
            break;
            default:
                System.out.println("player Wants to Quit The Game");
        }
    }
}