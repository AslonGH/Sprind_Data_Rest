package uz.pdp.data_rest_task1.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.data_rest_task1.entity.Currency;

@Projection(types = Currency.class)
public interface CurrencyInter {

    Integer getId();
    String  getName();
    boolean getActive();
}
