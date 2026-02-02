import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * COMP.2800 – Lab 1
 * Java Swing Calculator GUI (Non-operational)
 *
 * This program creates a calculator graphical user interface using
 * Java Swing components. The calculator is not functional yet.
 * Clicking any button will display an "Error" message in the text field.
 *
 * Author:  Oluwanifemi Koleosho
 * Student ID: 110170729
 */

public class COMP2800_Lab1_Oluwanifemi_Koleosho_110170729 extends JFrame {

    // Text field displayed at the top of the calculator
    private JTextField displayField;

    /**
     * Constructor: sets up the GUI
     */
    public COMP2800_Lab1_Oluwanifemi_Koleosho_110170729() {

        // Set frame title
        setTitle("Calculator");

        // Set frame size
        setSize(700, 400);

        // Close program when window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use BorderLayout for main frame
        setLayout(new BorderLayout(10,10));

        // Create text field
        displayField = new JTextField();
        displayField.setEditable(false); // user cannot type
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setFont(new Font("Arial", Font.BOLD, 22));

        // Add text field to the top
        add(displayField, BorderLayout.NORTH);

        // Create panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 7, 5, 5));

        // Button labels
        String[] buttons = {
            "Rad", "Deg", "x!", "(", ")", "%", "AC",
            "Inv", "sin", "ln", "7", "8", "9", "/",
            "PI", "cos", "log", "4", "5", "6", "x",
            "E", "tan", "root", "1", "2", "3", "-",
            "Ans", "EXP", "Pow", "0", ".", "=", "+"
        };

        // Create shared action listener
        ActionListener errorListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayField.setText("Error");
            }
        };

        // Create and add buttons
        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 14));
            btn.addActionListener(errorListener);
            buttonPanel.add(btn);
        }

        // Add button panel to center
        add(buttonPanel, BorderLayout.CENTER);

        // Center window on screen
        setLocationRelativeTo(null);

        // Make frame visible
        setVisible(true);
    }

    /**
     * Main method: program entry point
     */
    public static void main(String[] args) {
        new COMP2800_Lab1_Oluwanifemi_Koleosho_110170729();
    }

}

