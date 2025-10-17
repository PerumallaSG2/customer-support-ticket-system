package com.example.ticketing.service;

import com.example.ticketing.model.Ticket;
import com.example.ticketing.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<Ticket> getAllTickets() { return ticketRepository.findAll(); }

    public Ticket getTicketById(Long id) {
        return ticketRepository.findById(id).orElseThrow(() -> new RuntimeException("Ticket not found"));
    }

    public Ticket createTicket(Ticket ticket) { return ticketRepository.save(ticket); }

    public Ticket updateTicket(Long id, Ticket updated) {
        Ticket t = getTicketById(id);
        t.setTitle(updated.getTitle());
        t.setDescription(updated.getDescription());
        t.setPriority(updated.getPriority());
        t.setStatus(updated.getStatus());
        return ticketRepository.save(t);
    }

    public void deleteTicket(Long id) { ticketRepository.deleteById(id); }
}
