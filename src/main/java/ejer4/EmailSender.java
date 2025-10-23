package ejer4;

public class EmailSender {
    public static void sendEmail(EmailAble e, String message) {
        System.out.println("Email: " + e.getEmailAddress());
        System.out.println("Mensaje: " + message);
        System.out.println("Email enviado exitosamente!\n");


    }
}
