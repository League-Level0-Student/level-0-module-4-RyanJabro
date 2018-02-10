import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
public static void main(String [] args) {
String fs;
String ed;
String fs2;
String sb;
fs = JOptionPane.showInputDialog("You are stuck in a forest, s to build shelter, f to find food.");
	if(fs.equalsIgnoreCase("s")) {
		sb = JOptionPane.showInputDialog("Shelter built! It is late, s to build signal fire, b to go to bed.");
		if(sb.equalsIgnoreCase("s")) {
			JOptionPane.showMessageDialog(null, "A plane sees you. You escape, YOU WIN!");
		}
		else if(sb.equalsIgnoreCase("b")) {
			JOptionPane.showMessageDialog(null, "You wake up in extreme hunger, you can't move. GAME OVER!");
		}
	}
	else if(fs.equalsIgnoreCase("f")) {
		ed = JOptionPane.showInputDialog("Berries found, e to eat, d to discard.");
		if(ed.equalsIgnoreCase("e")) {
			JOptionPane.showMessageDialog(null, "Berries were poisionous, GAME OVER!");
		}
		else if(ed.equalsIgnoreCase("d")) {
			fs2 = JOptionPane.showInputDialog("Discarded, s to build shelter, f to try find food again.");
			if(fs2.equalsIgnoreCase("s")) {
				sb = JOptionPane.showInputDialog("Shelter built! It is late, s to build signal fire, b to go to bed.");
				if(sb.equalsIgnoreCase("s")) {
					JOptionPane.showMessageDialog(null, "A plane sees you. You escape, YOU WIN!");
				}
				else if(sb.equalsIgnoreCase("b")) {
					JOptionPane.showMessageDialog(null, "You wake up in extreme hunger, you can't move. GAME OVER!");
				}
			}
			else if(fs2.equalsIgnoreCase("f")) {
				sb = JOptionPane.showInputDialog("Still no luck, it is getting late, you decided to build a shelter. s to build signal fire, b to go to bed.");
				if(sb.equalsIgnoreCase("s")) {
					JOptionPane.showMessageDialog(null, "A plane sees you. You escape, YOU WIN!");
				}
				else if(sb.equalsIgnoreCase("b")) {
					JOptionPane.showMessageDialog(null, "You wake up in extreme hunger, you can't move. GAME OVER!");
				}
			}
		}
	}
}
}
