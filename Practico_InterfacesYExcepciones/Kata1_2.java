package EjerciciosJava.Practico_InterfacesYExcepciones;


interface Pago {
    void procesarPago(double monto);
}


interface PagoConDescuento extends Pago {
    double aplicarDescuento(double porcentaje);
}


class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $" + monto + " procesado con tarjeta " + numeroTarjeta);
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        return porcentaje;
    }
}


class PayPal implements PagoConDescuento {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $" + monto + " procesado con PayPal (" + email + ")");
    }

    @Override
    public double aplicarDescuento(double porcentaje) {
        return porcentaje;
    }
}


public class Kata1_2 {
    public static void main(String[] args) {
        PagoConDescuento tarjeta = new TarjetaCredito("1234-5678-9012-3456");
        double monto1 = 1000;
        double descuento1 = tarjeta.aplicarDescuento(10);
        tarjeta.procesarPago(monto1 - (monto1 * descuento1 / 100));

        PagoConDescuento paypal = new PayPal("usuario@correo.com");
        double monto2 = 2000;
        double descuento2 = paypal.aplicarDescuento(15);
        paypal.procesarPago(monto2 - (monto2 * descuento2 / 100));
    }
}
