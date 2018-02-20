//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



import javax.swing.JOptionPane;

public class HappyPet {
	// 2. Create a happinessLevel variable to store the pet's happiness number.
	//    Initialize to zero.

	public static void main(String[] args) {
		int happinessLevel = 0;
		int task = -1;
		int taskTwice = -1;
		// 1. Ask the user what kind of pet they want to buy, and store in variable
int pet = JOptionPane.showOptionDialog(null, "What pet do you want to buy.", "", 0, JOptionPane.INFORMATION_MESSAGE, null, 
		new String[] { "Dog", "Cat", "Goldfish" }, null);
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		System.out.println(pet);
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			for(int i = 0; i < 3; i++) {
		if(pet == 0 || pet == 1) {
		 task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed", "Walk", "Cuddle" }, null);
			}
			if(pet == 2) {
		 taskTwice = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Feed", "Clean tank", "Buy fish tank accessories" }, null);

			}
			// 5. Use user input to call the appropriate method created in step 4.
			if(task == 0) {
				FeedDogCat();
				happinessLevel += 1;
			}
			else if(task == 1) {
				WalkDogCat();
				happinessLevel += 1;
			}
			else if(task == 2) {
				CuddleDogCat();
				happinessLevel += 1;
			}
			else if(taskTwice == 0) {
				FeedFish();
				happinessLevel += 1;
			}
			else if(taskTwice == 1) {
				CleanTankFish();
				happinessLevel += 1;
			}
			else if(taskTwice == 2) {
				BuyFishThings();
				happinessLevel += 1;
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if(happinessLevel > 2) {
	JOptionPane.showMessageDialog(null, "You love your pet.");
	System.exit(0);
}
			}	
			}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
public static void FeedDogCat() {
	JOptionPane.showMessageDialog(null, "(Devours food with rapid pace) PET HAPPINESS INCREASED");
}
public static void WalkDogCat() {
	JOptionPane.showMessageDialog(null, "Pant, pant (walks energeticly) PET HAPPINESS INCREASED");
}
public static void CuddleDogCat() {
	JOptionPane.showMessageDialog(null, "(lays down comfortably and closes eyes) PET HAPPINESS INCREASED");
}
public static void FeedFish() {
	JOptionPane.showMessageDialog(null, "(Devours food with rapid pace) PET HAPPINESS INCREASED");
}
public static void CleanTankFish() {
	JOptionPane.showMessageDialog(null, "(Swims around in circles) PET HAPPINESS INCREASED");
}
public static void BuyFishThings() {
	JOptionPane.showMessageDialog(null, "(Toys around with new equipment) PET HAPPINESS INCREASED");
}
}