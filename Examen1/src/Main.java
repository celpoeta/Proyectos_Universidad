import java.util.Scanner;

public class Main {
	
	
long carnet = 0;
String nombre = "";
double notafinal = 0;
static int opcion;
static int x;
static int contador = 0;
static int size1 = 25;
static Scanner teclado = new Scanner (System.in);
static Scanner teclado1 = new Scanner (System.in);
static Estudiante[] a = new Estudiante [size1];
public static double puntos_res = 0; //valor de puntos por cada pregunta de las secciones
public static char[] respuesta_su = {'3', '3', '1', '1','1'}; //respuestas correctas de seleccion unica
public static char [] res = {'V','V','F','F','V'}; //respuestas correctas de verdadero y falso 

public static void main (String [] args) throws InterruptedException{
	
	boolean salir = false;
	
	while (!salir) {
		header_c();
		menu();
		System.out.print("\t Por favor seleccione la opcion a realizar: ");
		opcion = teclado.nextInt();

switch (opcion) {
case 1:
	ingresarEstudiante();	
	break;
case 2:
	rubrica();
	break;
	
case 3:
	test(); 
	break;
	
case 4:
	consultar();
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
		System.out.println( "  Ingresar Estudiantes #1.....(1)        | |  | |  __ '| | | |  ____|  ||  |" );
		System.out.println( "  Ingresar Rubrica #2.........(2)        | |  | | |__) |  || | |__  | '  / |" );
		System.out.println( "  Test de Evaluacion #3.......(3)        | |  | |  ___/| . ` |  __| | |'/| | " );
		System.out.println( "  Consultar Test #4...........(4)        | |__| | |    | |'  | |    | |  | | " );
		System.out.println( "  Salir / Exit................(5)        |_____/|_|    |_| '_|_|    |_|  |_| \n" );
}
public static void header_c(){
	System.out.println( "    _______________________________________________________________________" );
	System.out.println( "    |                                   _____________________             |" );
	System.out.println( "    |                                   |    Gan Carlos     |_____________|" );
	System.out.println( "    |        XXXXXXXXXXXXXXXXXX         |Cta: 0501199412297 |            ||" );
	System.out.println( "    |        Test de Estudiante         |    Estructura     |            ||" );
	System.out.println( "    |        XXXXXXXXXXXXXXXXXX         |        De         |            ||" );
	System.out.println( "    |  ______________XXX________________|       Datos       |            ||" );
	System.out.println( "    |  |  _    _     XXX   _    _    _  |    __  ____ _     |   ______   ||" );
	System.out.println( "    |  | | |  | |  _____  | |  | |  | | |       ______      |   |  _ |   ||" );
	System.out.println( "    |  | |_|  |_|  | | |  |_|  |_|  |_| |       |  | |      |   |  | |   ||" );
	System.out.println( "    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^" );
}

public static void ingresarEstudiante () {
	String cuenta;
	String estudent;
	System.out.println( "     ---------------------------------------------------------------------\n");
	System.out.print("\t\t Ingrese la Cantidad de Estudiantes a agregar:");
	x = teclado.nextInt();
	int p;
	p = contador;
	contador = contador + x;
	
	
	for (int i = 0; i < x; i++) {
		System.out.printf("\t\t\t Ingrese Numero de Carnet : ");
		cuenta = teclado.next();
		System.out.printf("\t\t\t Ingrese el nombre del Estudiante: ");
		estudent = teclado1.nextLine();
		
		a[p] = new Estudiante(cuenta,estudent,0);
		p++;
	}	
}

public static void rubrica () throws InterruptedException {
	System.out.print("\n\t\t 1. Seccion Verdadero y Falso " + porcentaje(4) + "% \n");
	System.out.print("\t A) ¿Los sistemas de ficheros se montan automáticamente cada vez que "
	+ "se inicia el sistema operativo ? \n \t R = ");
	System.out.println(res[0]);

 	System.out.print("\t B) ¿Se puede mover un fichero mediante la terminal ?\n \t R = ");
	 System.out.println(res[1]);

 	System.out.print("\t C) La administración de los usuarios del sistema ha de realizarse "
    + "por línea de comandos, no siendo posible realizarla con la interfaz gráfica\n \t R = ");
	System.out.println(res[2]);

	System.out.print("\t D) La principal diferencia entre Linux y Unix radica en que Linux es "
     + "libre y multiplataforma mientras que Unix suele ser comercial y muy orientado al "
    + "hardware.\n \t R = ");
	System.out.println(res[3]);

	System.out.print("\t E) El comando tar permite realizar copias exactas (bit a bit) de discos duros, "
	+ "particiones o ficheros.\n \t R = ");
	System.out.println(res[4]);

	System.out.print("\n\t\t 2. Seccion Selecion Unica " + porcentaje(6) + "% \n");
    System.out.print("\n\t\tInstruciones: Escriba el numero , que antecede la mejor repuesta para su criterio\n\n");
    //Preguna para seleccion Multiple
    
    //#1
    System.out.print("\t A) ¿Que sistema operativo es derivado de Ubuntu \n");
    System.out.print("\t\t 1.Fedora\n" +
                    "\t\t 2.Gentoo\n" +
                    "\t\t 3.Debian\n" +
                    "\t\t 4.Novell \n \t R = ");
	System.out.println(respuesta_su[0]);
	//#2
    System.out.print("\t B) El directorio de trabajo del administrador del equipo es: \n");
    System.out.print("\t\t 1./dev\n" +
                    "\t\t 2./proc\n" +
                    "\t\t 3./home/administrator\n" +
                    "\t\t 4./root \n \t R = ");
	System.out.println(respuesta_su[1]);
	//#3
    System.out.print("\t C) Queremos cambiar el nombre del directorio “contabilidad” "
            + "por el nombre “hipoteca”, para ello ejecutaremos el comando \n");
    System.out.print("\t\t 1.mv contabilidad hipoteca\n" +
                    "\t\t 2.rm contabilidad hipoteca\n" +
                    "\t\t 3.cp contabilidad hipoteca\n" +
                    "\t\t 4.mv hipoteca contabilidad \n \t R = ");
	System.out.println(respuesta_su[2]);
	 //#4
	System.out.print("\t D) Si queremos obtener más información sobre el uso del comando “usermod” tendremos que ejecutar la orden: \n");
	System.out.print("\t\t 1.man usermod\n" +
					"\t\t 2.usermod ?\n" +
					"\t\t 3.usermod -ayudan \n" +
					"\t\t 4.help usermod \n \t R = ");
	System.out.println(respuesta_su[3]);
	//#5
    System.out.print("\t E) Los paquetes de aplicaciones que poseen la extensión .RPM son característicos de la distribución \n");
    System.out.print("\t\t 1.Fedora \n" +
                    "\t\t 2.Ubuntu \n" +
                    "\t\t 3.Windows \n" +
                    "\t\t 4.Debian \n \t R = ");
	System.out.println(respuesta_su[4]);
	Thread.sleep(3000);
}

public static void test () {
	String cuenta;
	boolean bandera = false;
	if(contador <= 0) {
		System.out.println( "     ---------------------------------------------------------------------\n");
		System.out.println("\t\t\t No hay registros de estudiantes para realizar el test");
		System.out.println( "     ---------------------------------------------------------------------\n");
	}else {
		System.out.println( "     ---------------------------------------------------------------------\n");
		System.out.print("\t\t Ingrese su numero de cuenta para iniciar el Test: ");
		cuenta = teclado.next();
		for(int i = 0; i<contador; i++) {
			if(a[i].ExisteEtudiante(a[i].carnet,cuenta)) {				
				testPregunta(i);
				i = contador;
				bandera= true;
			}					
		}
		if(!bandera) {
			System.out.println( "     ---------------------------------------------------------------------\n");
			System.out.println("\t Lastimosamente no se encuentra en la B.D para realizar el test favor comunicarse con el encargado");
			System.out.println( "     ---------------------------------------------------------------------\n");
		}
	}

}

public static void testPregunta(int num) {
	int max = 5; //variable para indicar la cantidad de preguntas
	char [] test = new char[max];
	char [] test1 = new char[max];

	double total_test = 0;
    System.out.println("Test de Linux \n");
	System.out.print("\n\t\t 1. Seccion Verdadero y Falso " + porcentaje(4) + "% \n");
    System.out.print("\n\t\t Instruciones: Segun su decision coloque V si es Verdadero o F si es falso.\n\n");
	//Preguntas verdadero y falso
	//#1
	System.out.print("\t A) ¿Los sistemas de ficheros se montan automáticamente cada vez que "
	+ "se inicia el sistema operativo ? \n \t R = ");
	test[0] = Character.toUpperCase(teclado.next().charAt(0));
	//#2
    System.out.print("\t B) ¿Se puede mover un fichero mediante la terminal ?\n \t R = ");
	test[1] = Character.toUpperCase(teclado1.next().charAt(0));
	//#3
	System.out.print("\t C) La administración de los usuarios del sistema ha de realizarse "
            + "por línea de comandos, no siendo posible realizarla con la interfaz gráfica\n \t R = ");
	test[2] = Character.toUpperCase(teclado.next().charAt(0));
	//#4
	 System.out.print("\t D) La principal diferencia entre Linux y Unix radica en que Linux es "
            + "libre y multiplataforma mientras que Unix suele ser comercial y muy orientado al "
            + "hardware.\n \t R = ");
	test[3] = Character.toUpperCase(teclado1.next().charAt(0));
	//#5
	System.out.print("\t E) El comando tar permite realizar copias exactas (bit a bit) de discos duros, "
	+ "particiones o ficheros.\n \t R = ");
	test[4] = Character.toUpperCase(teclado.next().charAt(0));

	test tests = new test();
		// Evaluar V y F
		for(int i = 0; i < max; i++) {
			if(tests.ValidarRespuesta(res[i], test[i])) {
				total_test = total_test + puntos_res;
			}
		}


	System.out.print("\n\t\t 2. Seccion Selecion Multiple " + porcentaje(6) + "% \n");
    System.out.print("\n\t\tInstruciones: Escriba el numero , que antecede la mejor repuesta para su criterio\n\n");
    //Preguna para seleccion Multiple
    
    //#1
    System.out.print("\t A) ¿Que sistema operativo es derivado de Ubuntu \n");
    System.out.print("\t\t 1.Fedora\n" +
                    "\t\t 2.Gentoo\n" +
                    "\t\t 3.Debian\n" +
                    "\t\t 4.Novell \n \t R = ");
	test1[0] = Character.toUpperCase(teclado.next().charAt(0));
	//#2
    System.out.print("\t B) El directorio de trabajo del administrador del equipo es: \n");
    System.out.print("\t\t 1./dev\n" +
                    "\t\t 2./proc\n" +
                    "\t\t 3./home/administrator\n" +
                    "\t\t 4./root \n \t R = ");
	test1[1] = Character.toUpperCase(teclado1.next().charAt(0));
	//#3
    System.out.print("\t C) Queremos cambiar el nombre del directorio “contabilidad” "
            + "por el nombre “hipoteca”, para ello ejecutaremos el comando \n");
    System.out.print("\t\t 1.mv contabilidad hipoteca\n" +
                    "\t\t 2.rm contabilidad hipoteca\n" +
                    "\t\t 3.cp contabilidad hipoteca\n" +
                    "\t\t 4.mv hipoteca contabilidad \n \t R = ");
	test1[2] = Character.toUpperCase(teclado.next().charAt(0));
	 //#4
	System.out.print("\t D) Si queremos obtener más información sobre el uso del comando “usermod” tendremos que ejecutar la orden: \n");
	System.out.print("\t\t 1.man usermod\n" +
					"\t\t 2.usermod ?\n" +
					"\t\t 3.usermod -ayudan \n" +
					"\t\t 4.help usermod \n \t R = ");
	test1[3] = Character.toUpperCase(teclado1.next().charAt(0));
	//#5
    System.out.print("\t E) Los paquetes de aplicaciones que poseen la extensión .RPM son característicos de la distribución \n");
    System.out.print("\t\t 1.Fedora \n" +
                    "\t\t 2.Ubuntu \n" +
                    "\t\t 3.Windows \n" +
                    "\t\t 4.Debian \n \t R = ");
	test1[4] = Character.toUpperCase(teclado.next().charAt(0));

	// Evaluar Selecion Multiple
	for(int i = 0; i < max; i++) {
		if(tests.ValidarRespuesta(respuesta_su[i], test1[i])) {
			total_test = total_test + puntos_res;
		}
	}

	// Nota agregada al estudiante que realizo el test
	a[num].SetNota(total_test);

}

public static int porcentaje(int valor)
{
    int var = (valor*100)/10;
    // Nos inicializa el valor de cada respuesta
    puntos_res = var/5;
    // Retorna el porsentaje de valor de cada seccion
    return var;
}

public static void consultar () {
	String cuenta;
	boolean bandera = false;
	if(contador <= 0) {
		System.out.println("No hay registros de estudiantes para realizar consultar notas");
	}else {
		System.out.println("Ingrese el numero de cuenta del estudiante : ");
		cuenta = teclado.next();
		for(int i = 0; i<contador; i++) {
			if(a[i].ExisteEtudiante(a[i].carnet,cuenta)) {	
				Imprimir(a[i].Nombre,a[i].carnet,a[i].NotaFinal);			
				i = contador;
				bandera= true;
			}					
		}
		if(!bandera) {
			System.out.println("Lastimosamente no se encuentra en la B.D para realizar el test favor comunicarse con el encargado");
		}
	}
}

public static void Imprimir(String name,String cuenta,double Nota)
{
    System.out.print("\n\t\t\t Universidad Nacional Pedagogica de Francisco Morazan \n");
    System.out.print("\t\t\t\t        Carrera : Computacion \n");
    System.out.print("\t\t\t\t    Test : Intrduccion a Linux \n\n");
    System.out.print("\t\t\t     Nombre : " + name + " | Carnet : " + cuenta + " \n");
    System.out.print("\n\t\t\t\t\t NOTA FINAL : " + Nota +"\n");
}

}


