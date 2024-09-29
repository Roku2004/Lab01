package Lab01;
import java.lang.classfile.ClassFile.Option;
import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,"Do you want to change to the first class ticket?");
        
        JOptionPane.showMessageDialog(null, "You 've chosen:' " +
        (option==JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
        // int option=JOptionPane.showConfirmDialog(null,"Do you want to change to the first class ticket");
        // Object[] options = { "Yes", "No" };
        // int choice = JOptionPane.showOptionDialog(null,
        //     "Do you want to change to the first class ticket","select option",
        //     JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
        //     null,options, options[0]);
        // JOptionPane.showMessageDialog(null,"you have chosen: "+ (choice == 0 ?"Yes":"No"));
        // System.exit(0);
    }
}
