//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EnemigoJefe original = new EnemigoJefe("Primerísimo primer jefe", "Verde", 0, 0);
        original.mostrar();

        EnemigoJefe[] clones = new EnemigoJefe[5];
        for (int i = 0; i < 5; i++){
            clones[i] = original.clone();
            System.out.println("Clonando " + (i + 1));
            clones[i].mostrar();

        }

        clones[0].setNombre("Primerísimo primer jefe 2.0");
        clones[0].setColor("Amarillo");
        clones[0].setxInicial(1);
        clones[0].setyInicial(1);

        System.out.println(clones[0].getNombre() + " editado.");
        clones[0].mostrar();
        System.out.println("Revisamos que el original permanezca igual.");
        original.mostrar();
    }

}