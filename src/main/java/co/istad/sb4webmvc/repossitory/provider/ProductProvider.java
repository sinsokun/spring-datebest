package co.istad.sb4webmvc.repossitory.provider;

import org.apache.ibatis.jdbc.SQL;
import org.springframework.beans.factory.annotation.Value;

public class ProductProvider {
    private final String TB_NAME = "products";
    public String InsertSQL(){
        return new SQL(){{
            INSERT_INTO(TB_NAME);
            VALUES("name" ,"#{p.name}");
            VALUES("slug" ,"#{p.slug}");
            VALUES("description" ,"#{p.description}");
            VALUES("in_stock" ,"#{p.inStock}");
            VALUES("supplier_id" ,"#{p.supplier_id}");
        }}.toString();
    }
    public String insertProductCategory(){
        return new SQL(){{
            INSERT_INTO("product_categories");
            VALUES("product_id ","#{p.id}");
            VALUES("_id","#{p.id}");
        }}.toString();
    }
}


