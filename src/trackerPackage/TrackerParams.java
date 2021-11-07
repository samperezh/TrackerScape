package trackerPackage;

import java.awt.Color; // import more colors?

public class TrackerParams {

	// Screen coordinates dimensions
	public static final int WIDTH = 700;
	public static final int HEIGHT = 525;
	public static final int OFFSET = 300;
	

	//Parameters for the calendar 
	public static final double WIDTHCalendar = 1280-2.65*OFFSET;
	public static final double sqSize = WIDTHCalendar/7; 
	public static final String[] emotions = {"Happy", "Angry", "Sad", "Tired", "Anxious", "Productive"};
	public static final Color[]  colours = {Color.YELLOW, Color.RED, Color.BLUE, Color.LIGHT_GRAY, Color.ORANGE, Color.GREEN}; 
	public static final String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	public static final String[] days = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30","31"};
}
