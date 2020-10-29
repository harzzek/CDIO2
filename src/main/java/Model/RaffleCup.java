package Model;

public class RaffleCup {

    private Dice dice1;
    private Dice dice2;


    public RaffleCup() {
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        this.dice1 = dice1;
        this.dice2 = dice2;
    }

    public int[] roll() {
        int[] rollArray = new int[2];
        dice1.setFaceValue(dice1.roll());
        dice2.setFaceValue(dice2.roll());
        rollArray[0] = dice1.getFaceValue();
        rollArray[1] = dice2.getFaceValue();
        return rollArray;
    }
}