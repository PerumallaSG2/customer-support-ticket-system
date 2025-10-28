import { Component, OnInit } from '@angular/core';
import { TicketService, Ticket } from '../services/ticket.service';

@Component({
  selector: 'app-ticket-list',
  template: `
    <h2>Tickets</h2>
    <ul>
      <li *ngFor="let ticket of tickets">
        {{ticket.title}} - {{ticket.status}}
      </li>
    </ul>
  `
})
export class TicketListComponent implements OnInit {
  tickets: Ticket[] = [];

  constructor(private ticketService: TicketService) {}

  ngOnInit(): void {
    this.ticketService.getTickets().subscribe(data => {
      this.tickets = data;
    });
  }
}
