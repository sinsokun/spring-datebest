package co.istad.sb4webmvc.repossitory.provider;

import org.apache.ibatis.jdbc.SQL;

public class ProductProvider {

    private final String TB_PRODUCT = "products";

    public String selectByQueryString() {
        return new SQL() {{
            SELECT("*");
            FROM(TB_PRODUCT);
            WHERE("name #{proName}");
            AND();
            WHERE("in_stock = #{status}");
        }}.toString();
    }
}
