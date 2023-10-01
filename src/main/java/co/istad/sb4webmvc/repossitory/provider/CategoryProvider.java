package co.istad.sb4webmvc.repossitory.provider;

import org.apache.ibatis.builder.annotation.ProviderMethodResolver;
import org.apache.ibatis.jdbc.SQL;

public class CategoryProvider implements ProviderMethodResolver {
    private String TB_CATEGORY = "categories";
    public String selectProductCategories() {
        return new SQL() {{

            SELECT("*");
            FROM(TB_CATEGORY + " c");
            INNER_JOIN("products_categories pc ON pc.category_id = c.id");
            WHERE("pc.product_id = #{productId}");

        }}.toString();
    }
}
