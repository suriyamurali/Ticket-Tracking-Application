package com.ticketing.ticketgenie.service;

import java.util.List;

import com.ticketing.ticketgenie.beans.TicketBean;
import com.ticketing.ticketgenie.beans.UserBean;

public interface TicketGenieService {
		
		public int createNewTicket(TicketBean ticket) throws Exception;
		
		public boolean updateTicketDetails(TicketBean ticket,int ticketId) throws Exception;
		
		public boolean deleteTicket(int ticketId) throws Exception;
		
		public List<TicketBean> viewAlltickets() throws Exception;
		
		public List<TicketBean> viewTicketsForUser(UserBean user) throws Exception;

		public List<TicketBean> searchTicket(String keyword) throws Exception;
		
		
			

}
