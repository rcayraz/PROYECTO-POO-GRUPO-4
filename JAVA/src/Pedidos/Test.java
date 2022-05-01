package Pedidos;

public class Test {

    public static void main(String[] args) {



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



        objGestionPedidos.AsignarPedidoCliente("60267465","ped000160267465","PC GAMER","ingresado");

        System.out.println(objGestionPedidos.toString());








    }
}
