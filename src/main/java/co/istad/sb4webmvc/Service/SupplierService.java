package co.istad.sb4webmvc.Service;

import co.istad.sb4webmvc.Model.Supplier;

public interface SupplierService {
    void addNewSupplier(Supplier supplier);
    void updateSupplierById(Integer id,Supplier supplier );
}
