package be.mediasoft.example.domain;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class ProductDTOTest {

    private static final String ID = "deidiejdiojeiodjeidjeo";
    private static final String SHORT_CODE = "short_code";
    private static final String NAME = "name";
    private static final BigDecimal PRICE = new BigDecimal("22.50");

    private ProductDTO underTest;

    @Before
    public void setUp() throws Exception {
        underTest = new ProductDTO(ID, SHORT_CODE, NAME, PRICE);
    }

    @Test
    public void testSetId() throws Exception {
        assertEquals(ID, underTest.getId());

        String id = "other id";
        underTest.setId(id);
        assertEquals(id, underTest.getId());
    }

    @Test
    public void testSetShortCode() throws Exception {
        assertEquals(SHORT_CODE, underTest.getShortCode());

        String shortCode = "other shortCode";
        underTest.setShortCode(shortCode);
        assertEquals(shortCode, underTest.getShortCode());
    }

    @Test
    public void testSetName() throws Exception {
        assertEquals(NAME, underTest.getName());

        String name = "other name";
        underTest.setName(name);
        assertEquals(name, underTest.getName());
    }

    @Test
    public void testSetPrice() throws Exception {
        assertEquals("22.50", underTest.getPrice());

        String price = "10.00";
        underTest.setPrice(price);
        assertEquals(price, underTest.getPrice());
    }

}