public class CuentaAhorro extends Account {

    private boolean active;

    public CuentaAhorro(float balance, float annualRate) {
        super(balance, annualRate);
        this.active = balance >= 10000;
    }

    @Override
    public void consign(float amount) {
        if (active) {
            super.consign(amount);
        } else {
            System.out.println("La cuenta está inactiva y no se puede realizar la consignación.");
        }
    }

    @Override
    public void withdraw(float amount) {
        if (active) {
            super.withdraw(amount);
            if (balance < 10000) {
                active = false;
            }
        } else {
            System.out.println("La cuenta está inactiva y no se puede realizar el retiro.");
        }
    }

    @Override
    public void monthlyStatement() {
        int extraWithdrawals = numberWithdrawals - 4;
        if (extraWithdrawals > 0) {
            monthlyCommission += extraWithdrawals * 1000;
        }
        super.monthlyStatement();
        active = balance >= 10000;
    }

    public void print() {
        System.out.println("Saldo: $" + balance);
        System.out.println("Comisión mensual: $" + monthlyCommission);
        System.out.println("Número de transacciones: " + (numberConsignments + numberWithdrawals));
        System.out.println("Estado: " + (active ? "Activa" : "Inactiva"));
    }
}
