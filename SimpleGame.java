import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SimpleGame extends JFrame {
    
    private DisplayPanel displayPanel;    

    private SimpleGame() {
        super("SimpleGame");
        displayPanel = new DisplayPanel();

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(displayPanel);     
        setVisible(true);   

        addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
								
				switch(e.getKeyCode()) {
								
				case KeyEvent.VK_A:
                    displayPanel.character.moveLeft();                
					break;
					
				case KeyEvent.VK_D:
                    displayPanel.character.moveRight();
                    System.out.println(displayPanel.dog.diffInSeconds);
					break;

                case KeyEvent.VK_W:
                    displayPanel.character.moveUp();                
					break;
                
                case KeyEvent.VK_X:
                    displayPanel.character.moveDown();                
					break;
                    
			    }        
            }
        });    
    }

	public static void main(String[] args) {
		//System.out.println("Not running anything");
        SimpleGame simpleGame = new SimpleGame();
        simpleGame.startGame();
	}


    private void startGame() {

        while(true) {
            renderGame();
        }    
    }

	private void renderGame() {
		displayPanel.repaint();		
	}    

}    