package mundopc;

import com.gm.mundopc.Monitor;
import com.gm.mundopc.Orden;
import com.gm.mundopc.Raton;
import com.gm.mundopc.Teclado;
import com.gm.mundopc.computadora;


public class TestMain {


	public static void main(String[] args) {
		Monitor hhh = new Monitor(12,"hola", 12.2, 2);
		
		Raton raton = new Raton (17, 1);
		Teclado teclado = new Teclado (18, 1);
		computadora uno = new computadora("elias", hhh, teclado, raton);
		Orden Lana = new Orden (1);
		Lana.agregarComputadora(uno);
		Lana.mostrarOrder();
		
	}
}
