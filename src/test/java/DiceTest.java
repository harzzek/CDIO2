import org.junit.Assert;
import org.junit.Test;
import Model.Dice;

public class DiceTest {

    @Test
    public void CheckIfDiceRollsAboveSix() {

        boolean aboveSix = false;
        Dice dice = new Dice();

        for (int i = 0; i < 10000; i++) {
            dice.roll();

            if (dice.getFaceValue() > 6) {
                aboveSix = true;
            }
        }
        Assert.assertFalse(aboveSix);
    }
}
