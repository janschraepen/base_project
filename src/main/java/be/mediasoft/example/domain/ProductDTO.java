package be.mediasoft.example.domain;

import be.mediasoft.example.util.PriceUtil;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Product Data Transfer Object. Used for transferring data
 * throughout the layers.
 */
public class ProductDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String shortCode;

    private String name;

    private String price;

    /**
     * Instantiates a new ProductDTO.
     * @param id the uuid
     * @param shortCode the shortCode
     * @param name the name
     * @param price the price
     */
    public ProductDTO(String id, String shortCode, String name, BigDecimal price) {
        this.id = id;
        this.shortCode = shortCode;
        this.name = name;
        this.price = PriceUtil.format(price);
    }

    /**
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return the shortCode
     */
    public String getShortCode() {
        return shortCode;
    }

    /**
     *
     * @param shortCode the shortCode to set
     */
    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
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
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     *
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

}
