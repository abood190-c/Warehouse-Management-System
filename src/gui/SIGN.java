package gui;

import java.awt.EventQueue;
import java.awt.Point;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.LineBorder;

public class SIGN extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField emailField;
    private JTextField passwordField;
     
    private Point initialClick; // For dragging the window
    private JTextField txtEmail;
    private JPasswordField passwordField_1;
    private JLabel lblNewLabel_1;
    private JLabel lblNewLabel_2;
    private JLabel lblNewLabel_3;
    private JLabel lblNewLabel_4;
    private JButton btnNewButton_1;
    private JButton btnNewButton_2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SIGN frame = new SIGN();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     * 
     */
    check c =new check();
    public SIGN() {
        // Window properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 890, 510);
        setUndecorated(true); // Remove the window's border
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Panel
        JPanel panel_1 = new JPanel();
        panel_1.setOpaque(false);
        panel_1.setBounds(0, 0, 899, 520);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        // Button to close window
        JButton btnNewButton = 	new JButton("");
       
        btnNewButton.setContentAreaFilled(false); // Make the button background transparent
        btnNewButton.setBorderPainted(false); // Remove the border
        btnNewButton.setFocusPainted(false); // Remove focus painting
        btnNewButton.setIcon(new ImageIcon("src/img/d3768aa1-71da-45bc-be52-22c55293a20a-Photoroom.png"));
        
        btnNewButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mousePressed(MouseEvent e) {
                btnNewButton.setIcon(new ImageIcon("src/img/fccda98d-e80e-4a45-9b42-3133d14e2b52-Photoroom-Photoroom.png"));

        	}
        	@Override
        	public void mouseReleased(MouseEvent e) {
        		 btnNewButton.setIcon(new ImageIcon("src/img/d3768aa1-71da-45bc-be52-22c55293a20a-Photoroom.png"));
        	}
        });
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {dispose();
        	}
        });
        
        btnNewButton.setBounds(790, 22, 78, 43);
        panel_1.add(btnNewButton);
        
        JPanel panel = new JPanel();
        panel.setOpaque(false);
        panel.setBounds(298, 159, 333, 230);
        panel_1.add(panel);
        panel.setLayout(null);
        
        txtEmail = new JTextField();
        txtEmail.setOpaque(false);
        txtEmail.setBorder(new MatteBorder(0, 0, 1, 0,  new Color(0xB8860B)));
        txtEmail.setBackground(new Color(255, 255, 255));
        txtEmail.setFont(new Font("Sylfaen", Font.PLAIN, 15));
        txtEmail.setForeground(SystemColor.controlHighlight);
        txtEmail.setBounds(48, 42, 208, 25);
        panel.add(txtEmail);
        txtEmail.setColumns(10);
        
        passwordField_1 = new JPasswordField();
        passwordField_1.setOpaque(false);
        passwordField_1.setForeground(SystemColor.controlHighlight);
        passwordField_1.setFont(new Font("Sylfaen", Font.PLAIN, 15));
        passwordField_1.setColumns(10);
        passwordField_1.setBorder(new MatteBorder(0, 0, 1, 0,  new Color(0xB8860B)));
        passwordField_1.setBackground(Color.WHITE);
        passwordField_1.setBounds(48, 141, 208, 25);
        passwordField_1.setBounds(48, 97, 208, 25);
        panel.add(passwordField_1);
        
        lblNewLabel_1 = new JLabel("Email");
        lblNewLabel_1.setForeground(Color.LIGHT_GRAY);
        lblNewLabel_1.setFont(new Font("Sylfaen", Font.PLAIN, 11));
        lblNewLabel_1.setBounds(48, 33, 45, 13);
        panel.add(lblNewLabel_1);
        
        lblNewLabel_2 = new JLabel("Password");
        lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
        lblNewLabel_2.setFont(new Font("Sylfaen", Font.PLAIN, 11));
        lblNewLabel_2.setBounds(47, 88, 64, 13);
        panel.add(lblNewLabel_2);
        
        lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setIcon(new ImageIcon("src/img/515c5ccf-8089-4098-a1ba-8e9ed32e0439.jpg"));
        lblNewLabel_3.setBounds(23, 52, 15, 15);
        panel.add(lblNewLabel_3);
        
        lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon("src/img/lock-Photoroom.png"));
        lblNewLabel_4.setBounds(23, 107, 15, 15);
        panel.add(lblNewLabel_4);
        //////////////////////////////////////
        btnNewButton_1 = new JButton("Login");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
					if(c.SignInCheck(txtEmail.getText(), passwordField_1.getText())) {
						dispose();
						new finish().setVisible(true); 
					}
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        	 
        	}
        });
           // Prevent the button from filling its background my edit
        btnNewButton_1.setBorderPainted(false);        // Remove any border around the button editxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
        btnNewButton_1.setFocusPainted(false);
        btnNewButton_1.setForeground(new Color(0xFFFDD0));
//        btnNewButton_1.setOpaque(false);
        btnNewButton_1.setBackground(new Color(0xB8860B));
        btnNewButton_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
        btnNewButton_1.setBounds(48, 146, 208, 25);
        panel.add(btnNewButton_1);
        /////////////////////////////////////
        btnNewButton_2 = new JButton("Crerat new account");
        btnNewButton_2.setContentAreaFilled(false); // Make the button background transparent
        btnNewButton_2.setBorderPainted(false); // Remove the border
        btnNewButton_2.setFocusPainted(false); // Remove focus painting
        btnNewButton_2.setForeground(new Color(0xB8860B)); // Set the text color
         
        
        btnNewButton_2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mousePressed(MouseEvent e) {
                btnNewButton_2.setForeground(new Color(0xFFFDD0)); // Set the text color

        	}
        	@Override
        	public void mouseReleased(MouseEvent e) {
                btnNewButton_2.setForeground(new Color(0xB8860B)); // Set the text color
        	}
        });
        
        
        
        
        btnNewButton_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	setVisible(false);

                // Open the SignUp frame
                SignUp signUpFrame = new SignUp();
                signUpFrame.setVisible(true);
            }
        });
        
        btnNewButton_2.setBounds(71, 181, 171, 21);
        panel.add(btnNewButton_2);
//////////////////////////////////////////////////
        // Image Label
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("src/img/WhatsApp Image 2024-11-04 at 21.31.33.jpeg"));
        lblNewLabel.setBounds(-1, -8, 900, 525);
        contentPane.add(lblNewLabel);

        // Make the frame draggable
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint(); // Store the initial click location
            }
        });

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                // Get the current window location
                int thisX = getLocation().x;
                int thisY = getLocation().y;

                // Calculate how much the mouse moved
                int xMoved = e.getX() - initialClick.x;
                int yMoved = e.getY() - initialClick.y;

                // Update the window's location
                int newX = thisX + xMoved;
                int newY = thisY + yMoved;
                setLocation(newX, newY);
            }
        });

}
}