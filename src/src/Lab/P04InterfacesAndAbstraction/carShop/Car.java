package Lab.P04InterfacesAndAbstraction.carShop;

import java.io.Serializable;

public interface Car extends Serializable {

        int TIERS= 4;

        String getModel();
        Integer getHorsePower();
        String getColor();
        String countryProduced();

}
