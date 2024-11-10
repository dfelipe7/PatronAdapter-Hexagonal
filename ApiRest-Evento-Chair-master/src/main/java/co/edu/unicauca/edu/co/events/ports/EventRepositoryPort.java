/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicauca.edu.co.events.ports;

/**
 *
 * @author Unicauca
 */

import co.edu.unicauca.edu.co.events.domain.Event;
import java.util.List;
import java.util.Optional;

public interface EventRepositoryPort {
    List<Event> findAll();
    Optional<Event> findById(Long id);
    Event save(Event event);
    void deleteById(Long id);
}
