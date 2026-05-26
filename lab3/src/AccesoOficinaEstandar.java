class AccesoOficinaEstandar extends ControlAcceso {
    @Override
    protected boolean validarPermisos(Empleado empleado) {
        System.out.println("[VALIDACIÓN OFICINA] Verificando empleado activo...");
        return empleado.estaActivo();
    }
}