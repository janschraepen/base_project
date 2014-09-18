package be.mediasoft.example.provider;

import be.mediasoft.example.domain.Product;

import java.math.BigDecimal;

/**
 * TaxProvider interface class. This interface describes the methods
 * to use for calculating the tax.
 */
public interface TaxProvider {

    /**
     * Calculates the tax for a given price.
     * @param price the price
     * @return BigDecimal the tax
     */
    BigDecimal calculateTax(BigDecimal price);

    /**
     * Calculates the price (incl tax) for a given price.
     * @param price the price
     * @return BigDecimal the price (incl tax)
     */
    BigDecimal addTax(BigDecimal price);

}
