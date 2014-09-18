package be.mediasoft.example.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Product Entity class. This class represents a Product with
 *  attributes such as shortCode, name and price.
 */
@javax.persistence.Entity
@Table(name = "PRODUCT")
public class Product extends Entity {

    private static final long serialVersionUID = 1L;

    @Column(name = "SHORT_CODE")
    private String shortCode;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PRICE")
    private BigDecimal price;

    /**
     *
     * @return the shortCode
     */
    public String getShortCode() {
        return shortCode;
    }

    /**
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the price
     */
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + getId() + '\'' +
                ", shortCode='" + shortCode + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}
