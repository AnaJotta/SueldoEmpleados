import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String tipoEmpleados = JOptionPane.showInputDialog("Introduzca el tipo de empleado (repositor / cajero / supervisor):");

        Empleados empleado;

        if (tipoEmpleados.equalsIgnoreCase("repositor")) {
            empleado = new Repositor();
        } else if (tipoEmpleados.equalsIgnoreCase("cajero")) {
            empleado = new Cajero();
        } else if (tipoEmpleados.equalsIgnoreCase("supervisor")) {
            empleado = new Supervisor();
        } else {
            JOptionPane.showMessageDialog(null, "El tipo de empleado no es válido.");
            return;
        }

        double sueldoFinal = empleado.calcularSueldo();

        JOptionPane.showMessageDialog(null, "El sueldo del " + tipoEmpleados + " es: " + sueldoFinal);
    }
}
