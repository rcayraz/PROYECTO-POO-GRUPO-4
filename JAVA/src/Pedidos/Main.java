package Pedidos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Productos> arregloProductos;

    public Main() {
        this.arregloProductos = new ArrayList<>();
    }

    public static void imprimirProductos() {
        for (Productos p: arregloProductos) {
            System.out.println(p);
        }
    }

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
        System.out.println("[1] Registro de Productos");
        System.out.println("[2] Reporte de Clientes");
        System.out.println("[3] Reporte Ventas");
        System.out.println("[4] Cerrar Sesión");
        System.out.println("Seleccione una opción: ");
        Scanner scan = new Scanner(System.in);
        int seleccionMenu = scan.nextInt();
        switch (seleccionMenu) {
            case 1 : AgregarProductos(); break;
            case 2 : reporteClientes();break;
            case 3 : ReporteVentas();break;
            case 4 : menuLogin(); break;
            default: System.out.println("Seleccionar una opción correcta");break;
        }
    }


    public static void  ingresoMenuEjecutivo(){
        System.out.println(""); System.out.println("");
        System.out.println("==========================================================");
        System.out.println("Menú de Ventas");
        System.out.println("==========================================================");
        System.out.println("[1] Reporte de Clientes");
        System.out.println("[2] Pedidos");
        System.out.println("[3] Cerrar Sesión");

        System.out.println("Seleccione una opción: ");
        Scanner scan = new Scanner(System.in);
        int seleccionMenu = scan.nextInt();
        switch (seleccionMenu) {
            case 1 : RegistroClientes();break;
            case 2 : AsignarPedidos(); break;
            //case 2 : ReportePedidos(); break;
            case 3: menuLogin(); break;


            default: System.out.println("Seleccionar una opción correcta");break;
        }
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


        System.out.println("Clientes Registrados");
        AsignarPedidos();
        System.out.println("Pedidos Asignados a los clientes");

        ingresoMenuEjecutivo();
    }


    public static void reporteClientes() {
        System.out.println("=".repeat(150));
        System.out.println("\t\t\t\t LISTA DE CLIENTES" );
        System.out.println("=".repeat(150));
        System.out.println("-".repeat(150));
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|%-20s|%-20s|\n","DNI: ", "Nombres","Apellidos", "MedioContacto", "Direccion", "Distrito","Telefono");
        System.out.println("-".repeat(150));

        //objpedidos.ListarClientes();
        RegistroClientes();
        ingresoMenuAdministrador();
    }

    public static void ReportePedidos() {
        System.out.println("=".repeat(85));
        System.out.println("\t\t\t\t LISTA DE PEDIDOS INGRESADOS POR CLIENTE" );
        System.out.println("=".repeat(80));
        System.out.println("-".repeat(85));
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|\n","DNI: ", "Codigo Pedido","Pedido Solicitado", "Estado de Solicitud");
        System.out.println("-".repeat(85));

        //objpedidos.ListarClientes();
        AsignarPedidos();
        ingresoMenuEjecutivo();

    }

    public static void ReporteVentas() {

        System.out.println("=".repeat(100));
        System.out.println("\t\t\t\t REPORTE VENTAS" );
        System.out.println("=".repeat(100));
        System.out.println("-".repeat(100));
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|\n","Codigo de Ventas: ", "Fecha","Precio Producto","Precio FInal");
        System.out.println("-".repeat(100));

        ingresarVentas();

        ingresoMenuAdministrador();}


        public static  void ingresarVentas(){
        Ventas obVentas = new Ventas("PED0001","Cocina a gas Mabe 4hornillas","Vendido","V000123","02-02-2022",2,699.1,705.1);
        Ventas obVentas1 = new Ventas("PED0002","V LG de 55pulg. UHD 4K Smar","Vendido","V000124","02-05-2022",1,1900.00,1905.00);
        Ventas obVentas2 = new Ventas("PED0003","Casaca jean hombre con peluches","Vendido","V000125","02-08-2022",2,230.00,235.00);

            System.out.println(obVentas);
            System.out.println(obVentas1);
            System.out.println(obVentas2);


        }



    public  static  void AsignarPedidos(){
        GestionPedidos objGestionPedidos= new GestionPedidos();
        objGestionPedidos.AsignarPedidoCliente("60267465","PED0001","PC GAMER","ingresado");
        objGestionPedidos.AsignarPedidoCliente("26656456","PED0002","Cocina a gas Mabe 4hornillas","Aceptado");
        objGestionPedidos.AsignarPedidoCliente("54556323","PED0003","TV LG de 55pulg. UHD 4K Smar","Aceptado");
        objGestionPedidos.AsignarPedidoCliente("60267465","PED0004","Casaca jean hombre con peluche","Aceptado");
        objGestionPedidos.AsignarPedidoCliente("26746552","PED005","ESCRITORIO DE OFICINA","Rechazado");
        System.out.println(objGestionPedidos.toString());
        System.out.println("Pedidos Asignados");
        ingresoMenuEjecutivo();
    }


    public static void AgregarProductos() {
        ArtefactosElec a1 = new ArtefactosElec("AECOMAG4QH", "Cocina a gas Mabe 4hornillas", 699.00,"Artefactos");
        ArtefactosElec a2 = new ArtefactosElec("AETVLG55FHD", "TV LG de 55pulg. UHD 4K Smart", 1900.00,"Artefactos");
        ropaYcalzado r1 = new ropaYcalzado("RCPAJDAS", "Pantalon jean para dama, talla small", 150.00,"Ropa");
        ropaYcalzado r2 = new ropaYcalzado("RCCAJHOcP", "Casaca jean hombre con peluche", 230.00,"Ropa");
        Muebles m1 = new Muebles("MUJCO6MACA", "Juego de comedor 6 sillas, en Caoba", 1600.00,"Muebles");
        Muebles m2 = new Muebles("MUMTV65ORG", "Mesa de TV 65pulg. Con organizador", 750.00,"Muebles");


        Empresa empresa = new Empresa();
        empresa.registrar(a1);
        empresa.registrar(a2);
        empresa.registrar(r1);
        empresa.registrar(r2);
        empresa.registrar(m1);
        empresa.registrar(m2);

        System.out.println(empresa.getArregloProductos().toString());
        /*
        for (Productos p: empresa.getArregloProductos()) {
            System.out.println(p.toString());
        }*/
        System.out.println("***********************************");
        System.out.println("Productos Registrados");

        ingresoMenuAdministrador();


    }




}
