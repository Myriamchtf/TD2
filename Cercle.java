package model;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Cercle extends JPanel implements Shape {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8549950284753468719L;

	public Cercle() {
		// TODO Auto-generated constructor stub
	}
	
	public void paintComponent(Graphics g){
	    
	    super.paintComponent(g);

		/*
         * AJOUTER UN cercle 
         */
        g.setColor(Color.black);
        g.drawOval(100, 150, 100, 100);
        }
	
}
