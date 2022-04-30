package Pedidos;

public class ArtefactosElec extends Productos {

        public ArtefactosElec(String codigo, String nombreProd, double precio, int stock) {
            super(codigo, nombreProd, precio, stock);
        }

        @Override
        public String toString() {
            return "ArtefactosElec{} " + super.toString();
        }
    }






