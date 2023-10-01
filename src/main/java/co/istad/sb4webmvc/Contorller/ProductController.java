package co.istad.sb4webmvc.Contorller;

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

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Integer id){
        return productService.loadProductById(id);
    }


    @PostMapping
    public void createNewProduct( @RequestBody Product product){

       productService.createNewProduct(product);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/{id}")
    public void UpdateProduct(Integer id, @PathVariable Product product){
        productService.updateProductById(id, product);


    }
    @DeleteMapping("/{id}")
    public void deleteprodcut(@PathVariable Integer id){
        productService.deleteProductById(id);
    }

    @PatchMapping
    public String updateProduct(){
        return " update Product Partially";
    }
    @DeleteMapping
    public String dateProduct(){
        return "Delete Product";
    }





}
