public class Main {
    public static void main(String[] args) {
        CuentaCorriente cuenta = new CuentaCorriente(1000.0f, 0.05f);

        // Retirar
        cuenta.withdraw(1500.0f);

        // Consignar
        cuenta.consign(2000.0f);

        // Imprimir
        cuenta.print();

        CuentaAhorro cuentaAhorro = new CuentaAhorro(5000.0f, 0.05f);

        // Consignar
        cuentaAhorro.consign(2000.0f);

        // Retirar
        cuentaAhorro.withdraw(3000.0f);

        // Extracto mensual
        cuentaAhorro.monthlyStatement();

        // Imprimir
        cuentaAhorro.print();
    }
}