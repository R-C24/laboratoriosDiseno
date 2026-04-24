import java.util.ArrayList;
import java.util.List;

public class Folder implements ArchivoComponent {
    private String nombre;
    private List<ArchivoComponent> hijos = new ArrayList<>();

    public Folder(String nombre) {
        this.nombre = nombre;
    }

    public void agregarComponente(ArchivoComponent componente) {
        hijos.add(componente);
    }

    @Override
    public int getTam() {
        int total = 0;
        for (ArchivoComponent hijo : hijos) {
            total += hijo.getTam();
        }
        return total;
    }

    public String getNombre() {
        return nombre;
    }
}
