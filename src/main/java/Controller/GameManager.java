package Controller;

import Model.GameBoard;
import Model.Player;
import Model.RaffleCup;
import gui_fields.GUI_Car;
import gui_main.GUI;
import java.awt.*;

public class GameManager
{
    private RaffleCup raffleCup;
    private GUI gui;
    private GameBoard gameBoard;
    private PlayerController playerController = new PlayerController();

    public GameManager() {
    }

    public void setupGame(){
        DiceController diceController = new DiceController();
        raffleCup = diceController.createRaffleCup();
        BoardController boardController = new BoardController();
        gameBoard = boardController.createGameBoard();
        gui = new GUI(gameBoard.createFields(), Color.LIGHT_GRAY);
        String userInput = gui.getUserString("Player 1 name");
        playerController.createPlayer(1,userInput,Color.BLUE,Color.cyan, GUI_Car.Type.UFO, GUI_Car.Pattern.FILL);
        gui.addPlayer(playerController.readPlayerByName(userInput).getPlayer());
        userInput = gui.getUserString("Player 2 name");
        playerController.createPlayer(2,userInput,Color.magenta,Color.cyan, GUI_Car.Type.RACECAR, GUI_Car.Pattern.FILL);
        gui.addPlayer(playerController.readPlayerByName(userInput).getPlayer());
        while (!gameOver(playerController.readPlayersByID()[0]) || !gameOver(playerController.readPlayersByID()[1]))
        {
            if(!gameOver(playerController.readPlayersByID()[1])){
                round(playerController.readPlayersByID()[0]);
            }
            if(!gameOver(playerController.readPlayersByID()[0]))
            {
                round(playerController.readPlayersByID()[1]);
            }

        }
        System.exit(1);
    }

    public void round(Player player)
    {
        String s = gui.getUserButtonPressed(null,"Roll");
        int dice1Value;
        int dice2Value;
        int totalValue;

        if (checkStringBoolean(s))
        {
            dice1Value = raffleCup.roll()[0];
            dice2Value = raffleCup.roll()[1];
            totalValue = dice1Value + dice2Value;
            if(gameBoard.getFields(player.getPlacement()).hasCar(player.getPlayer()))
            {
                gameBoard.getFields(player.getPlacement()).removeAllCars();
            }
            playerController.updatePlayerPlacement(player,totalValue);
            gui.showMessage(gameBoard.getSquareDesc(player.getPlacement()));
            gameBoard.getFields(player.getPlacement()).setCar(player.getPlayer(),true);
            player.updateScore(gameBoard.getSquarePoint(player.getPlacement()));
            player.getPlayer().setBalance(player.getScore());
            gui.setDice(dice1Value, dice2Value);
        }

    }

    private boolean checkStringBoolean(String s)
    {
        return s == "Roll";
    }

    public boolean gameOver(Player player){
        if(player.getScore() >= 3000)
        {
            gui.showMessage(player.getName() + " has won!");
            gui.close();
            return true;
        } else return false;
    }

}
