package be.mediasoft.example.provider;

import be.mediasoft.example.domain.Product;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * TaxProvider21PercImpl class. This class provides in an 21 percent
 *  implementation for the TaxProvider interface.
 */
@Component
public class TaxProvider21PercImpl implements TaxProvider {

    private static final BigDecimal PERC_21 = new BigDecimal("0.21");

    @Override
    public BigDecimal calculateTax(BigDecimal price) {
        return price.multiply(PERC_21);
    }

    @Override
    public BigDecimal addTax(BigDecimal price) {
        return price.add(calculateTax(price));
    }

}
