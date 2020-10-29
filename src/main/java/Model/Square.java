package Model;

import gui_fields.GUI_Field;

public class Square {

    private int id;
    private GUI_Field type;
    private int points;

    public Square(GUI_Field type,int id,int points)
    {
        this.id = id;
        this.type = type;
        this.points = points;
    }
}
