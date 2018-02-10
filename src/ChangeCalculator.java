//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {
String answern;
String answerd;
String answerq;
int money = 0;
		// Ask the user how many nickels they have
answern = JOptionPane.showInputDialog("How many nickels do you have?");
answerd = JOptionPane.showInputDialog("How many dimes do you have?");
answerq = JOptionPane.showInputDialog("How many quarters do you have?");
		// Convert their answer to an int using Integer.parseInt()
int nickels = Integer.parseInt(answern);
int dimes = Integer.parseInt(answerd);
int quarters = Integer.parseInt(answerq);
		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has and save it in a double variable 
money = (nickels * 5) + (dimes * 10) + (quarters * 25);
		// Tell the user how much money they have
JOptionPane.showMessageDialog(null, "You have " + money + " cents.");
	}
}

