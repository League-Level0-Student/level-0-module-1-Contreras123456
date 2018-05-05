import javax.swing.JOptionPane;

public class UnBirthday {

	public static void main(String[]args) {
String Elmo= JOptionPane.showInputDialog("When is your birthday?");
String Kermit = "5/5/18";
if(Elmo.equals(Kermit)) {
JOptionPane.showMessageDialog(null, "Happy Birthday");
}
}
}