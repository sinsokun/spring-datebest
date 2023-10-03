package co.istad.sb4webmvc.Service;

import co.istad.sb4webmvc.Dto.CreateProductDto;
import co.istad.sb4webmvc.Model.Product;

import java.util.List;

public interface ProductService {
//    void createNewProduct(CreateProductDto createProductDto);
//
//    void deleteProductById(Integer id);
//
//    void updateProductById(Integer id, Product product);

    List<Product> loadProducts();

   // Product loadProductById(Integer id);
}
