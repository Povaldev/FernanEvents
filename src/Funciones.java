import java.util.Scanner;

public class Funciones {
    String nombreE1, descripcionE1, categoriaE1, fechaE1, horaE1,
    nombreE2, descripcionE2, categoriaE2, fechaE2, horaE2,
    nombreE3, descripcionE3, categoriaE3, fechaE3, horaE3;

    //Duda tipo de eventos

    int aforoE1, numInscritosE1, aforoE2, numInscritosE2, aforoE3, numInscritosE3;

    boolean e1Creado, e2Creado, e3Creado;


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

    public static void creaEventos(String nombreE1, String descripcionE1, String categoriaE1, String fechaE1, String horaE1,
                                   String nombreE2, String descripcionE2, String categoriaE2, String fechaE2, String horaE2,
                                   String nombreE3, String descripcionE3, String categoriaE3, String fechaE3, String horaE3,
                                   int aforoE1, int aforoE2, int aforoE3,
                                   boolean e1Creado, boolean e2Creado, boolean e3Creado){
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

    public static void eliminaEventos(int peticionEventoBorrar, boolean e1Creado, boolean e2Creado, boolean e3Creado){
        switch (peticionEventoBorrar){
            case 1 -> e1Creado = false;
            case 2 -> e2Creado = false;
            case 3 -> e3Creado = false;
            case 4 -> System.out.println("Saliendo...");
            default -> System.out.println("Debes de introducir las opciones que hay en pantalla");
        }
    }

    public static void muestraEventos(int peticionMuestraEvento, String nombreE1, String descripcionE1, String categoriaE1, String fechaE1, String horaE1,
                                      String nombreE2, String descripcionE2, String categoriaE2, String fechaE2, String horaE2,
                                      String nombreE3, String descripcionE3, String categoriaE3, String fechaE3, String horaE3,
                                      int aforoE1, int aforoE2, int aforoE3,
                                      boolean e1Creado, boolean e2Creado, boolean e3Creado){

        switch (peticionMuestraEvento){
            case 1: e1Creado = false;

            case 4:
                System.out.println("Saliendo...");
                break;
            default: System.out.println("Debes de introducir las opciones que hay en pantalla");
            break;
        }

    }

}
