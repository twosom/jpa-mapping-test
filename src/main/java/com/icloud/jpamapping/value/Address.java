package com.icloud.jpamapping.value;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
@Access(AccessType.FIELD)
public class Address {


    private String zipCode;

    private String address1;

    private String address2;

    public Address(String zipCode, String address1, String address2) {
        this.zipCode = zipCode;
        this.address1 = address1;
        this.address2 = address2;
    }

    protected Address() {
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(getZipCode(), address.getZipCode()) && Objects.equals(getAddress1(), address.getAddress1()) && Objects.equals(getAddress2(), address.getAddress2());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getZipCode(), getAddress1(), getAddress2());
    }
}
