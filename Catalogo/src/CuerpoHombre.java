import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CuerpoHombre extends AbstractoCuerpo{
	public String Mostrar2(AbstractoCuerpo hombre) {
		String resultado="mira ese cuerpo de hombre";
		return resultado;
	}
	public ImageIcon Mostrar(AbstractoCuerpo hombre) {
		ImageIcon img = new ImageIcon("hombre.jpeg");
		//JLabel label = new JLabel(img);
		return img;
	}
}
