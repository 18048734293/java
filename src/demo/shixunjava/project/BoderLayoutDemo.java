package demo.shixunjava.project;
/*
 * BOderLayout,可以将组件放置到东，南，西，北，中间5个区域，实例
 * 程序如下
 */
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BoderLayoutDemo {
     public static boolean RIGHT_TO_LEFT=false;
     public static void addcomponentstopane(Container pane) {
    if(!(pane.getLayout()instanceof BorderLayout)) {
    	pane.add(new JLabel("Container doesn't use BorderLayout!"));
    	return;
    }
    if(RIGHT_TO_LEFT) {
    	pane.setComponentOrientation(
    			java.awt.ComponentOrientation
    			.RIGHT_TO_LEFT);
    }
    JButton button=new JButton("Button 1 (PASE_START)");
    pane.add(button,BorderLayout.PAGE_START);
    // MAKE the center component big,since that's the
    //typical usage of BorderLayout.
    button=new JButton("Button 2(CENTER)");
    button.setPreferredSize(new Dimension(200,100));
    pane.add(button,BorderLayout.CENTER);
    
    button=new JButton("Button 3(LINE_START)");
    pane.add(button,BorderLayout.LINE_START);
    
    button=new JButton("Long-Named Button 4(PAGE_END)");
    pane.add(button,BorderLayout.PAGE_END);
 
    button=new JButton(" 5(LINE_END)");
    pane.add(button,BorderLayout.LINE_END);
     }
     
     private static void createAndShowGUI() {
    	 //make sure we have nice window decorations.
    	 JFrame.setDefaultLookAndFeelDecorated(true);
    	 //create and set up the window.
    	 JFrame frame= new JFrame("BorderLayoutDemo");
    	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	 //SET UP THE CONTENT PANE
    	 addcomponentstopane(frame.getContentPane());
    	 //use the content pane's default borderlayout.no need for
    	 //display the window.
    	 frame.pack();
    	 frame.setVisible(true);	 
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Schedule a job for the event-dispatching thread:
		//creating and showing this application's GUI
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				createAndShowGUI();
			}
		});

	}

}
