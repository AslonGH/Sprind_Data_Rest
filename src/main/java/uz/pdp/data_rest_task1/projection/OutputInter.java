package uz.pdp.data_rest_task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.data_rest_task1.entity.Client;
import uz.pdp.data_rest_task1.entity.Currency;
import uz.pdp.data_rest_task1.entity.Output;
import uz.pdp.data_rest_task1.entity.WareHouse;

import java.util.Date;

@Projection(types = Output.class)
public interface OutputInter {

    Integer getId();
    Date getDate();

    WareHouse getWareHouse();

    Currency getCurrency();

    Client getClient();

    String getFutureNumber();

    String getCode();
}
