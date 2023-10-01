package co.istad.sb4webmvc.Service;

import co.istad.sb4webmvc.Model.Product;
import co.istad.sb4webmvc.repossitory.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class productServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public void createNewProduct(Product product) {

    }

    @Override
    public void deleteProductById(Integer id) {

    }

    @Override
    public void updateProductById(Integer id, Product product) {

    }

    @Override
    public List<Product> loadProducts() {

        return productRepository.selectProducts();
    }

    @Override
    public Product loadProductById(Integer id) {
        return productRepository.selectProductById(id).orElseThrow();
    }
}
