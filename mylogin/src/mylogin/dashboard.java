package mylogin;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Font;

public class dashboard extends JFrame {

	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=-20,-1
	 */
	private final JPanel panel = new JPanel();
	private final JPanel panelMenu = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dashboard frame = new dashboard();
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
	public dashboard() {
		setBackground(Color.CYAN);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 776, 378);
		setUndeorated(true);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new LineBorder(Color.BLUE, 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		panelMenu.setBackground(Color.PINK);
		panelMenu.setBounds(0, 0, 239, 355);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);
		
		JTextPane txtpnWelcomeToWebpage = new JTextPane();
		txtpnWelcomeToWebpage.setFont(new Font("Tw Cen MT", Font.BOLD | Font.ITALIC, 20));
		txtpnWelcomeToWebpage.setText("WELCOME TO OUR PAGE");
		txtpnWelcomeToWebpage.setBounds(10, 11, 200, 52);
		panelMenu.add(txtpnWelcomeToWebpage);
		
		JPanel panelLoad = new JPanel();
		panelLoad.setBackground(Color.PINK);
		panelLoad.setBounds(10, 70, 198, 30);
		panelMenu.add(panelLoad);
		panelLoad.setLayout(null);
		
		JLabel lblLoad = new JLabel("Load");
		lblLoad.setForeground(Color.BLUE);
		lblLoad.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblLoad.setBounds(83, 11, 60, 15);
		panelLoad.add(lblLoad);
		
		JLabel lblIcon2_2 = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource("/load-icon.png")).getImage();
		lblIcon2_2.setIcon(new ImageIcon(img));
		lblIcon2_2.setBounds(58, 12, 23, 14);
		panelLoad.add(lblIcon2_2);
		
		JPanel panelEditDeletePreferences = new JPanel();
		panelEditDeletePreferences.setBackground(Color.PINK);
		panelEditDeletePreferences.setBounds(10, 100, 198, 30);
		panelMenu.add(panelEditDeletePreferences);
		panelEditDeletePreferences.setLayout(null);
		
		JLabel lblEditdeletePreferences = new JLabel("Edit/Delete Preferences");
		lblEditdeletePreferences.setForeground(Color.BLUE);
		lblEditdeletePreferences.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEditdeletePreferences.setBounds(24, 11, 164, 15);
		panelEditDeletePreferences.add(lblEditdeletePreferences);
		
		JPanel paneEditDeleteRooms = new JPanel();
		paneEditDeleteRooms.setBackground(Color.PINK);
		paneEditDeleteRooms.setBounds(12, 130, 198, 30);
		panelMenu.add(paneEditDeleteRooms);
		paneEditDeleteRooms.setLayout(null);
		
		JLabel lblEditDeleteRooms = new JLabel("Edit Delete Rooms");
		lblEditDeleteRooms.setForeground(Color.BLUE);
		lblEditDeleteRooms.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblEditDeleteRooms.setBounds(34, 11, 134, 15);
		paneEditDeleteRooms.add(lblEditDeleteRooms);
		
		JPanel panelAddCourses = new JPanel();
		panelAddCourses.setBackground(Color.PINK);
		panelAddCourses.setBounds(10, 160, 198, 30);
		panelMenu.add(panelAddCourses);
		
		JLabel lblIcon2_1 = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource("/add-icon.png")).getImage();
		lblIcon2_1.setIcon(new ImageIcon(img));
		panelAddCourses.add(lblIcon2_1);
		
		JLabel lblAddCourses = new JLabel("Add Courses");
		lblAddCourses.setForeground(Color.BLUE);
		lblAddCourses.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panelAddCourses.add(lblAddCourses);
		
		JPanel panelClassRoomAllocation = new JPanel();
		panelClassRoomAllocation.setBackground(Color.PINK);
		panelClassRoomAllocation.setBounds(10, 220, 198, 30);
		panelMenu.add(panelClassRoomAllocation);
		
		JLabel lblClassRoomAlloation = new JLabel("Class Room Alloation");
		lblClassRoomAlloation.setForeground(Color.BLUE);
		lblClassRoomAlloation.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panelClassRoomAllocation.add(lblClassRoomAlloation);
		
		JPanel paneEraseAllData = new JPanel();
		paneEraseAllData.setBackground(Color.PINK);
		paneEraseAllData.setBounds(10, 250, 198, 30);
		panelMenu.add(paneEraseAllData);
		
		JLabel lblIcon2 = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource("/Close-icon.png")).getImage();
		lblIcon2.setIcon(new ImageIcon(img));
		paneEraseAllData.add(lblIcon2);
		
		JLabel lblEraseAllData = new JLabel("Erase All Data");
		lblEraseAllData.setForeground(Color.BLUE);
		lblEraseAllData.setFont(new Font("Times New Roman", Font.BOLD, 14));
		paneEraseAllData.add(lblEraseAllData);
		
		JPanel panelLogout = new JPanel();
		panelLogout.setBackground(Color.PINK);
		panelLogout.setBounds(10, 280, 198, 30);
		panelMenu.add(panelLogout);
		panelLogout.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(77, 13, 0, 0);
		panelLogout.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBounds(82, 13, 0, 0);
		panelLogout.add(lblNewLabel_1_1);
		
		JLabel lblLogout = new JLabel("Logout");
		lblLogout.setBounds(87, 5, 43, 17);
		lblLogout.setForeground(Color.BLUE);
		lblLogout.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panelLogout.add(lblLogout);
		
		JLabel lblIcon = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/logout-icon.png")).getImage();
		lblIcon.setIcon(new ImageIcon(img));
		lblIcon.setBounds(54, 8, 23, 14);
		panelLogout.add(lblIcon);
		
		JPanel panelAddRooms = new JPanel();
		panelAddRooms.setBackground(Color.PINK);
		panelAddRooms.setBounds(10, 190, 198, 30);
		panelMenu.add(panelAddRooms);
		
		JLabel lblIcon2_3 = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource("/add-icon.png")).getImage();
		lblIcon2_3.setIcon(new ImageIcon(img));
		panelAddRooms.add(lblIcon2_3);
		
		JLabel lblAddRooms = new JLabel("Add Rooms");
		lblAddRooms.setForeground(Color.BLUE);
		lblAddRooms.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panelAddRooms.add(lblAddRooms);
	}

	private void setUndeorated(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
