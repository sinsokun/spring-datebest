package co.istad.sb4webmvc.repossitory;

import co.istad.sb4webmvc.Model.Supplier;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface SupplierRepository {
    @Select("SELECT * FROM suppliers WHERE id = #{id}")
    Supplier selectProductSupplier(@Param("id") Integer id);

    @Select("SELECT * FROM ")
    List<Supplier> selectSuppliers();

    @Insert("""
                INSERT INTO suppliers (company,since,status)
                VALUES (#{s.company},#{s.since},#{s.status})
            """)
    void insert(@Param("s") Supplier supplier);

    @Update("""
                UPDATE suppliers 
                SET company = #{s.company},
                    status = #{status}
                WHERE id = #{s.id}
            """)
    void update(@Param("s") Supplier supplier);

    @Delete("DELETE FROM  supplier WHERE id = #{id}")
    void dalete(@Param("id") Integer id);
}
