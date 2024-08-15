import javax.swing.JOptionPane;

public class Conversion {
    public static void main(String[] args) {
        // Declare variables
        String str = JOptionPane.showInputDialog("Enter a value in centimeters: ");
        double cent = Double.parseDouble(str);
        
        // Convert centimeters to inches
        double in = cent / 2.54;
        
        // Display the result
        System.out.println(cent + " centimeters is equal to " + in + " inches");
    }
}