package _07_fortune_cookie;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FortuneCookie {
	
public void showButton() {
	JFrame frame=new JFrame();
    frame.setVisible(true);
	            System.out.println("Button clicked");
	            
	       }
	   
public static void main(String[] args) {
	JFrame frame=new JFrame();
    JButton button = new JButton();
    frame.add(button);
    frame.pack();
    
}

}
