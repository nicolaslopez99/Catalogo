import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class GuiElfo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiElfo window = new GuiElfo();
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
	public GuiElfo() {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 262);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		FabricaAbstracta fabrica = new FabricaElfos();
		Cliente cliente = new Cliente(fabrica);
		
		
		JLabel label = new JLabel(cliente.Arma());
		label.setBounds(26, 33, 197, 198);
		panel.add(label);
		
		JLabel label_1 = new JLabel(cliente.Cuerpo());
		label_1.setBounds(247, 11, 140, 121);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel(cliente.Escudo());
		label_2.setBounds(247, 133, 140, 118);
		panel.add(label_2);
	}

}
