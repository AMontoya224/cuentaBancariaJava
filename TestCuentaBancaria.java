public class TestCuentaBancaria {
    public static void main(String[] args) {
        // CUENTAS
        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria();

        //DEPOSITOS
        System.out.println ( "\n---- INICIO ----");
        System.out.println ( "Numero de cuenta: " + cuenta1.getNumeroCuenta() + "\nSaldo cuenta corriente: " + cuenta1.getSaldoCorriente() + "\nSaldo cuenta de ahorros: " + cuenta1.getSaldoAhorros());
        System.out.println ( "\nNumero de cuenta: " + cuenta2.getNumeroCuenta() + "\nSaldo cuenta corriente: " + cuenta2.getSaldoCorriente() + "\nSaldo cuenta de ahorros: " + cuenta2.getSaldoAhorros());
        cuenta1.depositar( 1500.20, 200.06);
        cuenta1.depositar( 10.0, 0);
        cuenta2.depositar( 850.50, 120.85);
        System.out.println ( "\n---- FINAL ----");
        System.out.println ( "Numero de cuenta: " + cuenta1.getNumeroCuenta() + "\nSaldo cuenta corriente: " + cuenta1.getSaldoCorriente() + "\nSaldo cuenta de ahorros: " + cuenta1.getSaldoAhorros());
        System.out.println ( "\nNumero de cuenta: " + cuenta2.getNumeroCuenta() + "\nSaldo cuenta corriente: " + cuenta2.getSaldoCorriente() + "\nSaldo cuenta de ahorros: " + cuenta2.getSaldoAhorros());
        
        //RETIROS
        System.out.println ( "\n---- INICIO ----");
        System.out.println ( "Numero de cuenta: " + cuenta1.getNumeroCuenta() + "\nSaldo cuenta corriente: " + cuenta1.getSaldoCorriente() + "\nSaldo cuenta de ahorros: " + cuenta1.getSaldoAhorros());
        System.out.println ( "\nNumero de cuenta: " + cuenta2.getNumeroCuenta() + "\nSaldo cuenta corriente: " + cuenta2.getSaldoCorriente() + "\nSaldo cuenta de ahorros: " + cuenta2.getSaldoAhorros());
        cuenta1.retirar(852.5, 0);
        cuenta2.retirar(0, 20);
        cuenta2.retirar(1000, 20);
        System.out.println ( "\n---- FINAL ----");
        System.out.println ( "Numero de cuenta: " + cuenta1.getNumeroCuenta() + "\nSaldo cuenta corriente: " + cuenta1.getSaldoCorriente() + "\nSaldo cuenta de ahorros: " + cuenta1.getSaldoAhorros());
        System.out.println ( "\nNumero de cuenta: " + cuenta2.getNumeroCuenta() + "\nSaldo cuenta corriente: " + cuenta2.getSaldoCorriente() + "\nSaldo cuenta de ahorros: " + cuenta2.getSaldoAhorros());

        //VER SALDO
        cuenta1.getDineroTotal();

    }
}
