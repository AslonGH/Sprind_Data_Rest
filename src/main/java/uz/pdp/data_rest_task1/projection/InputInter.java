package uz.pdp.data_rest_task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.data_rest_task1.entity.Currency;
import uz.pdp.data_rest_task1.entity.Input;
import uz.pdp.data_rest_task1.entity.Supplier;
import uz.pdp.data_rest_task1.entity.WareHouse;

import java.util.Date;

@Projection(types = Input.class)
public interface InputInter {

    Integer getId();
    
    Date getDate();

    WareHouse getWareHouse();

    Supplier getSupplier();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();

}
