package com.icloud.jpamapping.value;

import javax.persistence.*;
import java.util.Objects;

@Embeddable
public class ShippingInfo {

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "zipCode",
                    column = @Column(name = "shipping_zipcode")),
            @AttributeOverride(name = "address1",
                    column = @Column(name = "shiping_addr1")),
            @AttributeOverride(name = "address2",
                    column = @Column(name = "shipping_addr2"))
    })
    private Address address;

    public ShippingInfo(Address address) {
        this.address = address;
    }

    protected ShippingInfo() {
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShippingInfo that = (ShippingInfo) o;
        return Objects.equals(getAddress(), that.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAddress());
    }
}
