
public class Cantante {
	String idcantante;
	String cantante ;

	Cantante (String idcantante, String cantante){
		this.idcantante = idcantante;	
		this.cantante =  cantante;
	}

	public boolean existe_consulta (String idcantente,String idconsulta) {
		return idcantente.equals(idconsulta)?true:false;
	}
}
