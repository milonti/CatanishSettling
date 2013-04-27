import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import java.awt.Color;


public class MainGamePanel extends JPanel {
	private ActivePlayerPanel ActivePlayer;
	private GameBoardPanel GameBoard;
	private OtherPlayerPanel OtherPlayers;
	private ChatPanel ChatPanel;
	
	
	private GameStatusPanel StateOfGamePanel;
	private GameLogic gl;
	private SpringLayout layout;
	public MainGamePanel() {
		
		gl = new GameLogic();
		layout = new SpringLayout();
		setLayout(layout);
		this.setPreferredSize(new Dimension(880,700));
				
		ChatPanel = new ChatPanel(gl);
		layout.putConstraint(SpringLayout.WEST, ChatPanel, 0, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.SOUTH, ChatPanel, 5, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.NORTH, ChatPanel, -120, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.EAST, ChatPanel, -0, SpringLayout.EAST, this);
		add(ChatPanel);
		
		
		OtherPlayers = new OtherPlayerPanel(gl);
		OtherPlayers.setBackground(Color.GREEN);
		layout.putConstraint(SpringLayout.NORTH, OtherPlayers, 5, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, OtherPlayers, -5, SpringLayout.NORTH, ChatPanel);
		layout.putConstraint(SpringLayout.WEST, OtherPlayers, 5, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, OtherPlayers, 155, SpringLayout.WEST, this);
		add(OtherPlayers);
		
		ActivePlayer = new ActivePlayerPanel(gl);
		ActivePlayer.setBackground(Color.YELLOW);
		layout.putConstraint(SpringLayout.NORTH, ActivePlayer, 5, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, ActivePlayer, -5, SpringLayout.NORTH, ChatPanel);
		layout.putConstraint(SpringLayout.WEST, ActivePlayer, -155, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.EAST, ActivePlayer, -5, SpringLayout.EAST, this);
		add(ActivePlayer);
		

		StateOfGamePanel = new GameStatusPanel(gl);
		StateOfGamePanel.setBackground(Color.BLACK);
		layout.putConstraint(SpringLayout.WEST, StateOfGamePanel, 5, SpringLayout.EAST, OtherPlayers);
		layout.putConstraint(SpringLayout.SOUTH, StateOfGamePanel, 100, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.NORTH, StateOfGamePanel, 5, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.EAST, StateOfGamePanel, -5, SpringLayout.WEST, ActivePlayer);
		add(StateOfGamePanel);
		
		GameBoard = new GameBoardPanel(gl);
		layout.putConstraint(SpringLayout.NORTH, GameBoard, 40, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, GameBoard, -0, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.WEST, GameBoard, 50, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, GameBoard, -0, SpringLayout.EAST, this);
		GameBoard.setBackground(Color.LIGHT_GRAY);
		add(GameBoard);
		
		GameBoard.repaint();
		
	}
	
	public JPanel getActivePlayer() {
		return ActivePlayer;
	}
	public GameBoardPanel getGameBoard() {
		return GameBoard;
	}
	public JPanel getOtherPlayers() {
		return OtherPlayers;
	}
	public JPanel getChatPanel() {
		return ChatPanel;
	}
	public JPanel getStateOfGamePanel() {
		return StateOfGamePanel;
	}
}
