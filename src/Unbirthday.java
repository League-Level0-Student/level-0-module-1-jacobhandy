import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String bday = JOptionPane.showInputDialog("When is your birthday? THIS IS NOT A SCAM!!!");
	if(bday.equals("11/29")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!!! XDXDXD");
		
	
	}
	else {
		JOptionPane.showMessageDialog(null, "Happy Unbirthday");
	}
	
			
			
}
}
