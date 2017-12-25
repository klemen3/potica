import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Gui extends JFrame implements ActionListener, KeyListener {
	
	private JTextField odgovor;
	private JButton poslji;
	
	public void mainFrame() {
	
		try {
	        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	    } catch (Exception evt) {}
	
		JFrame frame = new JFrame("Potica");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();	
		panel.setPreferredSize(new Dimension(400,200));
		
		JLabel label = new JLabel("Odgovor: ");	
		
		odgovor = new JTextField(20);
		odgovor.setPreferredSize(new Dimension(300, 24));
		odgovor.addKeyListener(this);
		panel.add(label);
		panel.add(odgovor);
		frame.getContentPane().add(panel);
		
		poslji = new JButton("Klikni!");
		panel.add(poslji);
		poslji.addActionListener(this);
		
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("e");
		if (e.getSource() == odgovor) {
			if (odgovor.getText().equals("da")) {
				if (e.getKeyChar() == '\n') {
					try {
						ProperŽurka.speci("potica");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
			if (odgovor.getText().equals("ne")) {
				if (e.getKeyChar() == '\n') {
					try {
						ProperŽurka.speci("potica");
					} catch (IOException e2) {
						e2.printStackTrace();
					}
					try {
						ProperŽurka.speci("potica");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//TODO

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
