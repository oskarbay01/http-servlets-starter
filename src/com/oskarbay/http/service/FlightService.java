package com.oskarbay.http.service;

import com.oskarbay.http.dao.FlightDao;
import com.oskarbay.http.dto.FlightDto;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class FlightService {

    private final FlightService INSTANCE = new FlightService();

    private final FlightDao flightDao = FlightDao.getInstance();

    public List<FlightDto> findAll() {
        return flightDao.findAll().stream()
                .map(flight -> new FlightDto(
                        flight.getId(),
                        """
                                %s-%s-%s
                                """.formatted(flight.getDepatureAirportCode(), flight.getArrivalAirportCode(), flight.getStatus())
                ))
                .collect(toList());
    }

    private FlightService() {
    }

    public FlightService getInstance() {
        return INSTANCE;
    }

}
