import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class DirectoryLength {
    private String calcLengthOfTheDirectory(File[] files) {
        String s;
        int sum = 0;
        for (int i = 0; i < files.length; i++) {
            sum += files[i].length();
        }

        Double finalSumInKBytes = new Double(sum/1000);
        s = finalSumInKBytes.toString();
        return s;
    }

    //string for directory length
    public String dirLength = "0";

    DirectoryLength() {

        //create new container JFrame
        JFrame jFrame = new JFrame("Directory Length");

        // default size of the frame
        jFrame.setSize(600, 300);

        //finish executing the program, when the user presses 'exit'
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //create font
        Font BigFontTR = new Font("TimesRoman", Font.BOLD, 20);

        //create text labels (North, South)
        final JLabel textLabelNorth = new JLabel("Shows the length of all files in the directory");
        JLabel textLabelSouth = new JLabel("The length of the directory (kB): " );

        //add labels onto the panel
        textLabelNorth.setBounds(50,30, 400,20);
        textLabelSouth.setBounds(50,150, 400,20);
        textLabelNorth.setFont(BigFontTR);
        textLabelSouth.setFont(BigFontTR);
        jFrame.add(textLabelNorth, BorderLayout.NORTH);
        jFrame.add(textLabelSouth, BorderLayout.SOUTH);

        //create a button for a file chooser
        JButton button = new JButton("Choose a directory");
        button.setBounds(50,80,280,40);
        button.setFont(BigFontTR);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser directoryOpen = new JFileChooser();
                directoryOpen.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int ret = directoryOpen.showDialog(null, null);

                if (ret == JFileChooser.APPROVE_OPTION) {
                    File chosenDirectory = directoryOpen.getSelectedFile();

                    //create an array of our files
                    if (chosenDirectory.isDirectory()) {
                        File[] fileArrayOfTheDirectory = chosenDirectory.listFiles();
                        dirLength = calcLengthOfTheDirectory(fileArrayOfTheDirectory);
                        textLabelSouth.setText("The length of the directory (kB): " + dirLength + " kB");
                    }
                }
            }
        });

        //add the button
        jFrame.add(button);

        //show the frame
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DirectoryLength();
            }
        });
    }
}
