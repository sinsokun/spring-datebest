package co.istad.sb4webmvc.repossitory;

import co.istad.sb4webmvc.Model.Supplier;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SupplierRepository {
    @Select("SELECT * FROM suppliers WHERE id = #{id}")
    Supplier selectProductSupplier(@Param("id") Integer id);

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
}
