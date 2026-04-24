public class Archivo implements ArchivoComponent {
    private String nombre;
    private int tam;

    public Archivo(String nombre, int tam) {
        this.nombre = nombre;
        this.tam = tam;
    }

    @Override
    public int getTam() {
        return tam;
    }

    public String getNombre() {
        return nombre;
    }
}
