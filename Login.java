import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button_signin, button_clear, button_signup;
    Login(){
        super("Bank Management System");
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        label1=new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.BLACK);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(250, 125, 450,40);
        add(label1);

        label2=new JLabel("Card No:");
        label2.setForeground(Color.BLACK);
        label2.setFont(new Font("Raleway", Font.BOLD, 28));
        label2.setBounds(150, 190, 375,30);
        add(label2);

        textField2 = new JTextField(15);
        label2.setFont(new Font("Arial", Font.BOLD, 14));
        textField2.setBounds(325, 190, 230,30);
        add(textField2);

        label3=new JLabel("PIN: ");
        label3.setForeground(Color.BLACK);
        label3.setFont(new Font("Raleway", Font.BOLD, 28));
        label3.setBounds(150, 250, 375,30);
        add(label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setFont(new Font("Arial", Font.BOLD, 14));
        passwordField3.setBounds(325, 250, 230,30);
        add(passwordField3);

        button_signin = new JButton("SIGN IN");
        button_signin.setFont(new Font("Arial", Font.BOLD, 14));
        button_signin.setForeground(Color.WHITE);
        button_signin.setBackground(Color.BLACK);
        button_signin.setBounds(300,300,100, 30);
        button_signin.addActionListener(this);
        add(button_signin);

        button_clear = new JButton("CLEAR");
        button_clear.setFont(new Font("Arial", Font.BOLD, 14));
        button_clear.setForeground(Color.WHITE);
        button_clear.setBackground(Color.BLACK);
        button_clear.setBounds(430,300,100, 30);
        button_clear.addActionListener(this);
        add(button_clear);

        button_signup = new JButton("SIGN UP");
        button_signup.setFont(new Font("Arial", Font.BOLD, 14));
        button_signup.setForeground(Color.WHITE);
        button_signup.setBackground(Color.BLACK);
        button_signup.setBounds(300,350,230, 30);
        button_signup.addActionListener(this);
        add(button_signup);

        
        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        // try{
        //     if (e.getSource()==button_signin){
        //         Connn c = new Connn();
        //         String cardno = textField2.getText();
        //         String pin = passwordField3.getText();
        //         String q = "select * from login where card_number = '"+cardno+"' and  pin = '"+pin+"'";
        //         ResultSet resultSet = c.statement.executeQuery(q);
        //         if (resultSet.next()){
        //             setVisible(false);
        //             new main_Class(pin);
        //         }else {
        //             JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
        //         }


        //     }else if (e.getSource() == button_clear){
        //         textField2.setText("");
        //         passwordField3.setText("");
        //     }else if (e.getSource() == button_signup){
        //         new Signup();
        //         setVisible(false);
        //     }
        // }catch (Exception E){
        //     E.printStackTrace();
        // }

    }


    }
   

    public static void main(String[] args) {
        new Login();
    }
    

