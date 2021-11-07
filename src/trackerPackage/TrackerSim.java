package trackerPackage;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import static trackerPackage.TrackerParams.*;
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
		
		addActionListeners();
	}
	
	public void actionPerformed (ActionEvent e) {
		JComboBox<String> combo = (JComboBox<String>) e.getSource();
		String selectedMonth = (String) combo.getSelectedItem();
		x = Integer.parseInt(selectedMonth);
	}
	
	public GRect[][] getBox() {
				
//		String a = e.getSelectedItem();

		if (x <=7) {
			for (int i = 0; i < 7; i++) {
				return new GRect [1][i];
			}
		} else if (x > 7 && x <= 14) {
				for (int i = 0; i < 7; i++) {
					return new GRect [2][i];
					}
		} else if (x > 14 && x<= 21) {
				for (int i = 0; i < 7; i++) {
					return new GRect [3][i];
					}
		} else if (x > 21 && x<= 28) {
				for (int i = 0; i < 7; i++) {
					return new GRect [4][i];
					}
		} else if (x > 28 && x<= 31) {
				for (int i = 0; i < 7; i++) {
					return new GRect [5][i];
					}
		}
		return null;
	}
//		if (e.getSource() == "1")return new GRect[1][1];
//		if (e.getSource() == "2")return new GRect[1][2];
//		if (e.getSource() == "3")return new GRect[1][3];
//		if (e.getSource() == "4")return new GRect[1][4];
//		if (e.getSource() == "5")return new GRect[1][5];
//		if (e.getSource() == "6")return new GRect[1][6];
//		if (e.getSource() == "7")return new GRect[1][7];
		
//		if (e.getSource() == "8")return new GRect[2][1];
//		return null;
}


/* when the month is changed, number of boxes are changed for amount of days
 * assign emotions to boxes depending on the day + month selected 
 * 
 * 
 * 
 */

