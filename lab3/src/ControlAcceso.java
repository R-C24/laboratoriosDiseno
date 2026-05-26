abstract class ControlAcceso {
    public final void ejecutarAcceso(Empleado empleado) {
        if (!leerTarjeta()) {
            System.out.println("No se pudo leer la tarjeta RFID");
            return;
        }
        System.out.println("Tarjeta leída correctamente");

        boolean accesoPermitido = validarPermisos(empleado);

        registrarIntento(accesoPermitido);

        if (accesoPermitido) {
            enviarPulsoElectrico();
            System.out.println("Acceso concedido\n");
        } else {
            System.out.println("Acceso denegado\n");
        }
    }

    private boolean leerTarjeta() {
        return true;
    }

    private void registrarIntento(boolean exitoso) {
        System.out.println("Intento de acceso registrado: " + (exitoso ? "exitoso" : "fallido"));
    }

    private void enviarPulsoElectrico() {
        System.out.println("Pulso eléctrico enviado al cerrojo");
    }

    protected abstract boolean validarPermisos(Empleado empleado);
}
