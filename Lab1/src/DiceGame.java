public class DiceGame {
    public static void main(String[] args) {
        Dice dice1 = new Dice();
        dice1.roll();

        Dice dice2 = new Dice();
        dice2.roll();

        if (dice1.getFaceValue() + dice2.getFaceValue() == 7){
            System.out.println("You Win!");
        }
        else
            System.out.println("You Lose");
    }
}
