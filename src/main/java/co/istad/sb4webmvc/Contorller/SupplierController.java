package co.istad.sb4webmvc.Contorller;

import co.istad.sb4webmvc.Model.Supplier;
import co.istad.sb4webmvc.Service.SupplierService;
import co.istad.sb4webmvc.repossitory.SupplierRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/supplier")
@RequiredArgsConstructor
public class SupplierController{

    private final SupplierService supplierService ;

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    public void UpdateSupplierById(@PathVariable Integer id,
                                  @RequestBody Supplier supplier){
        supplierService.updateSupplierById(id, supplier);
    }
}
