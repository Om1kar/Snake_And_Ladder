package SnakeAndLadder;

public class SnakeAndLadderGame {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Game");
        int StartingPosition = 0;
        System.out.println("Current position is= " + StartingPosition);

        int RollDice = (int)Math.floor(Math.random()*10)%6+1;
        System.out.println("player rolls a dice= " +RollDice);
    }
}