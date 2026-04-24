public class Main {
    public static void main(String[] args) {

        Archivo archivo1 = new Archivo("foto.jpg", 100);
        Archivo archivo2 = new Archivo("video.mp4", 500);
        Archivo archivo3 = new Archivo("documento.pdf", 50);

        Folder subfolder = new Folder("subcarpeta");
        subfolder.agregarComponente(archivo2);
        subfolder.agregarComponente(archivo3);

        Folder root = new Folder("raiz");
        root.agregarComponente(archivo1);
        root.agregarComponente(subfolder);

        System.out.println("Tamaño total de 'raiz': " + root.getTam() + " KB");
        System.out.println("Tamaño de 'subcarpeta': " + subfolder.getTam() + " KB");
    }
}