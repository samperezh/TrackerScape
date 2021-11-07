package trackerPackage;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import static trackerPackage.TrackerParams.*;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;


public class TrackerSim extends GraphicsProgram {
	TrackerCalendar Calendar;
	TrackerButtons Buttons;
	public int x;
	
	public static void main(String[] args) {
		new TrackerSim().start(args);
	}
	
	public void run() {
		
		this.resize(TrackerParams.WIDTH, TrackerParams.HEIGHT);
		Calendar = new TrackerCalendar(this);

		Buttons = new TrackerButtons(this);
		
//		Buttons.start();
		
		addActionListeners();
	}
	
	/*public void actionPerformed (ActionEvent e) {
		
//		JComboBox combo = (JComboBox)e.getSource();
//        String currentQuantity = (String)combo.getSelectedItem();
		if (e.getSource() == Buttons.MonthChooser);
		//JComboBox<String> combo = (JComboBox<String>) e.getSource();
		//String selectedMonth = (String) combo.getSelectedItem();
		//x = Integer.parseInt(selectedMonth);
		
		if (e.getActionCommand().equals("Enter")) {
			//int ;
			GRect square = createShape(Buttons.getCurrentEmotion());
			add(square);
		}
		
	}
	
	public GRect createShape(Color color) {
		GRect coloredSquare = new GRect(10,10, sqSize, sqSize);
		coloredSquare.setColor(color);
		coloredSquare.setFilled(true);
		return coloredSquare;
	}*/
}


/* when the month is changed, number of boxes are changed for amount of days
 * assign emotions to boxes depending on the day + month selected 
 * 
 * 
 * 
 */

