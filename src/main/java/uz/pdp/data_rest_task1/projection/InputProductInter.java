package uz.pdp.data_rest_task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.data_rest_task1.entity.Input;
import uz.pdp.data_rest_task1.entity.InputProduct;
import uz.pdp.data_rest_task1.entity.Product;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface InputProductInter {

    Integer getId();
    Product getProduct();
    Double  getAmount();
    Double getPrice();
    Date getExpireDate();
    Input getInput();
}
