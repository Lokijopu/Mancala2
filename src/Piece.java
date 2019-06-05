import java.awt.Graphics;
import javax.swing.JComponent;


public abstract class Piece extends JComponent {
	public abstract void paint(Graphics g);
	public abstract String getColor();
}
