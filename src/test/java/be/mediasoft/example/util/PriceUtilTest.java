package be.mediasoft.example.util;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PriceUtilTest {

    @Test
    public void testFormat() throws Exception {
        String result = PriceUtil.format(new BigDecimal("12.49999"));
        assertNotNull(result);
        assertEquals("12.50", result);
    }

}