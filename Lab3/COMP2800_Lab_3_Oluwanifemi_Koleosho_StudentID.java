import javax.swing.*;
import java.awt.*;

/*
 * COMP.2800 - Lab 3
 * Creating a Typing GUI
 * This program builds the GUI layout for a typing tutor application.
 * No button functionality is implemented.
 * Author:  Oluwanifemi Koleosho
 * Student ID: 110170729
 */

public class COMP2800_Lab_3_Oluwanifemi_Koleosho_StudentID extends JFrame {

    public COMP2800_Lab_3_Oluwanifemi_Koleosho_StudentID() {

        setTitle("TypingTutor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 400);
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(4, 4, 4, 4);
        gbc.fill = GridBagConstraints.BOTH;

        // ===== Instruction Label =====
        JLabel instructions = new JLabel(
                "Type text using your keyboard. The key you press will be highlighted and text will be displayed."
        );

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 15;
        gbc.weightx = 1;
        gbc.weighty = 0;
        add(instructions, gbc);

        // ===== Text Area =====
        JTextArea textArea = new JTextArea(5, 40);
        JScrollPane scrollPane = new JScrollPane(textArea);

        gbc.gridy = 1;
        gbc.weighty = 0.4;
        add(scrollPane, gbc);

        // Reset for buttons
        gbc.gridwidth = 1;
        gbc.weighty = 0;

        // ===== Keyboard Layout =====
        String[][] keys = {
                {"`","1","2","3","4","5","6","7","8","9","0","-","+","Backspace"},
                {"Tab","Q","W","E","R","T","Y","U","I","O","P","[","]","\\"},
                {"CAPS","A","S","D","F","G","H","J","K","L",";","'","Enter"},
                {"SHIFT","Z","X","C","V","B","N","M",",",".","/"},
                {" ","<","v",">"}
        };

        int row = 2;

        for (String[] keyRow : keys) {
            int col = 0;

            for (String key : keyRow) {

                JButton btn = new JButton(key);

                gbc.gridx = col;
                gbc.gridy = row;
                gbc.weightx = 1;

                // Wider keys
                if (key.equals("Backspace")) gbc.gridwidth = 2;
                else if (key.equals("Tab")) gbc.gridwidth = 2;
                else if (key.equals("CAPS")) gbc.gridwidth = 2;
                else if (key.equals("Enter")) gbc.gridwidth = 2;
                else if (key.equals("SHIFT")) gbc.gridwidth = 2;
                else if (key.equals(" ")) gbc.gridwidth = 6;
                else gbc.gridwidth = 1;

                add(btn, gbc);

                col += gbc.gridwidth;
            }
            row++;
        }

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new COMP2800_Lab_3_Oluwanifemi_Koleosho_StudentID();
    }
}
