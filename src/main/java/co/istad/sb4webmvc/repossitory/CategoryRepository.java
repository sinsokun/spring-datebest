package co.istad.sb4webmvc.repossitory;

import co.istad.sb4webmvc.Model.Category;
import co.istad.sb4webmvc.repossitory.provider.CategoryProvider;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Mapper
@Repository
public interface CategoryRepository {

    @SelectProvider(CategoryProvider.class)
    List<Category> selectProductCategories(@Param("productId") Integer productId);

    @Select("SELECT * FROM categories")
    @Results(id = "categoryResultMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "description", column = "description")

    })
    List<Category> select();

    @Select("SELECT * FROM categories WHERE id = #{id}")
    @ResultMap("categoryResultMap")
    Optional<Category> selectById(@Param("id") Integer id);

    @Insert("""
            INSERT INTO categories(name ,descrption)
            VALUES (#{c.name}, #{c.descrption})
            
            """)
    void insert(@Param("c") Category category);

    @Update("""
            UPDATE categories
            SET name = #{c.name}
            descrption = #{c.descrption}
            WHERE id = #{c.id}
            
            """)
    void Update(@Param("c") Category category);

    @Delete("""
            DELETE FROM categories
            WHERE id = #{id}
            """)
    void delete(@Param("id") Category category);
}
