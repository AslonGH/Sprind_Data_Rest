package uz.pdp.data_rest_task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.data_rest_task1.entity.User;
import uz.pdp.data_rest_task1.entity.WareHouse;
import java.util.Set;
@Projection(types = User.class)

public interface UserInter {
    Integer getId();

    String  getFirstName();

    String  getLastName();

    String  getPhoneNumber();

    String  getCode();

    String  getPassword();

    boolean getActive();

    Set<WareHouse> getWareHouses();

}
