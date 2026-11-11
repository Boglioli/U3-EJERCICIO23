public class CajaAhorro extends CuentaBancaria{
    private double interesMensual;
    public CajaAhorro(String numeroCuenta, double saldo, String titular, double interesMensual) {
        super(numeroCuenta, saldo, titular);
        this.interesMensual = interesMensual;
    }
    public void aplicarInteres() {
        saldo = saldo + saldo * interesMensual / 100;
        System.out.println("interes aplicado correctamente");
    }
}
