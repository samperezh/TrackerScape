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
		if (Buttons.getDayChooser() == "2") return array[0][1];
		if (Buttons.getDayChooser() == "3") return array[0][2];
		if (Buttons.getDayChooser() == "4") return array[0][3];
		if (Buttons.getDayChooser() == "5") return array[0][4];
		if (Buttons.getDayChooser() == "6") return array[0][5];
		if (Buttons.getDayChooser() == "7") return array[0][6];
		
		if (Buttons.getDayChooser() == "8") return array[1][0];
		if (Buttons.getDayChooser() == "9") return array[1][1];
		if (Buttons.getDayChooser() == "10") return array[1][2];
		if (Buttons.getDayChooser() == "11") return array[1][3];
		if (Buttons.getDayChooser() == "12") return array[1][4];
		if (Buttons.getDayChooser() == "13") return array[1][5];
		if (Buttons.getDayChooser() == "14") return array[1][6];
		
		if (Buttons.getDayChooser() == "15") return array[2][0];
		if (Buttons.getDayChooser() == "16") return array[2][1];
		if (Buttons.getDayChooser() == "17") return array[2][2];
		if (Buttons.getDayChooser() == "18") return array[2][3];
		if (Buttons.getDayChooser() == "19") return array[2][4];
		if (Buttons.getDayChooser() == "20") return array[2][5];
		if (Buttons.getDayChooser() == "21") return array[2][6];
		
		if (Buttons.getDayChooser() == "22") return array[3][0];
		if (Buttons.getDayChooser() == "23") return array[3][1];
		if (Buttons.getDayChooser() == "24") return array[3][2];
		if (Buttons.getDayChooser() == "25") return array[3][3];
		if (Buttons.getDayChooser() == "26") return array[3][4];
		if (Buttons.getDayChooser() == "27") return array[3][5];
		if (Buttons.getDayChooser() == "28") return array[3][6];
		
		if (Buttons.getDayChooser() == "29") return array[4][0];
		if (Buttons.getDayChooser() == "30") return array[4][1];
		return array[4][2];
	}
	
}
