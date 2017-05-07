/// Rafiqul Islam Jack

package TicTacToePackage;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TicTacToe extends JFrame implements ActionListener{	
	private JButton[] buttons; // Declaring JButton array
	private boolean[] flags; // Declaring Flag
	
	// here, Icon is an object of any class that implements interface Icon
	Icon c1= new ImageIcon("cross.jpg"); // Declare an ImageIcon class. The File cross.jpg contains the  
	Icon c2 = new ImageIcon("Circle.jpg");// image to load and store in the ImageIcon object. ImageIcon 
										// object is assign to Icon reference c1 and c2 respectively.   
	int[] arr = new int[10];
	private int counter=0; // Declaring a variable counter. 
	
	// Constructor Start here 
	public TicTacToe(){
	setTitle("Tic Tac Toe-------Rafiqul Islam Jack");
	setLayout(new GridLayout(3,3));  // Declaring a 3 by 3 Grid using Grid Layout Manager.
	setSize(1000,1000); // Select size 1000 by 1000.
	buttons= new JButton[9]; // Declaring the size of the JButton array. 
	flags= new boolean[9];
	setVisible(true); // make the JFrame visible
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // When press close the Program will be Quit.
	// here, flag is boolean type array. set False.
	for(int i=0;i<flags.length;i++){
		flags[i] = false;
	}
	for(int i=0;i<buttons.length;i++){
		buttons[i]= new JButton(); // Creating the JButton type object or instance of JButton.
		buttons[i].setBackground(Color.WHITE);
		add(buttons[i]); // Add Button into the JFrame
		buttons[i].addActionListener(this); // Add button with the Action Listener Interface
	}
	
} // Constructor End Here
	
	
	boolean flag=true; 
	
	// it is the Action Listener Interface Method
	public void actionPerformed(ActionEvent e){
		Object o= e.getSource(); // getSource() method, Find the source where event occurs. 
		for(int i=0;i<buttons.length;i++){
			if(buttons[i]==o){
				if(flags[i]==false){
					
					
				if(flag==true){
				buttons[i].setIcon(c1); // set Icon on that particular button
				buttons[i].setText("X"); // set Also character.
				counter++;
				Check(); // Call Method Check(), to find the Result. 
				flag=false;
				
				}
				
				else if(flag==false){
					buttons[i].setText("0");
					buttons[i].setIcon(c2);
					counter++;
					Check(); // Call Method Check(), to find the Result.
					flag=true;
				  }
				
				flags[i] =true; // make true. That particular Button can not press 
								//second time
			}
				
		}
		
	 }
	
	}
	
	
	// Method Check, Determine the Result of the game. 
	public  void Check(){
		if(buttons[0].getText().toString().equals("X") && buttons[1].getText().toString().equals("X") && buttons[2].getText().toString().equals("X")){
			JOptionPane.showMessageDialog(null, "Player X winner");
			for(int i=0;i<buttons.length;i++){
				buttons[i].setEnabled(false);
			}
		}
		
		if(buttons[3].getText().toString().equals("X") && buttons[4].getText().toString().equals("X") && buttons[5].getText().toString().equals("X")){
			JOptionPane.showMessageDialog(null, "Player X winner");
			for(int i=0;i<buttons.length;i++){
				buttons[i].setEnabled(false);
			}
		}
		if(buttons[6].getText().toString().equals("X") && buttons[7].getText().equals("X") && buttons[8].getText().equals("X")){
			JOptionPane.showMessageDialog(null, "Player X Winner");
			for(int i=0;i<buttons.length;i++){
				buttons[i].setEnabled(false);
			}
		}
		if(buttons[0].getText().toString().equals("X") && buttons[3].getText().equals("X") && buttons[6].getText().equals("X")){
			JOptionPane.showMessageDialog(null, "Player X Winner");
			for(int i=0;i<buttons.length;i++){
				buttons[i].setEnabled(false);
			}
		}
		if(buttons[1].getText().toString().equals("X") && buttons[4].getText().equals("X") && buttons[7].getText().equals("X")){
			JOptionPane.showMessageDialog(null, "Player X Winner");
			for(int i=0;i<buttons.length;i++){
				buttons[i].setEnabled(false);
			}
		}
		if(buttons[2].getText().toString().equals("X") && buttons[5].getText().equals("X") && buttons[8].getText().equals("X")){
			JOptionPane.showMessageDialog(null, "Player X Winner");
			for(int i=0;i<buttons.length;i++){
				buttons[i].setEnabled(false);
			}
		}
		if(buttons[0].getText().toString().equals("X") && buttons[4].getText().equals("X") && buttons[8].getText().equals("X")){
			JOptionPane.showMessageDialog(null, "Player X Winner");
			for(int i=0;i<buttons.length;i++){
				buttons[i].setEnabled(false);
			}
		}
		if(buttons[2].getText().toString().equals("X") && buttons[4].getText().equals("X") && buttons[6].getText().equals("X")){
			JOptionPane.showMessageDialog(null, "Player X Winner");
			for(int i=0;i<buttons.length;i++){
				buttons[i].setEnabled(false);
			}
		}
		
		if(buttons[0].getText().toString().equals("0") && buttons[1].getText().toString().equals("0") && buttons[2].getText().toString().equals("0")){
			JOptionPane.showMessageDialog(null, "Player 0 winner");
			for(int i=0;i<buttons.length;i++){
				buttons[i].setEnabled(false);
			}
		}
		
		if(buttons[3].getText().toString().equals("0") && buttons[4].getText().toString().equals("0") && buttons[5].getText().toString().equals("0")){
			JOptionPane.showMessageDialog(null, "Player 0 winner");
			for(int i=0;i<buttons.length;i++){
				buttons[i].setEnabled(false);
			}
		}
		if(buttons[6].getText().toString().equals("0") && buttons[7].getText().equals("0") && buttons[8].getText().equals("0")){
			JOptionPane.showMessageDialog(null, "Player 0 Winner");
			for(int i=0;i<buttons.length;i++){
				buttons[i].setEnabled(false);
			}
		}
		if(buttons[0].getText().toString().equals("0") && buttons[3].getText().equals("0") && buttons[6].getText().equals("0")){
			JOptionPane.showMessageDialog(null, "Player 0 Winner");
			for(int i=0;i<buttons.length;i++){
				buttons[i].setEnabled(false);
			}
		}
		if(buttons[1].getText().toString().equals("0") && buttons[4].getText().equals("0") && buttons[7].getText().equals("0")){
			JOptionPane.showMessageDialog(null, "Player 0 Winner");
			for(int i=0;i<buttons.length;i++){
				buttons[i].setEnabled(false);
			}
		}
		if(buttons[2].getText().toString().equals("0") && buttons[5].getText().equals("0") && buttons[8].getText().equals("0")){
			JOptionPane.showMessageDialog(null, "Player 0 Winner");
			for(int i=0;i<buttons.length;i++){
				buttons[i].setEnabled(false);
			}
		}
		if(buttons[0].getText().toString().equals("0") && buttons[4].getText().equals("0") && buttons[8].getText().equals("0")){
			JOptionPane.showMessageDialog(null, "Player 0 Winner");
			for(int i=0;i<buttons.length;i++){
				buttons[i].setEnabled(false);
			}
		}
		if(buttons[2].getText().toString().equals("0") && buttons[4].getText().equals("0") && buttons[6].getText().equals("0")){
			JOptionPane.showMessageDialog(null, "Player 0 Winner");
			for(int i=0;i<buttons.length;i++){
				buttons[i].setEnabled(false);
			}
		}
		
		else if(counter>=9){
			JOptionPane.showMessageDialog(null,"Tie, Not  Winner ");
			for(int i=0;i<buttons.length;i++){
				buttons[i].setEnabled(false);
			}
		} // End Method Check
		
		
	  
		
	}
}
