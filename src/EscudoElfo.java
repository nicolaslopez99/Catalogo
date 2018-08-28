import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EscudoElfo extends AbstractoEscudo{
	public String Mostrar2(AbstractoEscudo elfo) {
		String resultado="mira ese escudo de elfo";
		return resultado;
	}
	public ImageIcon Mostrar(AbstractoEscudo elfo) {
		ImageIcon img = new ImageIcon("armaelfo.png");
		//JLabel label = new JLabel(img);
		return img;
	}
}
