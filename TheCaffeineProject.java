import java.awt.FlowLayout;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;
import javax.swing.JTextField;  
public class Frame {  
    public static void main(String s[]) {  

        int weight = 0;

        JFrame frame = new JFrame("Caffeine Calculator by Group J");  
        JPanel panel = new JPanel();  
        panel.setLayout(new FlowLayout());  

        JLabel label2 = new JLabel("Enter your weight: ");
        JTextField textField2 = new JTextField(10);
        JButton button = new JButton();  
        JLabel label3 = new JLabel("");
        JLabel label4 = new JLabel("The maximum amount of caffeine a human should have is: 400mg per day");
        JLabel label5 = new JLabel("");

        button.setText("Submit");
        //when the button is pressed variable weight get the value of the textfield
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                int weight = Integer.parseInt(textField2.getText());
                label3.setText("The healthy amount of Caffeine you should have is: " + (weight * 3) + " mg per day");
                if ((3 * weight) < 180) {
                    label5.setText("Thats around half a cup");
                } else if ((3 * weight) > 181 && (3 * weight) < 270) {
                    label5.setText("Thats around a cup");
                } else if ((3 * weight) > 271) {
                    label5.setText("Thats around one and a half cups");
                }
            }
        });

   
       
       
       
       

        panel.add(label2);
        panel.add(textField2);
        panel.add(button);

        panel.add(label4);
        panel.add(label3);

        panel.add(label5);

        frame.add(panel);  
        frame.setSize(500, 300);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }  
}  
