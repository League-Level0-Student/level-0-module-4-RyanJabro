//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.

	public static void main(String[] args) {
		String happinessLevel = "zero";
		
		// 1. Ask the user what kind of pet they want to buy, and store in variable
int pet = JOptionPane.showOptionDialog(null, "What pet do you want to buy.", "", 0, JOptionPane.INFORMATION_MESSAGE, null, 
		new String[] { "Dog", "Cat", "Goldfish" }, null);
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		System.out.println(pet);
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			if(pet == 0) {
		int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed", "Walk", "Cuddle" }, null);
			}
			if(pet == 1) {
		int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed", "Let him/her sleep", "Cuddle" }, null);
			}
			if(pet == 2) {
		int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed", "Clean tank", "Buy fish tank accessories" }, null);
			}
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
public static void FeedDog() {
	JOptionPane.showMessageDialog(null, "ruff! ruff! (mouth opens wide) PET HAPPINESS INCREASED");
}
public static void WalkDog() {
	JOptionPane.showMessageDialog(null, "pant, pant (walks energeticly) PET HAPPINESS INCREASED");
}
public static void CuddleDog() {
	JOptionPane.showMessageDialog(null, "*lays down comfortably (closes eyes) PET HAPPINESS INCREASED");
}
}