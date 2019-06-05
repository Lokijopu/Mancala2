import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Board extends JComponent{
	private int[][] spaces;
	public Board() {
        ImageIcon image = new ImageIcon(getClass().getResource("Mancala board.jfif"));
        JLabel label = new JLabel(image);
        label.setToolTipText("click here to submit");
	}
	public void paintComponent(Graphics2D g) {
		
	}
	public void setPit(Piece piece) {
		
	}
	public void reset() {
		
	}
}
