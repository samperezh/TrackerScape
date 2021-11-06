package trackerPackage;

import acm.program.GraphicsProgram;
import static trackerPackage.TrackerParams.*;
// Hello
//hello hello
//hiiiii
public class TrackerSim extends GraphicsProgram {
	
	public static void main(String[] args) {
		new TrackerSim().start(args);
	}
	
	public void run() {
		
		this.resize(WIDTH+OFFSET, HEIGHT+OFFSET);
		//TrackerCalendar Calendar = new TrackerCalendar(this);
		TrackerButtons Buttons = new TrackerButtons(this);
		
	}
}
