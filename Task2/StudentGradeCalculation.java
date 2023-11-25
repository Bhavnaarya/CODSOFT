
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CalculationFrame extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,lh;
    JButton b1;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    double math,english,science,tot,avg;
    String grade;
    
    public CalculationFrame(){
        
        
        //Get the container
            Container c = getContentPane();

            //Set absolute layout        
            c.setLayout(null);   

            //Set Background Color
            c.setBackground(Color.cyan); 
        
        
        //create first Label
        lh=new JLabel("Student Grade Calculation");
        lh.setForeground(Color.blue);
        lh.setFont(new Font("tunga",Font.BOLD,36));
        lh.setSize(800, 100);
        lh.setLocation(150, 10);
        c.add(lh);
        
        //create a labe for student name
        l1=new JLabel("Student Name: ");
        l1.setForeground(Color.black);
        l1.setFont(new Font("tunga",Font.BOLD,24));
        l1.setSize(400,60);
        l1.setLocation(20, 100);
        c.add(l1);
        
        
        //create textfield for name
        t1=new JTextField(10);
        t1.setSize(300,60);
        t1.setLocation(200, 100);
        t1.setBorder(BorderFactory.createRaisedBevelBorder());
        c.add(t1);
        
        
        //create a labe for subject 1
        l2=new JLabel("Math: ");
        l2.setForeground(Color.black);
        l2.setFont(new Font("tunga",Font.BOLD,24));
        l2.setSize(400,70);
        l2.setLocation(20, 170);
        c.add(l2);
        
        
        //create textfield for sub 1
        t2=new JTextField(10);
        t2.setSize(250,50);
        t2.setLocation(150, 180);
        t2.setBorder(BorderFactory.createRaisedBevelBorder());
        c.add(t2);
        
        //create a labe for subject 2
        l3=new JLabel("English: ");
        l3.setForeground(Color.black);
        l3.setFont(new Font("tunga",Font.BOLD,24));
        l3.setSize(400,70);
        l3.setLocation(20, 240);
        c.add(l3);
        
        //create textfield for sub 2
        t3=new JTextField(10);
        t3.setSize(250,50);
        t3.setLocation(150, 250);
        t3.setBorder(BorderFactory.createRaisedBevelBorder());
        c.add(t3);
        
        //create a labe for subject 3
        l4=new JLabel("Science: ");
        l4.setForeground(Color.black);
        l4.setFont(new Font("tunga",Font.BOLD,24));
        l4.setSize(400,70);
        l4.setLocation(20, 310);
        c.add(l4);
        
        //create textfield for sub 3
        t4=new JTextField(10);
        t4.setSize(250,50);
        t4.setLocation(150, 320);
        t4.setBorder(BorderFactory.createRaisedBevelBorder());
        c.add(t4);
        
        //create label for total
        l5=new JLabel("Total: ");
        l5.setForeground(Color.black);
        l5.setFont(new Font("tunga",Font.BOLD,24));
        l5.setSize(400,70);
        l5.setLocation(450, 170);
        c.add(l5);
        
        
        //create textfield for total
        t5=new JTextField(10);
        t5.setSize(250,50);
        t5.setLocation(520, 180);
        t5.setBorder(BorderFactory.createRaisedBevelBorder());
        c.add(t5);
        
        
        
        //create a label for avg
        l6=new JLabel("Avg: ");
        l6.setForeground(Color.black);
        l6.setFont(new Font("tunga",Font.BOLD,24));
        l6.setSize(400,70);
        l6.setLocation(450, 240);
        c.add(l6);
        
        //create textfield for avg
        t6=new JTextField(10);
        t6.setSize(250,50);
        t6.setLocation(520, 250);
        t6.setBorder(BorderFactory.createRaisedBevelBorder());
        c.add(t6);
        
        
        //create a labe for grade
        l7=new JLabel("Grade: ");
        l7.setForeground(Color.black);
        l7.setFont(new Font("tunga",Font.BOLD,24));
        l7.setSize(400,70);
        l7.setLocation(450, 310);
        c.add(l7);
        
        //create textfield for grade
        t7=new JTextField(10);
        t7.setSize(235,50);
        t7.setLocation(535, 320);
        t7.setBorder(BorderFactory.createRaisedBevelBorder());
        c.add(t7);
        
        //create button for calculation
        b1=new JButton("Calc");
        b1.setForeground(Color.black);
        b1.setFont(new Font("tunga",Font.BOLD,36));
        b1.setSize(770,60);
        b1.setLocation(10, 400);
        c.add(b1);
        b1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        math=Integer.parseInt(t2.getText());
        t2.setText(String.valueOf(math));
        
        english=Integer.parseInt(t3.getText());
        t3.setText(String.valueOf(english));
        
        science=Integer.parseInt(t4.getText());
        t4.setText(String.valueOf(science));
        
        tot= math+english+science;
        t5.setText(String.valueOf(tot));
        
        avg=tot/3;
        t6.setText(String.valueOf(avg));
        
        if(avg>=85){
            t7.setText("A");
        }else if(avg>=75){
            t7.setText("B");
        }else if(avg>=65){
            t7.setText("c");
        }else if(avg>=45){
            t7.setText("D");
        }else{
            t7.setText("Fail");
        }
        
    }
    
}

public class StudentGradeCalculation {

    public static void main(String[] args) {
        CalculationFrame cf=new CalculationFrame();
        cf.setSize(800, 500);
        cf.setVisible(true);
        cf.setTitle("Student Grade Calculation");
        cf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
}
