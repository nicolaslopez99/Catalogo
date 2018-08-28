import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ArmaHombre extends AbstractoArma{
	public String Mostrar2(AbstractoArma hombre) {
		String resultado="mira esa arma de hombre";
		return resultado;
	}
	public ImageIcon Mostrar(AbstractoArma hombre) {
		ImageIcon img = new ImageIcon("espadaHombre.png");
		//JLabel label = new JLabel(img);
		return img;
	}
}
