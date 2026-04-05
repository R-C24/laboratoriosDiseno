public class EnemigoJefe implements Enemigo {
    private String nombre;
    private String color;
    private int xInicial;
    private int yInicial;
    private RecursosJefe recursosJefe;

    public EnemigoJefe(String nombre, String color, int xInicial, int yInicial) {
        this.nombre = nombre;
        this.color = color;
        this.xInicial = xInicial;
        this.yInicial = yInicial;
        this.recursosJefe = new RecursosJefe();
        System.out.println("Enemigo " + nombre + " creado exitosamente.");
    }

    public EnemigoJefe clone(){
        try {
            EnemigoJefe clon = (EnemigoJefe) super.clone();
            return clon;
        } catch (CloneNotSupportedException e) {
            throw new InternalError("No se pudo crear el enemigo.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getxInicial() {
        return xInicial;
    }

    public void setxInicial(int xInicial) {
        this.xInicial = xInicial;
    }

    public int getyInicial() {
        return yInicial;
    }

    public void setyInicial(int yInicial) {
        this.yInicial = yInicial;
    }

    public void mostrar(){
        System.out.println("---------------"); //Para que sea más sencillo diferenciarlo en consola después
        System.out.println("Mostrando " + nombre + ":");
        System.out.println("Color: " + color);
        System.out.println("Posición inicial " + "(" + xInicial  + ", " + yInicial + ")");
        System.out.println("---------------");
    }
}
