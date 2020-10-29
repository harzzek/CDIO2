package Controller;

import Model.GameBoard;
import Model.RaffleCup;
import gui_fields.GUI_Field;
import gui_main.GUI;

import java.security.Guard;

public class GameManager
{
    private RaffleCup raffleCup;
    private GUI gui;
    private GameBoard gameBoard;

    public GameManager()
    {
        DiceController diceController = new DiceController();
        raffleCup = diceController.createRaffleCup();
        BoardController boardController = new BoardController();
        gameBoard = boardController.createGameBoard();
        gui = new GUI(gameBoard.createFields());

    }

    public void round()
    {
        String s = "";

        s = gui.getUserButtonPressed("Roll","Roll");
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
