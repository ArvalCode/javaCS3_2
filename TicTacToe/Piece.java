
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Nolan Tran
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

public class Piece extends Cell implements Nameable {
    private String name;
    private Color color;

    // Default constructur for all parameters
    public Piece() {
        super(5, 5, 5, 5);
        setName("empty");
        setColor(Color.BLUE);
    }

    public Piece(String name) {
        super(5, 5, 5, 5);
        setName(name);
        setColor(Color.BLUE);
    }

    public Piece(int x, int y, String name) {
        super(x, y, 5, 5);
        setName(name);
        setColor(Color.BLUE);
    }

    public Piece(int x, int y, int w, int h, String name) {
        super(x, y, w, h);
        setName(name);
        setColor(Color.BLUE);
    }

    public Piece(int x, int y, int w, int h, String name, Color c) {
        super(x, y, w, h);
        setName(name);
        setColor(c);
    }

    // Set methods
    public void setName(String name) {
        this.name = name;
    }

    public void setColor(Color c) {
        color = c;
    }

    // Get methods
    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public void draw(Graphics window) {
        window.setFont(new Font("TAHOMA", Font.BOLD, 28));
        window.setColor(getColor());
    }

    // toString to print out Piece data/color
    public String toString() {
        return  super.toString() + ", name: " + getName() + "\ncolor: " + getColor();
    }
}
