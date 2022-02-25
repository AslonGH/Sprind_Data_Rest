package uz.pdp.data_rest_task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.data_rest_task1.entity.Measurement;

@Projection(types = Measurement.class)
public interface MeasurementInter {

    Integer getId();
    Integer getName();
    boolean getActive();

}
