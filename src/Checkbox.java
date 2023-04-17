import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Checkbox extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JCheckBox boldCheckBox;
	private JCheckBox italicCheckBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Checkbox frame = new Checkbox();
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
	public Checkbox() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 306, 119);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(5, 5, 280, 29);
		contentPane.add(textField);
		textField.setColumns(10);

		CheckBoxHandler handler = new CheckBoxHandler();
		boldCheckBox = new JCheckBox();
		boldCheckBox.setBounds(5, 41, 97, 23);
		contentPane.add(boldCheckBox);
		italicCheckBox = new JCheckBox();
		italicCheckBox.setBounds(188, 41, 97, 23);
		contentPane.add(italicCheckBox);
		boldCheckBox.setText("Negrito");
		italicCheckBox.setText("Italico");
		boldCheckBox.addItemListener(handler);
		italicCheckBox.addItemListener(handler);
	}

	private class CheckBoxHandler implements ItemListener {
		private int valBold = Font.PLAIN;
		private int valItalic = Font.PLAIN;

		public void itemStateChanged(ItemEvent event) {
			if (event.getSource() == boldCheckBox)
				valBold = boldCheckBox.isSelected() ? Font.BOLD : Font.PLAIN;
			if (event.getSource() == italicCheckBox)
				valItalic = italicCheckBox.isSelected() ? Font.ITALIC : Font.PLAIN;
			textField.setFont(new Font("Serif", valBold + valItalic, 14));

		}
	}

}
