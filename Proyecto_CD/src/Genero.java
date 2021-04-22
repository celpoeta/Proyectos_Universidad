
public class Genero {
	String idgenero;
	String genero;

	Genero (String idgenero,String genero ){
		this.idgenero = idgenero;
		this.genero = genero;
	}

	public boolean existe_consulta (String idgenero,String idconsulta) {
		return idgenero.equals(idconsulta)?true:false;
	}

}
