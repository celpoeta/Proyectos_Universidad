import java.util.Scanner;

public class ProyectoCD {
	static Scanner teclado = new Scanner (System.in);
	static Scanner teclado1 = new Scanner (System.in);
	static Scanner teclado2 = new Scanner (System.in);
	static int size1 = 25;
	static Cantante [] cant = new Cantante[size1];
	static Genero [] gen = new Genero [size1];
	static Canciones [] can = new Canciones [size1];
	static Ingreso [] ing = new Ingreso [size1];
	static int opcion;
	static int opcion1;
	static int contador_genero;
	static int contador_cantante;
	static int contador_ingresos;
	static int contador_canciones;



	public static void main(String[] args) {
		boolean salir = false;
		
		while (!salir) {
			header_c();
			menu();
			System.out.print("\t Por favor seleccione la opcion a realizar: ");
			opcion = teclado.nextInt();
			switch (opcion) {
				case 1:
					ingreso_genero ();
					break;
				case 2:
					ingreso_cantante ();
					break;
					
				case 3:
						String x;
						modulo_cd ();
						System.out.print("\t Por favor seleccione la opcion a realizar: ");
						opcion1 = teclado.nextInt();
						
						switch (opcion1) {
							case 1:
									ingresar_cd();
								break;
							case 2:
									System.out.print("\t Ingrese el idcd a consultar: ");
									x = teclado2.nextLine();
									consultar(x);
								break;
							case 3:
									System.out.print("\t Ingrese el idcd a modificar: ");
									x = teclado1.nextLine();
									modificar(x);
								break;
							case 4:
							
								break;
							case 5:
							
								break;
							default :
								System.out.println("Son numeros entre 1 - 5:");
						}
					break;
					
				case 4:
					for (int i = 0 ; i < contador_genero ; i ++) {
					System.out.println(gen[i].idgenero + " " + gen[i].genero);	
					}
					System.out.println( "     ---------------------------------------------------------------------");
					for (int i = 0 ; i < contador_cantante ; i ++) {
						System.out.println(cant[i].idcantante + " " + cant[i].cantante);	
						}
					break;
					
				case 5:
					salir = true;
					break;
				default :
					System.out.println("Son numeros entre 1 - 5:");			
			}
		}
}
	
	public static void menu(){
		System.out.println( "     ---------------------------------------------------------------------\n");
		System.out.println( "             <<<<<<<<<<        MENU PRINCIPAL            >>>>>>>>>>");
		System.out.println( "\n     ---------------------------------------------------------------------\n");
		System.out.println( "                                          _    _ _____  _   _ ______ __  __ " );
		System.out.println( "  Ingresar Genero.............(1)        | |  | |  __ '| | | |  ____|  ||  |" );
		System.out.println( "  Ingresar Cantante...........(2)        | |  | | |__) |  || | |__  | '  / |" );
		System.out.println( "  Modulo CD...................(3)        | |  | |  ___/| . ` |  __| | |'/| | " );
		System.out.println( "  Busqueda....................(4)        | |__| | |    | |'  | |    | |  | | " );
		System.out.println( "  Salir / Exit................(5)        |_____/|_|    |_| '_|_|    |_|  |_| \n" );
	}

	public static void header_c(){
		System.out.println( "    _______________________________________________________________________" );
		System.out.println( "    |                                   _____________________             |" );
		System.out.println( "    |                                   |    Gian Carlo     |_____________|" );
		System.out.println( "    |        XXXXXXXXXXXXXXXXXX         |Cta: 0501199412297 |            ||" );
		System.out.println( "    |          Proyecto de CD           |    Estructura     |            ||" );
		System.out.println( "    |        XXXXXXXXXXXXXXXXXX         |        De         |            ||" );
		System.out.println( "    |  ______________XXX________________|       Datos       |            ||" );
		System.out.println( "    |  |  _    _     XXX   _    _    _  |    __  ____ _     |   ______   ||" );
		System.out.println( "    |  | | |  | |  _____  | |  | |  | | |       ______      |   |  _ |   ||" );
		System.out.println( "    |  | |_|  |_|  | | |  |_|  |_|  |_| |       |  | |      |   |  | |   ||" );
		System.out.println( "    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^" );
	}
	
	public static void ingreso_genero () {
		int x;
		String genero;
		System.out.println( "     ---------------------------------------------------------------------");
		System.out.print("\t\t Ingrese la Cantidad de Generos agregar:");
		x = teclado.nextInt();
		int p;
		p = contador_genero;
		contador_genero = contador_genero + x;
		
		
		for (int i = 0; i < x; i++) {
			System.out.printf("\t\t\t Ingrese el Nombre del Genero: ");
			genero = teclado1.nextLine();
			gen[p] = new Genero ("GN000" + (p + 1),genero);
			p++;
		}

		System.out.println( "     ---------------------------------------------------------------------");
		System.out.println("\t\t\t IdGenero \t  Genero");

		for(int i = 0; i < x; i++){
			if(p<=1){

				p = x - p;
				System.out.println( "\t\t\t " + gen[p].idgenero + " \t  " +  gen[p].genero);

			}else{

				if(p==contador_genero){
					p = p - x;
				}

				System.out.println( "\t\t\t " + gen[p].idgenero + " \t  " +  gen[p].genero);
			}
			p++;
		}

		System.out.println( "     ---------------------------------------------------------------------");
		sleep(2000);
	}

	public static void ingreso_cantante () {
		int x;
		String cantante;
		System.out.println( "     ---------------------------------------------------------------------");
		System.out.print("\t\t Ingrese la Cantidad de Cantantes agregar:");
		x = teclado.nextInt();
		int p;
		p = contador_cantante;
		contador_cantante = contador_cantante + x;

		for (int i = 0; i < x; i++) {
			System.out.printf("\t\t\t Ingrese el Nombre del los Cantantes: ");
			cantante = teclado1.nextLine();
			cant[p] = new Cantante ("CANT000" + (p + 1),cantante);
			p++;
		}

		System.out.println( "     ---------------------------------------------------------------------");
		System.out.println("\t\t\t IdCantante \t  Cantante");

		for(int i = 0; i < x; i++){
			if(p<=1){

				p = x - p;
				System.out.println( "\t\t\t " + cant[p].idcantante + " \t  " +  cant[p].cantante);
			}else{
				if(p==contador_cantante){
					p = p - x;
				}
				System.out.println( "\t\t\t " + cant[p].idcantante + " \t  " +  cant[p].cantante);
			}
			p++;
		}
		System.out.println( "     ---------------------------------------------------------------------");
		sleep(2000);
	}
	
	public static void ingreso_canciones (String idcd){
		String canciones;
		int x;
		System.out.println( "     ---------------------------------------------------------------------");
		System.out.print("\t\t Ingrese la Cantidad de Canciones ha agregar:");
		x = teclado.nextInt();
		int p;
		p = contador_canciones;
		contador_canciones = contador_canciones + x;
		
		for (int i = 0; i < x; i++) {
			System.out.printf("\t\t\t Ingrese el Nombre de la Cancion: ");
			canciones = teclado1.nextLine();
			can[p] = new Canciones (idcd,canciones);
			p++;
		}

		//System.out.println( "     ---------------------------------------------------------------------");
		//for(int i = 0; i < x; i++){
		//	System.out.println("\t\t\t IdCD   \t  Cancion");
		//		p = x - p;
		//		System.out.println( "\t\t\t " + can[p].idcd + " \t  " +  can[p].nombre);
		//	p++;
		//}
		//System.out.println( "     ---------------------------------------------------------------------");
		//sleep(2000);
	}

	public static void modulo_cd () {
		System.out.println( "     ---------------------------------------------------------------------\n");
		System.out.println( "             <<<<<<<<<<        MODULO DE CD           >>>>>>>>>>");
		System.out.println( "\n     ---------------------------------------------------------------------\n");
		System.out.println( "                                          _    _ _____  _   _ ______ __  __ " );
		System.out.println( "  Ingresar CD..................(1)        | |  | |  __ '| | | |  ____|  ||  |" );
		System.out.println( "  Consultar....................(2)        | |  | | |__) |  || | |__  | '  / |" );
		System.out.println( "  Modificar....................(3)        | |  | |  ___/| . ` |  __| | |'/| | " );
		System.out.println( "  Eliminar..,..................(4)        | |__| | |    | |'  | |    | |  | | " );
		System.out.println( "  Salir / Exit.................(5)        |_____/|_|    |_| '_|_|    |_|  |_| \n" );
	}
	
	public static void ingresar_cd () {
		int x;
		String idCD;
		String titulo;
		String genero;
		String idgenero;
		String cantante;
		String idcantante;
		boolean bandera = false;

		System.out.println( "     ---------------------------------------------------------------------\n");
		System.out.print("\t\t Ingrese la Cantidad de CD para agregar:");
		x = teclado.nextInt();
		int p;
		p = contador_ingresos;
		contador_ingresos = contador_ingresos + x;
		
		
		for (int i = 0; i < x; i++) {
			idCD = "CD000" + (p+1);
			if(i > 0){
				System.out.println( "     ---------------------------------------------------------------------");
			}
			System.out.printf("\t\t\t Ingrese titulo del Album: ");
			titulo = teclado1.nextLine();
			System.out.printf("\t\t\t Ingrese el Codigo del Genero Para el Album: ");
			idgenero = teclado2.nextLine();
			
			genero = existe_genero (idgenero);

			if (!genero.equals("0")) {
				System.out.printf("\t\t\t Ingrese el id del Cantante: ");
				idcantante = teclado1.nextLine();

				cantante = existe_cantante(idcantante);
				
				ingreso_canciones(idCD);

				if(!cantante.equals("0")){
					ing[p] = new Ingreso (idCD,titulo,genero,cantante);
				}
				p++;	
			}	
		}

		for (int i = 0; i < contador_ingresos; i++) {
			System.out.println( "     ---------------------------------------------------------------------");
			System.out.println( "\t IDCD  \t       Titulo  \t       Genero  \t       Cantante");
			System.out.println( "\t" + ing[i].idcd + "\t\t" + ing[i].titulo + "\t\t" + ing[i].genero + "\t\t " + ing[i].cantante +"\n");
			for(int j=0; j < contador_canciones; j++){
				if(j <= 0){
					System.out.println( "     ---------------------------------------------------------------------");
					System.out.println( "\t\t\t      Canciones ");
				}
				if(can[j].idcd.equals(ing[i].idcd)){
					System.out.println("\t\t        " + (j+1) + ". " + can[j].nombre);
					bandera = true;
				}else{
					if(bandera){
						j = contador_canciones;
						bandera = false;
					}
				}
			}
		}
		System.out.println( "     ---------------------------------------------------------------------\n");
		sleep(4000);
	}

	public static void modificar(String idcd){
		boolean bandera = false;
		boolean bandera1 = false;
		String titulo;
		String genero;
		String idgenero;
		String cantante;
		String idcantante;

		for(int i = 0; i < contador_ingresos; i++){ 

			if(ing[i].idcd.equals(idcd)){	

				System.out.printf("\t\t\t Ingrese titulo del Album: ");
				titulo = teclado1.nextLine();
				System.out.printf("\t\t\t Ingrese el Codigo del Genero Para el Album: ");
				idgenero = teclado2.nextLine();
				
				genero = existe_genero (idgenero);

				if (!genero.equals("0")) {
					System.out.printf("\t\t\t Ingrese el id del Cantante: ");
					idcantante = teclado1.nextLine();

					cantante = existe_cantante(idcantante);
					
					ingreso_canciones(idcd);

					if(!cantante.equals("0")){
						ing[i] = new Ingreso (idcd,titulo,genero,cantante);
					}
				}

				System.out.println( "     ---------------------------------------------------------------------");
				System.out.println( "\t IDCD  \t       Titulo  \t       Genero  \t       Cantante");
				System.out.println( "\t" + ing[i].idcd + "\t\t" + ing[i].titulo + "\t\t" + ing[i].genero + "\t\t " + ing[i].cantante +"\n");
				
				for(int j=0; j < contador_canciones; j++){
					if(j <= 0){
						System.out.println( "     ---------------------------------------------------------------------");
						System.out.println( "\t\t\t      Canciones ");
					}

					if(can[j].idcd.equals(idcd)){
							System.out.println("\t\t        " + (j+1) + ". " + can[j].nombre);
							bandera1 = true;
					}else{
						if(bandera){
							j = contador_canciones;
							bandera1 = false;
						}
					}
				}
				bandera = true;
			}
		}
		if(bandera){
			System.out.println( "     ---------------------------------------------------------------------\n");
			sleep(4000);
		}else{
			System.out.println("Lastimosamente no se encuentra en la B.D el idCD por lo tanto no puede modificarse");
			sleep(4000);
		}
	}

	public static void eliminar(String idcd){
		boolean bandera = false;
		boolean bandera1 = false;

		for(int i = 0; i < contador_ingresos; i++){ 
			if(ing[i].idcd.equals(idcd)){	
				
				System.out.println( "\t" + ing[i].idcd + "\t\t" + ing[i].titulo + "\t\t" + ing[i].genero + "\t\t " + ing[i].cantante +"\n");
				
				for(int j=0; j < contador_canciones; j++){
					if(j <= 0){
						System.out.println( "     ---------------------------------------------------------------------");
						System.out.println( "\t\t\t      Canciones ");
					}

					if(can[j].idcd.equals(idcd)){
							System.out.println("\t\t        " + (j+1) + ". " + can[j].nombre);
							bandera1 = true;
					}else{
						if(bandera1){
							j = contador_canciones;
							bandera1 = false;
						}
					}
				}
				bandera = true;
			}
		}
		if(bandera){
			System.out.println( "     ---------------------------------------------------------------------\n");
			sleep(4000);
		}else{
			System.out.println("Lastimosamente no se encuentra en la B.D el idCD");
			sleep(4000);
		}
	}

	public static void consultar(String idcd){
		boolean bandera = false;
		boolean bandera1 = false;

		for(int i = 0; i < contador_ingresos; i++){ 
			if(ing[i].idcd.equals(idcd)){	
				
				System.out.println( "     ---------------------------------------------------------------------");
				System.out.println( "\t IDCD  \t       Titulo  \t       Genero  \t       Cantante");
				System.out.println( "\t" + ing[i].idcd + "\t\t" + ing[i].titulo + "\t\t" + ing[i].genero + "\t\t " + ing[i].cantante +"\n");
				
				for(int j=0; j < contador_canciones; j++){
					if(j <= 0){
						System.out.println( "     ---------------------------------------------------------------------");
						System.out.println( "\t\t\t      Canciones ");
					}

					if(can[j].idcd.equals(idcd)){
							System.out.println("\t\t        " + (j+1) + ". " + can[j].nombre);
							bandera1 = true;
					}else{
						if(bandera1){
							j = contador_canciones;
							bandera1 = false;
						}
					}
				}
				bandera = true;
			}
		}
		if(bandera){
			System.out.println( "     ---------------------------------------------------------------------\n");
			sleep(4000);
		}else{
			System.out.println("Lastimosamente no se encuentra en la B.D el idCD favor comunicarse con el encargado para que lo pueda ingresar");
			sleep(4000);
		}
		
	}

	public static  String existe_genero (String idgenero) {
		boolean bandera = false;
		if(contador_genero <= 0) {
			System.out.println( "\n     ---------------------------------------------------------------------\n");
				System.out.printf("\t No Existe el ningun idgenero por lo que no podra agregara el CD favor intentelo de nuevo! \n\n");
				System.out.println( "     ---------------------------------------------------------------------\n");
				sleep(4000);
		}else {
			for(int i = 0; i<contador_genero; i++) {
				if(gen[i].existe_consulta(gen[i].idgenero,idgenero)) {	
					bandera = true;
					return gen[i].genero;	
				}					
			}
			if(!bandera) {
				System.out.println("Lastimosamente no se encuentra en la B.D el idGenero favor comunicarse con el encargado para que lo pueda ingresar");
			}
		}
		return  "0";
	}

	public static  String existe_cantante (String idcantante) {
		boolean bandera = false;
		if(contador_cantante <= 0) {
			System.out.println( "\n     ---------------------------------------------------------------------\n");
				System.out.printf("\t No Existe el ningun idcantante por lo que no podra agregara el CD favor intentelo de nuevo! \n\n");
				System.out.println( "     ---------------------------------------------------------------------\n");
				sleep(4000);
		}else {
			for(int i = 0; i<contador_genero; i++) {
				if(cant[i].existe_consulta(cant[i].idcantante,idcantante)) {	
					bandera = true;
					return cant[i].cantante;	
				}					
			}
			if(!bandera) {
				System.out.println("Lastimosamente no se encuentra en la B.D el idcantente favor comunicarse con el encargado para que lo pueda ingresar");
			}
		}
		return  "0";
	}

	public static void sleep(int time){
		try {
			Thread.sleep(time);
		} catch (Exception e) {}
	}
}


