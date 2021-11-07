package trackerPackage;

import acm.graphics.GPoint;
import acm.graphics.GRect;
import acm.program.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.lang.reflect.Array;

import javax.swing.*;
import static trackerPackage.TrackerParams.*;

public class TrackerButtons {
	
	public JRadioButton happyButton;
	public JRadioButton angryButton;
	public JRadioButton sadButton;
	public JRadioButton tiredButton;
	public JRadioButton anxiousButton;
	public JRadioButton productiveButton;
	
	//public JCheckBox ModeChooser;
	
	public JComboBox MonthChooser;
	public JComboBox DayChooser;
	
	public String month;
	public String day;
	public TrackerCalendar Calendar;
	public GraphicsProgram GProgram;


	public TrackerButtons(GraphicsProgram GProgram) {
		
		this.GProgram = GProgram;
	
		GProgram.add(new JLabel("TrackerScape"), BorderLayout.NORTH);
		
		MonthChooser = new JComboBox(months);
		MonthChooser.setEditable(false);
		
		GProgram.add(MonthChooser, BorderLayout.SOUTH);
		
		DayChooser = new JComboBox(days);
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
		
		GProgram.add(new JButton("Enter"), BorderLayout.EAST);

	}
	
	public Color getCurrentEmotion() {
		if (happyButton.isSelected()) return new Color(255,255,204);
		if (angryButton.isSelected()) return new Color(255,102,102);
		if (sadButton.isSelected()) return new Color(153,204,255);
		if (tiredButton.isSelected()) return new Color(153,153,255);
		if (anxiousButton.isSelected()) return new Color(255,204,153);
		if (productiveButton.isSelected()) return new Color(102,204,0);
		return Color.WHITE;
		
	}
	
/*	public String getMonthChooser() {
		return month = (String)MonthChooser.getSelectedItem();
	}
*/	
	public String getDayChooser() {
		return day = (String)DayChooser.getSelectedItem();
	}
	
}
