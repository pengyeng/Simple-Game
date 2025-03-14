import java.awt.geom.Rectangle2D;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

import javax.swing.ImageIcon;

import java.awt.*;
import java.util.Date;
import java.time.Duration;

public class Dog {
    int myX;
    int myY;
    int myW;
    int myH;
    SimpleDateFormat Time = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");    
    LocalDateTime startTime = LocalDateTime.now();
    long diffInSeconds;    

    public Dog(int x, int y){
        myX = x;
        myY = y;
        myH = 40;
        myW = 31;
    }
    
    public void show(Graphics2D g2d){

        LocalDateTime nowTime = LocalDateTime.now();
        Duration duration = Duration.between(startTime, nowTime); 
        diffInSeconds = duration.toSeconds();
        if (diffInSeconds > 1){
            myX = myX + 10;
            startTime = nowTime;
        }                 
        
        Image characterImg = new ImageIcon(getClass().getResource("./dog.png")).getImage();
        g2d.drawImage(characterImg, myX, myY, myW, myH, null);
    }


}
