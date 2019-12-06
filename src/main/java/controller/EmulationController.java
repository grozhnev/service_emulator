package controller;

import data.impl.Weather;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import service.ServiceEmulation;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

@Slf4j
@RestController
class EmulationController {

    private final ServiceEmulation emulator;

    @Autowired
    public EmulationController(ServiceEmulation emulator) {
        this.emulator = emulator;
    }

    @PostMapping(path = "/weather/{cityCode}", consumes = { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE },
                 produces = {APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE})
    public @ResponseBody
    Weather getWeatherByCityCode(@RequestParam("cityCode") String cityCode){
        log.info("Counting weather in the city " + cityCode);
        return (Weather) emulator.getData(cityCode);
    }

    @PostMapping(path = "/time/{zip}", consumes = { APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE },
                 produces = {APPLICATION_JSON_VALUE, APPLICATION_XML_VALUE})
    public @ResponseBody String getTimeByZipCode(@RequestParam("zip") String zip){
        log.info("Getting time at location " + zip );
        return (String) emulator.getData(zip);
    }
}
