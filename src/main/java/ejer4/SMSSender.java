package ejer4;

public class SMSSender {
    public static void sendSMS(TelephoneAble e, String message) {
        System.out.println("Teléfono: " + e.getTelephone());
        System.out.println("Mensaje: " + message);
        System.out.println("SMS enviado exitosamente!\n");
    }
    }

