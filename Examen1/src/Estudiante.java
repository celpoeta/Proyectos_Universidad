
public class Estudiante {
	String carnet;
	String Nombre;
	double NotaFinal;

	Estudiante(String carnet, String Nombre, double NotaFinal) {
		this.carnet = carnet;
		this.Nombre = Nombre;
		this.NotaFinal = NotaFinal;
	}
	 
	public boolean ExisteEtudiante(String nombre, String cuenta) {
		
		return nombre.equals(cuenta) ? true : false ;
	}

	public void SetNota(double Nota){
		NotaFinal = Nota;
	}
		
}
