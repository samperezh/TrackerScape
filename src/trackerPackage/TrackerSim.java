package trackerPackage;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import static trackerPackage.TrackerParams.*;
import static trackerPackage.TrackerButtons.*;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;


public class TrackerSim extends GraphicsProgram {
	
	TrackerButtons Buttons;
	
	public static void main(String[] args) {
		new TrackerSim().start(args);
	}
	
	public void run() {
		
		this.resize(TrackerParams.WIDTH, TrackerParams.HEIGHT);
		TrackerCalendar Calendar = new TrackerCalendar(this);

		Buttons = new TrackerButtons(this);
		
		addMouseListeners();
		addActionListeners();
		
		String hello = "123";
		int number = Integer.parseInt(hello);
		
		println("");
		
	}
	
	public void mouseClicked(MouseEvent e) {
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Enter")) {
			
			GRect square = createShape(Buttons.getCurrentEmotion());
			add(square);
		}
	}
	/**
	 * Creates square using given color 
	 * @param color
	 * @return
	 */
	public GRect createShape(Color color) {
		GRect coloredSquare = new GRect(10,10, sqSize, sqSize);
		coloredSquare.setColor(color);
		coloredSquare.setFilled(true);
		return coloredSquare;
	}
}

/* when the month is changed, number of boxes are changed for amount of days
 * assign emotions to boxes depending on the day + month selected 
 * 
 * 
 * 
 */

