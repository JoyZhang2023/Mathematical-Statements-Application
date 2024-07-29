//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Assignment: Mathematical Statements Application");

        logicalOperation();

    }

    public static void logicalOperation() {
        Scanner scanner = new Scanner(System.in);

        // Prompt for user input for statement A
        System.out.println("Enter 0 for true or 1 for false for statement A");
        String statementA = scanner.nextLine();
        int logicalA = Integer.parseInt(statementA);
        if( !(logicalA == 0 || logicalA == 1)) {
            throw new IllegalArgumentException("Invalid input");
        }

        // Prompt for user input for statement B
        System.out.println("Enter 0 for true or 1 for false for statement B");
        String statementB = scanner.nextLine();
        int logicalB = Integer.parseInt(statementB);
        if ( !(logicalB == 0 || logicalB == 1)) {
            throw new IllegalArgumentException("Invalid input");
        }

        System.out.println("Here are the result of different logical connective between statement A and B:");

        // Display logical operation result

        // When A is true
        if (logicalA == 0) {
            if (logicalB == 1) {
                // A false B true display table

                // Define data for the table
                Object[][] data = {
                        {"False", "True", "True", "False", "False"}
                };

                displayTable(data);

            }else {
                // A false B false
                // Define data for the table
                Object[][] data = {
                        {"False", "True", "True", "False", "False"}
                };

                displayTable(data);
            }
        }else {
            if(logicalB == 1) {
                // A true B true
                // Define data for the table
                Object[][] data = {
                        {"False", "True", "True", "False", "False"}
                };

                displayTable(data);

            }else {
                // A true B false
                // Define data for the table
                Object[][] data = {
                        {"False", "True", "True", "False", "False"}
                };

                displayTable(data);
            }
        }



        scanner.close();


    }

    public static void truthTable() {

    }

    public static void displayTable(Object[][] data) {

        // Define 5 column names
        String[] columnNames = {"AND", "OR", "NOT", "IF..THEN", "IF AND ONLY IF"};

        // Create a JTable with the data and column names

        JTable table = new JTable(data, columnNames);
        // Add the table to a JScrollPane (for scrolling)

        JScrollPane scrollPane = new JScrollPane(table);

        // Create a frame to hold the table

        JFrame frame = new JFrame("Truth Table");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(scrollPane);

        frame.setSize(500, 150);

        frame.setVisible(true);
    }
}