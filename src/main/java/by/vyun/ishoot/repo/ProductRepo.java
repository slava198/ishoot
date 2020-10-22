package by.vyun.ishoot.repo;

import by.vyun.ishoot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {
    Product getFirstById(Long id);

}
