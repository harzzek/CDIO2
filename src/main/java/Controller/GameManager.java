package Controller;

import Model.GameBoard;
import Model.RaffleCup;
import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;
import java.awt.*;

public class GameManager
{
    private RaffleCup raffleCup;
    private GUI gui;
    private GameBoard gameBoard;
    private PlayerController playerController = new PlayerController();

    public GameManager()
    {
        DiceController diceController = new DiceController();
        raffleCup = diceController.createRaffleCup();
        BoardController boardController = new BoardController();
        gameBoard = boardController.createGameBoard();
        gui = new GUI(gameBoard.createFields(), Color.LIGHT_GRAY);
    }

    public void round()
    {
        String s = "Roll";
        String userInput = gui.getUserString("Player 1 name");
        playerController.createPlayer(1,userInput,Color.BLUE,Color.cyan, GUI_Car.Type.UFO, GUI_Car.Pattern.FILL);
        gui.addPlayer(playerController.readPlayer(userInput).getPlayer());
        userInput = gui.getUserString("Player 2 name");
        playerController.createPlayer(2,userInput,Color.magenta,Color.cyan, GUI_Car.Type.RACECAR, GUI_Car.Pattern.FILL);
        gui.addPlayer(playerController.readPlayer(userInput).getPlayer());

        while (checkStringBoolean(s))
        {
            gui.setDice(raffleCup.roll()[0], raffleCup.roll()[1]);

            s = gui.getUserButtonPressed("roll","Roll");
        }

    }

    private boolean checkStringBoolean(String s)
    {
        if (s =="Roll")
        {
            return true;
        } else return false;
    }


}
