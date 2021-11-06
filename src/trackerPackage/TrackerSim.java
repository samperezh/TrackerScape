package trackerPackage;

import acm.program.GraphicsProgram;
import static trackerPackage.TrackerParams.*;
import java.awt.Component;


public class TrackerSim extends GraphicsProgram {
	
	public static void main(String[] args) {
		new TrackerSim().start(args);
	}
	
	public void run() {
		
		this.resize(TrackerParams.WIDTH, TrackerParams.HEIGHT);
		TrackerCalendar Calendar = new TrackerCalendar(this);
		TrackerButtons Buttons = new TrackerButtons(this);
		
		
		
	}
}
