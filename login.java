import javax.swing.*;
import java.awt.*;

public class login {

    private JFrame frame;
    private JLabel pic, username, password;
    private JTextField usernameField, passwordField;
    private JPanel areaPanel, buttonPanel;
    private JButton loginButton, registerButton;

    public login(){
            frame = new JFrame("Hi");
            areaPanel = new JPanel();
            buttonPanel = new JPanel();
            System.out.println("Hello!");

            
            pic = new JLabel();
            pic.setIcon(new ImageIcon("logo-social.png"));
            Dimension size = pic.getPreferredSize();
            pic.setBounds(50, 30, size.width, size.height);

            usernameField = new JTextField("Username", 15);
            passwordField = new JTextField("Password", 15);
            
            username = new JLabel("Username");
            password = new JLabel("Password");
            
            loginButton = new JButton("Login");
            registerButton = new JButton("Register");

            areaPanel.setLayout(new BoxLayout(areaPanel, BoxLayout.Y_AXIS));
            areaPanel.setBounds(50, 100, 300, 200);
            areaPanel.add(username);
            areaPanel.add(usernameField);
            areaPanel.add(password);
            areaPanel.add(passwordField);
            areaPanel.setBorder(BorderFactory.createEmptyBorder(10, 50, 10, 50));

            buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
            buttonPanel.add(Box.createHorizontalStrut(75));
            buttonPanel.add(loginButton);
            buttonPanel.add(Box.createRigidArea(new Dimension(5, 0)));
            buttonPanel.add(registerButton);
            

            frame.setLayout(new BorderLayout());
            // frame.add(pic);
            // frame.add(username);
            // frame.add(usernameField);
            // frame.add(password);
            // frame.add(passwordField);
            frame.add(pic, BorderLayout.NORTH);
            frame.add(areaPanel, BorderLayout.CENTER);
            frame.add(buttonPanel, BorderLayout.SOUTH);
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    }
