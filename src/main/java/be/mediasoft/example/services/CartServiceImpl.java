package be.mediasoft.example.services;

import be.mediasoft.example.provider.TaxProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CartServiceImpl class. This class provides in an implementation
 *  for the CartService interface.
 */
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private TaxProvider taxProvider;

    @Override
    public void addToCart(String cartUuid, String productUuid, Integer quantity) {
        // TODO implement..
    }

}
