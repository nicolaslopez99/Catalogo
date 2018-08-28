import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CuerpoElfo extends AbstractoCuerpo{
	public String Mostrar2(AbstractoCuerpo elfo) {
		String resultado="mira ese cuerpo de elfo";
		return resultado;
	}
	public ImageIcon Mostrar(AbstractoCuerpo elfo) {
		ImageIcon img = new ImageIcon("armaelfo.png");
		//JLabel label = new JLabel(img);
		return img;
	}
}
