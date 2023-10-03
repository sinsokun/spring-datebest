package co.istad.sb4webmvc.repossitory;

import co.istad.sb4webmvc.Model.Product;
import co.istad.sb4webmvc.repossitory.provider.ProductProvider;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Mapper
@Repository
public interface ProductRepository {
    @Select("SELECT * FROM products")
    @Results(id = "productResultMap", value ={
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "inStock" , column = "in_stock"),
            @Result(property = "categories" , column = "id",
                    many = @Many(select = "co.istad.sb4webmvc.repository.CategoryRepository.selectProductCategories")),
            @Result(property = "supplier",column = "supplier_id",
                    one = @One( select= "co.istad.sb4webmvc.repository.SupplierRepository.selectProductSupplier"))
    })
    List<Product> selectProducts();




        @Select("SELECT * FROM products WHERE id = #{id}")
        @ResultMap("productResultMap")
        Optional<Product> selectProductById(@Param("id") Integer id);

        @Insert("""
                INSERT INTO product(supplier_id, name, price, in_stock, slug, description)
                VALUES (#{p.supplier.id}, #{p.name} ,#{p.price} ,#{p.in_stock} , #{p.slug} )
                """)
         void insert();

//        @Update("""
//
//                UPDATE product
//                supplier_id = #{p.supplier.id},
//                SET name = #{p.name},
//                slug = #{p.slug},
//                discription = #{p.name},
//                price = #{p.price},
//                in_stock = #{p.in_stock}
//                WHERE id = #{p.id}
//
//                """)
//         void Update(@Param("p") Product product);

//        @Delete("""
//                DELETE FROM  product
//                WHERE id = #{id}
//                """)
//        void delete(@Param("id") Integer id);
//    @SelectProvider(value = ProductProvider.class, method = "selectByQueryString")
//    @ResultMap("productResultMap")
//    List<Product> searchProduct(@Param("proName") String name, @Param("status") Boolean status);
//
//    @InsertProvider(value = ProductProvider.class ,method = "InsertSQL")
//    @Options(useGeneratedKeys = true, keyProperty = "id" , keyColumn = "id")
//    void insert(@Param("p") Product product);
//
//    @InsertProvider(ProductProvider.class)
//    void insertProductCategory(@Param("proId")Integer productId,
//                               @Param("cateId") Integer categoryId);
}
