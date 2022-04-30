package Pedidos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        AgregarPedidos();
        System.out.println("se cargo los pedidos");
        menu();





    }

    public static  void AgregarPedidos(){


        GestionPedidos objpedidos=new GestionPedidos();
        Pedidos objpedido1= new Pedidos("60264162","Roberto","Ayra",
                "instagram","av rio 55","rimac","9785462","ayra.zevallos@mail.com",
                "PEDIDO60267465-1","PC GAMER","Ingresado");

        objpedidos.AgregarPedido(objpedido1);
        objpedidos.ListarClientes();

        objpedidos.ListarPedidos();

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
