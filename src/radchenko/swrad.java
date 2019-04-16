package radchenko;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swrad {

	private JFrame frame;
	private final JButton btnNewButton = new JButton("Изменить цвет формы");
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swrad window = new swrad();
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
	public swrad() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(frame.getBackground() == Color.RED){
					frame.setBackground(Color.GREEN);
					textField.setText("Зеленый");}
					else{
						frame.setBackground(Color.RED);
						textField.setText("Красный");
					}
			}
		});
		btnNewButton.setBounds(63, 84, 217, 33);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(85, 193, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
