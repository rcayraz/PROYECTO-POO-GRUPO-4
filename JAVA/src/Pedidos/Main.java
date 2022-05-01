package Pedidos;

import java.util.Scanner;

public class Main {
    public static String[][] usuarios = {{"Admin", "Administrador", "1234"}, {"Ventas", "Vendedor", "12345"}};
    public static GestionPedidos objpedidos;
    public static void main(String[] args) {
        menuLogin();
        //AgregarPedidos();
        //System.out.println("se cargo los pedidos");
        //menu();
    }

    public static void menuLogin() {
        Scanner scan = new Scanner(System.in);
        String usuario, contraseña;
        boolean estado = false;
        do {
            bienvenida();
            System.out.println("Ingresar usuario");
            usuario = scan.nextLine();
            System.out.println("Ingresar contraseña");
            contraseña = scan.nextLine();
            estado = login(contraseña, usuario);
        } while (estado == false);

    }

    public static void bienvenida() {
        System.out.println(); System.out.println("");
        System.out.println("===========SISTEMA DE VENTAS POR DELIVERY FASTY GO! v1.0===========");
        System.out.println(""); System.out.println("");
    }

    public static boolean login(String contraseña, String usuario) {
        boolean validacionUser = false;
        boolean existenciaUser = false;
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0].equals(usuario)) {
                existenciaUser = true;
                if (usuarios[i][2].equals(contraseña)) {
                    validacionUser = true;
                    System.out.println("Bienvenido " + usuarios[i][0] + " | Perfil: " + usuarios[i][1]);
                    switch (usuarios[i][1]) {
                        case "Administrador" : ingresoMenuAdministrador(); break;
                        case "Vendedor" : ingresoMenuEjecutivo();break;
                    }
                }else System.out.println("Error en contraseña, vuelva a ingresar");break;
            }
        }
        if (validacionUser==false && existenciaUser==false) System.out.println("Error en Usuario, vuelva a ingresar");
        return validacionUser;
    }

    public static void  ingresoMenuAdministrador(){
        System.out.println(""); System.out.println("");
        System.out.println("==========================================================");
        System.out.println("Menú Administrador");
        System.out.println("==========================================================");
        System.out.println("[1] Actualización de Precios");
        System.out.println("[2] Reporte de Productos");
        System.out.println("[3] Reporte General de envíos");
        System.out.println("[4] Cerrar Sesión");
        System.out.println("Seleccione una opción: ");
        Scanner scan = new Scanner(System.in);
        int seleccionMenu = scan.nextInt();
        switch (seleccionMenu) {
           // case 1 : actualizacionTarifas(); break;
           // case 2 : reporteTarifas();break;
           // case 3 : reporteGeneralEnvios();break;
            case 4 : menuLogin(); break;
            default: System.out.println("Seleccionar una opción correcta");break;
        }
    }


    public static void  ingresoMenuEjecutivo(){
        System.out.println(""); System.out.println("");
        System.out.println("==========================================================");
        System.out.println("Menú de Ventas");
        System.out.println("==========================================================");
        System.out.println("[1] Lista de Productos");
        System.out.println("[2] Registro de Pedidos");
        System.out.println("[3] Reporte de Envíos diarios");
        System.out.println("[4] Reporte de Clientes");
        System.out.println("[5] Cerrar Sesión");
        System.out.println("Seleccione una opción: ");
        Scanner scan = new Scanner(System.in);
        int seleccionMenu = scan.nextInt();
        switch (seleccionMenu) {
            case 1 : AgregarProductos(); break;
            //case 2 : AgregarPedidos();break;
           // case 3 : reporteEnviosDiarios();break;
            case 4 : reporteClientes();break;
            case 5 : menuLogin(); break;
            default: System.out.println("Seleccionar una opción correcta");break;
        }
    }

    public static void reporteClientes() {
        System.out.println("=".repeat(85));
        System.out.println("\t\t\t\t LISTA DE CLIENTES" );
        System.out.println("=".repeat(85));
        System.out.println("-".repeat(85));
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|\n", "Nombre y Apellidos   ", "DNI", "Correo", "Telefono");
        System.out.println("-".repeat(85));

        //objpedidos.ListarClientes();
        AgregarCliente();
        ingresoMenuEjecutivo();
    }



    public static void AgregarProductos(){
        ArtefactosElec p1 = new ArtefactosElec("AECOMAG4QH","Cocina a gas Mabe 4hornillas",699.00,2);
        ArtefactosElec p2 = new ArtefactosElec("AETVLG55FHD","TV LG de 55pulg. UHD 4K Smart",1900.00,1);
        ropaYcalzado p3 = new ropaYcalzado("RCPAJDAS","Pantalon jean para dama, talla small",150.00,5);
        ropaYcalzado p4 = new ropaYcalzado("RCCAJHOcP","Casaca jean hombre con peluche",230.00,1);
        Muebles p5 = new Muebles("MUJCO6MACA","Juego de comedor 6 sillas, en Caoba",1600.00,0);
        Muebles p6 = new Muebles("MUMTV65ORG","Mesa de TV 65pulg. Con organizador",750.00,3);

        Empresa empresa = new Empresa();
        empresa.registrar(p1);
        empresa.registrar(p2);
        empresa.registrar(p3);
        empresa.registrar(p4);
        empresa.registrar(p5);
        empresa.registrar(p6);
        for (Productos p: empresa.getArregloProductos()) {
            System.out.println(p.toString());
        }
        ingresoMenuEjecutivo();
    }

    empresa.imprimirProductos();

        System.out.println("=============================================================\n" +
                "=============================================================");

        empresa.imprimirArtefactos();

        System.out.println("=============================================================\n" +
                "=============================================================");

        empresa.imprimirRopa();

        System.out.println("=============================================================\n" +
                "=============================================================");

        empresa.imprimirMuebles();
}




    public static void AgregarCliente() {
        Cliente objCliente = new Cliente();
        objCliente.setCodigoCliente("45124512");
        objCliente.setApellidos("PEREZ ZAPATA");
        objCliente.setNombres("ROSA MARIA");
        objCliente.setCorreo("marlenni@gmail.com");
        objCliente.setTelefono("9875487");
        objpedidos.AgregarCliente(objCliente);
        objpedidos.ListarClientes();
    }


    public  static  void menu(){
        System.out.println("*******************************");

        System.out.println("Ingresa la operacion que desea Realizar ");
        System.out.println("***** 1. Ingresa un nuevo pedido");
        System.out.println("***** 2. lista los Pedidos Aprovados");
        System.out.println("***** 3. lista los clientes registrados");

        Scanner sc= new Scanner(System.in);
        Pedidos ojbpedido1= new Pedidos();
        GestionPedidos objpedidos=new GestionPedidos();

        int rpta= sc.nextInt();

        try {
            switch (rpta){
                case 1:
                    System.out.println(" Ingrese codigo Cliente :");
                    ojbpedido1.setCodigoCliente(sc.nextLine());
                    System.out.println(" Ingrese Nombres Cliente :");
                    ojbpedido1.setNombres(sc.nextLine());
                    System.out.println(" Ingrese Apellidos Cliente :");
                    ojbpedido1.setApellidos(sc.nextLine());
                    System.out.println(" Ingrese MedioContacto Cliente :");
                    ojbpedido1.setMedioContacto(sc.nextLine());
                    System.out.println(" Ingrese Direccion Cliente :");
                    ojbpedido1.setDireccion(sc.nextLine());
                    System.out.println(" Ingrese Distrito Cliente :");
                    ojbpedido1.setDistrito(sc.nextLine());
                    System.out.println(" Ingrese Telefono Cliente :");
                    ojbpedido1.setTelefono(sc.nextLine());
                    System.out.println(" Ingrese Correo Cliente :");
                    ojbpedido1.setCorreo(sc.nextLine());
                    System.out.println(" Ingrese CodigoPedido Cliente :");
                    ojbpedido1.setCodigoCliente(sc.nextLine());
                    System.out.println(" Ingrese PedidoRealizado Cliente :");
                    ojbpedido1.setPedidosRealizado(sc.nextLine());
                    System.out.println(" Ingrese Estado  inicial del pedido  :");
                    ojbpedido1.setEstados(sc.nextLine());
                    objpedidos.AgregarCliente(ojbpedido1);
                    break;
                case 2:
                    objpedidos.ListarClientes();

                case 3:
                    objpedidos.ListarPedidos();

                default:
                    break;





            }

        } catch (Exception e){
            System.out.println("Ingrese un numero valido"+e);
        }






    }

}
