import Controller.GameManager;
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
        int pointsUpdater = 0;
        int point = 1;
        boolean playerWin = false;

        GameManager gameManager = new GameManager();
        Player player = new Player();

        for(pointsUpdater =0;pointsUpdater < 3001;pointsUpdater++)
        {

            player.updateScore(point);
            if(gameManager.gameOver(player)){
                playerWin = true;
            }
        }

        Assert.assertTrue(playerWin);
    }


}
