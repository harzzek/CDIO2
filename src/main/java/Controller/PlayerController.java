package Controller;

import Model.Player;
import gui_fields.GUI_Car;
import gui_fields.GUI_Player;

import java.awt.*;

public class PlayerController {

    private Player[] players = new Player[2];

    public Player createPlayer(int id, String name, Color carColor, Color carPatternColor, GUI_Car.Type carType, GUI_Car.Pattern carPattern)
    {
        GUI_Car car = new GUI_Car(carColor,carPatternColor,carType,carPattern);
        Player player = new Player(id,name,new GUI_Player(name,1000,car),car);
        if(player.getId() == 1)
        {
            players[0]=player;
        }else
            {
                players[1]=player;
            }
        return player;
    }

    public Player readPlayer(String name)
    {
        Player player = null;
        for (int i = 0; i < players.length; i++)
        {
            if(players[i].getName().equals(name))
            {
                player = players[i];
                break;
            }
        }
        return player;
    }

    public void updateScore(String name, int newScore)
    {
        for (int i = 0; i < players.length; i++)
        {
            if(players[i].getName().equals(name))
            {
                players[i].updateScore(newScore);
            }
        }
    }
}
