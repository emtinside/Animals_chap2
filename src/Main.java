import java.awt.Dimension;
import javax.swing.JFrame;
import processing.awt.PSurfaceAWT;
import processing.core.PApplet;
/*
 * Before starting, access the lucid chart below;
 * Join link: https://lucid.app/join
 * Join ID: M9Z L4G
 */
public class Main {

	/**
	 * Creates the window of the program and runs the program
	 * @param args default
	 */
	public static void main(String args[]) {

		DrawingSurface drawing = new DrawingSurface();
		PApplet.runSketch(new String[]{""}, drawing);
		PSurfaceAWT surf = (PSurfaceAWT) drawing.getSurface();

		PSurfaceAWT.SmoothCanvas canvas = (PSurfaceAWT.SmoothCanvas) surf.getNative();
		JFrame window = (JFrame)canvas.getFrame();

		window.setSize(500,500);
		window.setLocationRelativeTo(null);
		window.setMinimumSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(true);
		window.setTitle("Animals");
		window.setVisible(true);
		
	}
}
