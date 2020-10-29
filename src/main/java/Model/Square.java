package Model;

import gui_fields.GUI_Field;
import gui_fields.GUI_Street;

public class Square {

    private int id;
    private GUI_Field type;
    private int points;
    private String name;
    private String description;


    public Square(int id,int points, String name, String description)
    {
        this.id = id;
        type = new GUI_Street();
        this.points = points;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return String.valueOf(id);
    }

    public String getPoints() {
        return String.valueOf(points);
    }
}
