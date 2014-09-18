package be.mediasoft.example.services;

import be.mediasoft.example.domain.ProductDTO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * ProductService interface. This class defines all possibles actions
 *  regarding the Products.
 */
public interface ProductService {

    /**
     * Find a Product by its uuid.
     * @param uuid the uuid to find
     * @return the found Product, or null if not found
     */
    @Transactional(readOnly = true)
    ProductDTO findProductById(String uuid);

    /**
     * Find a Product by its shortCode.
     * @param shortCode the shortCode to find
     * @return the found Product, or null if not found
     */
    @Transactional(readOnly = true)
    ProductDTO findProductByShortCode(String shortCode);

    /**
     * Find all Products.
     * @return a List of all Products
     */
    @Transactional(readOnly = true)
    List<ProductDTO> findAllProducts();

}
