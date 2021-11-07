package trackerPackage;

import acm.program.*;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;
import static trackerPackage.TrackerParams.*;

public class TrackerButtons {
	
	public JRadioButton happyButton;
	public JRadioButton angryButton;
	public JRadioButton sadButton;
	public JRadioButton tiredButton;
	public JRadioButton anxiousButton;
	public JRadioButton productiveButton;

	

	public TrackerButtons(GraphicsProgram GProgram) {
		
	
		GProgram.add(new JLabel("TrackerScape"), BorderLayout.NORTH);
		
		JComboBox MonthChooser = new JComboBox(months);
		MonthChooser.setEditable(false);
		
		GProgram.add(MonthChooser, BorderLayout.SOUTH);
		
		JComboBox DayChooser = new JComboBox(days);
		DayChooser.setEditable(false);
		
		GProgram.add(DayChooser, BorderLayout.SOUTH);
		
	//	for (int i = 0; i < emotions.length; i++) {} SIMPLIFY
		
		happyButton = new JRadioButton("Happy");
		angryButton = new JRadioButton("Angry");
		sadButton = new JRadioButton("Sad");
		tiredButton = new JRadioButton("Tired");
		anxiousButton = new JRadioButton("Anxious");
		productiveButton = new JRadioButton("Productive");
		
		ButtonGroup emotionGroup = new ButtonGroup();
		
		emotionGroup.add(happyButton);
		emotionGroup.add(angryButton);
		emotionGroup.add(sadButton);
		emotionGroup.add(tiredButton);
		emotionGroup.add(anxiousButton);
		emotionGroup.add(productiveButton);
		
		GProgram.add(happyButton, BorderLayout.EAST);
		GProgram.add(angryButton, BorderLayout.EAST);
		GProgram.add(sadButton, BorderLayout.EAST);
		GProgram.add(tiredButton, BorderLayout.EAST);
		GProgram.add(anxiousButton, BorderLayout.EAST);
		GProgram.add(productiveButton, BorderLayout.EAST);

	}
	
	public Color getCurrentEmotion() {
		if (happyButton.isSelected()) return Color.YELLOW;
		if (angryButton.isSelected()) return Color.RED;
		if (sadButton.isSelected()) return Color.BLUE;
		if (tiredButton.isSelected()) return Color.LIGHT_GRAY;
		if (anxiousButton.isSelected()) return Color.ORANGE;
		return Color.GREEN;
		
	}
	
}
