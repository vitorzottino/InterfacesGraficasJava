import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RadioButtonFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Font plainFont;
	private Font boldFont;
	private Font italicFont;
	private Font boldItalicFont;
	private ButtonGroup radioGroup;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButtonFrame frame = new RadioButtonFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public RadioButtonFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField("Watch the style change");
		textField.setBounds(10, 11, 330, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton plainRadio = new JRadioButton("Plain", false);
		plainRadio.setBounds(10, 40, 65, 23);
		contentPane.add(plainRadio);
		
		JRadioButton boldRadio = new JRadioButton("Bold", false);
		boldRadio.setBounds(96, 40, 65, 23);
		contentPane.add(boldRadio);
		
		JRadioButton italicRadio = new JRadioButton("Italic", false);
		italicRadio.setBounds(184, 40, 65, 23);
		contentPane.add(italicRadio);
		
		JRadioButton boldItalicRadio = new JRadioButton("boldItalic", false);
		boldItalicRadio.setBounds(275, 40, 80, 23);
		contentPane.add(boldItalicRadio);
		
		radioGroup = new ButtonGroup();
		radioGroup.add(plainRadio);
		radioGroup.add(boldRadio);
		radioGroup.add(italicRadio);
		radioGroup.add(boldItalicRadio);
		
		plainFont = new Font("Serif", Font.PLAIN, 14);
		boldFont = new Font("Sans-Serif", Font.BOLD, 14);
		italicFont = new Font("Serif", Font.ITALIC, 14);
		boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		textField.setFont(plainFont);
		
		plainRadio.addItemListener(new RadioButtonHandler(plainFont));
		boldRadio.addItemListener(new RadioButtonHandler(boldFont));
		italicRadio.addItemListener(new RadioButtonHandler(italicFont));
		boldItalicRadio.addItemListener(new RadioButtonHandler(boldItalicFont));
	}
	
	public class RadioButtonHandler implements ItemListener{
		private Font font;
		public RadioButtonHandler(Font f) {
			font = f;
		}
		
		public void itemStateChanged(ItemEvent event) {
			textField.setFont(font);
			
		}
		
	}
	
	

}
