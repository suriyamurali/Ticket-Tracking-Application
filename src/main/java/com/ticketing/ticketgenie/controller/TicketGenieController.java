package com.ticketing.ticketgenie.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ticketing.ticketgenie.beans.TicketBean;
import com.ticketing.ticketgenie.beans.UserBean;

@RestController
public class TicketGenieController {
	
	
	@PostMapping(value="/create-ticket")
	public int createTicket(@RequestBody TicketBean ticket) {
		return 0;
		
	}
	
	@GetMapping(value="/view-all-tickets")
	public List<TicketBean> viewAllTickets() {
		return null;
		
	}
	
	@GetMapping(value="/view-tickets-for-user")
	public List<TicketBean> viewTicketsForUser(UserBean user) {
		return null;
		
	}
	
	@DeleteMapping(value="/delete-ticket/{id}")
	public boolean deleteTicket(int ticketId) {
		return false;
		
	}
	
	
	

}
