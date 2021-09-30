package com.example.demo;


import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/flight")
@RestController

public class FlightController {
	ArrayList<String> ticketDetails =new ArrayList<String>();
	@PostMapping("/admin/login")
	public void adminLogin(@RequestBody AdminLogin login) {
		System.out.println("Username: " +login.getUsername());
		System.out.println("PAssword: " +login.getPassword());
	}
	
	@PostMapping("/booking")
	public void bookingTicket(@RequestBody TicketBooking ticket) {
		System.out.println("Name: " +ticket.getName());
		System.out.println("Email-Id: " +ticket.getEmailId());
		System.out.println("Age :" +ticket.getAge());
		System.out.println("Gender :" +ticket.getGender());
		System.out.println("No_Of_Seats :" +ticket.getNo_of_seats());
	
	}
	
	@PostMapping("/search")
	public void searchForFlight(@RequestBody SearchForFlight search) {
		System.out.println("Date : " +search.getDate());
		System.out.println("Time : " +search.getTime());
		System.out.println("Source : " +search.getSource());
		System.out.println("Destination : "+search.getDestination());
	}


}