//add three lines that is necessary for running the program
import javax.swing.*;
import java.event.ActionListener;
import java.awt.Graphic;



//File name AppletPractice.java sub class of JApplet 

//Draw the graph after the program ran properly and what would happen if line 23 is deleted?

public class _AppletPractice_________ extends __JApplet_______ implements _______ActionListener___
{
	int count;
	JLabel title;
	JButton button;
	public void init()
	{
		setLayout(new FlowLayout());
		title = new JLabel("This is Applet Practice");
		button = new JButton("Press");
		add(button);
		add(title);
		
		button.addActionListener(this);
		
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawString("" + count, 50, 50);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		count++;
		repaint();
	}

	

}
