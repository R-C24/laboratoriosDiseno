class Empleado {
    private String id;
    private String nombre;
    private boolean activo;
    private String pin;

    public Empleado(String id, String nombre, boolean activo, String pin) {
        this.id = id;
        this.nombre = nombre;
        this.activo = activo;
        this.pin = pin;
    }

    public boolean estaActivo() {
        return activo;
    }

    public String getPin() {
        return pin;
    }

    public String getNombre() {
        return nombre;
    }
}
