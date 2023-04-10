import java.awt.BorderLayout;
import java.awt.Event;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class comboBox extends JFrame {

	private JPanel contentPane;
	private JComboBox imagesJComboBox;
	private JLabel label;
	private String names[] = { "bug1.gif", "bug2.gif", "travelbug.gif", "buganim.gif" };

	private Icon icons[] = { new ImageIcon(getClass().getResource(names[0])),
			new ImageIcon(getClass().getResource(names[1])), new ImageIcon(getClass().getResource(names[2])),
			new ImageIcon(getClass().getResource(names[3])) };

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					comboBox frame = new comboBox();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public comboBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLayout(new FlowLayout());
	
		imagesJComboBox = new JComboBox(names);
		imagesJComboBox.setMaximumRowCount(3);

		imagesJComboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {

				if (e.getStateChange() == ItemEvent.SELECTED)
					label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);

			}
		});

		add(imagesJComboBox);
		label = new JLabel(icons[0]);
		add(label);

	}

}
