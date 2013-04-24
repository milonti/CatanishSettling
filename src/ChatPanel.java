import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;


public class ChatPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	
	SpringLayout layout;
	JTextField entryLine;
	JTextArea ta;
	GameLogic gl;
	
	public ChatPanel(GameLogic gl) {
		//setPreferredSize(new Dimension(780, 100));
		
		this.gl = gl;
		layout = new SpringLayout();
		setLayout(layout);
		
		
		entryLine = new JTextField();
		entryLine.setBackground(Color.LIGHT_GRAY);
		entryLine.addActionListener(new ChatListener());
		layout.putConstraint(SpringLayout.SOUTH, entryLine, -5, SpringLayout.SOUTH, this);
		add(entryLine);
		entryLine.setColumns(10);
		
		
		
		ta= new JTextArea();
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setEditable(false);
		JScrollPane textArea = new JScrollPane(ta);
		layout.putConstraint(SpringLayout.NORTH, textArea, 0, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, textArea, -3, SpringLayout.NORTH, entryLine);
		layout.putConstraint(SpringLayout.EAST, entryLine, 0, SpringLayout.EAST, textArea);
		layout.putConstraint(SpringLayout.WEST, entryLine, 0, SpringLayout.WEST, textArea);
		layout.putConstraint(SpringLayout.WEST, textArea, 5, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, textArea, -5, SpringLayout.EAST, this);
		
		
		add(textArea);
	}
	
	public void addMessage(String newChatLine){
		ta.append(newChatLine + "\n");
	}
	
	public void update(GameLogic l){
		this.gl = l;
		//TODO
	}
	
	class ChatListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String newChatLine = "";
			
			if( gl.getActivePlayer() != null){
				newChatLine += gl.getActivePlayer();
			}
			else{
				newChatLine += "System: ";
			}
			
			newChatLine += entryLine.getText();
			entryLine.setText("");
			ta.append(newChatLine + "\n");
		}
		
		
		
	}
}


