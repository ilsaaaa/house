package House;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;



public class House implements ActionListener{

	public static House house; // calling from the House method
	
	final int WIDTH = 800, HEIGHT = 800;
	
	public Render render;
	
	
	House() {
	
	JFrame f= new JFrame("The House");
	
	Timer t = new Timer(20, this); //the game loop
	 render = new Render(); //from the Render class
	 
	 
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(WIDTH, HEIGHT);
    f.setLocationRelativeTo(null);
    f.setVisible(true);
    f.setResizable(false);  
    f.add(render); // added a method
    
   
    t.start();
 
	}
	
	
	public static void main(String[] args){
		
		house = new House(); //calling from the house method
		
	}


	public void repaint(Graphics g) {
		
		g.setColor(new Color(0, 222 , 234)); //the sky
        g.fillRect(0, 0, WIDTH, HEIGHT);
        
        g.setColor(new Color(40, 150 ,20)); //GRASS
        g.fillRect(0, 300, WIDTH, HEIGHT);
        
		g.setColor(new Color(239, 195, 0)); //BOX HOUSE
		g.fillRect(250 ,200 , 300, 300);
		g.setColor(Color.BLACK);
		//g.setStroke(new BasicStroke(10));
		g.drawRect(250, 200, 300, 300);
		
		g.setColor(new Color(232, 123, 0));
		g.fillRect(450, 55, 50, 100);
		
		
		g.setColor(new Color(229,26,0)); //roof
		g.fillPolygon(new int[] {200, 600, 400}, new int[] {250, 250, 50}, 3);
		g.setColor(Color.black);
		g.drawPolygon(new int[]{200,  600,  400} , new int []{250, 250 ,50}, 3);
		
		g.setColor(Color.BLUE); //left window
		g.fillRect(300, 300, 50, 50);
		
		g.setColor(Color.BLUE); //right window
		g.fillRect(450, 300, 50, 50);
		
		g.setColor(Color.RED); //door
		g.fillRect(365, 400, 60, 100);
		
		g.setColor(new Color(232, 123, 0)); //door
		g.fillRect(360, 500, 90, HEIGHT);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//render.repaint();
		
	}
	
	
}
