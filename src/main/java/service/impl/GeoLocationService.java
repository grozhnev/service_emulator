package service.impl;

import data.EntityRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ServiceEmulation;

/**
 * Service returns weather information by city code.
 * */
@Service
public class GeoLocationService implements ServiceEmulation {

    private EntityRepostory repostory;

    @Autowired
    public GeoLocationService(EntityRepostory repostory) {
        this.repostory = repostory;
    }

    @Override
    public String getData(String query) {
        return (String) this.repostory.findOne(query);
    }
}
