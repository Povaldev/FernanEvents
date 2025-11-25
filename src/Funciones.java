import java.util.Scanner;

public class Funciones {
    public String nombreE1, descripcionE1, categoriaE1, fechaE1, horaE1,
    nombreE2, descripcionE2, categoriaE2, fechaE2, horaE2,
    nombreE3, descripcionE3, categoriaE3, fechaE3, horaE3;

    //Duda tipo de eventos

    public int aforoE1, numInscritosE1, personasInscritasE1, aforoE2, numInscritosE2, personasInscritasE2, aforoE3, numInscritosE3, personasInscritasE3;

    public boolean e1Creado, e2Creado, e3Creado;

    public static void muestraCategoria(){
        System.out.println("Introduce la categoría del evento");
        System.out.println("1. Arte");
        System.out.println("2. Tecnología");
        System.out.println("3. Cine");
        System.out.println("4. Música");
        System.out.println("5. Juegos");
        System.out.println("6. Comida");
        System.out.println("7. Moda");
    }

    public void creaEventos(){
        Scanner s = new Scanner(System.in);
        if (!e1Creado){
            System.out.print("Introduce el nombre del evento: ");
            nombreE1 = s.next();
            System.out.print("Escribe la descripción del evento: ");
            descripcionE1 = s.next();
            muestraCategoria();
            int opcion = s.nextInt();
            categoriaE1 = switch (opcion){
                case 1 -> "Arte";
                case 2 -> "Tecnología";
                case 3 -> "Cine";
                case 4 -> "Música";
                case 5 -> "Juegos";
                case 6 -> "Comida";
                case 7 -> "Moda";
                default -> "";
            };
            System.out.print("Introduzca la fecha del evento: ");
            fechaE1 = s.next();
            System.out.print("Introduce la hora del evento: ");
            horaE1 = s.next();
            System.out.print("Introduce el aforo máximo permitido del evento: ");
            aforoE1 = s.nextInt();
            e1Creado = true;


        } else if (!e2Creado) {
            System.out.print("Introduce el nombre del evento: ");
            nombreE2 = s.next();
            System.out.print("Escribe la descripción del evento: ");
            descripcionE2 = s.next();
            muestraCategoria();
            int opcion = s.nextInt();
            categoriaE2 = switch (opcion){
                case 1 -> "Arte";
                case 2 -> "Tecnología";
                case 3 -> "Cine";
                case 4 -> "Música";
                case 5 -> "Juegos";
                case 6 -> "Comida";
                case 7 -> "Moda";
                default -> "";
            };
            System.out.print("Introduzca la fecha del evento: ");
            fechaE2 = s.next();
            System.out.print("Introduce la hora del evento: ");
            horaE2 = s.next();
            System.out.print("Introduce el aforo máximo permitido del evento: ");
            aforoE2 = s.nextInt();
            e2Creado = true;


        } else if (!e3Creado) {
            System.out.print("Introduce el nombre del evento: ");
            nombreE3 = s.next();
            System.out.print("Escribe la descripción del evento: ");
            descripcionE3 = s.next();
            muestraCategoria();
            int opcion = s.nextInt();
            categoriaE3 = switch (opcion){
                case 1 -> "Arte";
                case 2 -> "Tecnología";
                case 3 -> "Cine";
                case 4 -> "Música";
                case 5 -> "Juegos";
                case 6 -> "Comida";
                case 7 -> "Moda";
                default -> "";
            };
            System.out.print("Introduzca la fecha del evento: ");
            fechaE3 = s.next();
            System.out.print("Introduce la hora del evento: ");
            horaE3 = s.next();
            System.out.print("Introduce el aforo máximo permitido del evento: ");
            aforoE3 = s.nextInt();
            e3Creado = true;
        } else {
            System.out.println("Se ha llegado al límite de eventos, no se pueden crear más");
        }
    }

    public void eliminaEventos(int peticionEventoBorrar){
        switch (peticionEventoBorrar){
            case 1 -> e1Creado = false;
            case 2 -> e2Creado = false;
            case 3 -> e3Creado = false;
            case 4 -> System.out.println("Saliendo...");
            default -> System.out.println("Debes de introducir las opciones que hay en pantalla");
        }
    }

    public void muestraEvento(int peticionMuestraEvento){

        switch (peticionMuestraEvento){
            case 1:
                System.out.println("***** " + nombreE1 + " *****");
                System.out.println("Descripción: " + descripcionE1);
                System.out.println("Categoría: " + categoriaE1);
                System.out.println("Fecha: " + fechaE1 + " Hora " + horaE1);
                System.out.println("Aforo máximo " + aforoE1);
                System.out.println("Numero de personas inscritas hasta el momento " + personasInscritasE1);
                vistaDetalladaEvento(1);
                System.out.print("******");
                for (int i = 0; i < nombreE1.length(); i++) System.out.print("*");
                System.out.println("******");
                break;
            case 2:
                System.out.println("***** " + nombreE2 + " *****");
                System.out.println("Descripción: " + descripcionE2);
                System.out.println("Categoría: " + categoriaE2);
                System.out.println("Fecha: " + fechaE2 + " Hora " + horaE2);
                System.out.println("Aforo máximo " + aforoE2);
                System.out.println("Numero de personas inscritas hasta el momento " + personasInscritasE2);
                vistaDetalladaEvento(2);
                System.out.print("******");
                for (int i = 0; i < nombreE2.length(); i++) System.out.print("*");
                System.out.println("******");
                break;
            case 3:
                System.out.println("***** " + nombreE3 + " *****");
                System.out.println("Descripción: " + descripcionE3);
                System.out.println("Categoría: " + categoriaE3);
                System.out.println("Fecha: " + fechaE3 + " Hora " + horaE3);
                System.out.println("Aforo máximo " + aforoE3);
                System.out.println("Numero de personas inscritas hasta el momento " + personasInscritasE3);
                vistaDetalladaEvento(3);
                System.out.print("******");
                for (int i = 0; i < nombreE3.length(); i++) System.out.print("*");
                System.out.println("******");
                break;
            case 4:
                System.out.println("Saliendo...\n");
                break;
            default: System.out.println("Debes de introducir las opciones que hay en pantalla");
            break;
        }
    }

    public void vistaDetalladaEvento(int peticionEvento){
        int porcentajeOcupacion;
        switch (peticionEvento){
            case 1:
                porcentajeOcupacion = (numInscritosE1*100)/aforoE1;
                System.out.println("════════════════════");
                System.out.print("║");
                for (int i = 0; i < porcentajeOcupacion/5; i++) {
                    System.out.print("█");
                }
                for (int i = 0; i < (100-porcentajeOcupacion)/5; i++) {
                    System.out.print(" ");
                }
                System.out.print("║");
                System.out.println(porcentajeOcupacion + "% de Ocupación");
                System.out.println("════════════════════");
                System.out.println("Tipo de entradas: " /* --------------------------------------------------------------------------    */);
                break;
            case 2:
                porcentajeOcupacion = (numInscritosE2*100)/aforoE2;
                System.out.println("════════════════════");
                System.out.print("║");
                for (int i = 0; i < porcentajeOcupacion/5; i++) {
                    System.out.print("█");
                }
                for (int i = 0; i < (100-porcentajeOcupacion)/5; i++) {
                    System.out.print(" ");
                }
                System.out.print("║");
                System.out.println(porcentajeOcupacion + "% de Ocupación");
                System.out.println("════════════════════");
                System.out.println("Tipo de entradas: " /* --------------------------------------------------------------------------    */);
                break;
            case 3:
                porcentajeOcupacion = (numInscritosE3*100)/aforoE3;
                System.out.println("════════════════════");
                System.out.print("║");
                for (int i = 0; i < porcentajeOcupacion/5; i++) {
                    System.out.print("█");
                }
                for (int i = 0; i < (100-porcentajeOcupacion)/5; i++) {
                    System.out.print(" ");
                }
                System.out.print("║");
                System.out.println(porcentajeOcupacion + "% de Ocupación");
                System.out.println("════════════════════");
                System.out.println("Tipo de entradas: " /* --------------------------------------------------------------------------    */);
                break;
            default:
                System.out.println("");
                break;
        }

    }

    public void configuracionUsuario(){
        Scanner s = new Scanner(System.in);
        System.out.println("**** CONFIGURACIÓN ****");
        System.out.println("1. Cambio de nombre de usuario");
        System.out.println("2. Cambio de contraseña");
        System.out.println("3. Salir");
        int opcion = s.nextInt();
        switch (opcion) {
            case 1:
                // Cambio de nombre de usuario
                break;
            case 2:
                // Cambio de contraseña
                break;
            case 3:
                System.out.println("Saliendo...\n");
                break;
            default:
                System.out.println("Introduce una opción correctamente");
                break;
        }
    }
}
