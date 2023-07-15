import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JframeLambda {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        //create Button and add
        JButton button = new JButton("click me!");
       /* button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                JOptionPane.showMessageDialog(null,"ButtonClicked");
            }
        });*/

        button.addActionListener(e->{
            JOptionPane.showMessageDialog(null,"ButtonClicked");
        } );
        frame.add(button);
        frame.setSize(400,600);
        frame.setLayout(new FlowLayout());


        frame.setName("AppWindow");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
