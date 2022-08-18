public class Main {
    public static void main(String[] args) {
        Cuenta cuenJulian = new Cuenta("123456", "Ahorro",15000);
        System.out.println("Saldo mínimo: "+cuenJulian.getSaldoMinimo());
        cuenJulian.consignar(80000);
        System.out.println("Saldo actual: "+cuenJulian.getSaldoActual());
        cuenJulian.retirar(150000);
        System.out.println("Saldo actual: "+cuenJulian.getSaldoActual());
        System.out.println(cuenJulian.toString());
        
        System.out.println("-----------------------------");

        Cuenta pedroCuenta = new Cuenta("57578188","prestamo",5000);
        System.out.println(pedroCuenta.toString());

    }
}
