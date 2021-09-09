package frs_upgrad;

public class Passenger {
    private static int idCounter;
    private int id;

    private static class Address {
        String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    private Address address;

    private static class Contact {
        String name, phone, email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }
    private Contact contact;

    static {
        idCounter = 0;
    }

    //constructor
    public Passenger(String addressStreet, String addressCity,
                     String addressState, String contactName, String contactPhone,
                     String contactEmail) {
        this.id = ++idCounter;
        this.address = new Address(addressStreet, addressCity, addressState);
        this.contact = new Contact(contactName, contactPhone, contactEmail);
    }

    //getters and setters
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }


}
