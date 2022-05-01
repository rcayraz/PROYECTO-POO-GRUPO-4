package Pedidos;
import java.util.ArrayList;
import java.util.List;


public class Empresa {
    private List<Productos> arregloProductos;
    private List<Productos> arregloArtElectricos;
    private List<Productos> arregloRopaycalzado;
    private List<Productos> arregloMuebles;

    public Empresa() {
        this.arregloProductos = new ArrayList<>();

        this.arregloArtElectricos = new ArrayList<>();

        this.arregloRopaycalzado = new ArrayList<>();

        this.arregloMuebles = new ArrayList<>();
    }

    public void registrar(Productos productos) {
        arregloProductos.add(productos);
    }

    public List<Productos> getArregloProductos() { return arregloProductos; }

    public List<Productos> getArregloArtElectricos() { return  arregloArtElectricos; }

    public List<Productos> getArregloRopaycalzado() { return  arregloArtElectricos; }

    public List<Productos> getArregloMuebles() { return  arregloMuebles; }



    public void imprimirProductos() {
        for (Productos p: arregloProductos) {
            System.out.println(p);
        }
    }

    public void imprimirArtefactos() {
        System.out.println("Artefactos Eléctricos");
        for (Productos p: arregloProductos) {
            if (p.getTipoProducto() == "Artefactos") {
                System.out.println(p);
            }
        }
    }

    public void imprimirRopa() {
        System.out.println("Ropa y Calzado");
        for (Productos p: arregloProductos) {
            if (p.getTipoProducto() == "Ropa") {
                System.out.println(p);
            }
        }
    }

    public void imprimirMuebles() {
        System.out.println("Muebles");
        for (Productos p: arregloProductos) {
            if (p.getTipoProducto() == "Muebles") {
                System.out.println(p);
            }
        }
    }

}
