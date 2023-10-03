package co.istad.sb4webmvc.Service;

import co.istad.sb4webmvc.Dto.CreateProductDto;
import co.istad.sb4webmvc.Model.Category;
import co.istad.sb4webmvc.Model.Product;
import co.istad.sb4webmvc.Model.Supplier;
import co.istad.sb4webmvc.Util.SlugUtil;
import co.istad.sb4webmvc.repossitory.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class productServiceImpl implements ProductService {

    private final ProductRepository productRepository;

//    @Override
//    public void createNewProduct(CreateProductDto createProductDto) {
//        //Map dto to pojo
//        Product product = Product.builder()
//                .name(createProductDto.name())
//                .slug(SlugUtil.toSlug(createProductDto.name()))
//                .description(createProductDto.description())
//                .inStock(createProductDto.inStock())
//                .price(createProductDto.price())
//                .supplier(Supplier.builder()
//                        .id(createProductDto.supplierId())
//                        .build())
//                .build();
//        //Start inserting a product
//
//        productRepository.insert(product);
//        System.out.println("INSERT PRODUCT ID :" + product.getId());
//
//
//        //Start inserting a product category
//         createProductDto.categoryIds().forEach(id->
//                productRepository.insertProductCategory(product.getId(),id));
//    }

//    @Override
//    public void deleteProductById(Integer id) {
//
//    }
//
//    @Override
//    public void updateProductById(Integer id, Product product) {
//
//    }

    @Override
    public List<Product> loadProducts() {

        return productRepository.selectProducts();
    }

//    @Override
//    public Product loadProductById(Integer id) {
//        return productRepository.selectProductById(id).orElseThrow();
//    }
}
