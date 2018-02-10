import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String answer;
	answer = JOptionPane.showInputDialog("What was your test score?");
	int score = Integer.parseInt(answer);
	if(score < 50) {
		JOptionPane.showMessageDialog(null, "Pay attention in class.");
	}
	else if(score > 49 && 75 > score) {
		JOptionPane.showMessageDialog(null, "Study harder.");
	}
	else if(score > 74 && 89 > score) {
		JOptionPane.showMessageDialog(null, "You can get that A!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Nice!");
	}
}
} 
