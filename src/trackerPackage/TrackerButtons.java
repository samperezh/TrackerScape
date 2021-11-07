package trackerPackage;

import acm.graphics.GRect;
import acm.program.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

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

	

	public TrackerButtons(GraphicsProgram GProgram) {
		
	
		GProgram.add(new JLabel("TrackerScape"), BorderLayout.NORTH);
		
		MonthChooser = new JComboBox(months);
		MonthChooser.setEditable(false);
		
		GProgram.add(MonthChooser, BorderLayout.SOUTH);
		
		DayChooser = new JComboBox(days);
		DayChooser.setEditable(false);
		
		GProgram.add(DayChooser, BorderLayout.SOUTH);
		
		//ModeChooser = new JCheckBox("Collage Mode");
		//ModeChooser.setSelected(false);
		//GProgram.add(ModeChooser, BorderLayout.NORTH);
		
		
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
		if (happyButton.isSelected()) return Color.YELLOW;
		if (angryButton.isSelected()) return Color.RED;
		if (sadButton.isSelected()) return Color.BLUE;
		if (tiredButton.isSelected()) return Color.LIGHT_GRAY;
		if (anxiousButton.isSelected()) return Color.ORANGE;
		if (productiveButton.isSelected()) return Color.GREEN;
		return Color.WHITE;
		
	}
	
	public void actionPerformed (ActionEvent e, GraphicsProgram GProgram) {
		
//		JComboBox combo = (JComboBox)e.getSource();
//        String currentQuantity = (String)combo.getSelectedItem();
		if (e.getSource() == MonthChooser) {
			 month = (String)MonthChooser.getSelectedItem();	
		}
		
		if (e.getSource() == DayChooser) {
			 day = (String)DayChooser.getSelectedItem();	
		}
		//JComboBox<String> combo = (JComboBox<String>) e.getSource();
		//String selectedMonth = (String) combo.getSelectedItem();
		//x = Integer.parseInt(selectedMonth);
		
		if (e.getActionCommand().equals("Enter")) {
			// location of square
			GRect square = createShape(getCurrentEmotion());
			GProgram.add(square);
		}
		
	}
	
	public GRect createShape(Color color) {
		GRect coloredSquare = new GRect(10,10, sqSize, sqSize);
		coloredSquare.setColor(color);
		coloredSquare.setFilled(true);
		return coloredSquare;
	}
	
}
