import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;


public class MainGamePanel extends JPanel {
	private JPanel ActivePlayer;
	private GameBoardPanel GameBoard;
	private JPanel OtherPlayers;
	private JPanel ChatPanel;
	private JPanel StateOfGamePanel;
	private GameLogic gl;
	public MainGamePanel() {
		
		gl = new GameLogic();
		
		setLayout(new BorderLayout(0, 0));
		this.setPreferredSize(new Dimension(800,600));
		
		StateOfGamePanel = new JPanel();
		add(StateOfGamePanel, BorderLayout.NORTH);
		
		ChatPanel = new JPanel();
		add(ChatPanel, BorderLayout.SOUTH);
		
		OtherPlayers = new JPanel();
		add(OtherPlayers, BorderLayout.WEST);
		
		ActivePlayer = new JPanel();
		add(ActivePlayer, BorderLayout.EAST);
		
		GameBoard = new GameBoardPanel(gl);
		GameBoard.setBackground(Color.LIGHT_GRAY);
		add(GameBoard, BorderLayout.CENTER);
		
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
