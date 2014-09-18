package be.mediasoft.example.services;

import be.mediasoft.example.domain.Product;
import be.mediasoft.example.domain.ProductDTO;
import be.mediasoft.example.provider.TaxProvider;
import be.mediasoft.example.repository.ProductRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceImplTest {

    @Mock
    private ProductRepository mockedProductRepository;

    @Mock
    private TaxProvider mockedTaxProvider;

    @InjectMocks
    private ProductService underTest = new ProductServiceImpl();

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testFindProductById() throws Exception {
        Product product = new TestProduct();

        Mockito.when(mockedProductRepository.findById("1")).thenReturn(product);

        ProductDTO dto = underTest.findProductById("1");
        assertNotNull(dto);
        assertEquals("shortCode", dto.getShortCode());
        assertEquals("name", dto.getName());
        assertEquals("12.50", dto.getPrice());
    }

    @Test
    public void testFindProductByShortCode() throws Exception {
        Product product = new TestProduct();

        Mockito.when(mockedProductRepository.findByShortCode("code")).thenReturn(product);

        ProductDTO dto = underTest.findProductByShortCode("code");
        assertNotNull(dto);
        assertEquals("shortCode", dto.getShortCode());
        assertEquals("name", dto.getName());
        assertEquals("12.50", dto.getPrice());
    }

    @Test
    public void testFindAllProducts() throws Exception {
        Product product = new TestProduct();

        Mockito.when(mockedProductRepository.findAll()).thenReturn(Arrays.asList(product));
        Mockito.when(mockedTaxProvider.addTax((BigDecimal) Mockito.anyObject())).thenReturn(new BigDecimal("100.00"));

        List<ProductDTO> list = underTest.findAllProducts();
        assertNotNull(list);
        assertEquals(1, list.size());

        ProductDTO dto = list.get(0);
        assertEquals("shortCode", dto.getShortCode());
        assertEquals("name", dto.getName());
        assertEquals("100.00", dto.getPrice());
    }

    private class TestProduct extends Product {

        @Override
        public String getShortCode() {
            return "shortCode";
        }

        @Override
        public String getName() {
            return "name";
        }

        @Override
        public BigDecimal getPrice() {
            return new BigDecimal("12.50");
        }

    }

}