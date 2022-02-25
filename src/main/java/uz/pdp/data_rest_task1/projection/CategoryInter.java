package uz.pdp.data_rest_task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.data_rest_task1.entity.Category;

@Projection(types = Category.class)
public interface CategoryInter {

    Integer getId();
    String  getName();

    boolean getActive();
    Category getParentCategory();
}
