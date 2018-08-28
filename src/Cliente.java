import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Cliente {
	private AbstractoArma abstractoArma;
	private AbstractoEscudo abstractoEscudo;
	private AbstractoCuerpo abstractoCuerpo;

	// Constructor
	public Cliente(FabricaAbstracta fabrica) {
		abstractoArma = fabrica.creararma();
		abstractoEscudo = fabrica.crearescudo();
		abstractoCuerpo= fabrica.crearcuerpo();
	}
	public ImageIcon Run() {
		return abstractoArma.Mostrar(abstractoArma);
	}
	public String Arma() {
		return abstractoArma.Mostrar2(abstractoArma);
	}
	public String Escudo() {
		return abstractoEscudo.Mostrar2(abstractoEscudo);
	}
	public String Cuerpo() {
		return abstractoCuerpo.Mostrar2(abstractoCuerpo);
	}
	

}