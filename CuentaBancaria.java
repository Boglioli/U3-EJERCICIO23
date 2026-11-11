public class CuentaBancaria {
    protected String numeroCuenta;
    protected double saldo;
    protected String titular;
    public CuentaBancaria(String numeroCuenta, double saldo, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }
    public void depositar(double monto) {
        if (monto > 0) {
            saldo = saldo + monto;
            System.out.println("deposito realizado correctamente");
        }
    }
    public void extraer(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo = saldo - monto;
            System.out.println("extraccion realizada correctamente");
        } else {
            System.out.println("saldo insuficiente");
        }
    }
    public void mostrarInformacion() {
        System.out.println("numero de cuenta: " + numeroCuenta);
        System.out.println("titular: " + titular);
        System.out.println("saldo: " + saldo);
    }
}
