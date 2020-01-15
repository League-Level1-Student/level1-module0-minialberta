package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	JFrame frame = new JFrame();

	public void showButton() {

		frame.setVisible(true);
		frame.add(button);
		frame.pack();

		button.addActionListener(this);
	}

	JButton button = new JButton();

	public static void main(String[] args) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Button clicked");
		JOptionPane.showMessageDialog(null, "Woohoo!");
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You will walk");
		}else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "You will talk");
		}else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You will laugh");
		}else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You will run");
		}else { JOptionPane.showMessageDialog(null, "Your dog will not die");
		
		}
	}

}
