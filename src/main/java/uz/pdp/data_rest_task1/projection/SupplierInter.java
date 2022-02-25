package uz.pdp.data_rest_task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.data_rest_task1.entity.Supplier;

@Projection(types = Supplier.class)
public interface SupplierInter {

    Integer getId();
    String getName();
    boolean getActive();
    String getPhoneNumber();
}
