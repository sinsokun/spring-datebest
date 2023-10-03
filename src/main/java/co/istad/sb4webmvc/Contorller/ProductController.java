package co.istad.sb4webmvc.Contorller;

import co.istad.sb4webmvc.Dto.CreateProductDto;
import co.istad.sb4webmvc.Model.Product;
import co.istad.sb4webmvc.Service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private  final ProductService productService;

    @GetMapping
    public List<Product> getProduct(){
        return productService.loadProducts();
    }

//    @GetMapping("/{id}")
//    public Product getProduct(@PathVariable Integer proid){
//        return productService.loadProductById(proid);
//    }
//
//    @PostMapping
//    public void createNewProduct(@RequestBody CreateProductDto createProductDto){
//        System.out.println(createProductDto.supplierId());
//        System.out.println(createProductDto.supplierId());
//        productService.createNewProduct(createProductDto);
//    }

//    @ResponseStatus(HttpStatus.CREATED)
//    @PutMapping("/{id}")
//    public void UpdateProduct(Integer id, @PathVariable Product products){
//        productService.updateProductById(id, products);
//
//
//    }
//    @DeleteMapping("/{id}")
//    public void deleteproduct(@PathVariable Integer id){
//        productService.deleteProductById(id);
//    }
//
//    @PatchMapping
//    public String updateProduct(){
//        return " update Product Partially";
//    }
//    @DeleteMapping
//    public String dateProduct(){
//        return "Delete Product";
//    }


}
