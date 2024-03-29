package com.solvd.agency.business;

import com.solvd.agency.persons.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public final class Apartment{
    private final int idApartment;
    private Cities location;
    private Currency currency;
    private float price;
    private int numberRooms;
    private static int idCounter;
    private boolean available;
    private Person owner;
    private RentOrBuy rentOrBuy;

    private Apartment() {
        this.idApartment = ++Apartment.idCounter;
    }
    private static final Logger LOGGER = LogManager.getLogger(Agency.class);

    public Apartment(Person owner, Cities location, Currency currency, float price, int numberRooms, Boolean available, RentOrBuy rentOrBuy) {
        this();
        this.location = location;
        this.currency = currency;
        this.price = price;
        this.numberRooms = numberRooms;
        this.available = available;
        this.rentOrBuy = rentOrBuy;
        this.owner = owner;
    }

    public int getIdApartment() {
        return idApartment;
    }


    public Cities getLocation() {
        return location;
    }

    public void setLocation(Cities location) {
        this.location = location;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumberRooms() {
        return numberRooms;
    }

    public void setNumberRooms(int numberRooms) {
        this.numberRooms = numberRooms;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public RentOrBuy getRentOrBuy() {
        return rentOrBuy;
    }


    @Override
    public String toString() {
        return "Apartment{" +
                "idApartment=" + idApartment +
                ", location='" + location + '\'' +
                ", price=" + price +
                ", numberRooms=" + numberRooms +
                ", available=" + available +
                ", for rent or for buy=" + this.rentOrBuy +
                ", owner=" + owner.getFirstName() + " " + owner.getLastName() +
                ", owner contact=" + owner.getPhoneNumber() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apartment apartment = (Apartment) o;
        return idApartment == apartment.idApartment && Float.compare(apartment.price, price) == 0
                && numberRooms == apartment.numberRooms && available == apartment.available
                && location.equals(apartment.location) && owner.equals(apartment.owner)
                && rentOrBuy == apartment.rentOrBuy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idApartment, location, price, numberRooms, available, owner, rentOrBuy);
    }

}
