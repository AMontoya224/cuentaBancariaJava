import java.util.Random;

public class CuentaBancaria{
    private String numeroCuenta;
    private double saldoCorriente = 0;
    private double saldoAhorros = 0;
    private static int cantidadCuentas = 0;
    private static double[] dineroTotal = {0, 0};

    public CuentaBancaria() {
        numeroCuenta = generateNumeroCuenta();
        cantidadCuentas++;
    }

    private String generateNumeroCuenta(){
        String cuenta = "";
        Random random = new Random();
        for( int i=0; i<4; i++ ){
            int digito = random.nextInt(8999); 
            digito += 1000;
            if( i == 3 ){
                cuenta += digito;
            }
            else{
                cuenta += digito + "-";
            }
        }
        return cuenta;
    }

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public double getSaldoCorriente() {
        return this.saldoCorriente;
    }

    public double getSaldoAhorros() {
        return this.saldoAhorros;
    }

    public void depositar( double saldoCorriente, double saldoAhorros) {
        this.saldoCorriente += saldoCorriente;
        this.saldoAhorros += saldoAhorros;
        dineroTotal[0] += saldoCorriente;
        dineroTotal[1] += saldoAhorros;
    }

    public void retirar( double saldoCorriente, double saldoAhorros) {
        if( this.saldoCorriente > saldoCorriente ){
            this.saldoCorriente -= saldoCorriente;
            dineroTotal[0] -= saldoCorriente;
        }
        if( this.saldoAhorros > saldoAhorros ){
            this.saldoAhorros -= saldoAhorros;
            dineroTotal[1] -= saldoAhorros;
        }
    }

    public void getDineroTotal() {
        System.out.println ( "\nEl numero de cuentas es: " + cantidadCuentas );
        System.out.println ( "El saldo total de las cuentas corrientes es: $" + dineroTotal[0] );
        System.out.println ( "El saldo total de las cuentas de ahorro es: $" + dineroTotal[1] + "\n" );
    }

}