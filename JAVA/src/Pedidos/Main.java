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
            case 2 : RegistroClientes();break;
            case 3 : AsignarPedidos();break;
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


    public static  void RegistroClientes(){
        GestionPedidos objGestionPedidos= new GestionPedidos();
        objGestionPedidos.RegistrarCliente("60267465","ROBERTO CARLOS","AYRA ZEVALLOS","FACEBOOK","AV LA MARINA 12","SAN MIGUEL","96545856","ayra.zevallos@mail.com");
        objGestionPedidos.RegistrarCliente("26656456","JUAN CARLOS","RAMIRES VARGAS","INSTRAGRAM","AV LA PAZ 1523","SAN MIGUEL","985656232","ramires.v@mail.com");
        objGestionPedidos.RegistrarCliente("546545646","GEANS","PEREZ GONZALES","WEB","AV JORGE CHAVEZ 564","JESUS MARIA","3232326","p.gonsales1@mail.com");
        objGestionPedidos.RegistrarCliente("54556323","MANUEL","ROMERO PILCO","LLAMADA TELEFONICA","AV LOS SAUCES 88 ","COMAS","46565656","elunico0001.sls@mail.com");
        objGestionPedidos.RegistrarCliente("2645789","JORGE","FALCON PEREZ","FACEBOOK","AV LOS POSTES 898","SJL","96545856","f.pss@mail.com");
        objGestionPedidos.RegistrarCliente("23145685","JOSE","HERRERA CASTILLO","CHAT APLICATIVO","JR VIRGEN MARIA 8989","RIMAC","656565989","herrrera.castillo@mail.com");
        objGestionPedidos.RegistrarCliente("6225874","MARIA","MANUEL RAMIREZ","INSTAGRAM","JR EL DIABLO 666","SJM","98989895","manuel.9898@mail.com");
        objGestionPedidos.RegistrarCliente("62597465","MIGUEL ","RODRIGUES BALTA","LLAMADA","JR JORGE MUÑOZ 6565","RIMAC","98756565","balta.989898@mail.com");
        objGestionPedidos.RegistrarCliente("26746552","SUSANA","QUIÑONES PEÑA","FACEBOOK","JR PEDRO CASTILLO 6565","CERCADO DE LIMA","96545856","q.suana@mail.com");
        objGestionPedidos.RegistrarCliente("264848565","PEDRO","CABELLERO FALCON","FACEBOOK","JR ALAN GARCIA 9898","RIMAC","5656556","caballero.falcon@mail.com");
        System.out.println(objGestionPedidos.toString());


    }

    public  static  void AsignarPedidos(){
        GestionPedidos objGestionPedidos= new GestionPedidos();
        objGestionPedidos.AsignarPedidoCliente("60267465","PED0001","PC GAMER","ingresado");
        objGestionPedidos.AsignarPedidoCliente("26656456","PED0002","PC ESCRITORIO","Aceptado");
        objGestionPedidos.AsignarPedidoCliente("54556323","PED0003","PANTALONES TALLA 30","Aceptado");
        objGestionPedidos.AsignarPedidoCliente("60267465","PED0004","SILLA GAMER","Aceptado");
        objGestionPedidos.AsignarPedidoCliente("26746552","PED005","ESCRITORIO DE OFICINA","Rechazado");
        System.out.println(objGestionPedidos.toString());
    }


    public static void AgregarProductos() {


        ArtefactosElec p1 = new ArtefactosElec("AECOMAG4QH", "Cocina a gas Mabe 4hornillas", 699.00);
        ArtefactosElec p2 = new ArtefactosElec("AETVLG55FHD", "TV LG de 55pulg. UHD 4K Smart", 1900.00);
        ropaYcalzado p3 = new ropaYcalzado("RCPAJDAS", "Pantalon jean para dama, talla small", 150.00);
        ropaYcalzado p4 = new ropaYcalzado("RCCAJHOcP", "Casaca jean hombre con peluche", 230.00);
        Muebles p5 = new Muebles("MUJCO6MACA", "Juego de comedor 6 sillas, en Caoba", 1600.00);
        Muebles p6 = new Muebles("MUMTV65ORG", "Mesa de TV 65pulg. Con organizador", 750.00);


        Empresa empresa = new Empresa();
        empresa.registrar(p1);
        empresa.registrar(p2);
        empresa.registrar(p3);
        empresa.registrar(p4);
        empresa.registrar(p5);
        empresa.registrar(p6);
        /*
        for (Productos p: empresa.getArregloProductos()) {
            System.out.println(p.toString());
        }*/

        ingresoMenuEjecutivo();


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
        //objpedidos.AgregarCliente(objCliente);
        //objpedidos.ListarClientes();
    }


}
