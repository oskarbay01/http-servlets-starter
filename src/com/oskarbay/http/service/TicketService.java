package com.oskarbay.http.service;

import com.oskarbay.http.dao.TicketDao;
import com.oskarbay.http.dto.TicketDto;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class TicketService {

    private static final TicketService INSTANCE = new TicketService();

    private static final TicketDao ticketDao = TicketDao.getInstance();

    public List<TicketDto> findAllByFlightId(Long flightId) {
        return ticketDao.findAllByFlightId(flightId).stream()
                .map(ticket -> new TicketDto(// entity -- > ticketDto
                        ticket.getId(),
                        ticket.getFlightId(),
                        ticket.getSeatNo()
                ))
                .collect(toList());
    }

    private TicketService() {
    }

    public static TicketService getInstance() {
        return INSTANCE;
    }
}
