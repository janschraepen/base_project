package be.mediasoft.example.services;

import be.mediasoft.example.domain.Product;
import be.mediasoft.example.domain.ProductDTO;
import be.mediasoft.example.provider.TaxProvider;
import be.mediasoft.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * ProductServiceImpl class. This class provides in an implementation
 *  for the ProductService interface.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private TaxProvider taxProvider;

    @Override
    public ProductDTO findProductById(String uuid) {
        Product p = productRepository.findById(uuid);
        return createDTO(p, false);
    }

    @Override
    public ProductDTO findProductByShortCode(String shortCode) {
        Product p = productRepository.findByShortCode(shortCode);
        return createDTO(p, false);
    }

    @Override
    public List<ProductDTO> findAllProducts() {
        List<ProductDTO> list = new ArrayList<ProductDTO>();

        List<Product> products = productRepository.findAll();
        for (Product p : products) {
            list.add(createDTO(p, true));
        }
        return list;
    }

    /**
     * Create ProductDTO out of a product, calculates
     * the price incl tax for the given product.
     * @param product the product
     * @param inclTax true if tax needs to be included in price, false if not
     * @return ProductDTO the product
     */
    ProductDTO createDTO(Product product, boolean inclTax) {
        return new ProductDTO(
                product.getId(),
                product.getShortCode(),
                product.getName(),
                inclTax ? taxProvider.addTax(product.getPrice()) : product.getPrice()
        );
    }

}
