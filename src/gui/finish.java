package gui;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.HashMap;
import java.util.Random;

import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.*;

public class finish extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
//    private Point initialClick;
    private JPanel min;
    private JLayeredPane     mainPanel;
    private JPanel panel_2;
    public Dimension  screenSize =Toolkit.getDefaultToolkit().getScreenSize();

     private JScrollPane saleScroll_1_1;
     private JPanel transactions;

	private ArrayList<String> customerNames, productNames;
	private ArrayList<String> filteredCustomer,filteredProduct;
//	
//	// Method to filter table based on selected customer
//	private void filterTable(JTable table, String selectedItem) {
//	    TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
//	    table.setRowSorter(sorter);
//	    
//	    if (selectedItem == null || selectedItem.isEmpty()) {
//	        sorter.setRowFilter(null); // Show all rows
//	    } else {
//	        sorter.setRowFilter(RowFilter.regexFilter(selectedItem)); // Filter based on selected item
//	    }
//	}
//	
//	// Method to filter the combo box items based on the entered text
//		private boolean isUpdatingcustomerBox = false; // Flag to prevent infinite loop
//	
//
//		private void filterItems(JComboBox<String> comboBox, List<String> allItems, String text) {
//		    // Clear previous filtered items
//		    List<String> newFilteredItems = new ArrayList<>();
//
//		    // Add items that match the entered text (case-insensitive)
//		    for (String item : allItems) {
//		        if (item.toLowerCase().contains(text.toLowerCase())) {
//		            newFilteredItems.add(item);
//		        }
//		    }
//
//		    // Use invokeLater to ensure this runs after the current event processing
//		    SwingUtilities.invokeLater(() -> {
//		        // Set the flag to indicate we're updating the combo box
//		        isUpdatingcustomerBox = true;
//
//		        // Clear all current items
//		        comboBox.removeAllItems(); 
//		        
//		        // Add new filtered items
//		        for (String item : newFilteredItems) {
//		            comboBox.addItem(item);
//		        }
//
//		        // Optionally, set the text of the editor to the current text
//		        // This ensures that the user can see what they are typing
//		        JTextField editor = (JTextField) comboBox.getEditor().getEditorComponent();
//		        editor.setText(text);
//
//		        // Reset the flag after updating
//		        isUpdatingcustomerBox = false;
//		    });
//		}
//	
	
	
	
    public static void main(String[] args) {
		


		
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    finish frame = new finish();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public finish() {


        
        
        
        
        
        
        setSize((int)screenSize.getWidth(), (int)screenSize.getHeight());
        setUndecorated(true);
        contentPane = new JPanel();
        contentPane.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        
        
        
        

        min = new JPanel();
        
        min.setVisible(false);
        

//        min.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseEntered(MouseEvent e) {
//                min.setBounds(0, 0, 200, (int)screenSize.getHeight());
//                min.revalidate();
//                min.repaint();
//            }
//            public void mouseExited(MouseEvent e) {
//            	min.setBounds(0, 0, 64,  (int)screenSize.getHeight());
//            	min.revalidate();
//                min.repaint();
//            }
//        });

        min.setBackground(new Color(0x010014));
        min.setBounds(0, 0, 64,  (int)screenSize.getHeight());
        contentPane.add(min);
        min.setLayout(null);
        
        JPanel panel_7 = new JPanel();
        panel_7.setBounds(0, 0, 64, 864);
        panel_7.setOpaque(false);
        min.add(panel_7);
        panel_7.setLayout(null);
        
        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setIcon(new ImageIcon("src/img/WhatsApp Image 2024-11-04 at 20.55.53 (1).png"));
        lblNewLabel_4.setBackground(new Color(0,0,0,0));
        lblNewLabel_4.setBounds(10, 10, 44, 40);
        
        panel_7.add(lblNewLabel_4);
        lblNewLabel_4.setBounds(10, 10, 200, 40);
        
        JLabel lblNewLabel_4_1 = new JLabel(){
            private static final long serialVersionUID = 1L;
            private final ImageIcon backgroundImage = new ImageIcon("src/img/3f249e88-6d19-456e-a183-60df41d09d57-Photoroom.png");

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        
        
        lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_4_1.setForeground(Color.CYAN);
        lblNewLabel_4_1.setIcon(null);
        lblNewLabel_4_1.setBackground(new Color(0, 0, 0, 0));
        lblNewLabel_4_1.setBounds(10, 177, 44, 40);
        panel_7.add(lblNewLabel_4_1);
        
        
        
        
        //
        
        JLabel lblNewLabel_4_1_1 = new JLabel(){
            private static final long serialVersionUID = 1L;
            private final ImageIcon backgroundImage = new ImageIcon("src/img/download-Photoroom.png");

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        
       
        
  
        lblNewLabel_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_4_1_1.setIcon(null);
        lblNewLabel_4_1_1.setForeground(Color.CYAN);
        lblNewLabel_4_1_1.setBackground(new Color(0, 0, 0, 0));
        lblNewLabel_4_1_1.setBounds(10, 227, 44, 40);
        panel_7.add(lblNewLabel_4_1_1);
        
        
        
        //
        
        
        
        JLabel lblNewLabel_4_1_2 = new JLabel(){
            private static final long serialVersionUID = 1L;
            private final ImageIcon backgroundImage = new ImageIcon("src/img/customers-icon-5.png");

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        
        
        lblNewLabel_4_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_4_1_2.setIcon(null);
        lblNewLabel_4_1_2.setForeground(Color.CYAN);
        lblNewLabel_4_1_2.setBackground(new Color(0, 0, 0, 0));
        lblNewLabel_4_1_2.setBounds(10, 277, 40, 40);
        panel_7.add(lblNewLabel_4_1_2);
        //
        JLabel lblNewLabel_4_1_3 = new JLabel(){
            private static final long serialVersionUID = 1L;
            private final ImageIcon backgroundImage = new ImageIcon("src/img/images-Photoroom.png");

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        lblNewLabel_4_1_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel_4_1_3.setIcon(null);
        lblNewLabel_4_1_3.setForeground(Color.CYAN);
        lblNewLabel_4_1_3.setBackground(new Color(0, 0, 0, 0));
        lblNewLabel_4_1_3.setBounds(10, 327, 44, 40);
        panel_7.add(lblNewLabel_4_1_3);
        //
        JPanel head = new JPanel();
        head.setBackground(Color.WHITE);
        head.setBounds(0, 0, (int)screenSize.getWidth() , 30);
        contentPane.add(head);
        head.setLayout(null);

        JPanel panel_5 = new JPanel();
        panel_5.setOpaque(true);
        panel_5.setBounds( (int)screenSize.getWidth()-60, 0, 60, 30);
        head.add(panel_5);
        panel_5.setLayout(null);

        JLabel lblNewLabel = new JLabel();
        lblNewLabel.setText("x");

        panel_5.setBackground(Color.white);

        lblNewLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                panel_5.setBackground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel_5.setBackground(Color.white);
            }
        });

        lblNewLabel.setBounds(0, 0, 60, 30);
        panel_5.add(lblNewLabel);
        lblNewLabel.setFont(new Font("Simplified Arabic", Font.PLAIN, 32));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panel_5_1 = new JPanel();
        panel_5_1.setLayout(null);
        panel_5_1.setOpaque(true);
        panel_5_1.setBackground(Color.WHITE);
        panel_5_1.setBounds((int)screenSize.getWidth()-120, 0, 60, 30);
        head.add(panel_5_1);

        JLabel lblNewLabel_1 = new JLabel();
        lblNewLabel_1.setBounds(0, 0, 60, 30);
        panel_5_1.add(lblNewLabel_1);
        lblNewLabel_1.setText("-");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setFont(new Font("Andalus", Font.PLAIN, 40));

        panel_5_1.setBackground(Color.white);
        

        lblNewLabel_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setState(JFrame.ICONIFIED);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                panel_5_1.setBackground(new Color(0xb4b4b4));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel_5_1.setBackground(Color.white);
            }
        });

        // Main panel area
        JPanel home = new JPanel();
      
        home.setLayout(null);

        // Gray panel
        panel_2 = new JPanel();
        panel_2.setBackground(new Color(0xD3D3D3));
        panel_2.setBounds(0, 0,(int) screenSize.getWidth(),(int) screenSize.getHeight());
        home.add(panel_2);
        panel_2.setLayout(null);
        
        JLabel lblNewLabel_5 = new JLabel("Stock Flow");
        lblNewLabel_5.setForeground(Color.ORANGE);
  
//        lblNewLabel_5.setForeground(new Color(184, 134, 11));
        lblNewLabel_5.setFont(new Font("Brush Script MT", Font.PLAIN, 70));
        lblNewLabel_5.setBounds(114, 20, 365, 81);
        panel_2.add(lblNewLabel_5);
        
         
        JLabel lblNewLabel_6 = new JLabel("<html>Efficiently manage your inventory with ease. Experience seamless stock flow and organization.</html>");
        
        lblNewLabel_6.setForeground(new Color(1, 0, 36));
        lblNewLabel_6.setBackground(new Color(218, 165, 32));
        lblNewLabel_6.setVerticalAlignment(SwingConstants.TOP);
        lblNewLabel_6.setFont(new Font("Baskerville Old Face", Font.PLAIN, 20));
        lblNewLabel_6.setBounds(114, 111, 319, 55);
        panel_2.add(lblNewLabel_6);
        
        JPanel panel_4 = new JPanel(){
            private static final long serialVersionUID = 1L;
            private final ImageIcon backgroundImage = new ImageIcon("src/img/578ceb6ebe81f1841c76b89b323c57701.jpg");

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        		
        panel_4.setBounds(0,0, (int)screenSize.getWidth(), 200);
        panel_2.add(panel_4);
       
                // Pre-made image panel for background
                JPanel panel_3 = new JPanel() {
                    private static final long serialVersionUID = 1L;
                    private final ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/img/image_2024-10-29_114956805.png"));

                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
                    }
                };
                panel_3.setBounds(0,200, (int)screenSize.getWidth(),(int)screenSize.getHeight()-230);
                panel_2.add(panel_3);


                // Horizontal scroll pane around panel_3

                panel_3.setLayout(null);

                JPanel panel = new JPanel();
                panel.addMouseListener(new MouseAdapter() {
                	@Override
                	public void mouseClicked(MouseEvent e) {






                	}
                });
                panel.setBackground(new Color(160,160,160,40));
                panel.setBounds(346, 88, 200, 200);
                panel_3.add(panel);
                panel.setLayout(null);

                JLabel lblNewLabel_7 = new JLabel("Sale");
                lblNewLabel_7.setForeground(SystemColor.controlHighlight);
                lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 24));
                lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_7.setBounds(0, 167, 200, 33);
                panel.add(lblNewLabel_7);

                JLabel lblNewLabel_8 = new JLabel(""){
                    private static final long serialVersionUID = 1L;
                    private final ImageIcon backgroundImage = new ImageIcon("src/img/point-of-sale-icon-7.png");

                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
                    }
                };





                lblNewLabel_8.setBounds(30, 15, 140, 137);
                panel.add(lblNewLabel_8);

                JPanel panel_1 = new JPanel();
                panel_1.setBackground(new Color(160, 160, 160, 40));
                panel_1.setBounds(600, 88, 200, 200);
                panel_3.add(panel_1);
                panel_1.setLayout(null);

                JLabel lblNewLabel_7_1 = new JLabel("Inventory");
                lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_7_1.setForeground(SystemColor.controlHighlight);
                lblNewLabel_7_1.setFont(new Font("Tahoma", Font.BOLD, 24));
                lblNewLabel_7_1.setBounds(0, 167, 200, 33);
                panel_1.add(lblNewLabel_7_1);

                JLabel lblNewLabel_8_1 = new JLabel(){
                    private static final long serialVersionUID = 1L;
                    private final ImageIcon backgroundImage = new ImageIcon("src/img/12341396.png");

                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
                    }
                };



                lblNewLabel_8_1.setBounds(35, 20, 140, 137);
                panel_1.add(lblNewLabel_8_1);

                JPanel panel_6 = new JPanel();
                panel_6.setBackground(new Color(160, 160, 160, 40));
                panel_6.setBounds(894, 88, 200, 200);
                panel_3.add(panel_6);
                panel_6.setLayout(null);

                JLabel lblNewLabel_7_2 = new JLabel("Customers");
                lblNewLabel_7_2.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_7_2.setForeground(SystemColor.controlHighlight);
                lblNewLabel_7_2.setFont(new Font("Tahoma", Font.BOLD, 24));
                lblNewLabel_7_2.setBounds(0, 167, 200, 33);
                panel_6.add(lblNewLabel_7_2);

                JLabel lblNewLabel_8_1_1 = new JLabel() {
                    private static final long serialVersionUID = 1L;
                    private final ImageIcon backgroundImage = new ImageIcon("src/img/12440938.png");

                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
                    }
                };
                lblNewLabel_8_1_1.setBounds(31, 20, 140, 137);
                panel_6.add(lblNewLabel_8_1_1);

                JPanel panel_9 = new JPanel();
                panel_9.setBackground(new Color(160, 160, 160, 40));
                panel_9.setBounds(1181, 88, 200, 200);
                panel_3.add(panel_9);
                panel_9.setLayout(null);

                JLabel lblNewLabel_7_3 = new JLabel("Transactions ");
                lblNewLabel_7_3.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_7_3.setForeground(SystemColor.controlHighlight);
                lblNewLabel_7_3.setFont(new Font("Tahoma", Font.BOLD, 24));
                lblNewLabel_7_3.setBounds(0, 167, 200, 33);
                panel_9.add(lblNewLabel_7_3);

                JLabel lblNewLabel_8_1_2 = new JLabel() {
                    private static final long serialVersionUID = 1L;
                    private final ImageIcon backgroundImage = new ImageIcon("src/img/transaction-history.png");

                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
                    }
                };

                lblNewLabel_8_1_2.setBounds(-20, -20, 240, 227);
                panel_9.add(lblNewLabel_8_1_2);


        mainPanel =new JLayeredPane();
        mainPanel.setOpaque(false);
        mainPanel.setBounds(0, 30, (int)screenSize.getWidth(), (int)screenSize.getHeight()-30);
        contentPane.add(mainPanel);




        JPanel customer = new JPanel() {
            private static final long serialVersionUID = 1L;

            private final ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/img/image_2024-10-29_114956805.png"));

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };







        customer.setLayout(null);







        // Create an instance of CustomerInterface


        // Create the CustomerPanel that will hold customer buttons
        CustomerPanel customerPanel = new CustomerPanel();

        customerPanel.loadCustomerData("src/customers.csv");

        // Add the customer panel to a scroll pane
        JScrollPane scrollCustomer = new JScrollPane(customerPanel);
        scrollCustomer.setBounds((int)(0.1*  screenSize.getWidth()), 49,(int)(0.8*  screenSize.getWidth()), (int)screenSize.getHeight()-160);
        scrollCustomer.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

         customer.add(scrollCustomer);























        JPanel stock = new JPanel() {
            private static final long serialVersionUID = 1L;
            private final ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/img/image_2024-10-29_114956805.png"));

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };



        // Create and add InventoryScrollPanel to the JFrame

        // Create and configure the InventoryScrollPanel
        InventoryScrollPanel inventoryPanel = new InventoryScrollPanel();
        inventoryPanel.loadDataFromCSV("src/Inventory.csv"); // Load data into the panel

        // Wrap InventoryScrollPanel in a JScrollPane
        JScrollPane scrollPane = new JScrollPane(inventoryPanel);

        scrollPane.setBounds((int)(0.1*  screenSize.getWidth()), 49,(int)(0.8*  screenSize.getWidth()), (int)screenSize.getHeight()-160);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        stock.add(scrollPane); // Add the custom panel to the JFrame


//        stock.add(stockScroll);
//
        stock.setLayout(null);

         JButton btnNewButton2= new JButton("<html>Add New <br>Stock</html>");
         btnNewButton2.addMouseListener(new MouseAdapter() {
         	@Override
         	public void mouseClicked(MouseEvent e) {
         		new AddStock().setVisible(true);
         	}
         });



		btnNewButton2.setFocusPainted(false);
        btnNewButton2.setBorderPainted(false);
		btnNewButton2.setForeground(new Color(0xFFFDD0));
		btnNewButton2.setBackground(new Color(0xB8860B));
		btnNewButton2.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnNewButton2.setBounds((int) screenSize.getWidth()-140, (int)screenSize.getHeight()/2, 100, 40);


        stock.add(btnNewButton2);



        JPanel sale = new JPanel() {
            private static final long serialVersionUID = 1L;
            private final ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/img/image_2024-10-29_114956805.png"));

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        sale.setLayout(null);


        InventoryDisplay salePanel = new InventoryDisplay();
        sale.add(salePanel);










//        saleScroll_1_1 = new JScrollPane(salesT);
//        saleScroll_1_1.setBounds((int)screenSize.getWidth()-340, 50, 300, 420);
//        sale.add(saleScroll_1_1);
//
//        JLabel lblNewLabel_8 = new JLabel("Total Sum");
//        lblNewLabel_8.setForeground(new Color(240, 255, 240));
//        lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        lblNewLabel_8.setBounds(1190, 480, 306, 44);
//        sale.add(lblNewLabel_8);
        mainPanel.setLayout(new CardLayout(0, 0));


        transactions = new JPanel(){
            private static final long serialVersionUID = 1L;
            private final ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/img/image_2024-10-29_114956805.png"));

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        mainPanel.add(home, "Home");
        mainPanel.add(transactions, "Transaction");

        mainPanel.add(sale, "Sale");
        mainPanel.add(stock, "Stock");
        mainPanel.add(customer, "Customer");

        JButton btnNewButton_1 = new JButton(){
            private static final long serialVersionUID = 1L;
            private final ImageIcon backgroundImage = new ImageIcon("src/img/5045883.png");

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        btnNewButton_1.setOpaque(false);

        btnNewButton_1.setContentAreaFilled(false); // Prevents filling the content area
        btnNewButton_1.setBorderPainted(false); // Removes any border around the button
        btnNewButton_1.setFocusPainted(false); // Removes focus painting
        btnNewButton_1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		new AddCustomer().setVisible(true);
        	}
        });
        btnNewButton_1.setBounds(1391, 264, 85, 83);
        customer.add(btnNewButton_1);

        CardLayout cardLayout = (CardLayout) mainPanel.getLayout(); // Get the CardLayout
        lblNewLabel_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                min.setVisible(false);
                cardLayout.show(mainPanel, "Home"); // Show the specific card
            }
        });
        lblNewLabel_4_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	 min.setVisible(true);
                cardLayout.show(mainPanel, "Sale"); // Show the specific card
            }
        });

        lblNewLabel_4_1_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
           	 min.setVisible(true);
                cardLayout.show(mainPanel, "Stock"); // Show the specific card
            }
        });
        lblNewLabel_4_1_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
           	 min.setVisible(true);
                cardLayout.show(mainPanel, "Customer"); // Show the specific card
            }
        });
        lblNewLabel_4_1_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
           	 min.setVisible(true);
           	new Transaction().refreshTransactions();
                cardLayout.show(mainPanel, "Transaction"); // Show the specific card
            }
        });





        panel.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		min.setVisible(true);
                cardLayout.show(mainPanel, "Sale"); // Show the specific card
        	}
        });

        panel_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
           	 min.setVisible(true);
                cardLayout.show(mainPanel, "Stock"); // Show the specific card
            }
        });
        panel_6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
           	 min.setVisible(true);
                cardLayout.show(mainPanel, "Customer"); // Show the specific card
            }
        });
        panel_9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
           	 min.setVisible(true);
           	new Transaction().refreshTransactions();
                cardLayout.show(mainPanel, "Transaction"); // Show the specific card
            }
        });








        transactions.setLayout(null);






        Transaction  rean = new Transaction()   ;
        JScrollPane tranScroll = rean.getTransactionPanel();





        tranScroll.setBounds(200,100,(int)screenSize.getWidth()-464,(int)screenSize.getHeight()-300);











        transactions.add(tranScroll);




        // Initialize allItems and filteredItems



















//        transactions.setVisible(false);
//        sale.setVisible(false);
//        stock.setVisible(false);
//        customer.setVisible(true);
//        home.setVisible(false);
//
        revalidate();



//        scrollPaneHorizontal.addMouseWheelListener(new MouseWheelListener() {
//            @Override
//            public void mouseWheelMoved(MouseWheelEvent e) {
//                int notches = e.getWheelRotation();
//                int scrollAmount = 30; // Adjust this value to change scroll speed
//
//                // Adjust horizontal scrolling based on mouse wheel movement
//                int newScrollX = scrollPaneHorizontal.getHorizontalScrollBar().getValue() + (notches * scrollAmount);
//                scrollPaneHorizontal.getHorizontalScrollBar().setValue(newScrollX);
//            }
//        });

//
//        // Make the frame dragable
//        addMouseListener(new MouseAdapter() {
//            @Override
//            public void mousePressed(MouseEvent e) {
//                initialClick = e.getPoint();
//            }
//        });
//
//
//        addMouseMotionListener(new MouseMotionAdapter() {
//            @Override
//            public void mouseDragged(MouseEvent e) {
//                int thisX = getLocation().x;
//                int thisY = getLocation().y;
//
//                int xMoved = e.getX() - initialClick.x;
//                int yMoved = e.getY() - initialClick.y;
//
//                int newX = thisX + xMoved;
//                int newY = thisY + yMoved;
//                setLocation(newX, newY);
//            }
//        });
    }
}




class InventoryDisplay extends JPanel {
    private JPanel productListPanel;
public Dimension  screenSize =Toolkit.getDefaultToolkit().getScreenSize();
      private final File inventoryFile = new File("src/Inventory.csv");
    private final File batchFile = new File("src/Batch.csv");


    // Map to store amounts from Batch.csv
    private HashMap<String, Integer> productAmounts;

    public InventoryDisplay() {
        // Set up the main window


        setLayout(new BorderLayout());
        setBounds((int)(0.1*  screenSize.getWidth()), 49,(int)(0.8*  screenSize.getWidth()), (int)screenSize.getHeight()-160);
        productListPanel = new JPanel();
        productListPanel.setLayout(new GridLayout(0, 3, 10, 10));
        JScrollPane scrollPane = new JScrollPane(productListPanel);
        add(scrollPane, BorderLayout.CENTER);

        // Load data from CSV files
        loadBatchData();
        loadInventoryData();
    }

    private void loadBatchData() {
        productAmounts = new HashMap<>();
        if (batchFile.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(batchFile))) {
                String line = br.readLine(); // Skip header
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    if (values.length >= 5) {
                        String productID = values[1]; // ProductID
                        int amount = Integer.parseInt(values[4]); // Amount
                        productAmounts.put(productID, productAmounts.getOrDefault(productID, 0) + amount);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Batch.csv not found.");
        }
    }

    private void loadInventoryData() {
        if (inventoryFile.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(inventoryFile))) {
                String line = br.readLine(); // Skip header
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    if (values.length >= 5) {
                        String stockName = values[0];
                        String stockID = values[1];
                        String type = values[2];
                        String price = values[3];
                        String cost = values[4];

                        // Get the amount for the current product from Batch.csv
                        int amount = productAmounts.getOrDefault(stockID, 0);

                        // Create and add the product panel
                        addProductPanel(stockName, price, amount,type,stockID);
                    }
                }
                productListPanel.revalidate();
                productListPanel.repaint();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Inventory.csv not found.");
        }
    }

    private void addProductPanel(String name, String price, int amount,String type,String stockId) {
        JPanel productPanel = new JPanel();
        productPanel.setLayout(new BorderLayout());
        productPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));


        JLabel nameLabel = new JLabel(name, SwingConstants.CENTER);
        productPanel.add(nameLabel, BorderLayout.NORTH);


        JButton productButton = new JButton();
        productButton.setPreferredSize(new Dimension(100, 100));
        productPanel.add(productButton, BorderLayout.CENTER);
        productButton.addActionListener(e -> {

			new saleInfo(name,type,price,amount,stockId).setVisible(true);
        });


        JPanel detailsPanel = new JPanel(new BorderLayout());
        JLabel amountLabel = new JLabel("Amount: " + amount, SwingConstants.LEFT);
        JLabel priceLabel = new JLabel(price + "₪", SwingConstants.RIGHT);
        detailsPanel.add(amountLabel, BorderLayout.WEST);
        detailsPanel.add(priceLabel, BorderLayout.EAST);

        productPanel.add(detailsPanel, BorderLayout.SOUTH);
        productListPanel.add(productPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InventoryDisplay frame = new InventoryDisplay();
            frame.setVisible(true);
        });
    }
}


 //

 class InventoryScrollPanel extends JPanel {
	    public InventoryScrollPanel() {
	        // Set the layout for the InventoryScrollPanel
	        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); // Vertical layout
	    }

	    // Helper method to create a panel for a row of data
	    public void loadDataFromCSV(String fileName) {
	        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
	            String line;
	            boolean isHeader = true; // Skip the header row
	            while ((line = br.readLine()) != null) {
	                if (isHeader) {
	                    isHeader = false; // Skip header
	                    continue;
	                }
	                // Split the line into columns
	                String[] columns = line.split(",");
	                if (columns.length == 5) { // Ensure there are exactly 5 columns
	                    String stockName = columns[0].trim();
	                    String stockID = columns[1].trim();
	                    String type = columns[2].trim();
	                    String price = columns[3].trim();
	                    String cost = columns[4].trim();

	                    // Create a new panel for each row of data
	                    JPanel dataPanel = createDataPanel(stockName, stockID, type, price, cost);
	                    this.add(dataPanel); // Add the new panel to this panel
	                    this.revalidate(); // Refresh the UI to show the new panel
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    // Helper method to create a panel for a row of data
	    private static JPanel createDataPanel(String stockName, String stockID, String type, String price, String cost) {
	        JPanel panel = new JPanel();
	        panel.setLayout(new GridLayout(3, 3, 15, 10)); // 3 rows, 3 columns
	        panel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
	        panel.setBackground(Color.WHITE);

	        // Top row
	        JLabel stockNameLabel = new JLabel("Stock Name: " + stockName);
	        JLabel stockIDLabel = new JLabel("Stock ID: " + stockID);
	        JLabel typeLabel = new JLabel("Type: " + type);

	        // Middle row
	        JLabel placeholder1 = new JLabel(); // Empty cell placeholder
	        JLabel placeholder2 = new JLabel(); // Empty cell placeholder
	        JButton restockButton = new JButton("Re-Stock");

	        restockButton.addActionListener(e -> {
	            new ReStock(stockID).setVisible(true);
	        });

	        // Bottom row
	        JLabel priceLabel = new JLabel("Price: $" + price);
	        JLabel costLabel = new JLabel("Cost: $" + cost);
	        JButton detailsButton = new JButton("Details");






	        detailsButton.addMouseListener(new MouseListener() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                // Code to handle mouse click event
	            	 new InfoStock(stockID,stockName,type,price,cost).setVisible(true);
	            }

				@Override
				public void mousePressed(MouseEvent e) {


				}

				@Override
				public void mouseReleased(MouseEvent e) {


				}

				@Override
				public void mouseEntered(MouseEvent e) {


				}

				@Override
				public void mouseExited(MouseEvent e) {

				}

	        });

	        // Add components to the panel
	        // Top row components
	        panel.add(stockNameLabel);
	        panel.add(stockIDLabel);
	        panel.add(typeLabel);

	        // Middle row components
	        panel.add(placeholder1);
	        panel.add(placeholder2);
	        panel.add(restockButton);

	        // Bottom row components
	        panel.add(priceLabel);
	        panel.add(costLabel);
	        panel.add(detailsButton);

	        return panel;
	    }
	}
 ////////////////////////////







class CustomerPanel extends JPanel {
    public CustomerPanel() {
        // Set the layout for the CustomerPanel
        setLayout(new GridLayout(0, 1, 10, 10)); // 1 column, variable rows, spacing
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Padding
        setPreferredSize(new Dimension(780, 1900)); // You can adjust this if necessary
    }

    // Method to load customer data from a CSV or text file
    public void loadCustomerData(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] customerData = line.split(","); // Split data by commas
                if (customerData.length == 5) { // Ensure all fields are present
                    String name = customerData[0];
                    String id = customerData[1];
                    String phone = customerData[2];
                    String email = customerData[3];
                    String balance = customerData[4];

                    // Create a clickable panel (button) for each customer
                    JButton customerButton = createCustomerPanel(name, id, phone, email, balance);
                    this.add(customerButton); // Add the button to this panel
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Helper method to create a customer panel (as a button)
    private JButton createCustomerPanel(String name, String id, String phone, String email, String balance) {
        // Create a button to act as the panel
        JButton button = new JButton();
        button.setLayout(new BorderLayout()); // BorderLayout for left and right alignment
        button.setBackground(Color.WHITE);
        button.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        button.setFocusPainted(false); // Remove focus border when clicked

        // Left panel: Customer details
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(4, 1)); // 4 rows for details
        leftPanel.setBackground(Color.WHITE);

        JLabel nameLabel = new JLabel("Name: " + name);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        JLabel idLabel = new JLabel("ID: " + id);
        JLabel phoneLabel = new JLabel("Phone: " + phone);
        JLabel emailLabel = new JLabel("Email: " + email);

        leftPanel.add(nameLabel);
        leftPanel.add(idLabel);
        leftPanel.add(phoneLabel);
        leftPanel.add(emailLabel);

        // Right panel: Balance
        JLabel balanceLabel = new JLabel("$" + balance, SwingConstants.RIGHT);
        balanceLabel.setFont(new Font("Arial", Font.BOLD, 16));
        balanceLabel.setBorder(BorderFactory.createEmptyBorder(5, 20, 5, 20));
        try {
            double balanceValue = Double.parseDouble(balance); // Convert balance to a numeric value
            if (balanceValue < 0) {
                balanceLabel.setForeground(Color.RED); // Set color to red if balance is negative
            } else {
                balanceLabel.setForeground(Color.BLUE); // Default color
            }
        } catch (NumberFormatException e) {
            balanceLabel.setText("Invalid Balance");
        }

        // Add the left panel and balance label to the button
        button.add(leftPanel, BorderLayout.CENTER);
        button.add(balanceLabel, BorderLayout.EAST);

        // Add an ActionListener to handle button clicks
        button.addActionListener(e -> {
        	payment showpaymentWindow = new payment(name,id,balance);
            showpaymentWindow.setVisible(true);
        } );

        return button;
    }
}
 /////////////////////////////////////
class Transaction {

    private JScrollPane transactionPanel; // Field specifically for JScrollPane
    private JPanel gridPanel; // Panel to hold the transaction buttons

    public Transaction() {
        // Initialize the gridPanel
        gridPanel = new JPanel();
        gridPanel.setLayout(new BoxLayout(gridPanel, BoxLayout.Y_AXIS)); // Rows expand dynamically
        gridPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Padding
        gridPanel.setBackground(Color.WHITE); // Set background color for better visibility

        // Load data and populate the gridPanel
        loadTransactions();

        // Wrap the grid panel in a scroll pane
        transactionPanel = new JScrollPane(gridPanel);
        transactionPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        transactionPanel.getVerticalScrollBar().setUnitIncrement(16); // Smoother scrolling
    }

    // Method to refresh data and UI
    public void refreshTransactions() {
    	System.out.println("here1223");
        // Clear the gridPanel
        gridPanel.removeAll();
        // Reload the transactions
//        loadTransactions();

        // Repaint and revalidate the panel to reflect changes
        gridPanel.revalidate();
        gridPanel.repaint();
    }

    // Method to load transaction data from a CSV file
    private void loadTransactions() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/Transaction.csv"))) {
            String line;
            boolean isFirstLine = true;

            while ((line = reader.readLine()) != null) {
                if (isFirstLine) { // Skip headers
                    isFirstLine = false;
                    continue;
                }
                String[] transactionData = line.split(",");
                if (transactionData.length == 7) { // Ensure proper data format
                    String transactionID = transactionData[0];
                    String customerName = transactionData[1];
                    String customerID = transactionData[2];
                    String stockID = transactionData[3];
                    String quantity = transactionData[4];
                    String totalAmount = transactionData[5];
                    String transactionDate = transactionData[6];

                    // Add transaction panel to the grid
                    JButton transactionButton = createTransactionPanel(transactionID, customerName, customerID, stockID,
                            quantity, totalAmount, transactionDate);
                    gridPanel.add(transactionButton);
                    gridPanel.add(Box.createVerticalStrut(5)); // Add spacing between buttons
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public JScrollPane getTransactionPanel() {
        return this.transactionPanel;
    }

    private static JButton createTransactionPanel(String transactionID, String customerName, String customerID,
                                                  String stockID, String quantity, String totalAmount, String transactionDate) {
        JButton button = new JButton();
        button.setLayout(new BorderLayout());
        button.setBackground(Color.WHITE);
        button.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        button.setFocusPainted(false);

        // Set button preferred size
        button.setPreferredSize(new Dimension(900, 60));

        // Left panel: Transaction details
        JPanel leftPanel = new JPanel(new GridLayout(2, 1));
        leftPanel.setBackground(Color.WHITE);
        JLabel transactionIDLabel = new JLabel("Transaction ID: " + transactionID);
        JLabel customerNameLabel = new JLabel("Customer: " + customerName);
        leftPanel.add(transactionIDLabel);
        leftPanel.add(customerNameLabel);

        // Right panel: Total Amount and Date
        JPanel rightPanel = new JPanel(new GridLayout(2, 1));
        rightPanel.setBackground(Color.WHITE);
        JLabel totalAmountLabel = new JLabel("Total: $" + totalAmount, SwingConstants.RIGHT);
        totalAmountLabel.setForeground(Color.GREEN);
        totalAmountLabel.setFont(new Font("Arial", Font.BOLD, 14));
        JLabel transactionDateLabel = new JLabel("Date: " + transactionDate, SwingConstants.RIGHT);
        rightPanel.add(totalAmountLabel);
        rightPanel.add(transactionDateLabel);

        // Add panels to button
        button.add(leftPanel, BorderLayout.CENTER);
        button.add(rightPanel, BorderLayout.EAST);

        // Button action listener
        button.addActionListener(e -> {
            TransactionInfo frame = new TransactionInfo(transactionID, customerName, customerID, stockID, quantity,
                    totalAmount);
            frame.setVisible(true);
        });

        return button;
    }
}

/////////////////////////////////

 class TransactionInfo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public TransactionInfo(String transactionID,String customerName,String customerID,String stockID,String quantity,
            String totalAmount) {
		setDefaultCloseOperation(TransactionInfo.DISPOSE_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setUndecorated(true);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setAlwaysOnTop(true);

		JPanel panel = new JPanel() {
			private static final long serialVersionUID = 1L;
			private final ImageIcon backgroundImage = new ImageIcon(
					getClass().getResource("/img/image_2024-10-29_114956805.png"));

			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
			}
		};

		panel.setLayout(null);
		panel.setBackground(new Color(1, 25, 70));
		panel.setBounds(0, 0, 450, 500);
		contentPane.add(panel);


		JLabel lblNewLabel_2 = new JLabel("Transaction Id :");
		lblNewLabel_2.setForeground(new Color(204, 153, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(80, 98, 113, 23);
		panel.add(lblNewLabel_2);

		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		btnNewButton.setForeground(new Color(255, 253, 208));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(184, 134, 11));
		btnNewButton.setBounds(157, 445, 143, 23);
		panel.add(btnNewButton);

		JLabel lblNewLabel_3 = new JLabel("Transaction Info");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setForeground(new Color(204, 153, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_3.setBounds(84, 29, 272, 48);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_2_1 = new JLabel("Customer Id :");
		lblNewLabel_2_1.setForeground(new Color(204, 153, 0));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(80, 185, 113, 23);
		panel.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("Product Name :");
		lblNewLabel_2_1_1.setForeground(new Color(204, 153, 0));
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1_1.setBounds(80, 230,  113, 23);
		panel.add(lblNewLabel_2_1_1);

		JLabel lblNewLabel_2_2 = new JLabel("Product Id :");
		lblNewLabel_2_2.setForeground(new Color(204, 153, 0));
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(80, 272,  113, 23);
		panel.add(lblNewLabel_2_2);

		JLabel l1 = new JLabel("");
		l1.setForeground(new Color(204, 153, 0));
		l1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l1.setBounds(203, 98, 171, 23);
		panel.add(l1);

		JLabel l2 = new JLabel("");
		l2.setForeground(new Color(204, 153, 0));
		l2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l2.setBounds(221, 143, 171, 23);
		panel.add(l2);

		JLabel l3 = new JLabel("");
		l3.setForeground(new Color(204, 153, 0));
		l3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l3.setBounds(203, 185, 171, 23);
		panel.add(l3);

		JLabel l4 = new JLabel("");
		l4.setForeground(new Color(204, 153, 0));
		l4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l4.setBounds(200, 230, 171, 23);
		panel.add(l4);

		JLabel l5 = new JLabel("");
		l5.setForeground(new Color(204, 153, 0));
		l5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l5.setBounds(200, 272, 171, 23);
		panel.add(l5);

		JLabel l6 = new JLabel("");
		l6.setForeground(new Color(204, 153, 0));
		l6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l6.setBounds(200, 316, 171, 23);
		panel.add(l6);

		JLabel lblNewLabel_2_5 = new JLabel("Customer Name :");
		lblNewLabel_2_5.setForeground(new Color(204, 153, 0));
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_5.setBounds(80, 143, 113, 23);
		panel.add(lblNewLabel_2_5);

		JLabel lblNewLabel_2_2_1 = new JLabel("quantity :");
		lblNewLabel_2_2_1.setForeground(new Color(204, 153, 0));
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2_1.setBounds(80, 316, 80, 23);
		panel.add(lblNewLabel_2_2_1);

		JLabel lblNewLabel_2_3_2_1 = new JLabel("");
		lblNewLabel_2_3_2_1.setForeground(new Color(204, 153, 0));
		lblNewLabel_2_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_3_2_1.setBounds(219, 316, 171, 23);
		panel.add(lblNewLabel_2_3_2_1);

		JLabel lblNewLabel_2_2_1_1 = new JLabel("Total Price :");
		lblNewLabel_2_2_1_1.setForeground(new Color(204, 153, 0));
		lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2_1_1.setBounds(80, 361, 80, 23);
		panel.add(lblNewLabel_2_2_1_1);

		JLabel l7 = new JLabel("");
		l7.setForeground(new Color(204, 153, 0));
		l7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		l7.setBounds(200, 361, 171, 23);
		panel.add(l7);
		l1.setText(transactionID);
		l2.setText(customerName);
		l3.setText(customerID);
		String name =Methods.getStockName(stockID, "src/Inventory.csv");

		l4.setText(name);
		l5.setText(stockID);
		l6.setText(quantity);
		l7.setText(totalAmount);

	}
}
/////////////////////////////////////////////////////
 class ReStock extends JFrame {

		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JTextField t1;

		/**
		 * Launch the application.
		 */


		/**
		 * Create the frame.
		 */
		public ReStock(String stockId) {
			setDefaultCloseOperation(ReStock.DISPOSE_ON_CLOSE);
			setResizable(false);
			setBounds(100, 100, 460, 400);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);

			JPanel panel = new JPanel() {
				private static final long serialVersionUID = 1L;
				private final ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/img/image_2024-10-29_114956805.png"));

				@Override
				protected void paintComponent(Graphics g) {
					super.paintComponent(g);
					g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
				}
			};
			panel.setLayout(null);
			panel.setBackground(new Color(1, 25, 70));
			panel.setBounds(0, 0, 450, 365);
			contentPane.add(panel);



			JLabel lblNewLabel_2_1 = new JLabel("Enter The Amount :");
			lblNewLabel_2_1.setForeground(new Color(204, 153, 0));
			lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblNewLabel_2_1.setBounds(37, 155, 165, 23);
			panel.add(lblNewLabel_2_1);

			JButton btnNewButton = new JButton("Re-Stock");
			btnNewButton.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        String inputAmount = t1.getText(); // Get the number from t1
			        if (inputAmount.isEmpty()) {
			            JOptionPane.showMessageDialog(null, "Please enter a valid amount.", "Error", JOptionPane.ERROR_MESSAGE);
			            return;
			        }

			        try {
			            int addAmount = Integer.parseInt(inputAmount); // Convert input to integer
			            if (addAmount <= 0) {
			                JOptionPane.showMessageDialog(null, "Please enter a positive amount.", "Error", JOptionPane.ERROR_MESSAGE);
			                return;
			            }

			            File batchFile = new File("src/Batch.csv");
			            if (!batchFile.exists()) {
			                JOptionPane.showMessageDialog(null, "Batch file not found.", "Error", JOptionPane.ERROR_MESSAGE);
			                return;
			            }

			            // Read and update the Batch.csv file
			            ArrayList<String> updatedLines = new ArrayList<>();
			            boolean stockFound = false;

			            try (BufferedReader br = new BufferedReader(new FileReader(batchFile))) {
			                String line = br.readLine(); // Read header
			                updatedLines.add(line); // Add header to the list

			                while ((line = br.readLine()) != null) {
			                    String[] details = line.split(",");
			                    if (details.length >= 6 && details[1].trim().equals(stockId)) { // Match stockId
			                        int currentAmount = Integer.parseInt(details[4].trim());
			                        currentAmount += addAmount; // Update the amount
			                        details[4] = String.valueOf(currentAmount); // Set the new amount
			                        stockFound = true;
			                    }
			                    updatedLines.add(String.join(",", details)); // Add updated or unchanged line
			                }
			            }

			            // Write the updated content back to the file
			            if (stockFound) {
			                try (BufferedWriter bw = new BufferedWriter(new FileWriter(batchFile))) {
			                    for (String line : updatedLines) {
			                        bw.write(line);
			                        bw.newLine();
			                    }
			                }
			                JOptionPane.showMessageDialog(null, "Stock updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
			            } else {
			                JOptionPane.showMessageDialog(null, "Stock ID not found.", "Error", JOptionPane.ERROR_MESSAGE);
			            }

			            dispose(); // Close the reStock window

			        } catch (NumberFormatException ex) {
			            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
			        } catch (IOException ex) {
			            JOptionPane.showMessageDialog(null, "Error accessing the file.", "Error", JOptionPane.ERROR_MESSAGE);
			            ex.printStackTrace();
			        }
			    }
			});

			btnNewButton.setForeground(new Color(255, 253, 208));
			btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			btnNewButton.setFocusPainted(false);
			btnNewButton.setBorderPainted(false);
			btnNewButton.setBackground(new Color(184, 134, 11));
			btnNewButton.setBounds(146, 280, 143, 23);
			panel.add(btnNewButton);

			t1 = new JTextField();
			t1.setOpaque(false);
			t1.setForeground(new Color(211, 211, 211));
			t1.setColumns(10);
			t1.setBorder(new MatteBorder(0, 0, 1, 0, new Color(204, 153, 0)));
			t1.setBackground(new Color(0, 0, 0, 0));
			t1.setBounds(212, 159, 163, 21);
			panel.add(t1);

			JLabel lblNewLabel_3 = new JLabel("      Re-Stock");
			lblNewLabel_3.setForeground(new Color(204, 153, 0));
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
			lblNewLabel_3.setBounds(118, 44, 272, 48);
			panel.add(lblNewLabel_3);
		}
	}
////////////////////////
 class InfoStock extends JFrame {
	    private static final long serialVersionUID = 1L;
	    private JPanel contentPane;
	    private JLabel lbl1; // Label for Amount
	    private JLabel lbl2; // Label for ExpiryDate
	    private JLabel l3;   // Label for StockName
	    private JLabel l4;   // Label for Stock ID
	    private JLabel l5;   // Label for Type
	    private JLabel l6;   // Label for Price
	    private JLabel l7;   // Label for Cost

	    public InfoStock(String productId, String stockName, String type, String price, String cost) {
	        setDefaultCloseOperation(InfoStock.DISPOSE_ON_CLOSE); // Close only this window
	        setResizable(false);
	        setBounds(100, 100, 450, 520);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);
	        setUndecorated(true); // Remove window borders

	        // Add GUI components
	        JPanel panel = new JPanel(){
				private static final long serialVersionUID = 1L;
				private final ImageIcon backgroundImage = new ImageIcon(
						getClass().getResource("/img/image_2024-10-29_114956805.png"));

				@Override
				protected void paintComponent(Graphics g) {
					super.paintComponent(g);
					g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
				}
			};

	        panel.setBounds(0, 0, 450, 534);
	        contentPane.add(panel);
	        panel.setLayout(null);

	        JLabel lblNewLabel_2 = new JLabel("Product Name :");
	        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
	        lblNewLabel_2.setForeground(new Color(204, 153, 0));
	        lblNewLabel_2.setBounds(67, 93, 150, 23);
	        panel.add(lblNewLabel_2);

	        JLabel lblNewLabel_2_1 = new JLabel("Product ID :");
	        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
	        lblNewLabel_2_1.setForeground(new Color(204, 153, 0));
	        lblNewLabel_2_1.setBounds(67, 136, 113, 23);
	        panel.add(lblNewLabel_2_1);

	        lbl1 = new JLabel("");
	        lbl1.setForeground(new Color(204, 153, 0));
	        lbl1.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        lbl1.setBounds(225, 322, 164, 23);
	        panel.add(lbl1);

	        lbl2 = new JLabel("");
	        lbl2.setForeground(new Color(204, 153, 0));
	        lbl2.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        lbl2.setBounds(225, 376, 148, 23);
	        panel.add(lbl2);

	        JButton btnNewButton = new JButton("OK");
	        btnNewButton.setForeground(Color.WHITE);
	        btnNewButton.setBackground(new Color(0xB8860B));
	        btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
	        btnNewButton.setBounds(142, 466, 143, 23);
	        btnNewButton.addActionListener(e -> dispose()); // Close the window on OK button click
	        panel.add(btnNewButton);

	        JLabel lblNewLabel_2_2 = new JLabel("Info Stock");
	        lblNewLabel_2_2.setForeground(new Color(204, 153, 0));
	        lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 26));
	        lblNewLabel_2_2.setBounds(156, 32, 143, 32);
	        panel.add(lblNewLabel_2_2);

	        JLabel lblNewLabel_2_3 = new JLabel("Type :");
	        lblNewLabel_2_3.setForeground(new Color(204, 153, 0));
	        lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 21));
	        lblNewLabel_2_3.setBounds(67, 181, 96, 23);
	        panel.add(lblNewLabel_2_3);

	        JLabel lblNewLabel_2_1_1 = new JLabel("Cost :");
	        lblNewLabel_2_1_1.setForeground(new Color(204, 153, 0));
	        lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
	        lblNewLabel_2_1_1.setBounds(67, 230, 113, 23);
	        panel.add(lblNewLabel_2_1_1);

	        JLabel lblNewLabel_2_4 = new JLabel("Price :");
	        lblNewLabel_2_4.setForeground(new Color(204, 153, 0));
	        lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 21));
	        lblNewLabel_2_4.setBounds(67, 276, 96, 23);
	        panel.add(lblNewLabel_2_4);

	        JLabel lblNewLabel_2_1_2 = new JLabel("Amount :");
	        lblNewLabel_2_1_2.setForeground(new Color(204, 153, 0));
	        lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 21));
	        lblNewLabel_2_1_2.setBounds(67, 322, 113, 23);
	        panel.add(lblNewLabel_2_1_2);

	        JLabel lblNewLabel_2_1_2_1 = new JLabel("ExpirDate:");
	        lblNewLabel_2_1_2_1.setForeground(new Color(204, 153, 0));
	        lblNewLabel_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
	        lblNewLabel_2_1_2_1.setBounds(70, 376, 113, 23);
	        panel.add(lblNewLabel_2_1_2_1);

	        l7 = new JLabel("");
	        l7.setForeground(new Color(204, 153, 0));
	        l7.setFont(new Font("Tahoma", Font.PLAIN, 21));
	        l7.setBounds(225, 276, 148, 23);
	        panel.add(l7);

	        l6 = new JLabel("");
	        l6.setForeground(new Color(204, 153, 0));
	        l6.setFont(new Font("Tahoma", Font.PLAIN, 21));
	        l6.setBounds(225, 230, 148, 23);
	        panel.add(l6);

	        l5 = new JLabel("");
	        l5.setForeground(new Color(204, 153, 0));
	        l5.setFont(new Font("Tahoma", Font.PLAIN, 21));
	        l5.setBounds(225, 181, 135, 23);
	        panel.add(l5);

	        l4 = new JLabel("");
	        l4.setForeground(new Color(204, 153, 0));
	        l4.setFont(new Font("Tahoma", Font.PLAIN, 21));
	        l4.setBounds(225, 136, 148, 23);
	        panel.add(l4);

	        l3 = new JLabel("");
	        l3.setForeground(new Color(204, 153, 0));
	        l3.setFont(new Font("Tahoma", Font.PLAIN, 21));
	        l3.setBounds(225, 93, 164, 23);
	        panel.add(l3);

	        // Load data from Batch.csv
	        loadBatchData(productId, stockName, type, price, cost);
	        revalidate();
	    }

	    public void loadBatchData(String productId, String stockName, String type, String price, String cost) {
	        String batchFilePath = "src/Batch.csv"; // Path to the Batch.csv file
	        try (BufferedReader br = new BufferedReader(new FileReader(batchFilePath))) {
	            String line;
	            boolean isHeader = true;
	            while ((line = br.readLine()) != null) {
	                if (isHeader) {
	                    isHeader = false; // Skip the header
	                    continue;
	                }

	                // Split the line and check the ProductID
	                String[] columns = line.split(",");
	                if (columns.length >= 6) { // Ensure there are enough columns
	                    String batchProductId = columns[1].trim(); // ProductID is in the second column
	                    String expiryDate = columns[3].trim();     // ExpiryDate is in the fourth column
	                    String amount = columns[4].trim();         // Amount is in the fifth column

	                    if (batchProductId.equals(productId)) {
	                        // Update the labels with the data

	                        lbl1.setText(amount);
	                        lbl2.setText(expiryDate);
	                        l3.setText(stockName);
	                        l4.setText(productId);
	                        l5.setText(type);
	                        l6.setText(price);
	                        l7.setText(cost);

	                        break; // Stop searching after finding the product
	                    }
	                }
	            }
	        } catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	}

/////////////////////////////////////////////


 class saleInfo extends JFrame {

		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private JTextField t1;

		/**
		 * Launch the application.
		 */


		/**
		 * Create the frame.
		 */
		public saleInfo(String stockName,String type,String price,int amount,String stockId) {
			setDefaultCloseOperation(saleInfo.DISPOSE_ON_CLOSE);
			setResizable(false);
			setBounds(100, 100, 460, 515);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);

			JPanel panel = new JPanel() {
				private static final long serialVersionUID = 1L;
				private final ImageIcon backgroundImage = new ImageIcon(
						getClass().getResource("/img/image_2024-10-29_114956805.png"));

				@Override
				protected void paintComponent(Graphics g) {
					super.paintComponent(g);
					g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
				}
			};
			panel.setLayout(null);
			panel.setBackground(new Color(1, 25, 70));
			panel.setBounds(0, 0, 460, 480);
			contentPane.add(panel);



			JLabel lblNewLabel_2 = new JLabel("Product Name :");
			lblNewLabel_2.setForeground(new Color(204, 153, 0));
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblNewLabel_2.setBounds(67, 114,170, 23);
			panel.add(lblNewLabel_2);

			JLabel lblNewLabel_2_1 = new JLabel("Product Type :");
			lblNewLabel_2_1.setForeground(new Color(204, 153, 0));
			lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblNewLabel_2_1.setBounds(67, 167,170, 23);
			panel.add(lblNewLabel_2_1);

			JLabel lblNewLabel_2_2 = new JLabel("Price :");
			lblNewLabel_2_2.setForeground(new Color(204, 153, 0));
			lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblNewLabel_2_2.setBounds(67, 221,170, 23);
			panel.add(lblNewLabel_2_2);

			JButton btnNewButton = new JButton("Sell Product");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (amount >= Integer.parseInt(t1.getText())) {
						dispose();
						new saleInfo1(stockName, type, amount, price,stockId,t1.getText()).setVisible(true);
					} else {
					    JOptionPane.showMessageDialog(null, "The requested quantity exceeds the available stock.");
					}


				}
			});
			btnNewButton.setForeground(new Color(255, 253, 208));
			btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			btnNewButton.setFocusPainted(false);
			btnNewButton.setBorderPainted(false);
			btnNewButton.setBackground(new Color(184, 134, 11));
			btnNewButton.setBounds(132, 370, 143, 23);
			panel.add(btnNewButton);

			JLabel lblNewLabel_3 = new JLabel("  Sales Point");
			lblNewLabel_3.setForeground(new Color(204, 153, 0));
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
			lblNewLabel_3.setBounds(130, 22, 260, 64);
			panel.add(lblNewLabel_3);

			t1 = new JTextField();
			t1.setOpaque(false);
			t1.setForeground(new Color(204, 153, 0));
			t1.setColumns(10);
			t1.setFont(new Font("Tahoma", Font.PLAIN, 25));
			t1.setBorder(new MatteBorder(0, 0,1, 0, new Color(204, 153, 0)));
			t1.setBackground(new Color(0, 0, 0, 0));
			t1.setBounds(247, 280, 163, 21);
			panel.add(t1);

			JLabel lblNewLabel_2_2_1_1 = new JLabel("Enter the Quantity :");
			lblNewLabel_2_2_1_1.setForeground(new Color(204, 153, 0));
			lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblNewLabel_2_2_1_1.setBounds(67, 276, 170, 23);
			panel.add(lblNewLabel_2_2_1_1);

			JLabel l1 = new JLabel("");
			l1.setBounds(214, 114, 178, 23);
			l1.setForeground(new Color(204, 153, 0));
			l1.setFont(new Font("Tahoma", Font.PLAIN, 18));
			panel.add(l1);

			JLabel l2 = new JLabel("");
			l2.setBounds(212, 167, 178, 23);
			l2.setForeground(new Color(204, 153, 0));
			l2.setFont(new Font("Tahoma", Font.PLAIN, 18));
			panel.add(l2);

			JLabel l3 = new JLabel("");
			l3.setBounds(212, 221, 178, 23);
			l3.setForeground(new Color(204, 153, 0));
			l3.setFont(new Font("Tahoma", Font.PLAIN, 18));
			panel.add(l3);

			l1.setText(stockName);
			l2.setText(type);
			l3.setText(price);
		}
	}
/////////////

 class saleInfo1 extends JFrame {
	    private static final long serialVersionUID = 1L;
	    private JPanel contentPane;


	    public saleInfo1(String stockName,String type, int amount,String price,String stockId,String selectedAmount) {
	        setDefaultCloseOperation(saleInfo1.DISPOSE_ON_CLOSE);
	        setResizable(false);
	        setBounds(100, 100, 468, 421);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);

	        JPanel panel = new JPanel() {
				private static final long serialVersionUID = 1L;
				private final ImageIcon backgroundImage = new ImageIcon(
						getClass().getResource("/img/image_2024-10-29_114956805.png"));

				@Override
				protected void paintComponent(Graphics g) {
					super.paintComponent(g);
					g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
				}
			};
	        panel.setLayout(null);
	        panel.setBackground(new Color(1, 25, 70));
	        panel.setBounds(0, 0, 460, 382);
	        contentPane.add(panel);


	        JLabel lblNewLabel_2 = new JLabel("Select The Customer :");
	        lblNewLabel_2.setForeground(new Color(204, 153, 0));
	        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        lblNewLabel_2.setBounds(66, 127, 206, 23);
	        panel.add(lblNewLabel_2);

	        JButton btnNewButton = new JButton("Sell Product");
	        btnNewButton.setForeground(new Color(255, 253, 208));
	        btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
	        btnNewButton.setFocusPainted(false);
	        btnNewButton.setBorderPainted(false);
	        btnNewButton.setBackground(new Color(184, 134, 11));
	        btnNewButton.setBounds(150, 274, 143, 23);
	        panel.add(btnNewButton);

	        JLabel lblNewLabel_3 = new JLabel("  Select Customer");
	        lblNewLabel_3.setForeground(new Color(204, 153, 0));
	        lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
	        lblNewLabel_3.setBounds(130, 22, 260, 64);
	        panel.add(lblNewLabel_3);

	        JComboBox<String> comboBox = new JComboBox<>();
	        comboBox.setBounds(66, 167, 260, 30);
	        panel.add(comboBox);

	        // Load customers into the JComboBox
	        loadCustomers(comboBox);

	        // ActionListener for the button
	        btnNewButton.addActionListener(e -> {
	            String selectedCustomer = (String) comboBox.getSelectedItem();
	            if (selectedCustomer != null) {
	            	dispose();
	                new saleInfo2(selectedCustomer, stockName, type,selectedAmount, price,stockId).setVisible(true);
	            } else {
	                JOptionPane.showMessageDialog(this, "Please select a customer.");
	            }
	        });
	    }

	    private void loadCustomers(JComboBox<String> comboBox) {
	        String filePath = "src/customers.csv";
	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] customerData = line.split(","); // Split data by commas
	                if (customerData.length >= 1) { // Ensure the line has at least one field
	                    String customerName = customerData[0]; // Assuming the first column is the customer name
	                    comboBox.addItem(customerName);
	                }
	            }
	        } catch (IOException e) {
	            JOptionPane.showMessageDialog(this, "Error reading customers file: " + e.getMessage());
	        }
	    }
	}
 /////////////////////////////////////
 class saleInfo2 extends JFrame {

		private static final long serialVersionUID = 1L;
		private JPanel contentPane;

		/**
		 * Launch the application.
		 */

		/**
		 * Create the frame.
		 */
		public saleInfo2(String customerName,String stockName,String type ,String selectedAmount,String price ,String stockId) {
			setDefaultCloseOperation(saleInfo2.DISPOSE_ON_CLOSE);
			setResizable(false);
			setBounds(100, 100, 466, 577);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

			setContentPane(contentPane);
			contentPane.setLayout(null);

			JPanel panel = new JPanel() {
				private static final long serialVersionUID = 1L;
				private final ImageIcon backgroundImage = new ImageIcon(
						getClass().getResource("/img/image_2024-10-29_114956805.png"));

				@Override
				protected void paintComponent(Graphics g) {
					super.paintComponent(g);
					g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
				}
			};
			TransactionMethods tran=new TransactionMethods();
			Methods method=new Methods();
			panel.setLayout(null);
			panel.setBackground(new Color(1, 25, 70));
			panel.setBounds(0, 0, 450, 600);
			contentPane.add(panel);
			double Price = Double.parseDouble(price);
			int totalPrice = (int) (Price * Integer.parseInt(selectedAmount)); // Cast to int if necessary


			JLabel lblNewLabel_2 = new JLabel("Customer Name :");
			lblNewLabel_2.setForeground(new Color(204, 153, 0));
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblNewLabel_2.setBounds(67, 114, 145, 23);
			panel.add(lblNewLabel_2);

			JLabel lblNewLabel_2_1 = new JLabel("Product Name :");
			lblNewLabel_2_1.setForeground(new Color(204, 153, 0));
			lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblNewLabel_2_1.setBounds(67, 167, 122, 23);
			panel.add(lblNewLabel_2_1);

			JLabel lblNewLabel_2_2 = new JLabel("Product Type :");
			lblNewLabel_2_2.setForeground(new Color(204, 153, 0));
			lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblNewLabel_2_2.setBounds(67, 221, 80, 23);
			panel.add(lblNewLabel_2_2);

			JButton btnNewButton = new JButton("Confirm");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String customerId=method.getCustomerIdByName(customerName,"src/customers.csv");
					tran.createTransaction(customerName,customerId , stockId, selectedAmount, totalPrice);
					method.updateCustomerBalance(customerId,totalPrice,"src/customers.csv");
					method.updateStockAmount(stockId, selectedAmount, "src/Inventory.csv", "src/Batch.csv");



					dispose();

				}
			});
			btnNewButton.setForeground(new Color(255, 253, 208));
			btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			btnNewButton.setFocusPainted(false);
			btnNewButton.setBorderPainted(false);
			btnNewButton.setBackground(new Color(184, 134, 11));
			btnNewButton.setBounds(138, 461, 143, 23);
			panel.add(btnNewButton);

			JLabel lblNewLabel_2_2_1 = new JLabel("Amount :");
			lblNewLabel_2_2_1.setForeground(new Color(204, 153, 0));
			lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblNewLabel_2_2_1.setBounds(67, 272, 80, 23);
			panel.add(lblNewLabel_2_2_1);

			JLabel lblNewLabel_3 = new JLabel("Report");
			lblNewLabel_3.setForeground(new Color(204, 153, 0));
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
			lblNewLabel_3.setBounds(163, 25, 260, 64);
			panel.add(lblNewLabel_3);

			JLabel lblNewLabel_2_2_1_1 = new JLabel("Price :");
			lblNewLabel_2_2_1_1.setForeground(new Color(204, 153, 0));
			lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblNewLabel_2_2_1_1.setBounds(67, 328, 80, 23);
			panel.add(lblNewLabel_2_2_1_1);

			JLabel l5 = new JLabel("");
			l5.setForeground(new Color(204, 153, 0));
			l5.setFont(new Font("Tahoma", Font.PLAIN, 18));
			l5.setBounds(222, 328, 168, 23);
			panel.add(l5);

			JLabel l4 = new JLabel("");
			l4.setForeground(new Color(204, 153, 0));
			l4.setFont(new Font("Tahoma", Font.PLAIN, 18));
			l4.setBounds(222, 272, 168, 23);
			panel.add(l4);

			JLabel l3 = new JLabel("");
			l3.setForeground(new Color(204, 153, 0));
			l3.setFont(new Font("Tahoma", Font.PLAIN, 18));
			l3.setBounds(222, 221, 168, 23);
			panel.add(l3);

			JLabel l2 = new JLabel("");
			l2.setForeground(new Color(204, 153, 0));
			l2.setFont(new Font("Tahoma", Font.PLAIN, 18));
			l2.setBounds(222, 167, 168, 23);
			panel.add(l2);

			JLabel l1 = new JLabel("");
			l1.setForeground(new Color(204, 153, 0));
			l1.setFont(new Font("Tahoma", Font.PLAIN, 18));
			l1.setBounds(222, 114, 168, 23);
			panel.add(l1);

			JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Total Price :");
			lblNewLabel_2_2_1_1_1.setForeground(new Color(204, 153, 0));
			lblNewLabel_2_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblNewLabel_2_2_1_1_1.setBounds(67, 379, 101, 23);
			panel.add(lblNewLabel_2_2_1_1_1);

			JLabel l6 = new JLabel("");
			l6.setForeground(new Color(204, 153, 0));
			l6.setFont(new Font("Tahoma", Font.PLAIN, 18));
			l6.setBounds(222, 379, 168, 23);
			panel.add(l6);

			l1.setText(customerName);
			l2.setText(stockName);
			l3.setText(type);
			l4.setText(selectedAmount);
			l5.setText(price);
			l6.setText(String.valueOf(totalPrice));
		}



	}
 class Methods {
		private String customerName;
		private String customerID;
		private String phoneNumber;
		private String email;
		private double balance;
		private static final String CUSTOMER_FILE = "src/customers.csv";
		private static final Random random = new Random();
		private Date transactionDate;
		private String transactionID;
		private String customername;
		private String customerId;
		private String stockID;
		private int quantity;
		private double totalAmount;

		public String generateId() {
			StringBuilder idBuilder = new StringBuilder();
			for (int i = 0; i < 3; i++) {
				int digit = random.nextInt(10);
				idBuilder.append(digit);
			}
			for (int i = 0; i < 3; i++) {
				char letter = (char) ('A' + random.nextInt(26));
				idBuilder.append(letter);
			}
			return idBuilder.toString();
		}

		public void addCustomer(String name, String phoneNumber, String email) {

			this.customerName = name;

			customerID = generateId();

			this.phoneNumber = phoneNumber;

			this.email = email;

			this.balance = 0.0;

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(CUSTOMER_FILE, true))) {

				if (new BufferedReader(new FileReader(CUSTOMER_FILE)).readLine() == null) {
					bw.write("Customer Name,Customer ID,Phone Number,Email,Balance");
					bw.newLine();
				}

				// Write customer information
				bw.write(this.customerName + "," + this.customerID + "," + this.phoneNumber + "," + this.email + ","
						+ this.balance + "\n");
				System.out.println("Customer added successfully.");
				bw.flush();
			} catch (IOException e) {
				System.out.println("An error occurred while writing to the file: " + e.getMessage());
			}

		}

		/////// low stock//////

		public void setRestockAlert() {
			checkStockAlert(1);
		}

		private void checkStockAlert(int lineNum) {
			String fileName = "Batch.csv";
			File batchFile = new File(fileName);

			if (!batchFile.exists()) {
				System.out.println("Batch file not found.");
				return;
			}

			try (BufferedReader br = new BufferedReader(new FileReader(batchFile))) {

				for (int i = 0; i < lineNum; i++) {
					br.readLine();
				}

				String line = br.readLine();
				if (line == null) {
					return;
				}

				String[] batchDetails = line.split(",");
				if (batchDetails.length >= 6) {
					// Parse the amount
					int amount = Integer.parseInt(batchDetails[4]);

					// Check if amount is low
					if (amount < 5) {
						System.out.println("Low stock alert for Batch ID: " + batchDetails[0] + " (Product ID: "
								+ batchDetails[1] + ").");
						System.out.println("Amount left: " + amount);
					}
				}

				checkStockAlert(lineNum + 1);

			} catch (IOException e) {
				System.out.println("Error reading from batch file: " + e.getMessage());
			}
		}

		public static int updateStockAmount(String stockId, String amount, String inventoryFilePath, String batchFilePath) {
	        boolean stockFoundInInventory = false;
	        boolean stockFoundInBatch = false;
	        int updatedAmount = -1;


	        try (BufferedReader inventoryReader = new BufferedReader(new FileReader(inventoryFilePath))) {
	            String line;
	            while ((line = inventoryReader.readLine()) != null) {
	                String[] parts = line.split(",");
	                if (parts.length >= 2 && parts[1].trim().equals(stockId)) {
	                    stockFoundInInventory = true;
	                    break;
	                }
	            }
	        } catch (IOException e) {
	            JOptionPane.showMessageDialog(null, "Error reading Inventory file: " + e.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
	            return -1;
	        }

	        if (!stockFoundInInventory) {
	            JOptionPane.showMessageDialog(null, "Error: Stock ID not found in Inventory.csv.", "Stock Error", JOptionPane.ERROR_MESSAGE);
	            return -1;
	        }

	// Step 2: Find the ProductID in Batch.csv and update Amount
			ArrayList<String> batchFileContent = new ArrayList<>();
	        try (BufferedReader batchReader = new BufferedReader(new FileReader(batchFilePath))) {
	            String line;
	            while ((line = batchReader.readLine()) != null) {
	                String[] parts = line.split(",");
	                if (parts.length >= 6 && parts[1].trim().equals(stockId)) {
	                    stockFoundInBatch = true;
	                    int currentAmount = Integer.parseInt(parts[4].trim());
	                    updatedAmount = currentAmount - Integer.parseInt(amount);

	                    if (updatedAmount < 0) {
	                        JOptionPane.showMessageDialog(null, "Error: Insufficient stock for Stock ID " + stockId, "Stock Error", JOptionPane.ERROR_MESSAGE);
	                        return -1;
	                    }

	                    parts[4] = String.valueOf(updatedAmount);
	                    line = String.join(",", parts);
	                }
	                batchFileContent.add(line);
	            }
	        } catch (IOException | NumberFormatException e) {
	            JOptionPane.showMessageDialog(null, "Error reading Batch file: " + e.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
	            return -1;
	        }

	        if (!stockFoundInBatch) {
	            JOptionPane.showMessageDialog(null, "Error: Stock ID not found in Batch.csv.", "Stock Error", JOptionPane.ERROR_MESSAGE);
	            return -1;
	        }

	        try (BufferedWriter batchWriter = new BufferedWriter(new FileWriter(batchFilePath))) {
	            for (String contentLine : batchFileContent) {
	                batchWriter.write(contentLine);
	                batchWriter.newLine();
	            }
	        } catch (IOException e) {
	            JOptionPane.showMessageDialog(null, "Error writing Batch file: " + e.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
	            return -1;
	        }

	        return updatedAmount;
	    }
	// Step 3: Write updated content back to Batch.csv

		public static String getCustomerIdByName(String customerName, String filePath) {
			String line;

			try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
				while ((line = br.readLine()) != null) {
					String[] parts = line.split(","); // Assuming CSV is comma-separated
					if (parts.length >= 2) {
						String name = parts[0].trim();
						String id = parts[1].trim();

						if (name.equalsIgnoreCase(customerName)) {
							return id;
						}
					}
				}
			} catch (IOException e) {
				System.err.println("Error reading file: " + e.getMessage());
			}

			return null; // Return null if customer not found
		}

		public static double updateCustomerBalance(String customerId, int totalPrice, String filePath) {
		    ArrayList<String> fileContent = new ArrayList<>();
		    boolean customerFound = false;
		    double updatedBalance = -1;

		    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
		        String line;
		        boolean isHeader = true;

		        while ((line = br.readLine()) != null) {
		            if (isHeader) {
		                isHeader = false;
		                fileContent.add(line);
		                continue;
		            }

		            String[] parts = line.split(",");
		            if (parts.length >= 5) {
		                String id = parts[1].trim();

		                try {
		                    double balance = Double.parseDouble(parts[4].trim());

		                    if (id.equals(customerId)) {
		                        customerFound = true;
		                        double newBalance = balance - totalPrice;



		                        updatedBalance = newBalance;

		                        parts[4] = String.valueOf(updatedBalance);
		                        line = String.join(",", parts);
		                        System.out.println("Balance updated for Customer ID " + customerId + ": " + updatedBalance);
		                    }
		                } catch (NumberFormatException e) {
		                    JOptionPane.showMessageDialog(null,
		                            "nooo Invalid balance value in file for Customer ID " + id,
		                            "Data Error", JOptionPane.ERROR_MESSAGE);
		                    return -1;
		                }
		            }
		            fileContent.add(line);
		        }
		    } catch (IOException e) {
		        JOptionPane.showMessageDialog(null,
		                "Error reading file: " + e.getMessage(),
		                "File Error", JOptionPane.ERROR_MESSAGE);
		        return -1;
		    }

		    if (!customerFound) {
		        JOptionPane.showMessageDialog(null,
		                "Error: Customer ID not found.",
		                "Customer Error", JOptionPane.ERROR_MESSAGE);
		        return -1;
		    }

		    try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
		        for (String contentLine : fileContent) {
		            bw.write(contentLine);
		            bw.newLine();
		        }
		        System.out.println("File successfully updated.");
		    } catch (IOException e) {
		        JOptionPane.showMessageDialog(null,
		                "Error writing file: " + e.getMessage(),
		                "File Error", JOptionPane.ERROR_MESSAGE);
		        return -1;
		    }

		    return updatedBalance;
		}
		public boolean isStockNameDuplicate(String stockName, String inventoryFilePath) {
		    try (BufferedReader reader = new BufferedReader(new FileReader(inventoryFilePath))) {
		        String line;
		        while ((line = reader.readLine()) != null) {
		            String[] parts = line.split(","); // Assuming CSV is comma-separated
		            if (parts.length > 0 && parts[0].trim().equalsIgnoreCase(stockName.trim())) {
		                // Compare the stock name (assuming it's in the first column)
		                return true; // Duplicate found
		            }
		        }
		    } catch (IOException e) {
		        JOptionPane.showMessageDialog(null, "Error reading Inventory file: " + e.getMessage(),
		                "File Error", JOptionPane.ERROR_MESSAGE);
		    }
		    return false; // No duplicate found
		}
		public static String getStockName(String stockId, String filePath) {
	        String line;
	        String csvSplitBy = ","; // CSV delimiter

	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            // Skip the header line
	            br.readLine();

	            while ((line = br.readLine()) != null) {
	                // Split the line into parts
	                String[] columns = line.split(csvSplitBy);

	                // Ensure the line has enough columns (5 expected based on the format)
	                if (columns.length >= 2 && columns[1].trim().equals(stockId)) {
	                    return columns[0].trim(); // Return the Stock Name
	                }
	            }
	        } catch (IOException e) {
	            System.err.println("Error reading the file: " + e.getMessage());
	        }

	        return null; // Return null if the stock ID is not found
	    }
	}
 class TransactionMethods {
	    private String transactionID;
	    private String customerName;
	    private String customerID;
	    private String stockID;
	    private int quantity;
	    private double totalAmount;
	    private Date transactionDate;
	    private static final String TRANSACTION_FILE = "src/Transaction.csv";

	    public TransactionMethods() {

	    }

	    public TransactionMethods(String transactionID, String customerName, String customerID, String stockID, String quantity,
	            double totalAmount) {
	        this.transactionID = transactionID;
	        this.customerName = customerName;
	        this.customerID = customerID;
	        this.stockID = stockID;
	        this.quantity = Integer.parseInt(quantity);
	        this.totalAmount = totalAmount;
	        this.transactionDate = new Date();
	    }

	    public void saveTransaction() {
	        File transactionFile = new File(TRANSACTION_FILE);

	        try (BufferedWriter bw = new BufferedWriter(new FileWriter(transactionFile, true))) {

	            // If the file is empty or does not exist, write the headers
	            if (transactionFile.length() == 0) {
	                String headers = "Transaction ID,Customer Name,Customer ID,Stock ID,Quantity,Total Amount,Transaction Date";
	                bw.write(headers);
	                bw.newLine(); // Move to the next line for data
	            }

	            // Prepare transaction data
	            String transactionData = String.join(",",
	                    transactionID,
	                    customerName,
	                    customerID,
	                    stockID,
	                    String.valueOf(quantity),
	                    String.valueOf(totalAmount),
	                    transactionDate.toString());

	            // Write transaction data below the headers
	            bw.write(transactionData);
	            bw.newLine();
	            System.out.println("Transaction recorded successfully.");

	        } catch (IOException e) {
	            System.out.println("An error occurred while saving the transaction: " + e.getMessage());
	        }
	    }

	    // Getters
	    public String getTransactionID() {
	        return transactionID;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public String getCustomerID() {
	        return customerID;
	    }

	    public String getStockID() {
	        return stockID;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public double getTotalAmount() {
	        return totalAmount;
	    }

	    public Date getTransactionDate() {
	        return transactionDate;
	    }

	    // Method to create and save a transaction
	    public static TransactionMethods createTransaction(String customerName, String customerID, String stockID, String quantity,
	            double pricePerUnit) {
	        String transactionID = generateTransactionID();
	        double totalAmount =  pricePerUnit;
	        TransactionMethods transaction = new TransactionMethods(transactionID, customerName, customerID, stockID, quantity,
	                totalAmount);
	        transaction.saveTransaction();
	        return transaction;
	    }

	    // Generate unique transaction ID
	    private static String generateTransactionID() {
	        return "TRANS" + System.currentTimeMillis();
	    }

	}
 class AddStock extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Point initialClick;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_1;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */

	MethodsStock S = new MethodsStock();
	private JComboBox comboBox;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStock frame = new AddStock();
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
	public AddStock() {
		setDefaultCloseOperation(AddStock.DISPOSE_ON_CLOSE);
		setResizable(false);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setUndecorated(true);
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setAlwaysOnTop(true);


		Methods x = new Methods();


		JPanel panel = new JPanel() {
			private static final long serialVersionUID = 1L;
			private final ImageIcon backgroundImage = new ImageIcon(
					getClass().getResource("/img/image_2024-10-29_114956805.png"));

			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
			}
		};
		panel.setBackground(new Color(1, 25, 70));
		panel.setBounds(0, 0, 450, 600);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(330, 0, 60, 30);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(new Color(204, 153, 0));
		lblNewLabel_1.setText("-");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Andalus", Font.PLAIN, 40));

		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(390, 0, 60, 30);
		lblNewLabel.setForeground(new Color(204, 153, 0));
		lblNewLabel.setBackground(new Color(0, 0, 51));
		lblNewLabel.setText("x");

		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel.setOpaque(true); // Make it opaque on hover
				lblNewLabel.setBackground(Color.red);
				lblNewLabel.repaint(); // Refresh to show the new background
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setOpaque(false); // Make it transparent again on exit
				lblNewLabel.repaint(); // Refresh to remove the background
			}
		});
		lblNewLabel.setFont(new Font("Simplified Arabic", Font.PLAIN, 32));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		panel.add(lblNewLabel);

		textField = new JTextField();
		textField.setBackground(new Color(0,0,0,0));
		textField.setForeground(new Color(0xd3d3d3));
		textField.setOpaque(false);
		textField.setBorder(new MatteBorder(0, 0,1, 0, new Color(204, 153, 0)));
		textField.setColumns(10);
		textField.setBounds(214, 114, 163, 21);
		panel.add(textField);

		JLabel lblNewLabel_2 = new JLabel("Name Stock");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setForeground(new Color(204, 153, 0));
		lblNewLabel_2.setBounds(67, 114, 113, 23);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_2_1 = new JLabel("Stock Type");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_1.setForeground(new Color(204, 153, 0));
		lblNewLabel_2_1.setBounds(67, 167, 96, 23);
		panel.add(lblNewLabel_2_1);

		JLabel lblNewLabel_2_2 = new JLabel("Price");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_2.setForeground(new Color(204, 153, 0));
		lblNewLabel_2_2.setBounds(67, 221, 80, 23);
		panel.add(lblNewLabel_2_2);

		JButton btnNewButton = new JButton("Add Stock");
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        try {
		            // Gather input from GUI fields
		            String name = textField.getText();
		            String type = (String) comboBox.getSelectedItem();
		            int price = Integer.parseInt(textField_2.getText());
		            int cost = Integer.parseInt(textField_3.getText());
		            int quantity = Integer.parseInt(textField_1.getText());
		            double batchPrice = Double.parseDouble(textField_2.getText());
		            double costPerUnit = Double.parseDouble(textField_3.getText());
		            String expiryDate = textField_4.getText();

		            // Check for duplication in Inventory.csv
		            if (x.isStockNameDuplicate(name, "src/Inventory.csv")) {
		                JOptionPane.showMessageDialog(contentPane, "Error: Stock name already exists in Inventory.",
		                        "Duplicate Error", JOptionPane.ERROR_MESSAGE);
		                return;
		            }else {// Call methods in MethodsStock
		            S.addStockToFile(name, type, price, cost);
		            S.batchInformations(quantity, batchPrice, costPerUnit, expiryDate);
		            // Confirmation message
		            JOptionPane.showMessageDialog(contentPane, "Stock item and batch information saved successfully!");
}



		        } catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(contentPane, "Please enter valid numeric values for price, cost, and quantity.",
		                    "Input Error", JOptionPane.ERROR_MESSAGE);
		        } catch (Exception ex) {
		            JOptionPane.showMessageDialog(contentPane, "An error occurred: " + ex.getMessage(),
		                    "Error", JOptionPane.ERROR_MESSAGE);
		        }
		    }
		});


		btnNewButton.setFocusPainted(false);
        btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(new Color(0xFFFDD0));
		btnNewButton.setBackground(new Color(0xB8860B));
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		btnNewButton.setBounds(132, 519, 143, 23);
		panel.add(btnNewButton);

		textField_2 = new JTextField();
		textField_2.setForeground(new Color(0xd3d3d3));
		textField_2.setOpaque(false);
		textField_2.setColumns(10);
		textField_2.setBorder(new MatteBorder(0, 0,1, 0, new Color(204, 153, 0)));
		textField_2.setBackground(new Color(0, 0, 0, 0));
		textField_2.setBounds(214, 223, 163, 21);
		panel.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setOpaque(false);
		textField_3.setForeground(new Color(211, 211, 211));
		textField_3.setColumns(10);
		textField_3.setBorder(new MatteBorder(0, 0,1, 0, new Color(204, 153, 0)));
		textField_3.setBackground(new Color(0, 0, 0, 0));
		textField_3.setBounds(214, 277, 163, 21);
		panel.add(textField_3);

		JLabel lblNewLabel_2_2_1 = new JLabel("Cost");
		lblNewLabel_2_2_1.setForeground(new Color(204, 153, 0));
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_2_1.setBounds(67, 272, 80, 23);
		panel.add(lblNewLabel_2_2_1);

		comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"drinks", "ships", "snacks"}));
		comboBox.setOpaque(false);
		comboBox.setBounds(214, 169, 163, 22);
		panel.add(comboBox);

		JLabel lblNewLabel_3 = new JLabel("  Add Stock");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_3.setForeground(new Color(204, 153, 0));
		lblNewLabel_3.setIcon(new ImageIcon("src/img/add (3).png"));
		lblNewLabel_3.setBounds(116, 23, 260, 64);
		panel.add(lblNewLabel_3);

		textField_1 = new JTextField();
		textField_1.setOpaque(false);
		textField_1.setForeground(new Color(211, 211, 211));
		textField_1.setColumns(10);
		textField_1.setBorder(new MatteBorder(0, 0,1, 0, new Color(204, 153, 0)));
		textField_1.setBackground(new Color(0, 0, 0, 0));
		textField_1.setBounds(214, 330, 163, 21);
		panel.add(textField_1);

		JLabel lblNewLabel_2_2_1_1 = new JLabel("Quantity");
		lblNewLabel_2_2_1_1.setForeground(new Color(204, 153, 0));
		lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_2_1_1.setBounds(67, 328, 80, 23);
		panel.add(lblNewLabel_2_2_1_1);

		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("<html>Expiration date </html>");
		lblNewLabel_2_2_1_1_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2_2_1_1_1.setForeground(new Color(204, 153, 0));
		lblNewLabel_2_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2_2_1_1_1.setBounds(67, 379, 96, 64);
		panel.add(lblNewLabel_2_2_1_1_1);

		textField_4 = new JTextField();
		textField_4.setOpaque(false);
		textField_4.setForeground(new Color(211, 211, 211));
		textField_4.setColumns(10);
		textField_4.setBorder(new MatteBorder(0, 0,1, 0, new Color(204, 153, 0)));
		textField_4.setBackground(new Color(0, 0, 0, 0));
		textField_4.setBounds(214, 384, 163, 21);
		panel.add(textField_4);
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(JFrame.ICONIFIED);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setOpaque(true);
				lblNewLabel_1.setBackground(new Color(50, 50, 100));
				lblNewLabel_1.repaint();
			}

			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_1.setOpaque(false);
				lblNewLabel_1.repaint();
			}
		});


































		addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                initialClick = e.getPoint();
            }
        });


        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int thisX = getLocation().x;
                int thisY = getLocation().y;

                int xMoved = e.getX() - initialClick.x;
                int yMoved = e.getY() - initialClick.y;

                int newX = thisX + xMoved;
                int newY = thisY + yMoved;
                setLocation(newX, newY);
            }
        });


		revalidate();

	}
}


 class MethodsStock {
	    private String stockName;
	    private String stockID;
	    private String type;
	    private double price;
	    private double cost;
	    private static final Random random = new Random();

	    public String generateId() {
	        StringBuilder idBuilder = new StringBuilder();
	        for (int i = 0; i < 3; i++) {
	            int digit = random.nextInt(10);
	            idBuilder.append(digit);
	        }
	        for (int i = 0; i < 3; i++) {
	            char letter = (char) ('A' + random.nextInt(26));
	            idBuilder.append(letter);
	        }
	        return idBuilder.toString();
	    }

	    private String getExistingStockId(String stockName) {
	        String fileName = "src/Inventory.csv";
	        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] data = line.split(",");
	                if (data.length >= 2 && data[0].equalsIgnoreCase(stockName)) {
	                    return data[1];
	                }
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }
	        return null;
	    }

	    public void addStockToFile(String name, Object type, int price, int cost) {

	        this.stockName = name;
	        this.stockID = getExistingStockId(this.stockName);
	        if (this.stockID == null) {
	            this.stockID = generateId();
	            System.out.println("Generated ID: " + this.stockID);
	        } else {
	            System.out.println("Stock already exists. Using existing ID: " + this.stockID);
	        }

	        this.type = ((String)type).toLowerCase();/////
	        this.price = price;
	        this.cost = cost;

	        String fileName = "src/Inventory.csv";
	        File stockFile = new File(fileName);

	        try (BufferedWriter bw = new BufferedWriter(new FileWriter(stockFile, true))) {
	            if (stockFile.length() == 0) {
	                bw.write("Stock Name,Stock ID,Type,Price,Cost\n");
	            }

	            String formattedPrice = String.format("%.2f", this.price);
	            String formattedCost = String.format("%.2f", this.cost);
	            bw.write(this.stockName + "," + this.stockID + "," + this.type + "," + formattedPrice + "," + formattedCost + "\n");
	            System.out.println("Stock item saved successfully!");

	        } catch (IOException e) {
	            System.out.println("Error writing to file: " + e.getMessage());
	        }

	        // Close the scanner here if it won't be used elsewhere

	    }

	    public void batchInformations(int quantity1, double batchPrice2, double costPerUnit2, String expiryDate1) {


	        int quantity = quantity1;


	        double batchPrice = batchPrice2;


	        double costPerUnit = costPerUnit2;


	        String expiryDate = expiryDate1;

	        Batch batch = new Batch(); // Create Batch instance
	        batch.addBatchToFile(this.stockID, batchPrice, expiryDate, quantity, costPerUnit);

	        //System.out.print("Do you want to add another stock item? (yes/no): ");
	        //String response = scanner.nextLine().trim().toLowerCase();

	        //if (response.equals("yes")) {
	      //      addStockToFile(this.stockName, this.type, (int)this.price, (int)this.cost); // Modify to pass required params
	       // }

	    //    scanner.close(); // Close scanner
	    }
	}
 class Batch {
	    private String batchID;
	    private String productID; // Corresponds to Stock ID in Inventory
	    private double price;
	    private String expiryDate;
	    private int amount;
	    private static final Random random = new Random();

	    public Batch() {
	    }

	    public Batch(String productID, double price, String expiryDate, int amount) {
	        this.batchID = generateBatchId(); // Generate unique Batch ID
	        this.productID = productID;
	        this.price = price;
	        this.expiryDate = expiryDate;
	        this.amount = amount;
	    }

	    public String generateBatchId() {
	        StringBuilder idBuilder = new StringBuilder();
	        for (int i = 0; i < 4; i++) {
	            int digit = random.nextInt(10);
	            idBuilder.append(digit);
	        }
	        for (int i = 0; i < 4; i++) {
	            char letter = (char) ('A' + random.nextInt(26));
	            idBuilder.append(letter);
	        }
	        return idBuilder.toString();
	    }

	    public void addBatchToFile(String productID, double price, String expiryDate, int amount, double costPerUnit) {
	        String batchID = generateBatchId();
	        String filename = "src/Batch.csv";
	        File batchFile = new File(filename);

	        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))) {

	            // Write header if file is empty
	            if (batchFile.length() == 0) {
	                bw.write("BatchID,ProductID,Price,ExpiryDate,Amount,CostPerUnit\n");
	            }

	            // Write batch data, including cost per unit
	            bw.write(batchID + "," + productID + "," + price + "," + expiryDate + "," + amount + "," + costPerUnit
	                    + "\n");
	            System.out.println("Batch saved successfully!");

	        } catch (IOException e) {
	            System.out.println("ERROR WRITING TO FILE: " + e.getMessage());
	        }
	    }

	    public void viewBatches() {
	        String fileName = "src/Batch.csv";
	        File batchFile = new File(fileName);

	        if (!batchFile.exists()) {
	            System.out.println("Batch file not found.");
	            return;
	        }

	        try (BufferedReader br = new BufferedReader(new FileReader(batchFile))) {
	            String line;
	            boolean isHeader = true;

	            while ((line = br.readLine()) != null) {
	                // Skip the header row
	                if (isHeader) {
	                    isHeader = false;
	                    continue;
	                }

	                String[] batchDetails = line.split(",");

	                if (batchDetails.length == 5) {
	                    // Print batch details
	                    System.out.println("Viewing batch...");
	                    System.out.println("Batch ID: " + batchDetails[0]);
	                    System.out.println("Product ID: " + batchDetails[1]);
	                    System.out.println("Price: " + batchDetails[2]);
	                    System.out.println("Expiry Date: " + batchDetails[3]);
	                    System.out.println("Amount: " + batchDetails[4]);
	                    System.out.println("-------------------------------");
	                } else {
	                    System.out.println("Incorrect data format for line: " + line);
	                }
	            }
	        } catch (IOException e) {
	            System.out.println("Error reading from batch file: " + e.getMessage());
	        }
	    }

	}

 /////////////////////////////
 class payment extends JFrame {
	    private static final long serialVersionUID = 1L;
	    private JPanel contentPane;
	    private JLabel lbl1; // Label for Customer Name
	    private JLabel lbl2; // Label for Current Balance
	    private JTextField paymentField;

	    private String csvFilePath = "src/customers.csv"; // Path to the customer CSV file
	    private String customerName;
	    public String customerId;
	    private String currentBalance;

	    public payment(String customerName,String customerId, String currentBalance) {
	        this.customerName = customerName;
	        this.customerId = customerId;
	        this.currentBalance = currentBalance;

	        setDefaultCloseOperation(payment.DISPOSE_ON_CLOSE); // Close only this window
	        setBounds(100, 100, 470, 350);
	        contentPane = new JPanel();
	        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	        setContentPane(contentPane);
	        contentPane.setLayout(null);
	      setResizable(false);

	        // Add GUI components
	        JPanel panel = new JPanel(){
				private static final long serialVersionUID = 1L;
				private final ImageIcon backgroundImage = new ImageIcon(
						getClass().getResource("/img/image_2024-10-29_114956805.png"));

				@Override
				protected void paintComponent(Graphics g) {
					super.paintComponent(g);
					g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
				}
			};
	        panel.setBounds(0, 0, 470, 350);
	        contentPane.add(panel);
	        panel.setLayout(null);

	        JLabel lblNewLabel_2 = new JLabel("Customer Name :");
	        lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
	        lblNewLabel_2.setForeground(new Color(204, 153, 0));
	        lblNewLabel_2.setBounds(23, 85,210, 23);
	        panel.add(lblNewLabel_2);

	        JLabel lblNewLabel_2_1 = new JLabel("Debt :");
	        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
	        lblNewLabel_2_1.setForeground(new Color(204, 153, 0));
	        lblNewLabel_2_1.setBounds(23, 131, 113, 23);
	        panel.add(lblNewLabel_2_1);

	        lbl1 = new JLabel(customerName);
	        lbl1.setForeground(new Color(204, 153, 0));
	        lbl1.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        lbl1.setBounds(243, 85, 147, 23);
	        panel.add(lbl1);

	        lbl2 = new JLabel("$" + currentBalance);
	        lbl2.setForeground(new Color(204, 153, 0));
	        lbl2.setFont(new Font("Tahoma", Font.PLAIN, 18));
	        lbl2.setBounds(243, 131, 131, 23);
	        panel.add(lbl2);

	        JLabel lblNewLabel_2_2 = new JLabel("Add Payment");
	        lblNewLabel_2_2.setForeground(new Color(204, 153, 0));
	        lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 26));
	        lblNewLabel_2_2.setBounds(156, 32, 169, 32);
	        panel.add(lblNewLabel_2_2);

	        JLabel lblNewLabel_2_1_1 = new JLabel("Enter the payment:");
	        lblNewLabel_2_1_1.setForeground(new Color(204, 153, 0));
	        lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 21));
	        lblNewLabel_2_1_1.setBounds(23, 184, 210, 23);
	        panel.add(lblNewLabel_2_1_1);

	        paymentField = new JTextField();
	        paymentField.setFont(new Font("Tahoma", Font.PLAIN, 16));
	        paymentField.setBounds(243, 184, 197, 32);
	        panel.add(paymentField);
	        paymentField.setColumns(10);

	        JButton btnNewButton = new JButton("Add");
	        btnNewButton.setForeground(Color.WHITE);
	        btnNewButton.setBackground(new Color(0xB8860B));
	        btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
	        btnNewButton.setBounds(144, 250, 143, 23);

	        // Add ActionListener for Add Payment button
	        btnNewButton.addActionListener(e -> {
	            String paymentText = paymentField.getText();
	            try {
	                double paymentAmount = Double.parseDouble(paymentText); // Parse payment amount
	                double currentBal = Double.parseDouble(currentBalance);

	                double newBalance = currentBal + paymentAmount; // Update balance
	                updateCustomerBalance(newBalance);
	                JOptionPane.showMessageDialog(this, "Payment added successfully! New Balance: $" + newBalance);
	                dispose(); // Close the window
	            } catch (NumberFormatException ex) {
	                JOptionPane.showMessageDialog(this, "Invalid payment amount. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
	                dispose();
	            }
	        });
	        panel.add(btnNewButton);
	    }


	    // Method to update the customer's balance in the CSV file
	    private void updateCustomerBalance(double newBalance) {
	        ArrayList<String> lines = new ArrayList<>();

	        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
	            String line;
	            boolean customerFound = false;

	            while ((line = br.readLine()) != null) {
	                String[] columns = line.split(",");
	                if (columns.length >= 5 && columns[1].trim().equals(customerId)) { // Match customer by ID
	                    columns[4] = String.valueOf(newBalance); // Update balance
	                    line = String.join(",", columns); // Rebuild the line
	                    customerFound = true;
	                }
	                lines.add(line); // Add each line (updated or unchanged) to the list
	            }

	            if (!customerFound) {
	                JOptionPane.showMessageDialog(this, "Customer ID not found!", "Error", JOptionPane.ERROR_MESSAGE);
	                return;
	            }

	        } catch (IOException e) {
	            JOptionPane.showMessageDialog(this, "Error reading the CSV file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	            e.printStackTrace();
	            return;
	        }

	        // Write the updated data back to the file
	        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFilePath))) {
	            for (String updatedLine : lines) {
	                bw.write(updatedLine);
	                bw.newLine();
	            }
	            JOptionPane.showMessageDialog(this, "Customer balance updated successfully!");
	        } catch (IOException e) {
	            JOptionPane.showMessageDialog(this, "Error writing to the CSV file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	            e.printStackTrace();
	        }
	    }



	}


 class AddCustomer extends JFrame {

		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private Point initialClick;
		private JTextField textField;
		private JTextField textField_1;
		private JTextField textField_2;

		/**
		 * Launch the application.
		 *
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						AddCustomer frame = new AddCustomer();
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
		Methods c = new Methods();

		public AddCustomer() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 400);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setUndecorated(true);
			contentPane.setLayout(null);
			setContentPane(contentPane);
			setAlwaysOnTop(true);

			JPanel panel = new JPanel() {
				private static final long serialVersionUID = 1L;
				private final ImageIcon backgroundImage = new ImageIcon(getClass().getResource("/img/image_2024-10-29_114956805.png"));

				@Override
				protected void paintComponent(Graphics g) {
					super.paintComponent(g);
					g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
				}
			};
			panel.setBackground(new Color(1, 25, 70));
			panel.setBounds(0, 0, 450, 400);
			contentPane.add(panel);
			panel.setLayout(null);

			JLabel lblNewLabel_1 = new JLabel();
			lblNewLabel_1.setBounds(330, 0, 60, 30);
			panel.add(lblNewLabel_1);
			lblNewLabel_1.setForeground(new Color(204, 153, 0));
			lblNewLabel_1.setText("-");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setFont(new Font("Andalus", Font.PLAIN, 40));

			JLabel lblNewLabel = new JLabel();
			lblNewLabel.setBounds(390, 0, 60, 30);
			lblNewLabel.setForeground(new Color(204, 153, 0));
			lblNewLabel.setBackground(new Color(0, 0, 51));
			lblNewLabel.setText("x");

			lblNewLabel.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					dispose();
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					lblNewLabel.setOpaque(true); // Make it opaque on hover
					lblNewLabel.setBackground(Color.red);
					lblNewLabel.repaint(); // Refresh to show the new background
				}

				@Override
				public void mouseExited(MouseEvent e) {
					lblNewLabel.setOpaque(false); // Make it transparent again on exit
					lblNewLabel.repaint(); // Refresh to remove the background
				}
			});
			lblNewLabel.setFont(new Font("Simplified Arabic", Font.PLAIN, 32));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

			panel.add(lblNewLabel);

			textField = new JTextField();
			textField.setBackground(new Color(0, 0, 0, 0));
			textField.setForeground(new Color(0xd3d3d3));
			textField.setOpaque(false);
			textField.setBorder(new MatteBorder(0, 0, 1, 0, new Color(204, 153, 0)));
			textField.setColumns(10);
			textField.setBounds(215, 126, 163, 21);
			panel.add(textField);

			JLabel lblNewLabel_2 = new JLabel("Name Customer");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_2.setForeground(new Color(204, 153, 0));
			lblNewLabel_2.setBounds(68, 126, 113, 23);
			panel.add(lblNewLabel_2);

			JLabel lblNewLabel_2_1 = new JLabel("Phone Number");
			lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblNewLabel_2_1.setForeground(new Color(204, 153, 0));
			lblNewLabel_2_1.setBounds(68, 187, 96, 23);
			panel.add(lblNewLabel_2_1);

			JLabel lblNewLabel_2_2 = new JLabel("Email");
			lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_2_2.setForeground(new Color(204, 153, 0));
			lblNewLabel_2_2.setBounds(68, 246, 80, 23);
			panel.add(lblNewLabel_2_2);

			JButton btnNewButton = new JButton("Add Customer");
			
			btnNewButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					 // Validate the text fields
			        if (textField.getText().trim().isEmpty() || 
			            textField_1.getText().trim().isEmpty() || 
			            textField_2.getText().trim().isEmpty()) {

			            // Show a warning message if any field is empty
			            JOptionPane.showMessageDialog(
			                null,
			                "Please fill in all fields before adding the customer.",
			                "Validation Error",
			                JOptionPane.WARNING_MESSAGE
			            );
			            return; // Stop further execution
			        }
					
					
					c.addCustomer(textField.getText(), textField_1.getText(), textField_2.getText());
					dispose();
				}
			});
			btnNewButton.setFocusPainted(false);
			btnNewButton.setBorderPainted(false);
			btnNewButton.setForeground(new Color(0xFFFDD0));
			btnNewButton.setBackground(new Color(0xB8860B));
			btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
			btnNewButton.setBounds(144, 329, 143, 23);
			panel.add(btnNewButton);

			textField_1 = new JTextField();
			textField_1.setOpaque(false);
			textField_1.setColumns(10);
			textField_1.setForeground(new Color(0xd3d3d3));
			textField_1.setBorder(new MatteBorder(0, 0, 1, 0, new Color(204, 153, 0)));
			textField_1.setBackground(new Color(0, 0, 0, 0));
			textField_1.setBounds(215, 190, 163, 21);
			panel.add(textField_1);

			textField_2 = new JTextField();
			textField_2.setForeground(new Color(0xd3d3d3));
			textField_2.setOpaque(false);
			textField_2.setColumns(10);
			textField_2.setBorder(new MatteBorder(0, 0, 1, 0, new Color(204, 153, 0)));
			textField_2.setBackground(new Color(0, 0, 0, 0));
			textField_2.setBounds(215, 249, 163, 21);
			panel.add(textField_2);

			JLabel lblNewLabel_3 = new JLabel("   Add Customer");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
			lblNewLabel_3.setForeground(new Color(204, 153, 0));
			lblNewLabel_3.setIcon(new ImageIcon("src/img/add (2).png"));
			lblNewLabel_3.setBounds(118, 44, 272, 48);
			panel.add(lblNewLabel_3);
			lblNewLabel_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					setState(JFrame.ICONIFIED);
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					lblNewLabel_1.setOpaque(true);
					lblNewLabel_1.setBackground(new Color(50, 50, 100));
					lblNewLabel_1.repaint();
				}

				@Override
				public void mouseExited(MouseEvent e) {
					lblNewLabel_1.setOpaque(false);
					lblNewLabel_1.repaint();
				}
			});

			addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					initialClick = e.getPoint();
				}
			});

			addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseDragged(MouseEvent e) {
					int thisX = getLocation().x;
					int thisY = getLocation().y;

					int xMoved = e.getX() - initialClick.x;
					int yMoved = e.getY() - initialClick.y;

					int newX = thisX + xMoved;
					int newY = thisY + yMoved;
					setLocation(newX, newY);
				}
			});

		}
	}
 
 
 