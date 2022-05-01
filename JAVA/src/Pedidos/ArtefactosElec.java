package Pedidos;

public class ArtefactosElec extends Productos {

    public ArtefactosElec(String codigo, String nombreProd, double precio) {
        super(codigo, nombreProd, precio);
    }

        @Override
        public String toString() {
            return "ArtefactosElec{} " + super.toString();
        }
    }






