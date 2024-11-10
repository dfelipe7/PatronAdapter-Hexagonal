/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.edu.co.events.adapters;

/**
 *
 * @author Unicauca
 */


import co.edu.unicauca.edu.co.events.application.EventUseCase;
import co.edu.unicauca.edu.co.events.domain.Event;
import co.edu.unicauca.edu.co.events.domain.Investigator;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {
    private final EventUseCase eventService;

    public EventController(EventUseCase eventService) {
        this.eventService = eventService;
    }

    @GetMapping
    public List<Event> findAll() {
        return eventService.findAll();
    }

    @GetMapping("/{id}")
    public Event findById(@PathVariable Long id) {
        return eventService.findById(id);
    }

    @PostMapping
    public Event create(@RequestBody Event event) {
        return eventService.create(event);
    }

    @PutMapping("/{id}")
    public Event update(@PathVariable Long id, @RequestBody Event event) {
        return eventService.update(id, event);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        eventService.deleteById(id);
    }
    
       @GetMapping("/{id}/committee")
    public List<Investigator> getCommittee(@PathVariable Long id) {
        return eventService.getCommittee(id);
    }
}
