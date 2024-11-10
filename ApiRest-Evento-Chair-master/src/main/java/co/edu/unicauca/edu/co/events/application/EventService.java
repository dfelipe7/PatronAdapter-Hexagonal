/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.edu.co.events.application;

/**
 *
 * @author Unicauca
 */

import co.edu.unicauca.edu.co.events.domain.Event;
import co.edu.unicauca.edu.co.events.domain.Investigator;
import co.edu.unicauca.edu.co.events.ports.EventRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService implements EventUseCase {
    private final EventRepositoryPort repository;

    public EventService(EventRepositoryPort repository) {
        this.repository = repository;
    }

    @Override
    public List<Event> findAll() {
        return repository.findAll();
    }

    @Override
    public Event findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Event create(Event event) {
        return repository.save(event);
    }

    @Override
    public Event update(Long id, Event event) {
        Event existingEvent = findById(id);
        if (existingEvent != null) {
            existingEvent.setName(event.getName());
            existingEvent.setChair(event.getChair());
            existingEvent.setCommittee(event.getCommittee());
            return repository.save(existingEvent);
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
    
     @Override
    public List<Investigator> getCommittee(Long eventId) {
        Event event = repository.findById(eventId)
                .orElseThrow(() -> new RuntimeException("Event not found"));
        return event.getCommittee();
    }
}
