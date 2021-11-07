package trackerPackage;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import static trackerPackage.TrackerParams.*;

public class TrackerCalendar {

	GraphicsProgram GProgram;
	TrackerButtons trackerbuttons;
	
	public TrackerCalendar (GraphicsProgram GProgram) {
		this.GProgram = GProgram;
		
		GRect[][] calendarCases = new GRect[5][7];
		
		//Setting up Calendar boxes 
		
		//Initializing individual positions of the squares
		int sqX  = 50;
		int sqY = 50;
		
		// calendarCases.length = height = 5
		// calendarCases[i].length = width = 7
		for (int i = 0; i < calendarCases.length; i++) {
			for (int j = 0; j <  calendarCases[i].length; j++) {
				calendarCases[i][j] = new GRect(sqSize, sqSize);
				GProgram.add(calendarCases[i][j],sqX,sqY);
				sqX += sqSize;
			}
			sqY += sqSize;
			sqX = 50;
		}
	}



}
