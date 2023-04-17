import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class TextArea extends JFrame {

	private JPanel contentPane;
	JTextArea textArea_1;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextArea frame = new TextArea();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TextArea() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		Box box = Box.createHorizontalBox();
		
		JTextArea textArea = new JTextArea(10, 15);
		textArea.setBounds(22, 11, 138, 357);
		box.add(new JScrollPane(textArea));
		
		JButton newButton = new JButton("Copiar >>>");
		newButton.setBounds(170, 191, 106, 23);
		box.add(newButton);
		
		newButton.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				textArea_1.setText(textArea.getSelectedText());
				
			}
		});
		
		textArea_1 = new JTextArea(10, 15);
		textArea_1.setBounds(286, 11, 138, 357);
		textArea_1.setEditable(false);
		box.add(new JScrollPane(textArea_1));
		add(box);
			
		
		
	}
}
