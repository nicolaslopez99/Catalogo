import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EscudoHombre extends AbstractoEscudo{
	public String Mostrar2(AbstractoEscudo hombre) {
		String resultado="mira ese escudo de hombre";
		return resultado;
	}
	public ImageIcon Mostrar(AbstractoEscudo hombre) {
		ImageIcon img = new ImageIcon("armaelfo.png");
		//JLabel label = new JLabel(img);
		return img;
	}
}
