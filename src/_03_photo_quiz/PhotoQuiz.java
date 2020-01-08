package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
String pic="https://visioneyeinstitute.com.au/wp-content/uploads/laser-eye-safety.jpg";
		// 2. create a variable of type "Component" that will hold your image
Component picture=createImage(pic);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
quizWindow.add(picture);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String ans=JOptionPane.showInputDialog("What is the image of?");
		// 7. print "CORRECT" if the user gave the right answer
if (ans.equals("eye")) {
	System.out.println("CORRECT");
}else {
	System.out.println("INCORRECT");
}
		// 8. print "INCORRECT" if the answer is wrong
quizWindow.remove(picture);
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)

		// 10. find another image and create it (might take more than one line
		// of code)
String pic1="https://www.sciencemag.org/sites/default/files/styles/inline__450w__no_aspect/public/butterfly_16x9_0.jpg?itok=iq6kFrCi";
		// 11. add the second image to the quiz window
Component picture1=createImage(pic1);
quizWindow.add(picture1);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String ans1=JOptionPane.showInputDialog("What is the image of?");
		// 14+ check answer, say if correct or incorrect, etc.
if (ans1.equals("butterfly")) {
	System.out.println("CORRECT");
}else {
	System.out.println("INCORRECT");
}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
