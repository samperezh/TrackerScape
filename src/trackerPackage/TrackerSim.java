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
	
	public static void main(String[] args) {
		new TrackerSim().start(args);
	}
	
	public void run() {
		
		this.resize(TrackerParams.WIDTH, TrackerParams.HEIGHT);
		Calendar = new TrackerCalendar(this);

		Buttons = new TrackerButtons(this);
		
		addActionListeners(this);
	}
	
public void actionPerformed (ActionEvent e) {
		
		if (e.getActionCommand().equals("Enter")) {
			GRect square = createShape(Buttons.getCurrentEmotion());
			add(square);
		}
	}

	public GRect createShape(Color color) {
		GRect location = getBox();
		GRect coloredSquare = new GRect(location.getX(),location.getY(), sqSize, sqSize);
		coloredSquare.setColor(color);
		coloredSquare.setFilled(true);
		return coloredSquare;
	}
	
	public GRect getBox() {
		GRect[][] array = Calendar.getCalendar();
		
		if (Buttons.getDayChooser() == "1") return array[0][0];
		
		return array[0][1];
	}
	
}
