public class Termino {
    String idTermino;
    String Termino;
    String Significado;
    String Categoria;

    Termino(String idTermino, String Termino, String Significado, String Categoria){
        this.idTermino = idTermino;
        this.Termino = Termino;
        this.Significado = Significado;
        this.Categoria = Categoria;
    }

    public boolean existe_consulta (String idTermino,String idconsulta) {
		return idTermino.equals(idconsulta)?true:false;
	}
}
