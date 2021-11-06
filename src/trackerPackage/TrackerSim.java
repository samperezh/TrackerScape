package trackerPackage;

import acm.program.GraphicsProgram;
import static trackerPackage.TrackerParams.*;
<<<<<<< HEAD
import java.awt.Component;


=======
// Hello
//hello hello
//hiiiii
>>>>>>> 225bf0898b95c8f2322053f07187342734d33934
public class TrackerSim extends GraphicsProgram {
	
	public static void main(String[] args) {
		new TrackerSim().start(args);
	}
	
	public void run() {
		
<<<<<<< HEAD
		this.resize(TrackerParams.WIDTH, TrackerParams.HEIGHT);
		TrackerCalendar Calendar = new TrackerCalendar(this);
=======
		this.resize(WIDTH+OFFSET, HEIGHT+OFFSET);
		//TrackerCalendar Calendar = new TrackerCalendar(this);
>>>>>>> 225bf0898b95c8f2322053f07187342734d33934
		TrackerButtons Buttons = new TrackerButtons(this);
		
	}
}
