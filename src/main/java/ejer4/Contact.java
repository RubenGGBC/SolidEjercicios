package ejer4;

public class Contact implements EmailAble, TelephoneAble{
    String name, address, emailAddress, telephone;

    public Contact(String nombre, String direccion, String mail, String tel) {
        name = nombre;
        address = direccion;
        emailAddress = mail;
        telephone = tel;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String a) {
        address = a;
    }

    public String getAddress() {
        return address;
    }

    public void setEmailAddress(String ea) {
        emailAddress = ea;
    }
    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setTelephone(String t) {
        telephone = t;
    }
    @Override
    public String getTelephone() {
        return telephone;
    }
}