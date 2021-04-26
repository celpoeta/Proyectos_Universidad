public class Categoria {
    String idCategoria;
    String Categoria;

    Categoria(String idCategoria, String Categoria){
        this.idCategoria = idCategoria;
        this.Categoria = Categoria;
    }

    public boolean existe_consulta (String idCategoria,String idconsulta) {
		return idCategoria.equals(idconsulta)?true:false;
	}
    
    
}
