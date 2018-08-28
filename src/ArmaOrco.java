import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ArmaOrco extends AbstractoArma{
	public String Mostrar2(AbstractoArma orco) {
		String resultado="mira esa arma de orco";
		return resultado;
	}
	public ImageIcon Mostrar(AbstractoArma orco) {
		ImageIcon img = new ImageIcon("Mandoble_orco.png");
		//JLabel label = new JLabel(img);
		return img;
	}
}
