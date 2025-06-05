package gui;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class SignUp extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField t1;
    private JTextField t2;
    private JPasswordField t3;
    private JPasswordField t4;
    private JTextField t5;

    check c = new check();
    private JButton btnNewButton_4_1;
    private JButton btnNewButton_4;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SignUp frame = new SignUp();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public SignUp() {
    	
    	setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 908, 512);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setOpaque(false);
        panel.setBounds(312, 112, 340, 294);
        contentPane.add(panel);
        panel.setLayout(null);
        // Username Label
        JLabel lblUserName = new JLabel("Username");
        lblUserName.setForeground(new Color(0xB8860B));
        lblUserName.setFont(new Font("Sylfaen", Font.PLAIN, 12));
        lblUserName.setBounds(34, 10, 100, 20);
        panel.add(lblUserName);

        // Username Field
        t1 = new JTextField();
        t1.setForeground(Color.WHITE);
        t1.setOpaque(false);
        t1.setBorder(new MatteBorder(0, 0, 1, 0, new Color(0xB8860B)));
        t1.setBounds(34, 23, 239, 28);
        panel.add(t1);
        t1.setColumns(10);

        // Email Label
        JLabel lblEmail = new JLabel("Email");
        lblEmail.setForeground(new Color(0xB8860B));
        lblEmail.setFont(new Font("Sylfaen", Font.PLAIN, 12));
        lblEmail.setBounds(34, 63, 100, 20);
        panel.add(lblEmail);

        // Email Field
        t2 = new JTextField();
        t2.setForeground(Color.WHITE);
        t2.setOpaque(false);
        t2.setBorder(new MatteBorder(0, 0, 1, 0, new Color(0xB8860B)));
        t2.setBounds(34, 83, 239, 28);
        panel.add(t2);
        t2.setColumns(10);

        // Password Label
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setForeground(new Color(0xB8860B));
        lblPassword.setFont(new Font("Sylfaen", Font.PLAIN, 12));
        lblPassword.setBounds(34, 123, 100, 20);
        panel.add(lblPassword);

        // Password Field
        t3 = new JPasswordField();
        t3.setForeground(Color.WHITE);
        t3.setOpaque(false);
        t3.setBorder(new MatteBorder(0, 0, 1, 0, new Color(0xB8860B)));
        t3.setBounds(34, 143, 239, 28);
        panel.add(t3);

        // Confirm Password Label
        JLabel lblConfirmPassword = new JLabel("Confirm Password");
        lblConfirmPassword.setForeground(new Color(0xB8860B));
        lblConfirmPassword.setFont(new Font("Sylfaen", Font.PLAIN, 12));
        lblConfirmPassword.setBounds(34, 183, 130, 20);
        panel.add(lblConfirmPassword);

        
        JPanel panel_1 = new JPanel();
        panel_1.setOpaque(false);
        panel_1.setVisible(false);
        panel_1.setBounds(0, 54, 340, 351);
        contentPane.add(panel_1);
        panel_1.setLayout(null);
        
        JLabel lblEmail_1 = new JLabel("Phone Number");
        lblEmail_1.setForeground(new Color(184, 134, 11));
        lblEmail_1.setFont(new Font("Sylfaen", Font.PLAIN, 12));
        lblEmail_1.setBounds(25, 154, 100, 20);
        panel_1.add(lblEmail_1);
        
        t5 = new JTextField();
        t5.setOpaque(false);
        t5.setForeground(Color.WHITE);
        t5.setColumns(10);
        t5.setBorder(new MatteBorder(0, 0, 1, 0, new Color(0xB8860B)));
        t5.setBounds(25, 174, 239, 28);
        panel_1.add(t5);
        
        JButton btnNewButton = new JButton("Sign Up");
        
        btnNewButton.setFocusPainted(false);
        btnNewButton.setBorderPainted(false);
        String UserFile = "src/Users .csv";
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(c.checkText(t1.getText(),t2.getText() , t3.getText(), t4.getText(), t5.getText()) == 5) {
            		JOptionPane.showMessageDialog(null, "The phone number cannot be empty. ");
            	}else {
            		try (BufferedWriter bw = new BufferedWriter(new FileWriter(UserFile, true))) {
                        bw.write(t1.getText() + "," + t2.getText() + "," + t3.getText() + ","+ c.generateAdminID() + "," + t5.getText() + "\n");
                        JOptionPane.showMessageDialog(null,"Done , signed up successfully!");
                        SIGN signFrame = new SIGN(); 
                        signFrame.setVisible(true);
                        ((JFrame) SwingUtilities.getWindowAncestor((JButton) e.getSource())).dispose();
                        
                    } catch (IOException x) {
                    	JOptionPane.showMessageDialog(null,"Error writing to user file: " + x.getMessage());
                    }
            	}
            	}
        		
        });
        btnNewButton.setFont(new Font("Sylfaen", Font.PLAIN, 15));
        btnNewButton.setBackground(new Color(0xB8860B));
        btnNewButton.setBounds(25, 259, 175, 28);
        panel_1.add(btnNewButton);
        
        JButton btnNewButton_2 = new JButton("");
        btnNewButton_2.setIcon(new ImageIcon("src/img/96eb29b4-3ef9-46fa-a7d9-e27a0b03755e-Photoroom.png"));
        btnNewButton_2.setOpaque(false);               // Ensure the button doesn't paint its background
        btnNewButton_2.setContentAreaFilled(false);    // Prevent the button from filling its background
        btnNewButton_2.setBorderPainted(false);        // Remove any border around the button
        btnNewButton_2.setFocusPainted(false);
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		panel.setVisible(true);
        		panel_1.setVisible(false);
        	}
        });
        btnNewButton_2.setBounds(10, 53, 59, 51);
        panel_1.add(btnNewButton_2);
        
        JLabel lblNewLabel_1_1 = new JLabel("");
        lblNewLabel_1_1.setIcon(new ImageIcon("src/img/45420ac4-37d5-4af9-99cb-15da6fc40ece-Photoroom.png"));
        lblNewLabel_1_1.setBounds(0, 180, 15, 21);
        panel_1.add(lblNewLabel_1_1);
        
        // Confirm Password Field
        
        t4 = new JPasswordField();
        t4.setForeground(Color.WHITE);
        t4.setOpaque(false);
        t4.setBorder(new MatteBorder(0, 0, 1, 0, new Color(0xB8860B)));
        t4.setBounds(34, 203, 239, 28);
        panel.add(t4);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("src/img/515c5ccf-8089-4098-a1ba-8e9ed32e0439.jpg"));
        lblNewLabel.setBounds(10, 86, 15, 21);
        panel.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon("src/img/97283261-0794-40aa-8529-9992226c5999-Photoroom.png"));
        lblNewLabel_1.setBounds(9, 29, 15, 21);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setIcon(new ImageIcon("src/img/lock-Photoroom.png"));
        lblNewLabel_2.setBounds(10, 149, 15, 21);
        panel.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("New label");
        lblNewLabel_3.setIcon(new ImageIcon("src/img/lock-Photoroom.png"));
        lblNewLabel_3.setBounds(9, 209, 15, 21);
        panel.add(lblNewLabel_3);
        
        JButton btnNewButton_3 = new JButton("");
        btnNewButton_3.setOpaque(false);               // Ensure the button doesn't paint its background
        btnNewButton_3.setContentAreaFilled(false);    // Prevent the button from filling its background
        btnNewButton_3.setBorderPainted(false);        // Remove any border around the button
        btnNewButton_3.setFocusPainted(false);
        btnNewButton_3.addActionListener(new ActionListener() {
        	SIGN sign=new SIGN();
        	int complexity = c.passwordComplexity(t3.getText());
        	public void actionPerformed(ActionEvent e) {
        		String username = t1.getText();
                String email = t2.getText();
                String password = t3.getText();
                String confirmPassword = t4.getText();
                String phone = t5.getText();

                // Validate inputs using checkText
                int validationResult = c.checkText(username, email, password, confirmPassword, phone);
                if (validationResult == 1) {
                    JOptionPane.showMessageDialog(null, "The entered username is incorrect.");
                } else if (validationResult == 2) {
                    JOptionPane.showMessageDialog(null, "The entered Email is incorrect.");
                } else if (validationResult == 3) {
                    JOptionPane.showMessageDialog(null, "The entered Password is incorrect.");
                } else if (validationResult == 4) {
                    JOptionPane.showMessageDialog(null, "Your confirm Password is wrong.");
                }  else {
                
                    // Validate password complexity
                    int complexity = c.passwordComplexity(password);
                    if (complexity == 1) {
                        JOptionPane.showMessageDialog(null, "Password must be at least 8 characters long.");
                    } else if (complexity == 2) {
                        JOptionPane.showMessageDialog(null, "Password must contain both letters and numbers.");
                    } else {
                    	
                        // Success: Proceed to the next panel
                        panel_1.setBounds(319, 45, 340, 351);
                        panel.setVisible(false);
                        panel_1.setVisible(true);
                    }
         
                }
        	}
        });
       
		
        btnNewButton_3.setIcon(new ImageIcon("src/img/96eb29b4-3ef9-46fa-a7d9-e27a0b03755e-Photoroom.png"));
        btnNewButton_3.setBounds(62, 242, 58, 41);
        panel.add(btnNewButton_3);
        
        
        
        
        JButton btnNewButton_4_2 = new JButton("");
        btnNewButton_4_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {       		
        	    t3.setEchoChar('•');      	    
        		btnNewButton_4_2.setVisible(false);
        		btnNewButton_4.setVisible(true);
        	}
        });
        btnNewButton_4_2.setVisible(false);
        btnNewButton_4_2.setIcon(new ImageIcon("src/img/7694033_eye_eyes_hide_view_watch_icon (1).png"));
        btnNewButton_4_2.setOpaque(false);
        btnNewButton_4_2.setFocusPainted(false);
        btnNewButton_4_2.setContentAreaFilled(false);
        btnNewButton_4_2.setBorderPainted(false);
        btnNewButton_4_2.setBounds(269, 126, 50, 35);
        panel.add(btnNewButton_4_2);
        
        btnNewButton_4 = new JButton("");
        btnNewButton_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		t3.setEchoChar((char) 0);
        		btnNewButton_4.setVisible(false);
        		btnNewButton_4_2.setVisible(true);
        	}
        });
        btnNewButton_4.setIcon(new ImageIcon("src/img/file (10) (3).png"));
        btnNewButton_4.setOpaque(false);               // Ensure the button doesn't paint its background
        btnNewButton_4.setContentAreaFilled(false);    // Prevent the button from filling its background
        btnNewButton_4.setBorderPainted(false);        // Remove any border around the button
        btnNewButton_4.setFocusPainted(false);
        btnNewButton_4.setBounds(269, 125, 50, 35);
        panel.add(btnNewButton_4);
        
        JButton btnNewButton_4_3 = new JButton("");
        btnNewButton_4_3.setVisible(false);
        btnNewButton_4_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		t4.setEchoChar('•');
        		btnNewButton_4_3.setVisible(false);
        		btnNewButton_4_1.setVisible(true);
        		
        	}
        });
        btnNewButton_4_3.setIcon(new ImageIcon("src/img/7694033_eye_eyes_hide_view_watch_icon (1).png"));
        btnNewButton_4_3.setOpaque(false);
        btnNewButton_4_3.setFocusPainted(false);
        btnNewButton_4_3.setContentAreaFilled(false);
        btnNewButton_4_3.setBorderPainted(false);
        btnNewButton_4_3.setBounds(269, 186, 50, 35);
        panel.add(btnNewButton_4_3);
        
        btnNewButton_4_1 = new JButton("");
        btnNewButton_4_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		t4.setEchoChar((char) 0);
        		btnNewButton_4_1.setVisible(false);
        		btnNewButton_4_3.setVisible(true);
        	}
        });
        btnNewButton_4_1.setIcon(new ImageIcon("src/img/file (10) (3).png"));
        btnNewButton_4_1.setOpaque(false);
        btnNewButton_4_1.setFocusPainted(false);
        btnNewButton_4_1.setContentAreaFilled(false);
        btnNewButton_4_1.setBorderPainted(false);
        btnNewButton_4_1.setBounds(269, 185, 50, 35);
        panel.add(btnNewButton_4_1);
        
        JButton btnNewButton_5 = new JButton("I have already account");
        btnNewButton_5.setContentAreaFilled(false); // Make the button background transparent
        btnNewButton_5.setBorderPainted(false); // Remove the border
        btnNewButton_5.setFocusPainted(false); // Remove focus painting
        btnNewButton_5.setForeground(new Color(0xB8860B)); // Set the text color
         
        
        btnNewButton_5.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mousePressed(MouseEvent e) {
                btnNewButton_5.setForeground(new Color(0xFFFDD0)); // Set the text color

        	}
        	@Override
        	public void mouseReleased(MouseEvent e) {
                btnNewButton_5.setForeground(new Color(0xB8860B)); // Set the text color
        	}
        });
        
        
        
        
        btnNewButton_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	setVisible(false);

                // Open the SignUp frame
                SIGN signFrame = new SIGN();
                signFrame.setVisible(true);
            }
        });
        btnNewButton_5.setBounds(134, 261, 185, 23);
        panel.add(btnNewButton_5);
        
        
        JButton btnNewButton_1 = new JButton("");
        btnNewButton_1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				btnNewButton_1.setIcon(new ImageIcon("src/img/d3768aa1-71da-45bc-be52-22c55293a20a-Photoroom.png"));
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				btnNewButton_1.setIcon(new ImageIcon("src/img/fccda98d-e80e-4a45-9b42-3133d14e2b52-Photoroom-Photoroom.png"));
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				
			}
		});
        btnNewButton_1.setOpaque(false);               // Ensure the button doesn't paint its background
        btnNewButton_1.setContentAreaFilled(false);    // Prevent the button from filling its background
        btnNewButton_1.setBorderPainted(false);        // Remove any border around the button
        btnNewButton_1.setFocusPainted(false);
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        	}
        });
        btnNewButton_1.setIcon(new ImageIcon("src/img/d3768aa1-71da-45bc-be52-22c55293a20a-Photoroom.png"));
        btnNewButton_1.setBounds(795, 23, 89, 30);
        contentPane.add(btnNewButton_1);
        // Background Image
        JLabel backgroundLabel = new JLabel(){
            private static final long serialVersionUID = 1L;
            private final ImageIcon backgroundImage = new ImageIcon("src/img/backGround.png");

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        backgroundLabel.setIcon(new ImageIcon());


        backgroundLabel.setBounds(0, 0, 908, 512);
        contentPane.add(backgroundLabel);
        
        
        
        
        
       
    }
}
