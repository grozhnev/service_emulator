package service.impl;

import data.EntityRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ServiceEmulation;

/**
 * Service return time by ZIP code.
 * */
@Service
public class WeatherService implements ServiceEmulation {

    private EntityRepostory repostory;

    @Autowired
    public WeatherService(EntityRepostory repostory) {
        this.repostory = repostory;
    }

    @Override
    public String getData(String query) {
        return (String) this.repostory.findOne(query);
    }
}
