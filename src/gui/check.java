package gui;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import javax.swing.JOptionPane;


public class check  {
	public int flag;
	private double balance;
	private String name;
	private String phoneNumber;
	public int checkText (String t1,String t2,String t3,String t4,String t5) {
		if(t1.length() < 5) {
			return 1;
		}else if(t2.length() < 5) {
			return 2;
		}else if(t3.length() < 8) {
			return 3;
		}else if(!t3.equals(t4)) {
			return 4;
		}else if(t5.isEmpty()) {
			return 5;
		}
		return 10;
	}
	
	
	
	public void checkPassword(String password, String rePassword) {
        String currentPass = password;
        System.out.println("Re-enter password:");
        String newSamePassword = rePassword;
        if (currentPass.contentEquals(newSamePassword)) {
            
        } else {
            System.out.println("Password is incorrect.");
            System.out.println("Re-enter the password.");
            
        }
    }
	public String generateAdminID() {
        Random random = new Random();
        StringBuilder adminID = new StringBuilder("ADMIN");
        for (int i = 0; i < 5; i++) {
            adminID.append(random.nextInt(10));
        }
        return adminID.toString();
    }
	public int passwordComplexity(String password) {
        if (password.length() < 8) {
            return 1;
        }
        if (!password.matches(".*[A-Za-z].*") || !password.matches(".*[0-9].*")) {

            return 2;
        }
        return 10;
    }
	public boolean SignInCheck(String userName ,String password) throws IOException {
        String inputUsername = userName;
        String inputPassword = password;
        File UserFile = new File("src/Users .csv");
        try (BufferedReader br = new BufferedReader(new FileReader(UserFile))) {
            String line;
            boolean authenticated = false;

            while ((line = br.readLine()) != null) {
                String[] userDetails = line.split(",");
                if (userDetails.length >= 5) {
                    if (userDetails[1].equals(inputUsername) && userDetails[2].equals(inputPassword)) {
                        authenticated = true;
                        this.name = userDetails[1];
                        this.phoneNumber = userDetails[4];
                        break;
                    }
                } else {
                    System.out.println("Warning: User data line is malformed: " + line);
                }
            }

            if (authenticated) {
            	JOptionPane.showMessageDialog(null, "Sign-in successful!");
            	return true;
            	
            } else {
            	JOptionPane.showMessageDialog(null, "Invalid username or password.");
            	return false;
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
		return false;
    }

}