package be.mediasoft.example.provider;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TaxProvider21PercImplTest {

    private TaxProvider underTest;

    @Before
    public void setUp() throws Exception {
        underTest = new TaxProvider21PercImpl();
    }

    @Test
    public void testCalculateTax() throws Exception {
        BigDecimal price = new BigDecimal("100.00");
        BigDecimal result = underTest.calculateTax(price);
        assertNotNull(result);
        assertEquals(new BigDecimal("21.0000"), result);
    }

    @Test
    public void testAddTax() throws Exception {
        BigDecimal price = new BigDecimal("100.00");
        BigDecimal result = underTest.addTax(price);
        assertNotNull(result);
        assertEquals(new BigDecimal("121.0000"), result);
    }

}