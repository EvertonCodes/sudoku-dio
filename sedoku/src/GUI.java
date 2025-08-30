import java.awt.*;
import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sudoku");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 450);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(9,9));

        JTextField[][] cells = new JTextField[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                cells[i][j] = new JTextField();
                cells[i][j].setHorizontalAlignment(JTextField.CENTER);
                cells[i][j].setFont(new Font("Arial", Font.BOLD, 20));
                panel.add(cells[i][j]);
            }
        }

        frame.add(panel);
        frame.setVisible(true);
    }
}