package be.mediasoft.example.repository;

import be.mediasoft.example.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ProductRepository interface. This interface handles all data access
 *  to the hsql database Product records.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

    /**
     * Find Product by its id.
     * @param id the id to find
     * @return the found Product, or null if not found
     */
    Product findById(String id);

    /**
     * Find Product by its shortCode.
     * @param shortCode the shortCode to find
     * @return the found Product, or null if not found
     */
    Product findByShortCode(String shortCode);

}
