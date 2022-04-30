package Pedidos;
import java.util.ArrayList;
import java.util.List;



    public class Empresa {
        private List<Productos> arregloProductos;

        public Empresa() {
            this.arregloProductos = new ArrayList<>();
        }

        public void registrar(Productos productos) {
            arregloProductos.add(productos);
        }

        public List<Productos> getArregloProductos() {
            return arregloProductos;
        }
    }



