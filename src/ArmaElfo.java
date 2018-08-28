import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ArmaElfo extends AbstractoArma{
	public String Mostrar2(AbstractoArma elfo) {
		String resultado="mira esa arma de elfo";
		return resultado;
	}
	public ImageIcon Mostrar(AbstractoArma elfo) {
		ImageIcon img = new ImageIcon("armaElfo.png");
		//JLabel label = new JLabel(img);
		return img;
	}
}
