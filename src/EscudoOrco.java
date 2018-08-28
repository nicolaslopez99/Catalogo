import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EscudoOrco extends AbstractoEscudo{
	public String Mostrar2(AbstractoEscudo orco) {
		String resultado="mira ese escudo de orco";
		return resultado;
	}
	public ImageIcon Mostrar(AbstractoEscudo orco) {
		ImageIcon img = new ImageIcon("armaelfo.png");
		//JLabel label = new JLabel(img);
		return img;
	}
}
