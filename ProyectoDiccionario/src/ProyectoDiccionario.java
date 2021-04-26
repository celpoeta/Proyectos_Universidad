import java.util.Scanner;
import java.util.*;


public class ProyectoDiccionario {

	static Scanner teclado = new Scanner(System.in); // SE USA VARIOS SCANNER ,POR SALTO DE LINEA
	static Scanner teclado1 = new Scanner(System.in);
	static Scanner teclado2 = new Scanner(System.in);
	static int size1 = 30; // TAMANO DEL ARRAY
	static Categoria[] cate = new Categoria[size1];
	static Termino[] term = new Termino[size1];
	static int contador_categoria = 0;
	static int contador_termino = 0;
	static int opcion = 0;

	public static void main(String[] args) throws Exception {
		boolean salir = false;
		String x; // SE MANDARA LLAMAR DENTRO DE WHILE
		while (!salir) {
			header_c();// HEADER DE NUESTRO PROGRAMA
			menu(); // EL MENU DEL PROGRAMA
			System.out.print("\t Por favor seleccione la opcion a realizar: ");
			opcion = teclado.nextInt();// LECUTURA DEL TECLADO DE SELECION DEL MENU
			switch (opcion) {
			case 1:
				IngresarCategoria();
				break;
			case 2:
				if (contador_categoria <= 0) { // SI NO ENCUENTRA NADA EN CATETGORIA TIRA MENSAJE Y NO PERMITE INGRESAR
												// TERMINO
					System.out
							.println("\n     ---------------------------------------------------------------------\n");
					System.out.printf(
							"\t No Existe ningun idcategoria por lo que no podra agregara el termino favor intentelo de nuevo! \n\n");
					System.out.println("     ---------------------------------------------------------------------\n");
					sleep(4000); // REALIZA DELAY
				} else {
					IngresarTermino();
				}

				break;
			case 3:
				System.out.print("\t Ingrese el iD del Termino a consultar: ");
				x = teclado1.nextLine();
				consultar_termino(x);
				break;

			case 4:
				System.out.print("\t Ingrese el iD del Termino a consultar: ");
				x = teclado1.nextLine();
				modificar_termino(x);
				break;

			case 5:

				break;

			case 6:
				listado();
				break;

			case 7:
				System.out.print("\t Ingrese la palabra o letra con la quedesea buscar su termino: ");
				x = teclado1.nextLine();
				buscardor(x); // INICIA X
				break;

			case 8:
				salir = true;
				break;
			default:
				System.out.println("Son numeros entre 1 - 7:");
			}
		}
	}

	public static void menu() {
		System.out.println("     ---------------------------------------------------------------------\n");
		System.out.println("             <<<<<<<<<<        MENU PRINCIPAL            >>>>>>>>>>");
		System.out.println("\n     ---------------------------------------------------------------------\n");
		System.out.println("                                          _    _ _____  _   _ ______ __  __ ");
		System.out.println("  Ingresar Categoria..........(1)        | |  | |  __ '| | | |  ____|  ||  |");
		System.out.println("  Ingresar Termino............(2)        | |  | | |__) |  || | |__  | '  / |");
		System.out.println("  Consulta de Termino.........(3)        | |  | |  ___/| . ` |  __| | |'/| | ");
		System.out.println("  Modificar Termino...........(4)        | |  | | |    | |'  | |    | |  | | ");
		System.out.println("  Eliminar Termino............(5)        | |__| | |    | |'  | |    | |  | | ");
		System.out.println("  Listado de terminos.........(6)        |_____/|_|    |_| '_|_|    |_|  |_| ");
		System.out.println("  Busqueda de Termino.........(7)");
		System.out.println("  Salir / Exit................(8)\n");
	}

	public static void header_c() {
		System.out.println("    _______________________________________________________________________");
		System.out.println("    |                                   _____________________             |");
		System.out.println("    |                                   | GOT & ANA CHAVEZ  |_____________|");
		System.out.println("    |        XXXXXXXXXXXXXXXXXX         |Cta: 0501199412297 |            ||");
		System.out.println("    |        Proyecto Dicionario        |    Estructura     |            ||");
		System.out.println("    |        XXXXXXXXXXXXXXXXXX         |        De         |            ||");
		System.out.println("    |  ______________XXX________________|       Datos       |            ||");
		System.out.println("    |  |  _    _     XXX   _    _    _  |    __  ____ _     |   ______   ||");
		System.out.println("    |  | | |  | |  _____  | |  | |  | | |       ______      |   |  _ |   ||");
		System.out.println("    |  | |_|  |_|  | | |  |_|  |_|  |_| |       |  | |      |   |  | |   ||");
		System.out.println("    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}

	public static void IngresarCategoria() {
		int x;// VARIABLE QUE LEE TECLADO
		String idCategoria; // Autoincrementable
		String Categoria;

		System.out.println("     ---------------------------------------------------------------------");
		System.out.print("\t\t Ingrese la Cantidad de Categoria que desea agregar:");
		x = teclado.nextInt();

		int p; // Variable para capturar el contador antes de hacer el siguiente ingreso cuando
				// ya hay data existente
		p = contador_categoria;
		contador_categoria = contador_categoria + x;

		for (int i = 0; i < x; i++) { // FOR PARA INGRESAR CATEGORIA DEL BUCLE DE ARRAY OBJETO

			idCategoria = "CATE000" + (p + 1); // ASIGNACION DE ID CATEGORIA
			System.out.printf("\t\t\t Ingrese el Nombre de la Categoria: ");
			Categoria = teclado1.nextLine();

			if (Categoria.length() < 2) { // DEBE SER MAYOR A 2 CARACTERES PARA ENTRAR AL IF Y ASI INGRESA CATEGORIA
				System.out.println(
						"\t\t Favor Ingrese el nombre de la categoria ya que no puede ir vacia o contener solo menos de dos caracteres");
				i--; // DECREMENTA CONTEO DE VARIABLE PARA QUE NO SUME AL ARREGLO
			} else {
				cate[p] = new Categoria(idCategoria, Categoria); // COMPARA CON LA CLASE CATEGORIA P
				p++;
			}

		}

		System.out.println("     ---------------------------------------------------------------------");
		System.out.println("\t\t\t IdCategoria \t  Categoria");

		for (int i = 0; i < x; i++) { // FOR PARA IMPRIMIR LA CATEGORIAS INGREASADA AL FINMAL
			if (p <= 1) {

				p = x - p;
				System.out.println("\t\t\t " + cate[p].idCategoria + " \t  " + cate[p].Categoria);

			} else {

				if (p == contador_categoria) {
					p = p - x;
				}

				System.out.println("\t\t\t " + cate[p].idCategoria + " \t  " + cate[p].Categoria);
			}
			p++;
		}

		System.out.println("     ---------------------------------------------------------------------");
		sleep(2000);
	}

	public static void IngresarTermino() {
		int x;
		String idTermino;
		String Termino;
		String Significado;
		String idCategoria;
		String Categoria;
		boolean bandera = false;

		System.out.println("     ---------------------------------------------------------------------\n");
		System.out.print("\t\t Ingrese la Cantidad de Terminos para agregar:");
		x = teclado.nextInt();

		int p; // Variable para capturar el contador antes de hacer el siguiente ingreso cuando
				// ya hay data existente
		p = contador_termino;
		contador_termino = contador_termino + x;

		for (int i = 0; i < x; i++) {
			idTermino = "TR000" + (p + 1);
			if (i > 0) {
				System.out.println("     ---------------------------------------------------------------------");
			}

			System.out.printf("\t\t\t Ingrese el Nombre del Termino [" + (i + 1) + "] : ");
			Termino = teclado1.nextLine();

			System.out.printf("\t\t\t Ingrese el Codigo de la Categoria: ");
			idCategoria = teclado2.nextLine();

			Categoria = existe_categoria(idCategoria);

			if (!Categoria.equals("0")) {
				System.out.printf("\t\t\t Ingrese el significado del termino: ");
				Significado = teclado1.nextLine();
				term[p] = new Termino(idTermino, Termino.toUpperCase(), Significado, Categoria);
				p++;
				bandera = true;
			} else {
				i--;
			}
		}

		if (bandera) {

			p = p - x;
			for (int i = 0; i < x; i++) {
				System.out.println("     ---------------------------------------------------------------------");
				System.out.println("\t IDTermino  \t       Termino  \t       Categoria");
				System.out
						.println("\t " + term[p].idTermino + "\t\t\t" + term[p].Termino + "\t\t\t" + term[p].Categoria);
				System.out.println("     ---------------------------------------------------------------------");
				System.out.println("\t\t\t\t Significado");
				System.out.println("\t" + term[p].Significado);
				p++;
			}
			System.out.println("     ---------------------------------------------------------------------\n");
			sleep(4000);
		}

	}

	// REALIZA CONSULTA EN TIEMPO REAL SI EXISTE CATEGORIA
	public static String existe_categoria(String idcategoria) {
		boolean bandera = false;

		for (int i = 0; i < contador_categoria; i++) {
			if (cate[i].existe_consulta(cate[i].idCategoria, idcategoria)) {
				bandera = true;
				return cate[i].Categoria;
			}
		}

		if (!bandera) {
			System.out.println(
					"Lastimosamente no se encuentra en la B.D el idcategoria favor comunicarse con el encargado para que lo pueda ingresar");
		}
		return "0";
	}

	public static void consultar_termino(String idTermino) {
		boolean bandera = false; // MOSTRAR RESULTADO

		for (int i = 0; i < contador_termino; i++) {
			if (term[i].idTermino.equals(idTermino)) { // COMPARA SI EXISTE DICHON TERMINO

				System.out.println("     ---------------------------------------------------------------------");
				System.out.println("\t IDTermino  \t       Termino  \t       Categoria");
				System.out
						.println("\t " + term[i].idTermino + "\t\t\t" + term[i].Termino + "\t\t\t" + term[i].Categoria);
				System.out.println("     ---------------------------------------------------------------------");
				System.out.println("\t\t\t\t Significado");
				System.out.println("\t" + term[i].Significado);
				bandera = true; // SI CUMPLE SE CIERRA
			}
		}

		if (bandera) {
			System.out.println("     ---------------------------------------------------------------------\n");
			sleep(4000);
		} else {
			System.out.println(
					"Lastimosamente no se encuentra en la B.D del Termino favor comunicarse con el encargado para que lo pueda ingresar");
			sleep(4000);
		}
	}

	public static void modificar_termino(String idTermino) {
		String Termino;
		String Significado;
		String idCategoria;
		String Categoria;
		boolean bandera = false;

		for (int i = 0; i < contador_termino; i++) { // RECORRE TODOS NUESTRO CONTADOR TERMINO

			if (term[i].existe_consulta(term[i].idTermino, idTermino)) { // HACE UN BUCLE BUSCANDO EN EL ARRAY

				System.out.printf("\t\t\t Ingrese titulo del Termino: ");
				Termino = teclado1.nextLine();
				System.out.printf("\t\t\t Ingrese el Codigo de la Categoria: ");
				idCategoria = teclado2.nextLine();

				Categoria = existe_categoria(idCategoria);

				if (!Categoria.equals("0")) {
					System.out.printf("\t\t\t Ingrese el significado del termino: ");
					Significado = teclado1.nextLine();

					term[i] = new Termino(idTermino, Termino, Significado, Categoria);
					bandera = true;
				} else {
					i--;
				}

				if (bandera) {
					System.out.println("     ---------------------------------------------------------------------");
					System.out.println("\t IDTermino  \t       Termino  \t       Categoria");
					System.out.println(
							"\t " + term[i].idTermino + "\t\t\t" + term[i].Termino + "\t\t\t" + term[i].Categoria);
					System.out.println("     ---------------------------------------------------------------------");
					System.out.println("\t\t\t\t Significado");
					System.out.println("\t" + term[i].Significado);
					System.out.println("     ---------------------------------------------------------------------\n");
					sleep(4000);
				}
			}
		}

	}

	public static void buscardor(String buscar) {

		for (int i = 0; i < contador_termino; i++) {

			if (term[i].Termino.indexOf(buscar.toUpperCase()) == 0) {
				System.out.println("     ---------------------------------------------------------------------");
				System.out.println("\t IDTermino  \t       Termino  \t       Categoria");
				System.out
						.println("\t " + term[i].idTermino + "\t\t\t" + term[i].Termino + "\t\t\t" + term[i].Categoria);
				System.out.println("     ");
				System.out.println("\t\t\t\t Significado");
				System.out.println("\t" + term[i].Significado);
			}
		}
	}

	public static void listado() {
		for (int j = 0; j < contador_termino; j++) {
            for (int i = 0; i < contador_termino - j; i++) {
                if (term[i].Categoria.compareTo(term[i + 1].Categoria) > 0) {
                    String aux;
                    aux = term[i].Categoria;
                    term[i].Categoria = term[i + 1].Categoria;
                    term[i + 1].Categoria = aux;
                }
            }
        }
		for (int i = 0; i < contador_termino; i++) {
			System.out.println("     ---------------------------------------------------------------------");
			System.out.println("\t IDTermino  \t       Termino  \t       Categoria");
			System.out.println("\t " + term[i].idTermino + "\t\t\t" + term[i].Termino + "\t\t\t" + term[i].Categoria);
			System.out.println("     ");
			System.out.println("\t\t\t\t Significado");
			System.out.println("\t" + term[i].Significado);
		}
	}

	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
		}
	}

}
