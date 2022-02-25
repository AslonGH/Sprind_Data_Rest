package uz.pdp.data_rest_task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.data_rest_task1.entity.WareHouse;

@Projection(types = WareHouse.class)
public interface WareHouseInter {

    Integer getId();
    String  getName();
    boolean getActive();
}
