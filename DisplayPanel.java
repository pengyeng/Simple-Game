import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

public class DisplayPanel extends JPanel {

    Character character = new Character(100,100,200,100);

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Draw a rectangle
        //Rectangle2D rect = new Rectangle2D.Double(100, 100, 200, 100);
        //g2d.draw(rect);
        character.show(g2d);

        // Draw an oval
        Ellipse2D oval = new Ellipse2D.Double(400, 100, 200, 100);
        g2d.draw(oval);

        // Draw a polygon
        Path2D polygon = new Path2D.Double();
        polygon.moveTo(200, 300);
        polygon.lineTo(300, 400);
        polygon.lineTo(100, 400);
        polygon.closePath();
        g2d.draw(polygon);

        // Set font and color
        g2d.setFont(new Font("Arial", Font.BOLD, 24));
        g2d.setColor(Color.RED);

        // Draw a string
        g2d.drawString("Hello, John. Happy Learning", 200, 50);        
    }
}