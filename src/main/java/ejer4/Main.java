package ejer4;

public class Main {
    public static void main(String[] args) {

        Contact contact = new Contact(
                "María García",
                "Avenida Libertad 456",
                "maria.garcia@email.com",
                "+34 600 987 654"
        );

        System.out.println("1. Usando Contact (implementa Emailable y SMSable):");
        EmailSender.sendEmail(contact, "Hola María!");
        SMSSender.sendSMS(contact, "SMS para María!");

        GmailAccount gmailAccount = new GmailAccount(
                "Carlos López",
                "carlos.lopez@gmail.com"
        );

        System.out.println("2. Usando GmailAccount (solo implementa Emailable):");
        EmailSender.sendEmail(gmailAccount, "Email a cuenta de Gmail!");

        System.out.println("3. Usando polimorfismo:");
        EmailAble[] emailables = {contact, gmailAccount};

        for (EmailAble e : emailables) {
            EmailSender.sendEmail(e, "Email masivo!");
        }


    }
}