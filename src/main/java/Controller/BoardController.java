package Controller;

import Model.GameBoard;
import gui_fields.GUI_Field;

public class BoardController
{
    public GameBoard createGameBoard(GUI_Field[] fields)
    {
        return new GameBoard(fields);
    }
}
