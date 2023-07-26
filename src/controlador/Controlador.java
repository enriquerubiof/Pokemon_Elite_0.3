package controlador;

import vista.Bienvenida;

public class Controlador
{
	private Bienvenida bienvenida;

	public Controlador()
	{
		this.bienvenida = new Bienvenida();
	}
	
	public void iniciarPrograma()
	{
		this.bienvenida.setVisible(true);
	}
}
