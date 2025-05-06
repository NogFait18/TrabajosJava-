package EjerciciosJava.Practico_InterfacesYExcepciones;


class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}


class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para retirar $" + monto);
        }
        saldo -= monto;
    }

    public double getSaldo() {
        return saldo;
    }
}


public class Kata2_5 {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);

        try {
            cuenta.retirar(1200);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Saldo actual: $" + cuenta.getSaldo());
    }
}
