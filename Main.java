public class Main {
    public static void main(String[] args) {
        CajaAhorro caja = new CajaAhorro("1001", 100000, "juan", 3);
        CuentaCorriente corriente = new CuentaCorriente("2001", 50000, "pedro", 20000);
        System.out.println("---- caja de ahorro ---");
        caja.depositar(10000);
        caja.extraer(15000);
        caja.aplicarInteres();
        caja.mostrarInformacion();
        System.out.println();
        System.out.println("--- cuenta corriente ---");
        corriente.depositar(6000);
        corriente.extraer(35000);
        corriente.mostrarInformacion();
    }
}