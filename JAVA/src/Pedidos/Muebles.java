package Pedidos;
//se agrego codigo de abel

public class Muebles extends Productos {

    public Muebles(String codigo, String nombreProd, double precio) {
        super(codigo, nombreProd, precio);
    }

        @Override
        public String toString() {
            return "Muebles{} " + super.toString();
        }
}
