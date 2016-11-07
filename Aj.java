import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Aj  {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField textField_7;
	//private JPanel panelMain;
	private JPanel panel_1addpatient;
	private JPanel panel_2 ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aj window = new Aj();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Aj() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		final JPanel panelMain = new JPanel();
		frame.getContentPane().add(panelMain, "name_196719312612489");
		panelMain.setLayout(null);
		panelMain .setVisible(true);


		panel_1addpatient = new JPanel();
		frame.getContentPane().add(panel_1addpatient, "name_196727655918713");
		panel_1addpatient.setLayout(null);
		panelMain .setVisible(false);
		
		
		panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, "name_196731797739741");
		panel_2.setLayout(null);
		panel_2.setVisible(false);
			
			
		
		JButton btnaddpatientNewButton = new JButton("Add Patient");
		btnaddpatientNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		  panel_1addpatient.setVisible(true);
		  panelMain .setVisible(false);
			}
			
		});
		btnaddpatientNewButton.setBounds(48, 98, 143, 29);
		panelMain.add(btnaddpatientNewButton);
		
		JButton btnSearchNewButton_1 = new JButton("Search");
		try {
			btnSearchNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					panel_2.setVisible(true);
					  panelMain.setVisible(false);
				}
			});
		} catch (Exception e1) {
			System.out.println(e1);
			e1.printStackTrace();
		}
		btnSearchNewButton_1.setBounds(250, 98, 143, 29);
		panelMain.add(btnSearchNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(109, 196, 252, 26);
		panelMain.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Look Up");
		lblNewLabel.setBounds(187, 168, 128, 16);
		panelMain.add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(6, 49, 77, 16);
		panel_1addpatient.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setBounds(6, 77, 66, 16);
		panel_1addpatient.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Date of Birth(mm/dd/yy)");
		lblNewLabel_3.setBounds(6, 107, 164, 16);
		panel_1addpatient.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Height");
		lblNewLabel_4.setBounds(6, 135, 61, 16);
		panel_1addpatient.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Weight");
		lblNewLabel_5.setBounds(6, 163, 61, 16);
		panel_1addpatient.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Priority");
		lblNewLabel_6.setBounds(6, 185, 61, 16);
		panel_1addpatient.add(lblNewLabel_6);
		
		textField_1 = new JTextField();
		textField_1.setBounds(95, 44, 130, 26);
		panel_1addpatient.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(95, 72, 130, 26);
		panel_1addpatient.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(182, 102, 130, 26);
		panel_1addpatient.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(72, 130, 130, 26);
		panel_1addpatient.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(72, 158, 130, 26);
		panel_1addpatient.add(textField_5);
		textField_5.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("High");
		chckbxNewCheckBox.setBounds(42, 202, 128, 23);
		panel_1addpatient.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mid");
		chckbxNewCheckBox_1.setBounds(42, 227, 128, 23);
		panel_1addpatient.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Low");
		chckbxNewCheckBox_2.setBounds(42, 249, 128, 23);
		panel_1addpatient.add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_11 = new JLabel("Add Patient");
		lblNewLabel_11.setBounds(23, 18, 84, 16);
		panel_1addpatient.add(lblNewLabel_11);
		
	  
		
		JLabel lblNewLabel_7 = new JLabel("Search Patient");
		lblNewLabel_7.setBounds(19, 23, 96, 16);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("First Name");
		lblNewLabel_8.setBounds(19, 58, 96, 16);
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Last Name");
		lblNewLabel_9.setBounds(19, 77, 66, 16);
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Date Of Birth(mm/dd/yy)");
		lblNewLabel_10.setBounds(19, 105, 171, 16);
		panel_2.add(lblNewLabel_10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(127, 53, 136, 26);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(127, 77, 136, 26);
		panel_2.add(textField_8);
		textField_8.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(213, 100, 130, 26);
		panel_2.add(textField_7);
		textField_7.setColumns(10);
	}
}
