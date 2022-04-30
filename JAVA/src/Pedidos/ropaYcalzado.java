package Pedidos;
// se agrego el codigo de Abel

public class ropaYcalzado extends Productos {
        public ropaYcalzado(String codigo, String nombreProd, double precio, int stock) {
            super(codigo, nombreProd, precio, stock);
        }

        @Override
        public String toString() {
            return "ropaYcalzado{} " + super.toString();
        }
 }

