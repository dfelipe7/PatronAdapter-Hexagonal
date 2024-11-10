/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicauca.edu.co.events.application;

/**
 *
 * @author Unicauca
 */

import co.edu.unicauca.edu.co.events.domain.Event;
import co.edu.unicauca.edu.co.events.domain.Investigator;
import java.util.List;

public interface EventUseCase {
    List<Event> findAll();
    Event findById(Long id);
    Event create(Event event);
    Event update(Long id, Event event);
    void deleteById(Long id);
    List<Investigator> getCommittee(Long eventId);
}

