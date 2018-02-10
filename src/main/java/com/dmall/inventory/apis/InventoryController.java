package com.dmall.inventory.apis;

import com.dmall.inventory.model.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/inventories")
public class InventoryController {

    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    private List<Inventory> inventories = null;

    @Autowired
    public InventoryController() throws ParseException {

        this.inventories = Arrays.asList(
            new Inventory("p001", "坚果手机pro2", 10),
            new Inventory("p002", "坚果手机pro", 10),
            new Inventory("p004", "坚果v手机", 8),
            new Inventory("p003", "Oppo R11", 10));
    }

    @GetMapping
    public List<Inventory> getInventories() {

        return inventories;
    }

    @RequestMapping(value = "/{inventoryId}", method = RequestMethod.GET, headers = "Accept=application/json")
    public Inventory getDoctorByDoctorId(@PathVariable("inventoryId") final String inventoryId) {
        Optional<Inventory> doctor = inventories.stream().filter(c -> Objects.equals(c.getInventoryId(), inventoryId)).findAny();

        return doctor.isPresent() ? doctor.get() : null;
    }
}
