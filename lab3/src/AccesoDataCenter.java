class AccesoDataCenter extends ControlAcceso {
    @Override
    protected boolean validarPermisos(Empleado empleado) {
        System.out.println("[VALIDACIÓN DATA CENTER] Iniciando verificación estricta...");

        if (!empleado.estaActivo()) {
            System.out.println("[DATA CENTER] Empleado no activo");
            return false;
        }

        if (!validarPIN(empleado.getPin())) {
            System.out.println("[DATA CENTER] PIN incorrecto");
            return false;
        }

        if (!validarBiometrico()) {
            System.out.println("[DATA CENTER] Biometría fallida");
            return false;
        }

        System.out.println("[DATA CENTER] Todas las validaciones superadas");
        return true;
    }

    private boolean validarPIN(String pinEsperado) {
        String pinIngresado = "1234";
        System.out.println("[DATA CENTER] Verificando PIN...");
        return pinEsperado.equals(pinIngresado);
    }

    private boolean validarBiometrico() {
        System.out.println("[DATA CENTER] Escaneo biométrico...");
        return true;
    }
}