package uz.pdp.data_rest_task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.data_rest_task1.entity.Attachment;
import uz.pdp.data_rest_task1.entity.Category;
import uz.pdp.data_rest_task1.entity.Measurement;
import uz.pdp.data_rest_task1.entity.Product;

@Projection(types = Product.class)
public interface ProductInter {

    Integer getId();

    Category getCategory();

    Attachment getAttachment();

    String getCode();

    Measurement getMeasurement();

    boolean getActive();
}
