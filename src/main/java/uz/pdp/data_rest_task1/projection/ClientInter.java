package uz.pdp.data_rest_task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.data_rest_task1.entity.Client;

@Projection(types = Client.class)
public interface ClientInter {

    Integer getId();
    String  getName();

    String getPhoneNumber();
}
