package Controller;

import Model.Player;

public class PlayerController {

    private Player[] players = new Player[2];

    public Player createPlayer(int id, String name)
    {
        Player player = new Player(id,name);
        return player;
    }

    public Player readPlayer(String name)
    {
        Player player = null;
        for (int i = 0; i < players.length; i++)
        {
            if(players[i].getName() == name)
            {
                player = players[i];
            }
        }
        return player;
    }

    public void updateScore(String name, int newScore)
    {
        for (int i = 0; i < players.length; i++)
        {
            if(players[i].getName() == name)
            {
                players[i].updateScore(newScore);
            }
        }
    }
}
