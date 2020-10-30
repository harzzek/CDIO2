import Controller.GameManager;
import Model.GameBoard;
import Model.Player;
import org.junit.Assert;
import org.junit.Test;

public class PlayerTest
{

    @Test
    public void CheckIfPlayerCanHaveUnderZeroPoints()
    {
         int newScore = -5;
         int lastScore = 3;

         Player player = new Player();

         player.updateScore(lastScore);
         player.updateScore(newScore);

        Assert.assertEquals(0,player.getScore());

    }

    @Test
    public void CheckIfGameEndsAt3000Points()
    {
        int pointsCounter=0;
        int pointsUpdater = 1;

        GameManager gameManager = new GameManager(pointsCounter);
        Player player = new Player();

        for(pointsCounter =0;pointsCounter < 3001;pointsCounter++)
        {

            player.updateScore(pointsUpdater);
            gameManager.gameOver(player);

        }

        Assert.assertTrue(gameManager.gameOver(player));
    }


}
