package org.global.academy;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout; 
import java.awt.event.MouseAdapter; 
import java.awt.event.MouseEvent; 
import java.awt.Font;



public class Flashcard{
    String front; 
    String back;
    boolean learned;

    // No-argument constructor: creates an empty flashcard with default values
    public Flashcard() {
        this.front = "";
        this.back = "";
        this.learned = false;
    }

   public Flashcard(String front, String back) {
        this.front = front;
        this.back = back;
        this.learned = false; // default: not learned yet
    }
    public Flashcard(String front, String back, boolean learned){
        this.front = front;
        this.back = back;
        this.learned = learned; // now learned
    }
    public String getFront(){
        return front;
    }
    public String getBack(){
        return back;
    }
    public boolean isLearned(){
        return learned;
    }
    public void setFront(String front){
       this.front = front;
    }
    public void setBack(String back){
        this.back = back;
    }
    public void setLearned(boolean learned){
        this.learned = learned;
    }

     public void showCard() {
        JFrame frame = new JFrame("Flashcard");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 250);

         JLabel label = new JLabel(getFront(), SwingConstants.CENTER);
         label.setFont(new Font("Tahoma", Font.BOLD, 24));

          label.addMouseListener(new MouseAdapter() {
            private boolean showingFront = true;

            @Override
            public void mouseClicked(MouseEvent e) {
                showingFront = !showingFront; // Toggle the state
                if (showingFront) {
                    label.setText(getFront());
                } else {
                    label.setText(getBack());
                }
            }
        });

        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true);
    }
}
