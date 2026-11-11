public class CuentaCorriente extends CuentaBancaria{
    private double limiteSobregiro;
    public CuentaCorriente(String numeroCuenta, double saldo, String titular, double limiteSobregiro) {
        super(numeroCuenta, saldo, titular);
        this.limiteSobregiro = limiteSobregiro;
    }
    @Override
    public void extraer(double monto) {
        if (monto > 0 && monto <= saldo + limiteSobregiro) {
            saldo = saldo - monto;
            System.out.println("extraccion realizada correctamente");
        } else {
            System.out.println("limite de sobregiro excedido");
        }
    }
}
