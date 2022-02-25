package uz.pdp.data_rest_task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.data_rest_task1.entity.Output;
import uz.pdp.data_rest_task1.entity.OutputProduct;
import uz.pdp.data_rest_task1.entity.Product;

@Projection(types = OutputProduct.class)
public interface OutputProductInter {

    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Output getOutput();
}
