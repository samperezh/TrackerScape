package trackerPackage;

import acm.program.*;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.*;
import static trackerPackage.TrackerParams.*;

public class TrackerButtons {
	

	public TrackerButtons(GraphicsProgram GProgram) {
		
	
		GProgram.add(new JLabel("TrackerScape"), BorderLayout.NORTH);
		
		JComboBox MonthChooser = new JComboBox(months);
		MonthChooser.setEditable(false);
		
		GProgram.add(MonthChooser, BorderLayout.SOUTH);
		
		JComboBox DayChooser = new JComboBox(days);
		DayChooser.setEditable(false);
		
		GProgram.add(DayChooser, BorderLayout.SOUTH);
		
	}
	

	
}
