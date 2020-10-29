package Model;

import gui_fields.*;

import java.awt.*;

public class GameBoard
{

    GUI_Field[] fields = new GUI_Field[12];

    public GameBoard()
    {
    }

    public GUI_Field[] createFields()
    {
        fields[0] = new GUI_Start("Start","This is were you start stuped","Well what can i say?", Color.RED,Color.red);
        for (int i = 1; i < fields.length; i++)
        {
            fields[i] = new GUI_Street();
        }
        return fields;
    }

    public GUI_Field[] getFields() {
        return fields;
    }

    public String

}
