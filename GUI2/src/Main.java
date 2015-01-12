import java.awt.EventQueue;

import controlador.controlador;
import model.Persona;
import vista.Vista;


public class Main {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista v = new Vista();
					Persona m = new Persona();
					controlador c = new controlador(m ,v);
					v.setVisible(true);
					c.controlar();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}
