import org.junit.Assert;
import org.junit.Test;
import Model.Dice;

public class DiceTest {

    @Test
    public void CheckIfDiceRollsAboveSix() {

        boolean aboveSixAndBelowOne = false;
        Dice dice = new Dice();

        for (int i = 0; i < 10000; i++) {
            dice.roll();

            if (dice.getFaceValue() > 6 || dice.getFaceValue()<1) {
                aboveSixAndBelowOne = true;
            }
        }
        Assert.assertFalse(aboveSixAndBelowOne);
    }
}
