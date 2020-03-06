package mylogin;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login extends JFrame {

	private JPanel contentPane;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login frame = new login();
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
	 public login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Page");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblNewLabel.setBounds(27, 11, 397, 49);
		contentPane.add(lblNewLabel);
		
		JLabel userlabel = new JLabel("Username");
		userlabel.setBounds(10, 56, 351, 26);
		contentPane.add(userlabel);
		
		JTextField user = new JTextField();
		user.setBounds(10, 82, 351, 36);
		contentPane.add(user);
		user.setColumns(10);
		
		JLabel passlabel = new JLabel("Password");
		passlabel.setBounds(10, 113, 351, 29);
		contentPane.add(passlabel);
		
		pass = new JPasswordField();
		pass.setBounds(10, 136, 351, 37);
		contentPane.add(pass);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
					Statement st = con.createStatement();
					String sql = "Select * from user where Username ='"+user.getText()+"' and Password='"+pass.getText().toString()+"'";
					ResultSet rs = st.executeQuery(sql);
					if(rs.next()) 
						JOptionPane.showMessageDialog(null,"Login Sucessfully..");
					else
						JOptionPane.showMessageDialog(null,"incorrect username and pasword..");
                    con.close();
							
						
				}catch(Exception e) {
					System.out.print(e);
				}
			}
		});
		btnNewButton.setBounds(10, 184, 89, 23);
		contentPane.add(btnNewButton);
	}
}
