package be.mediasoft.example.web.controller;

import be.mediasoft.example.domain.ProductDTO;
import be.mediasoft.example.services.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class ProductControllerTest {

    @Mock
    private ProductService mockedProductService;

    @InjectMocks
    private ProductController underTest = new ProductController();

    @Test
    public void testList() throws Exception {
        Mockito.when(mockedProductService.findAllProducts()).thenReturn(Arrays.asList(new ProductDTO[] {}));

        ModelAndView mv = underTest.list();
        assertNotNull(mv);
        assertNotNull(mv.getModel());
        assertEquals("Lijst met producten", mv.getModel().get("title"));
        assertNotNull(mv.getModel().get("products"));
        assertEquals("list", mv.getViewName());
    }

    @Test
    public void testDetail() throws Exception {
        ProductDTO dto = new ProductDTO("id", "shortCode", "name", new BigDecimal("10.00"));
        Mockito.when(mockedProductService.findProductById(Mockito.anyString())).thenReturn(dto);

        ModelAndView mv = underTest.detail("id");
        assertNotNull(mv);
        assertNotNull(mv.getModel());
        assertNotNull(mv.getModel().get("product"));
        assertEquals("detail", mv.getViewName());
    }
}