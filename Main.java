//Marc Encarncion
//Swing App
//1/29/20
import javax.swing.*;
import java.awt.event.*; //this enables the events
import java.awt.*;

public class Main
{
  public static void main (String args[])
  {
    System.out.println("Marc Encarnacion, Swing App");
    JFrame frame1 = new JFrame("The Magic Advice Giver");
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame1.setSize(500,500);
    frame1.setVisible(true);

    //Panel 1 (to hold buttons)
    JPanel panel1 = new JPanel(new GridLayout(2,2,20,20));

    //Label 1
    JLabel label1 = new JLabel("Chase your dreams");
    JTextField textfield1 = new JTextField(10);

    //Button 1 
    JButton button1 = new JButton("Update Label");

    button1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        //Array list
        String[] phrases = {"You are amazing", "Do not let anyone get you down", "Believe in yourself", "You can do it"};
        String newText = phrases[(int)(Math.random() * phrases.length)];
        label1.setText(newText);
      }
    });

    //Button 2
    JButton button2 = new JButton("More advice?");
    button2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("You are worth it!");
      }
    });

    panel1.add(button1);
    panel1.add(button2);
    panel1.add(label1);
    panel1.add(textfield1);


      //-----------------Panel 2-----------------
      JPanel panel2 = new JPanel (new BorderLayout(10,10));

    
      //--------------Image 1 - the DUCK-------------
      ImageIcon duckImg = new ImageIcon("dogicon.jpg", "A little duck in water");
      JLabel duckLabelPic = new JLabel(duckImg);
      panel2.add(duckLabelPic);

      frame1.getContentPane().add(BorderLayout.NORTH, panel1);
      frame1.getContentPane().add(BorderLayout.CENTER, panel2);
  }//end main method
}//end class Main