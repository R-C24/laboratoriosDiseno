public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("2024101499", "Dayana Rojas Campos", true, "1234");

        System.out.println("Sistema de control de acceso. \n");

        System.out.println("- Acceso a oficina estándar");
        ControlAcceso oficina = new AccesoOficinaEstandar();
        oficina.ejecutarAcceso(empleado);

        System.out.println("- Acceso a Data Center");
        ControlAcceso dataCenter = new AccesoDataCenter();
        dataCenter.ejecutarAcceso(empleado);

        System.out.println("- Acceso a oficina (empleado inactivo)");
        Empleado empleadoInactivo = new Empleado("20143928", "José Jiménez", false, "0000");
        oficina.ejecutarAcceso(empleadoInactivo);
    }
}