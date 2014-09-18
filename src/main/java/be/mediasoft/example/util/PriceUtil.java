package be.mediasoft.example.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * PriceUtil class. Used for utilities regarding the price.
 */
public final class PriceUtil {

    public static final DecimalFormat PRICE_FORMATTER = new DecimalFormat("##.00");

    /**
     * private constructor. no instance allowed.
     */
    private PriceUtil() {

    }

    /**
     * format price as '#.00'.
     * @param price the price to format
     * @return String the formatted price
     */
    public static String format(BigDecimal price) {
        return PRICE_FORMATTER.format(price);
    }

}
