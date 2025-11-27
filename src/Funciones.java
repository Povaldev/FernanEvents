import java.util.Scanner;

public class Funciones {
    public static String nombreE1, descripcionE1, categoriaE1, fechaE1, horaE1,
            nombreE2, descripcionE2, categoriaE2, fechaE2, horaE2,
            nombreE3, descripcionE3, categoriaE3, fechaE3, horaE3;

    public static int aforoE1, numInscritosE1, personasInscritasE1, aforoE2, numInscritosE2, personasInscritasE2, aforoE3, numInscritosE3, personasInscritasE3;

    public static int precioGeneralE1, precioPremiumE1, precioVIPE1, precioGeneralE2, precioPremiumE2, precioVIPE2, precioGeneralE3, precioPremiumE3, precioVIPE3;

    public static boolean e1Creado = false, entradaGeneralE1 = false, entradaPremiumE1 = false, entradaVIPE1 = false, e2Creado = false, entradaGeneralE2 = false, entradaPremiumE2 = false, entradaVIPE2 = false, e3Creado = false, entradaGeneralE3 = false, entradaPremiumE3 = false, entradaVIPE3 = false;

    public static boolean as1InscritoE1 = false, as1InscritoE2 = false, as1InscritoE3 = false, as2InscritoE1 = false, as2InscritoE2 = false, as2InscritoE3 = false;

    public static String amigos1="", amigos2="";

    public static void muestraCategoria() {
        System.out.println("Introduce la categoría del evento");
        System.out.println("1. Arte");
        System.out.println("2. Tecnología");
        System.out.println("3. Cine");
        System.out.println("4. Música");
        System.out.println("5. Juegos");
        System.out.println("6. Comida");
        System.out.println("7. Moda");
    }

    public static void tipoEntradas(int eventoCorrespondiente){
        Scanner s = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Selecciona los tipos de entradas que podrá tener este evento (Debes de seleccionar al menos 1)");
            System.out.println("1. General");
            System.out.println("2. General y Premium");
            System.out.println("3. General, Premium y VIP");
            opcion = s.nextInt();
            if ((opcion > 3) || (opcion < 1)) System.out.println("Debes introducir algunas de las opciones correspondientes");
        } while ((opcion > 3) || (opcion < 1));

        System.out.println("Introduce los precios de cada entrada: ");
        switch (eventoCorrespondiente){
            case 1:
                switch (opcion){
                    case 1:
                        entradaGeneralE1 = true;
                        System.out.println("Precio General:");
                        precioGeneralE1 = s.nextInt();
                        break;
                    case 2:
                        entradaGeneralE1 = true;
                        entradaPremiumE1 = true;
                        System.out.println("Precio General:");
                        precioGeneralE1 = s.nextInt();
                        System.out.println("Precio Premium:");
                        precioPremiumE1 = s.nextInt();
                        break;
                    case 3:
                        entradaGeneralE1 = true;
                        entradaPremiumE1 = true;
                        entradaVIPE1 = true;
                        System.out.println("Precio General:");
                        precioGeneralE1 = s.nextInt();
                        System.out.println("Precio Premium:");
                        precioPremiumE1 = s.nextInt();
                        System.out.println("Precio VIP:");
                        precioVIPE1 = s.nextInt();
                }
                break;
            case 2:
                switch (opcion){
                    case 1:
                        entradaGeneralE2 = true;
                        System.out.println("Precio General:");
                        precioGeneralE2 = s.nextInt();
                        break;
                    case 2:
                        entradaGeneralE2 = true;
                        entradaPremiumE2 = true;
                        System.out.println("Precio General:");
                        precioGeneralE2 = s.nextInt();
                        System.out.println("Precio Premium:");
                        precioPremiumE2 = s.nextInt();
                        break;
                    case 3:
                        entradaGeneralE2 = true;
                        entradaPremiumE2 = true;
                        entradaVIPE2 = true;
                        System.out.println("Precio General:");
                        precioGeneralE2 = s.nextInt();
                        System.out.println("Precio Premium:");
                        precioPremiumE2 = s.nextInt();
                        System.out.println("Precio VIP:");
                        precioVIPE2 = s.nextInt();
                }
                break;
            case 3:
                switch (opcion){
                    case 1:
                        entradaGeneralE3 = true;
                        System.out.println("Precio General:");
                        precioGeneralE3 = s.nextInt();
                        break;
                    case 2:
                        entradaGeneralE3 = true;
                        entradaPremiumE3 = true;
                        System.out.println("Precio General:");
                        precioGeneralE3 = s.nextInt();
                        System.out.println("Precio Premium:");
                        precioPremiumE3 = s.nextInt();
                        break;
                    case 3:
                        entradaGeneralE3 = true;
                        entradaPremiumE3 = true;
                        entradaVIPE3 = true;
                        System.out.println("Precio General:");
                        precioGeneralE3 = s.nextInt();
                        System.out.println("Precio Premium:");
                        precioPremiumE3 = s.nextInt();
                        System.out.println("Precio VIP:");
                        precioVIPE3 = s.nextInt();
                }
                break;
        }
    }

    public static void creaEventos() {
        Scanner s = new Scanner(System.in);
        if (!e1Creado) {
            System.out.print("Introduce el nombre del evento: ");
            nombreE1 = s.next();
            System.out.print("Escribe la descripción del evento: ");
            descripcionE1 = s.next();
            muestraCategoria();
            int opcion = s.nextInt();
            categoriaE1 = switch (opcion) {
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
            tipoEntradas(1);
            e1Creado = true;

        } else if (!e2Creado) {
            System.out.print("Introduce el nombre del evento: ");
            nombreE2 = s.next();
            System.out.print("Escribe la descripción del evento: ");
            descripcionE2 = s.next();
            muestraCategoria();
            int opcion = s.nextInt();
            categoriaE2 = switch (opcion) {
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
            tipoEntradas(2);
            e2Creado = true;


        } else if (!e3Creado) {
            System.out.print("Introduce el nombre del evento: ");
            nombreE3 = s.next();
            System.out.print("Escribe la descripción del evento: ");
            descripcionE3 = s.next();
            muestraCategoria();
            int opcion = s.nextInt();
            categoriaE3 = switch (opcion) {
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
            tipoEntradas(3);
            e3Creado = true;
        } else {
            System.out.println("Se ha llegado al límite de eventos, no se pueden crear más");
        }
    }

    public static void eliminaEventos(int peticionEventoBorrar) {
        switch (peticionEventoBorrar) {
            case 1 -> e1Creado = false;
            case 2 -> e2Creado = false;
            case 3 -> e3Creado = false;
            case 4 -> System.out.println("Saliendo...");
            default -> System.out.println("Debes de introducir alguna de las opciones que hay en pantalla");
        }
    }

    public static void menuModificaEventos(){
        Scanner s = new Scanner(System.in);
        System.out.println("**** MENÚ MODIFICADOR EVENTOS ****");
        System.out.println("1. Crear nuevo evento");
        System.out.println("2. Modificar evento existente");
        System.out.println("3. Eliminar evento");
        System.out.println("4. Salir");
        int opcion = s.nextInt();
        switch (opcion){
            case 1:
                creaEventos();
                break;
            case 2:
                if (!e1Creado && !e2Creado && !e3Creado){
                    System.out.println("No puede modificar ningún evento, aún no se ha creado ninguno");
                    break;
                } else if (e1Creado && !e2Creado && !e3Creado) {
                    System.out.println("¿Qué evento desea modificar?");
                    System.out.println("1. " + nombreE1);
                    opcion = s.nextInt();
                    if (opcion != 1){
                        System.out.println("Por favor, introduce la opción correspondiente");
                        break;
                    }
                } else if (e1Creado && e2Creado && !e3Creado) {
                    System.out.println("¿Qué evento desea modificar?");
                    System.out.println("1. " + nombreE1);
                    System.out.println("2. " + nombreE2);
                    opcion = s.nextInt();
                    if (opcion < 1 || opcion > 2){
                        System.out.println("Por favor, introduce la opción correspondiente");
                        break;
                    }
                } else {
                    System.out.println("¿Qué evento desea modificar?");
                    System.out.println("1. " + nombreE1);
                    System.out.println("2. " + nombreE2);
                    System.out.println("3. " + nombreE3);
                    opcion = s.nextInt();
                    if (opcion < 1 || opcion > 3) {
                        System.out.println("Por favor, introduce la opción correspondiente");
                        break;
                    }
                }

                switch (opcion){
                    case 1:
                        eliminaEventos(1);
                        creaEventos();
                    break;
                    case 2:
                        eliminaEventos(2);
                        creaEventos();
                    break;
                    case 3:
                        eliminaEventos(3);
                        creaEventos();
                        break;
                }
        }
    }

    public static void muestraEvento1(int personasInscritasE1){
        System.out.println("***** " + nombreE1 + " *****");
        System.out.println("Descripción: " + descripcionE1);
        System.out.println("Categoría: " + categoriaE1);
        System.out.println("Fecha: " + fechaE1 + " Hora " + horaE1);
        System.out.println("Aforo máximo " + aforoE1);
        System.out.println("Numero de personas inscritas hasta el momento " + personasInscritasE1);
        vistaDetalladaEvento(1, numInscritosE1);
        System.out.print("******");
        for (int i = 0; i < nombreE1.length(); i++) System.out.print("*");
        System.out.println("******");
    }

    public static void muestraEvento2(int personasInscritasE2){
        System.out.println("***** " + nombreE2 + " *****");
        System.out.println("Descripción: " + descripcionE2);
        System.out.println("Categoría: " + categoriaE2);
        System.out.println("Fecha: " + fechaE2 + " Hora " + horaE2);
        System.out.println("Aforo máximo " + aforoE2);
        System.out.println("Numero de personas inscritas hasta el momento " + personasInscritasE2);
        vistaDetalladaEvento(2, numInscritosE2);
        System.out.print("******");
        for (int i = 0; i < nombreE2.length(); i++) System.out.print("*");
        System.out.println("******");
    }

    public static void muestraEvento3(int personasInscritasE3){
        System.out.println("***** " + nombreE3 + " *****");
        System.out.println("Descripción: " + descripcionE3);
        System.out.println("Categoría: " + categoriaE3);
        System.out.println("Fecha: " + fechaE3 + " Hora " + horaE3);
        System.out.println("Aforo máximo " + aforoE3);
        System.out.println("Numero de personas inscritas hasta el momento " + personasInscritasE3);
        vistaDetalladaEvento(3, numInscritosE3);
        System.out.print("******");
        for (int i = 0; i < nombreE3.length(); i++) System.out.print("*");
        System.out.println("******");
    }

    public static void muestraEventos_A_Asistentes(int asistente){
        System.out.println("**** EVENTOS A LOS QUE TE HAS SUSCRITO ****");
        if (asistente==1){
            if (as1InscritoE1) muestraEvento1(personasInscritasE1);
            if (as1InscritoE2) muestraEvento2(personasInscritasE2);
            if (as1InscritoE3) muestraEvento3(personasInscritasE3);
        } else if (asistente==2) {
            if (as2InscritoE1) muestraEvento1(personasInscritasE1);
            if (as2InscritoE2) muestraEvento2(personasInscritasE2);
            if (as2InscritoE3) muestraEvento3(personasInscritasE3);
        }
    }

    public static void muestraEventos() {
        if (!e1Creado && !e2Creado && !e3Creado){
            System.out.println("Aún no hay eventos.");
        } else {
            if (e1Creado){
                muestraEvento1(personasInscritasE1);
            }
            if (e2Creado){
                muestraEvento2(personasInscritasE2);
            }
            if (e3Creado){
                muestraEvento3(personasInscritasE3);
            }
        }
    }

    public static void vistaEntradasYPrecios(int peticionEvento){
        switch (peticionEvento){
            case 1:
                System.out.println("Tipo de entradas y precio: ");
                System.out.println("1. Entrada General: " + precioGeneralE1 + "€");
                if (entradaPremiumE1) System.out.println("2. Entrada Premium: " + precioPremiumE1 + "€");
                if (entradaVIPE1) System.out.println("3. Entrada VIP: " + precioVIPE1 + "€");
                break;
            case 2:
                System.out.println("Tipo de entradas y precio: ");
                System.out.println("1. Entrada General: " + precioGeneralE2 + "€");
                if (entradaPremiumE2) System.out.println("2. Entrada Premium: " + precioPremiumE2 + "€");
                if (entradaVIPE2) System.out.println("3. Entrada VIP: " + precioVIPE2 + "€");
                break;
            case 3:
                System.out.println("Tipo de entradas y precio: ");
                System.out.println("1. Entrada General: " + precioGeneralE3 + "€");
                if (entradaPremiumE3) System.out.println("2. Entrada Premium: " + precioPremiumE3 + "€");
                if (entradaVIPE3) System.out.println("3. Entrada VIP: " + precioVIPE3 + "€");
                break;
        }
    }

    public static void vistaDetalladaEvento(int peticionEvento, int numInscritos) {
        double porcentajeOcupacion;
        switch (peticionEvento) {
            case 1:
                porcentajeOcupacion = (double) (numInscritos * 100) / aforoE1;
                System.out.println("════════════════════");
                System.out.print("║");
                for (int i = 0; i < (porcentajeOcupacion / 5); i++) {
                    System.out.print("█");
                }
                for (int i = 0; i < (100 - porcentajeOcupacion) / 5; i++) {
                    System.out.print(" ");
                }
                System.out.print("║");
                System.out.println(porcentajeOcupacion + "% de Ocupación");
                System.out.println("════════════════════");
                System.out.println();
                vistaEntradasYPrecios(1);
                break;

            case 2:
                porcentajeOcupacion = (double) (numInscritos * 100) / aforoE2;
                System.out.println("════════════════════");
                System.out.print("║");
                for (int i = 0; i < porcentajeOcupacion / 5; i++) {
                    System.out.print("█");
                }
                for (int i = 0; i < (100 - porcentajeOcupacion) / 5; i++) {
                    System.out.print(" ");
                }
                System.out.print("║");
                System.out.println(porcentajeOcupacion + "% de Ocupación");
                System.out.println("════════════════════");
                System.out.println();
                vistaEntradasYPrecios(2);
                break;

            case 3:
                porcentajeOcupacion = (double) (numInscritos * 100) / aforoE3;
                System.out.println("════════════════════");
                System.out.print("║");
                for (int i = 0; i < porcentajeOcupacion / 5; i++) {
                    System.out.print("█");
                }
                for (int i = 0; i < (100 - porcentajeOcupacion) / 5; i++) {
                    System.out.print(" ");
                }
                System.out.print("║");
                System.out.println(porcentajeOcupacion + "% de Ocupación");
                System.out.println("════════════════════");
                System.out.println();
                vistaEntradasYPrecios(3);
                break;

            default:
                System.out.println("ERROR");
                break;
        }
    }

    public static int inscripcionEventoPago(int carteraAsistente, int asistente) {
        Scanner s = new Scanner(System.in);
        int seleccionUsuario;
        String respuesta;
        System.out.println("**** INSCRIPCIÓN A EVENTO DE PAGO ****");
        System.out.println("¿Desea volver a ver todos los eventos a los que puede inscribirse? (s/n)");
        String opcion = s.next();
        if (opcion.equals("s")) muestraEventos();
        System.out.println("¿A que evento desea inscribirse?");
        System.out.println("1. " + nombreE1);
        System.out.println("2. " + nombreE2);
        System.out.println("3. " + nombreE3);
        int opc = s.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Seleccione la entrada que desea:");
                vistaEntradasYPrecios(1);
                seleccionUsuario = s.nextInt();
                switch (seleccionUsuario){
                    case 1:
                        System.out.println("¿Está seguro que desea comprar esta entrada?. Se retirarán " + precioGeneralE1 + "€ de su cartera (s/n)");
                        respuesta = s.next();
                        if (respuesta.equals("s")){
                            if (carteraAsistente>precioGeneralE1){
                                carteraAsistente -= precioGeneralE1;
                                personasInscritasE1++;
                                if (asistente==1) as1InscritoE1 = true;
                                if (asistente==2) as2InscritoE1 = true;
                            } else {
                                System.out.println("No se ha podido realizar la compra de las entradas. No dispone de suficiente saldo");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("¿Está seguro que desea comprar esta entrada?. Se retirarán " + precioPremiumE1 + "€ de su cartera (s/n)");
                        respuesta = s.next();
                        if (respuesta.equals("s")){
                            if (carteraAsistente>precioPremiumE1){
                                carteraAsistente -= precioPremiumE1;
                                personasInscritasE1++;
                                if (asistente==1) as1InscritoE1 = true;
                                if (asistente==2) as2InscritoE1 = true;
                            } else {
                                System.out.println("No se ha podido realizar la compra de las entradas. No dispone de suficiente saldo");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("¿Está seguro que desea comprar esta entrada?. Se retirarán " + precioVIPE1 + "€ de su cartera (s/n)");
                        respuesta = s.next();
                        if (respuesta.equals("s")){
                            if (carteraAsistente>precioVIPE1){
                                carteraAsistente -= precioVIPE1;
                                personasInscritasE1++;
                                if (asistente==1) as1InscritoE1 = true;
                                if (asistente==2) as2InscritoE1 = true;
                            } else {
                                System.out.println("No se ha podido realizar la compra de las entradas. No dispone de suficiente saldo");
                            }
                        }
                        break;
                }
                break;
            case 2:
                System.out.println("Seleccione la entrada que desea:");
                vistaEntradasYPrecios(2);
                seleccionUsuario = s.nextInt();
                switch (seleccionUsuario){
                    case 1:
                        System.out.println("¿Está seguro que desea comprar esta entrada?. Se retirarán " + precioGeneralE2 + "€ de su cartera (s/n)");
                        respuesta = s.next();
                        if (respuesta.equals("s")){
                            if (carteraAsistente>precioGeneralE2){
                                carteraAsistente -= precioGeneralE2;
                                personasInscritasE2++;
                                if (asistente==1) as1InscritoE2 = true;
                                if (asistente==2) as2InscritoE2 = true;
                            } else {
                                System.out.println("No se ha podido realizar la compra de las entradas. No dispone de suficiente saldo");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("¿Está seguro que desea comprar esta entrada?. Se retirarán " + precioPremiumE2 + "€ de su cartera (s/n)");
                        respuesta = s.next();
                        if (respuesta.equals("s")){
                            if (carteraAsistente>precioPremiumE2){
                                carteraAsistente -= precioPremiumE2;
                                personasInscritasE2++;
                                if (asistente==1) as1InscritoE2 = true;
                                if (asistente==2) as2InscritoE2 = true;
                            } else {
                                System.out.println("No se ha podido realizar la compra de las entradas. No dispone de suficiente saldo");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("¿Está seguro que desea comprar esta entrada?. Se retirarán " + precioVIPE2 + "€ de su cartera (s/n)");
                        respuesta = s.next();
                        if (respuesta.equals("s")){
                            if (carteraAsistente>precioVIPE2){
                                carteraAsistente -= precioVIPE2;
                                personasInscritasE2++;
                                if (asistente==1) as1InscritoE2 = true;
                                if (asistente==2) as2InscritoE2 = true;
                            } else {
                                System.out.println("No se ha podido realizar la compra de las entradas. No dispone de suficiente saldo");
                            }
                        }
                        break;
                }
                break;
            case 3:
                System.out.println("Seleccione la entrada que desea:");
                vistaEntradasYPrecios(3);
                seleccionUsuario = s.nextInt();
                switch (seleccionUsuario){
                    case 1:
                        System.out.println("¿Está seguro que desea comprar esta entrada?. Se retirarán " + precioGeneralE3 + "€ de su cartera (s/n)");
                        respuesta = s.next();
                        if (respuesta.equals("s")){
                            if (carteraAsistente>precioGeneralE3){
                                carteraAsistente -= precioGeneralE3;
                                personasInscritasE3++;
                                if (asistente==1) as1InscritoE3 = true;
                                if (asistente==2) as2InscritoE3 = true;
                            } else {
                                System.out.println("No se ha podido realizar la compra de las entradas. No dispone de suficiente saldo");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("¿Está seguro que desea comprar esta entrada?. Se retirarán " + precioPremiumE3 + "€ de su cartera (s/n)");
                        respuesta = s.next();
                        if (respuesta.equals("s")){
                            if (carteraAsistente>precioPremiumE3){
                                carteraAsistente -= precioPremiumE3;
                                personasInscritasE3++;
                                if (asistente==1) as1InscritoE3 = true;
                                if (asistente==2) as2InscritoE3 = true;
                            } else {
                                System.out.println("No se ha podido realizar la compra de las entradas. No dispone de suficiente saldo");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("¿Está seguro que desea comprar esta entrada?. Se retirarán " + precioVIPE3 + "€ de su cartera (s/n)");
                        respuesta = s.next();
                        if (respuesta.equals("s")){
                            if (carteraAsistente>precioVIPE3){
                                carteraAsistente -= precioVIPE3;
                                personasInscritasE3++;
                                if (asistente==1) as1InscritoE3 = true;
                                if (asistente==2) as2InscritoE3 = true;
                            } else {
                                System.out.println("No se ha podido realizar la compra de las entradas. No dispone de suficiente saldo");
                            }
                        }
                        break;
                }
                break;
        }
        return carteraAsistente;
    }


//********************************************************************************************************************************************************************************************************


    public static int menuGeneral() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a FernanEvents, ¿Como deseas acceder?");
        System.out.println("1--Administrador");
        System.out.println("2--Organizador");
        System.out.println("3--Asistente 1");
        System.out.println("4--Asistente 2");
        System.out.println("5--Salir");
        int opcion = Integer.parseInt(sc.next());
        return opcion;


    }

    public static int menuAdministrador() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al Administrador");
        System.out.println("1--Panel de control");
        System.out.println("2--Eventos");
        System.out.println("3--Cartera Digital");
        System.out.println("4--Configuración");
        System.out.println("5--Cerrar sesión");
        int opcion = Integer.parseInt(sc.next());
        return opcion;


    }

    public static int menuOrganizador() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al Organizador");
        System.out.println("1--Mis eventos");
        System.out.println("2--Cartera digital");
        System.out.println("3__Configuración");
        System.out.println("4--Cerrar sesión");
        int opcion = Integer.parseInt(sc.next());
        return opcion;


    }

    public static int menuAsistente() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al Asistente ");
        System.out.println("1--Mis eventos");
        System.out.println("2--Eventos");
        System.out.println("3--Cartera digital");
        System.out.println("4--Invita a un amigo");
        System.out.println("5__Configuración");
        System.out.println("6--Cerrar sesión");
        int opcion = Integer.parseInt(sc.next());
        return opcion;


    }

    public static int menuCartera() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1--Ingresar dinero");
        System.out.println("2--Retirar dinero");
        System.out.println("3--Ver saldo");
        System.out.println("4--Salir");
        int opcion = Integer.parseInt(sc.next());
        return opcion;
    }


    public static int carteraIngresarDinero(int total, int suma) {
        System.out.println("Saldo Actualizado");
        return total += suma;
    }

    public static int carteraRetirarDinero(int total, int resta) {
        System.out.println("Saldo Actualizado");
        return total - resta;
    }

    public static int panelDeControl() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al panel de control, ¿que usuario deseas desbloquear?");
        System.out.println("1--Organizador");
        System.out.println("2--Asistente 1");
        System.out.println("3--Asistente 2");
        int opcion = Integer.parseInt(sc.next());
        return opcion;
    }

    public static int menuConfiguracion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la configuración, ¿que deseas cambiar?");
        System.out.println("1--Usuario");
        System.out.println("2--Contraseña");
        System.out.println("3--Salir");

        int opcion = Integer.parseInt(sc.next());
        return opcion;
    }

    public static String cambioUsuario() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu nuevo usuario");
        String nuevoUsuario = sc.next();


        return nuevoUsuario;
    }

    public static String cambioContrasena() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime tu nueva contraseña");
        String nuevaContrasena = sc.next();


        return nuevaContrasena;
    }

    public static int menuInvitaAmigo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Que deseas hacer?");
        System.out.println("1--Añadir amigo");
        System.out.println("2--Ver listado de amigos");
        System.out.println("3--Salir");
        int opcion = Integer.parseInt(sc.next());

        return opcion;
    }

    public static void invitaAmigo1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el correo de tu amigo:");
        amigos1+=" || "+sc.next();
        System.out.println("Amigo añadido con exito");

    }

    public static void invitaAmigo2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el correo de tu amigo:");
        amigos2+=" || "+sc.next();
        System.out.println("Amigo añadido con exito");

    }
//________________________________________________________FUNCIONES MARCOS_______________________________________________________________________
}