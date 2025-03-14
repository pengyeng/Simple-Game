import java.awt.geom.Rectangle2D;

import javax.swing.ImageIcon;

import java.awt.Graphics2D;
import java.awt.*;


public class Character {
    int myX;
    int myY;
    int myW;
    int myH;

    public Character(int x, int y){
        myX = x;
        myY = y;
        myH = 112;
        myW = 42;
    }

    public void show(Graphics2D g2d){
        Image characterImg = new ImageIcon(getClass().getResource("./character.png")).getImage();
        g2d.drawImage(characterImg, myX, myY, myW, myH, null);

        //Rectangle2D rect = new Rectangle2D.Double(myX, myY, myW, myH);
        //g2d.draw(rect);
    }

    public void moveUp(){
        System.out.println("My X "+ myX);
        if (myX > 300){
            System.out.println(myY);
            if (myY > 350){
                myY = myY-10;
            }
        }    
    }

    public void moveDown(){
        myY = myY+10;
    }

    public void moveRight(){
        myX = myX+10;
    }


    public void moveLeft(){
        myX = myX-10;
    }    
}
