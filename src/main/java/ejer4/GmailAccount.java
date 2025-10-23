package ejer4;

public class GmailAccount implements EmailAble{
    private String emailAddress;
    private String nombre;

    public GmailAccount(String nombre, String mail) {
        this.nombre = nombre;
        this.emailAddress = mail;

    }

    @Override
    public String getEmailAddress() {
        return this.emailAddress;
    }
    public void setEmailAddress(String ea) {
        emailAddress = ea;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
