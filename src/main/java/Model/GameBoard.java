package Model;

import gui_fields.GUI_Field;

import java.awt.*;

public class GameBoard
{
    GUI_Field[] fields;

    public GameBoard(GUI_Field[] fields)
    {
        this.fields = fields;
    }

    public GUI_Field[] createFields()
    {
        for (int i = 0; i < fields.length; i++)
        {
            fields[i].setBackGroundColor(Color.BLACK);
            fields[i].setForeGroundColor(Color.BLUE);

        }
        return null;
    }


}
