/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooanimals;

/**
 *
 * @author lmeade, aditi
 */
public interface iAnimal {
    public String getAnimalType();
    public int getIdTag();
    public void setIdTag(int anIdTag);
    public int getMinTemperature();
    public int getMaxTemperature();
}

public class Leopard implements iAnimal{

    private int idTag;

    public String getAnimalType() {
        return "Leopard";
    }

    public int getIdTag() {
        return idTag;
    }

    public void setIdTag(int anIdTag) {
        idTag = anIdTag;
    }

    public int getMinTemperature() {
        return -25;
    }

    public int getMaxTemperature() {
        return 70;
    }
}
