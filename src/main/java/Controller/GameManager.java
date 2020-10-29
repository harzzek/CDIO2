package Controller;

import Model.RaffleCup;
import gui_main.GUI;

import java.security.Guard;

public class GameManager
{
    private RaffleCup raffleCup;
    private GUI gui;

    public GameManager(GUI gui)
    {
        DiceController diceController = new DiceController();
        raffleCup = diceController.createRaffleCup();
        this.gui = gui;

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
