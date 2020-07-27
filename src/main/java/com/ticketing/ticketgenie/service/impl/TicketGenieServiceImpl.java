package com.ticketing.ticketgenie.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ticketing.ticketgenie.beans.TicketBean;
import com.ticketing.ticketgenie.beans.UserBean;
import com.ticketing.ticketgenie.dao.TicketGenieDaoImpl;
import com.ticketing.ticketgenie.service.TicketGenieService;

public class TicketGenieServiceImpl implements TicketGenieService {
	
	@Autowired TicketGenieDaoImpl ticketGenieDaoImpl;

	@Override
	public int createNewTicket(TicketBean ticket) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean updateTicketDetails(int ticketId) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteTicket(int ticketId) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<TicketBean> viewAlltickets() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TicketBean> searchTicket(String keyword) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TicketBean> viewTicketsForUser(UserBean user) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
