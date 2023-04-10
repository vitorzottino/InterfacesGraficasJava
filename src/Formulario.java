import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSlider;
import javax.swing.JToggleButton;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtTesteInterface;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.BLUE, 1, true));
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(5, 11, 474, 214);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		

		JPanel panel = new JPanel();
		panel.setBounds(10, 6, 454, 52);
		panel_1.add(panel);
		panel.setBorder(new LineBorder(Color.BLUE, 1, true));
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		
		

		txtTesteInterface = new JTextField();
		txtTesteInterface.setBackground(Color.WHITE);
		txtTesteInterface.setHorizontalAlignment(SwingConstants.CENTER);
		txtTesteInterface.setBounds(43, 6, 363, 35);
		txtTesteInterface.setFont(new Font("SansSerif", Font.PLAIN, 18));
		txtTesteInterface.setText("HACK DE CS 100% ATUALIZADO");
		txtTesteInterface.setBorder(null);
		txtTesteInterface.setEditable(false);
		panel.add(txtTesteInterface);
		txtTesteInterface.setColumns(10);

		
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.BLUE, 1, true));
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 69, 454, 121);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JToggleButton tglbtnNewToggleButton = new JToggleButton("AIMBOT");
		tglbtnNewToggleButton.setBounds(139, 54, 121, 23);
		panel_2.add(tglbtnNewToggleButton);

		JSlider slider = new JSlider();
		slider.setBounds(102, 11, 200, 26);
		panel_2.add(slider);
		
		JToggleButton tglbtnWallhack = new JToggleButton("WALLHACK");
		tglbtnWallhack.setBounds(139, 87, 121, 23);
		panel_2.add(tglbtnWallhack);

		JButton btnNewButton = new JButton();
		btnNewButton.setText("SAIR");
		btnNewButton.setBackground(Color.WHITE);

		btnNewButton.setBorder(new LineBorder(new Color(192, 192, 192)));
		btnNewButton.setIcon(null);
		btnNewButton.setForeground(Color.BLACK);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Encerrado");
				System.exit(0);
				
			}
		});

		btnNewButton.setBounds(370, 230, 89, 23);
		contentPane.add(btnNewButton);

	}
}
