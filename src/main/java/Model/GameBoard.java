package Model;

import gui_fields.*;

import java.awt.*;

public class GameBoard
{

    private GUI_Field[] fields = new GUI_Field[12];
    public Square[] squares = new Square[12];
    public GameBoard()
    {
    }

    public GUI_Field[] createFields()
    {
        createSquare();
        for (int i = 0; i < fields.length; i++)
        {

            fields[i] = squares[i].getType();
        }
        return fields;
    }

    public GUI_Field[] getFields() {
        return fields;
    }

    public void createSquare()
    {
        squares[0] = new Square(1, 0, "Endless Plains", "You've entered the Endless Plains, nothing of interest here",Color.WHITE);
        squares[1] = new Square(2, +250, "Tower", "You enter the tower and find 250 points", Color.GREEN );
        squares[2] = new Square(3, -100, "Crater","What's in here? You explore the crater and lost 100 points",Color.RED);
        squares[3] = new Square(4, +100, "Palace Gates","Hurray! You're welcomed back at the gates and receive 100 points",Color.GREEN);
        squares[4] = new Square(5, -20, "Cold Desert","Brrr! You're freezing in the Cold Desert and paid 20 points for a hide", Color.RED);
        squares[5] = new Square(6, +180, "Walled City","You enter the Walled City and find 180 points", Color.GREEN);
        squares[6] = new Square(7, 0, "Monastery","You spend the night at the Monastery for free", Color.WHITE);
        squares[7] = new Square(8, -70, "Black Cave","You've entered the Black Cave and can't find you're way out, pay 70 points for a way out", Color.RED);
        squares[8] = new Square(9, +60, "Huts in the Mountain","You're in the mountains and stumble upon some huts, you find 60 points", Color.GREEN);
        squares[9] = new Square(10, -80, "The Werewall", "AHH! You've encountered the were-wolfs and they stole 80 points from you, but you get an extra turn", Color.RED);
        squares[10] = new Square(11, -50, "The Pit","Ouch! You fell into the Pit and lost 50 points", Color.RED);
        squares[11] = new Square(12, +650, "Goldmine","Money! Your work at the Goldmine is appreciated, rewards 650 points", Color.ORANGE);

    }



}
