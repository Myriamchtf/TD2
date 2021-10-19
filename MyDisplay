package view; /*Gérer les formes à l'écran*/

import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;


import model.Cercle;
import model.Polygon;
import model.Rectangle;


public class MyDisplay extends JPanel {


	private static final long serialVersionUID = -5626812705212389468L;

	public MyDisplay() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
			/*
			 * Création d'une nouvelle fenetre dont le nom est Java Avance - Graphic Display
			 */
			JFrame frame = new JFrame("Java Avance - Graphic Display");

			/*
			 * Permet d'indiquer la taille de la fenetre 
			 */
			frame.setSize(new Dimension(500,500));
			/*
			 * Permet d'afficher la fenetre qui a été crée 
			 */
			frame.setVisible(true);
			/*
			 * Provoque la fermeture de la fenetre lorsqu'on appuie sur X. Si on ne le met pas elle peut se fermer mais continuer 
			 * à tourner en arrière plan
			 */
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
			
			/* Ajouter un nouveau cercle*/
			frame.getContentPane().add(new Cercle());

			/* Ajouter un nouveau Polygon */
			frame.getContentPane().add(new Polygon());
			
			/* Ajouter un nouveau Rectangle */
			frame.getContentPane().add(new Rectangle());

	}


}
