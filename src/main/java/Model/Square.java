package Model;

import gui_fields.GUI_Field;
import gui_fields.GUI_Street;

import java.awt.*;

public class Square {

    private int id;
    private GUI_Field type;
    private int points;
    private String name;
    private Color bgColor;
    private String description;


    public Square(int id,int points, String name, String description, Color color)
    {
        this.id = id;
        type = new GUI_Street();
        this.points = points;
        this.name = name;
        this.description = description;
        this.bgColor = color;

    }

    public GUI_Field getType()
    {
        return new GUI_Street(name, "", description, getPointsString(), bgColor, Color.BLACK);
    }

    public String getId() {
        return String.valueOf(id);

    }

    public String getPointsString() {
        return String.valueOf(points);
    }

    public int getPoints()
    {
        return points;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


}
