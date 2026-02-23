package czskola.swiapp1.controllers;

import czskola.swiapp1.entities.Location;
import czskola.swiapp1.repositories.LocationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/locations/test")
public class LocationTestController {

    @Autowired
    private LocationRepository locationRepository;

    @GetMapping
    public String testLocation() {
        Location location = new Location();
        location.setAddress("123 Main Street");
        location.setCity("New York");
        location.setPostalCode("10001");
        location.setLatitude(40.7128);
        location.setLongitude(-74.0060);

        locationRepository.save(location);

        return "Hello from Location Test Controller - Location successfully saved!";
    }
}