import java.awt.geom.Rectangle2D;
import java.awt.Graphics2D;

public class Character {
    int myX;
    int myY;
    int myW;
    int myH;

    public Character(int x, int y, int w, int h){
        myX = x;
        myY = y;
        myH = h;
        myW = w;
    }

    public void show(Graphics2D g2d){
        Rectangle2D rect = new Rectangle2D.Double(myX, myY, myW, myH);
        g2d.draw(rect);
    }

    public void moveRight(){
        myX = myX+10;
    }

    public void moveLeft(){
        myX = myX-10;
    }    
}
