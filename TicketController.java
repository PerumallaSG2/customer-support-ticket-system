package com.example.ticketing.controller;

import com.example.ticketing.model.Ticket;
import com.example.ticketing.service.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
@CrossOrigin(origins = "http://localhost:4200")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping
    public List<Ticket> getAllTickets() { return ticketService.getAllTickets(); }

    @GetMapping("/{id}")
    public Ticket getTicketById(@PathVariable Long id) { return ticketService.getTicketById(id); }

    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket) { return ticketService.createTicket(ticket); }

    @PutMapping("/{id}")
    public Ticket updateTicket(@PathVariable Long id, @RequestBody Ticket ticket) {
        return ticketService.updateTicket(id, ticket);
    }

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable Long id) { ticketService.deleteTicket(id); }
}
