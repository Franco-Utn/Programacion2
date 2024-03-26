public class CuentaCorriente extends Account{
    private float overdraft;

    public CuentaCorriente(float balance, float annualRate) {
        super(balance, annualRate);
        this.overdraft = 0;
    }
    @Override
    public void withdraw(float amount) {
        float newBalance = balance - amount;
        if (newBalance >= 0) {
            // Retiro normal
            balance -= amount;
            numberWithdrawals++;
        } else {
            // Retiro con sobregiro
            float overdraftAmount = Math.abs(newBalance);
            if (overdraftAmount <= overdraft) {
                // Se cubre el retiro con el sobregiro
                balance = 0;
                overdraft -= overdraftAmount;
                numberWithdrawals++;
            } else {
                // No se puede cubrir el retiro completo
                System.out.println("La cantidad a retirar excede el saldo y el sobregiro disponible.");
            }
        }
    }
    @Override
    public void consign(float amount) {
        super.consign(amount);
        if (overdraft > 0) {
            // Reducir el sobregiro si hay
            float amountToReduceOverdraft = Math.min(amount, overdraft);
            overdraft -= amountToReduceOverdraft;
        }
    }
    public void print() {
        System.out.println("Saldo: $" + balance);
        System.out.println("Comisión mensual: $" + monthlyCommission);
        System.out.println("Número de transacciones: " + (numberConsignments + numberWithdrawals));
        System.out.println("Valor de sobregiro: $" + overdraft);
    }
}
