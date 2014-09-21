package be.mediasoft.example.services;

import be.mediasoft.example.domain.ProductDTO;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * CartService interface. This class defines all possibles actions
 *  regarding the cart.
 */
public interface CartService {

    /**
     * Add product to Cart.
     * @param cartUuid the uuid of the Cart
     * @param productUuid the uuid of the Product
     * @param quantity the quantity of products to add
     */
    @Transactional
    void addToCart(String cartUuid, String productUuid, Integer quantity);

}
