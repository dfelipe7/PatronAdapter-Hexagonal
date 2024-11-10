/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unicauca.edu.co.events.adapters;

/**
 *
 * @author Unicauca
 */
import co.edu.unicauca.edu.co.events.domain.Event;
import co.edu.unicauca.edu.co.events.ports.EventRepositoryPort;
import co.edu.unicauca.edu.co.events.dao.EventRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EventRepositoryAdapter implements EventRepositoryPort {
    private final EventRepository repository;

    public EventRepositoryAdapter(EventRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Event> findAll() {
        return (List<Event>) repository.findAll();
    }

    @Override
    public Optional<Event> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Event save(Event event) {
        return repository.save(event);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
