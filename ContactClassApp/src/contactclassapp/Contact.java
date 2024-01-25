/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contactclassapp;

/**
 *
 * @author Administrator
 */
public class Contact {
   protected String firstName ,lastname,email ,address, phone ;

    public Contact() {
    }

    public Contact(String firstName, String lastname, String email, String address, String phone) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" + "firstName=" + firstName + ", lastname=" + lastname + ", email=" + email + ", address=" + address + ", phone=" + phone + '}';
    }
    
}
