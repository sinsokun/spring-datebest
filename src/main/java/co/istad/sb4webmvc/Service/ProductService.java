package co.istad.sb4webmvc.Service;

import co.istad.sb4webmvc.Model.Product;

import java.util.List;

public interface ProductService {
    void createNewProduct(Product product);

    void deleteProductById(Integer id);

    void updateProductById(Integer id, Product product);

    List<Product> loadProducts();

    Product loadProductById(Integer id);
}
