package trackerPackage;

import java.awt.Color; // import more colors?

public class TrackerParams {

	// Screen coordinates dimensions
	public static final int WIDTH = 1280;
	public static final int HEIGHT = 600;
	public static final int OFFSET = 300;
	

	//Parameters for the calendar 
	public static final int WIDTHCalendar = 1280-2*OFFSET;
	public static final int sqSize = WIDTHCalendar/7; // 97.14
	public static final String[] emotions = {"Happy", "Angry", "Sad", "Tired", "Anxious", "Productive"};
	public static final Color[]  colours = {Color.YELLOW, Color.RED, Color.BLUE, Color.LIGHT_GRAY, Color.ORANGE, Color.GREEN}; 
	
}
