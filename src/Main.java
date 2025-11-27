import java.util.Scanner;

public class Main {

    public static void main() {
        System.out.println("" +
                "███████╗███████╗██████╗  ███╗   ██╗ █████╗ ███╗   ██╗\n" +
                "██╔════╝██╔════╝██╔══██╗ ████╗  ██║██╔══██╗████╗  ██║\n" +
                "█████╗  █████╗  ██████╔╝ ██╔██╗ ██║███████║██╔██╗ ██║\n" +
                "██╔══╝  ██╔══╝  ██╔══██╗ ██║╚██╗██║██╔══██║██║╚██╗██║\n" +
                "██║     ███████╗██║  ██║ ██║ ╚████║██║  ██║██║ ╚████║\n" +
                "╚═╝     ╚══════╝╚═╝  ╚═╝ ╚═╝  ╚═══╝╚═╝  ╚═╝╚═╝  ╚═══╝\n" +
                "███████╗██╗     ██╗███╗   ██╗███████╗███╗   ██╗████████╗███████╗\n" +
                "██╔════╝╚██╗   ██╔╝████╗  ██║██╔════╝████╗  ██║╚══██╔══╝██╔════╝\n" +
                "█████╗   ╚██╗ ██╔╝ ██╔██╗ ██║█████╗  ██╔██╗ ██║   ██║   ███████╗\n" +
                "██╔══╝    ╚████╔╝  ██║╚██╗██║██╔══╝  ██║╚██╗██║   ██║   ╚════██║\n" +
                "███████╗   ╚██╔╝   ██║ ╚████║███████╗██║ ╚████║   ██║   ███████║\n" +
                "╚══════╝    ╚═╝    ╚═╝   ╚══╝╚══════╝╚═╝   ╚══╝   ╚═╝   ╚══════╝\n\n" +
                "             G E S T I Ó N   D E   E V E N T O S\n");

        Scanner sc = new Scanner(System.in);

        String usuarioAdmin="Paco";
        String usuarioOrganizador="Manuel";
        String usuarioAsistente1="Marcos";
        String usuarioAsistente2="Pablo";

        String contrasenaAdmin="1234";
        String contrasenaOrganizador="1234";
        String contrasenaAsistente1="1234";
        String contrasenaAsistente2="1234";

        int bloqueoAdmin=0;
        int bloqueoOrganizador=0;
        int bloqueoAsistente1=0;
        int bloqueoAsistente2=0;


        int finalizarPrograma=0;

        int carteraAdmin=0;
        int carteraOrganizador=0;
        int carteraAsistente1=0;
        int carteraAsistente2=0;


        do {

            int salirAdmin=0;
            int salirOrganizador=0;
            int salirAsistente1=0;
            int salirAsistente2=0;


            switch (Funciones.menuGeneral()){
                case 1:
                    do {
                        System.out.println("Escribe el usuario administrador");
                        String usuarioIntroducidoAdmin= sc.next();
                        System.out.println("Escribe la contraseña");
                        String contrasenaIntroducidaAdmin= sc.next();
                        if (usuarioAdmin.equals(usuarioIntroducidoAdmin) && contrasenaAdmin.equals(contrasenaIntroducidaAdmin)) {

                            do {

                                switch (Funciones.menuAdministrador()){
                                    case 1:

                                        switch (Funciones.panelDeControl()){
                                            case 1:
                                                System.out.println("Organizador desbloqueado");
                                                bloqueoOrganizador=0;
                                                break;
                                            case 2:
                                                System.out.println("Asistente 1 desbloqueado");
                                                bloqueoAsistente1=0;
                                                break;
                                            case 3:
                                                System.out.println("Asistente 2 desbloqueado");
                                                bloqueoAsistente2=0;
                                                break;
                                            default:
                                                System.out.println("Opcion incorrecta");
                                                break;
                                        }

                                        break;
                                    case 2:
                                            Funciones.muestraEventos();
                                        System.out.print("¿Desea abrir el menú de modificación de proyectos? (s/n): ");
                                        String opcion = sc.nextLine();
                                        if (opcion.equals("s")) Funciones.menuModificaEventos();
                                        break;
                                    case 3:

                                        switch (Funciones.menuCartera()){

                                            case 1:
                                                System.out.println("Escriba la cantidad que desea añadir.");
                                                int cantidadQueDeseaAñadirAdmin = Integer.parseInt(sc.next());
                                                carteraAdmin= Funciones.carteraIngresarDinero(carteraAdmin,cantidadQueDeseaAñadirAdmin);
                                                break;
                                            case 2:
                                                System.out.println("Escriba la cantidad que desea retirar.");
                                                int cantidadQueDeseaRetirarAdmin = Integer.parseInt(sc.next());
                                                carteraAdmin= Funciones.carteraRetirarDinero(carteraAdmin,cantidadQueDeseaRetirarAdmin);
                                                break;
                                            case 3:
                                                System.out.println("Su saldo es: "+carteraAdmin);
                                                break;
                                            default:
                                                break;

                                        }

                                        break;
                                    case 4:
                                        switch (Funciones.menuConfiguracion()){
                                            case 1:
                                                usuarioAdmin= Funciones.cambioUsuario();
                                                break;
                                            case 2:
                                                contrasenaAdmin= Funciones.cambioContrasena();
                                                break;
                                            case 3:
                                                break;
                                            default:
                                                System.out.println("error");
                                                break;
                                        }
                                        break;
                                    case 5:
                                        System.out.println("Cerrando sesión");
                                        salirAdmin++;
                                        break;
                                    default:
                                        System.out.println("Opción incorrecta");
                                        break;
                                }

                            }while (salirAdmin!=1);


                        }else{
                            System.out.println("Usuario o contraseña incorrecta");

                        }

                    }while (bloqueoAdmin!=3 && salirAdmin!=1);






                    break;
                case 2:


                    if (bloqueoOrganizador==3) {
                        System.out.println("Usuario bloqueado");
                        break;
                    }else{

                        do {
                            System.out.println("Escribe el usuario organizador");
                            String usuarioIntroducidoOrganizador= sc.next();
                            System.out.println("Escribe la contraseña");
                            String contrasenaIntroducidaOrganizador= sc.next();
                            if (usuarioOrganizador.equals(usuarioIntroducidoOrganizador) && contrasenaOrganizador.equals(contrasenaIntroducidaOrganizador)) {

                                do {

                                    switch (Funciones.menuOrganizador()){
                                        case 1:
                                            Funciones.muestraEventos();
                                            System.out.print("¿Desea abrir el menú de modificación de proyectos? (s/n): ");
                                            String opcion = sc.nextLine();
                                            if (opcion.equals("s")) Funciones.menuModificaEventos();
                                            break;
                                        case 2:
                                            switch (Funciones.menuCartera()){

                                                case 1:
                                                    System.out.println("Escriba la cantidad que desea añadir.");
                                                    int cantidadQueDeseaAñadirOrganizador = Integer.parseInt(sc.next());
                                                    carteraOrganizador=Funciones.carteraIngresarDinero(carteraOrganizador,cantidadQueDeseaAñadirOrganizador);
                                                    break;
                                                case 2:
                                                    System.out.println("Escriba la cantidad que desea retirar.");
                                                    int cantidadQueDeseaRetirarOrganizador = Integer.parseInt(sc.next());
                                                    carteraOrganizador=Funciones.carteraRetirarDinero(carteraOrganizador,cantidadQueDeseaRetirarOrganizador);
                                                    break;
                                                case 3:
                                                    System.out.println("Su saldo es: "+carteraOrganizador);
                                                    break;
                                                default:
                                                    break;

                                            }
                                            break;
                                        case 3:
                                            switch (Funciones.menuConfiguracion()){
                                                case 1:
                                                    usuarioOrganizador=Funciones.cambioUsuario();
                                                    break;
                                                case 2:
                                                    contrasenaOrganizador=Funciones.cambioContrasena();
                                                    break;
                                                case 3:
                                                    break;
                                                default:
                                                    System.out.println("error");
                                                    break;
                                            }

                                            break;
                                        case 4:
                                            salirOrganizador++;
                                            break;
                                        default:
                                            System.out.println("Opción incorrecta");
                                            break;

                                    }



                                }while (salirOrganizador!=1);



                            }else{
                                System.out.println("Usuario o contraseña incorrecta");
                                bloqueoOrganizador++;
                                if (bloqueoOrganizador==3) {

                                    System.out.println("Usuario bloqueado");
                                    break;
                                }
                            }

                        }while (bloqueoOrganizador!=3 && salirOrganizador!=1);

                    }





                    break;
                case 3:


                    if (bloqueoAsistente1==3) {
                        System.out.println("Usuario bloqueado");
                        break;
                    }else{

                        do {
                            System.out.println("Escribe el usuario asistente 1");
                            String usuarioIntroducidoAsistente1= sc.next();
                            System.out.println("Escribe la contraseña");
                            String contrasenaIntroducidaAsistente1= sc.next();
                            if (usuarioIntroducidoAsistente1.equals(usuarioAsistente1) && contrasenaIntroducidaAsistente1.equals(contrasenaAsistente1)) {

                                do {

                                    switch (Funciones.menuAsistente()){
                                        case 1:
                                            Funciones.muestraEventos_A_Asistentes(2);
                                            break;
                                        case 2:
                                            Funciones.muestraEventos();
                                            System.out.println("¿Desea inscribirse a algún evento? (s/n)");
                                            String opcion = sc.nextLine();
                                            if (opcion.equals("s")){
                                                carteraAsistente1 -= Funciones.inscripcionEventoPago(carteraAsistente1, 1);
                                            }
                                            break;
                                        case 3:
                                            switch (Funciones.menuCartera()){

                                                case 1:
                                                    System.out.println("Escriba la cantidad que desea añadir.");
                                                    int cantidadQueDeseaAñadirAsistente1 = Integer.parseInt(sc.next());
                                                    carteraAsistente1=Funciones.carteraIngresarDinero(carteraAsistente1,cantidadQueDeseaAñadirAsistente1);
                                                    break;
                                                case 2:
                                                    System.out.println("Escriba la cantidad que desea retirar.");
                                                    int cantidadQueDeseaRetirarAsistente1 = Integer.parseInt(sc.next());
                                                    carteraAsistente1=Funciones.carteraIngresarDinero(carteraAsistente1,cantidadQueDeseaRetirarAsistente1);
                                                    break;
                                                case 3:
                                                    System.out.println("Su saldo es: "+carteraAsistente1);
                                                    break;
                                                default:
                                                    break;

                                            }
                                            break;
                                        case 4:
                                            break;
                                        case 5:
                                            switch (Funciones.menuConfiguracion()){
                                                case 1:
                                                    usuarioAsistente1=Funciones.cambioUsuario();
                                                    break;
                                                case 2:
                                                    contrasenaAsistente1=Funciones.cambioContrasena();
                                                    break;
                                                case 3:
                                                    break;
                                                default:
                                                    System.out.println("error");
                                                    break;
                                            }

                                            break;
                                        case 6:
                                            salirAsistente1++;
                                            break;
                                        default:
                                            System.out.println("Opción incorrecta");
                                            break;
                                    }


                                }while (salirAsistente1!=1);




                            }else{
                                System.out.println("Usuario o contraseña incorrecta");
                                bloqueoAsistente1++;
                                if (bloqueoAsistente1==3) {

                                    System.out.println("Usuario bloqueado");
                                    break;
                                }
                            }

                        }while (bloqueoAsistente1!=3 && salirAsistente1!=1);

                    }





                    break;
                case 4:

                    if (bloqueoAsistente2==3) {
                        System.out.println("Usuario bloqueado");
                        break;
                    }else{

                        do {
                            System.out.println("Escribe el usuario asistente 2");
                            String usuarioIntroducidoAsistente2= sc.next();
                            System.out.println("Escribe la contraseña");
                            String contrasenaIntroducidaAsistente2= sc.next();
                            if (usuarioIntroducidoAsistente2.equals(usuarioAsistente2) && contrasenaIntroducidaAsistente2.equals(contrasenaAsistente2)) {


                                do {

                                    switch (Funciones.menuAsistente()){
                                        case 1:
                                            Funciones.muestraEventos_A_Asistentes(2);
                                            break;
                                        case 2:
                                            Funciones.muestraEventos();
                                            System.out.println("¿Desea inscribirse a algún evento? (s/n)");
                                            String opcion = sc.nextLine();
                                            if (opcion.equals("s")){
                                                carteraAsistente2 -= Funciones.inscripcionEventoPago(carteraAsistente2, 2);
                                            }
                                            break;
                                        case 3:
                                            switch (Funciones.menuCartera()){

                                                case 1:
                                                    System.out.println("Escriba la cantidad que desea añadir.");
                                                    int cantidadQueDeseaAñadirAsistente2 = Integer.parseInt(sc.next());
                                                    carteraAsistente2=Funciones.carteraIngresarDinero(carteraAsistente2,cantidadQueDeseaAñadirAsistente2);
                                                    break;
                                                case 2:
                                                    System.out.println("Escriba la cantidad que desea añadir.");
                                                    int cantidadQueDeseaRetirarAsistente2 = Integer.parseInt(sc.next());
                                                    carteraAsistente2=Funciones.carteraIngresarDinero(carteraAsistente2,cantidadQueDeseaRetirarAsistente2);
                                                    break;
                                                case 3:
                                                    System.out.println("Su saldo es: "+carteraAsistente2);
                                                    break;
                                                default:
                                                    break;

                                            }
                                            break;
                                        case 4:
                                            break;
                                        case 5:
                                            switch (Funciones.menuConfiguracion()){
                                                case 1:
                                                    usuarioAsistente2=Funciones.cambioUsuario();
                                                    break;
                                                case 2:
                                                    contrasenaAsistente2=Funciones.cambioContrasena();
                                                    break;
                                                case 3:
                                                    break;
                                                default:
                                                    System.out.println("error");
                                                    break;
                                            }

                                            break;
                                        case 6:
                                            salirAsistente2++;
                                            break;
                                        default:
                                            System.out.println("Opción incorrecta");
                                            break;
                                    }



                                }while (salirAsistente2!=1);




                            }else{
                                System.out.println("Usuario o contraseña incorrecta");
                                bloqueoAsistente2++;
                                if (bloqueoAsistente2==3) {

                                    System.out.println("Usuario bloqueado");
                                    break;
                                }
                            }

                        }while (bloqueoAsistente2!=3 && salirAsistente2!=1);

                    }

                    break;
                case 5:
                    finalizarPrograma++;
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }

        }while (finalizarPrograma==0);
    }
}