import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CuerpoOrco extends AbstractoCuerpo{
	public String Mostrar2(AbstractoCuerpo orco) {
		String resultado="mira ese cuerpo de orco";
		return resultado;
	}
	public ImageIcon Mostrar(AbstractoCuerpo orco) {
		ImageIcon img = new ImageIcon("orco.png");
		//JLabel label = new JLabel(img);
		return img;
	}
}
