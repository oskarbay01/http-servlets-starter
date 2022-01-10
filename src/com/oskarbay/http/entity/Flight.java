package com.oskarbay.http.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Flight {
    private Long id;
    private String flightNo;
    private LocalDateTime depatureDate;
    private String depatureAirportCode;
    private LocalDateTime arrivalDate;
    private String arrivalAirportCode;
    private Long arcraftId;
    private FlightStatus status;

    public Flight(Long id, String flightNo, LocalDateTime depatureDate, String depatureAirportCode, LocalDateTime arrivalDate, String arrivalAirportCode, Long arcraftId, FlightStatus status) {
        this.id = id;
        this.flightNo = flightNo;
        this.depatureDate = depatureDate;
        this.depatureAirportCode = depatureAirportCode;
        this.arrivalDate = arrivalDate;
        this.arrivalAirportCode = arrivalAirportCode;
        this.arcraftId = arcraftId;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public LocalDateTime getDepatureDate() {
        return depatureDate;
    }

    public void setDepatureDate(LocalDateTime depatureDate) {
        this.depatureDate = depatureDate;
    }

    public String getDepatureAirportCode() {
        return depatureAirportCode;
    }

    public void setDepatureAirportCode(String depatureAirportCode) {
        this.depatureAirportCode = depatureAirportCode;
    }

    public LocalDateTime getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDateTime arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getArrivalAirportCode() {
        return arrivalAirportCode;
    }

    public void setArrivalAirportCode(String arrivalAirportCode) {
        this.arrivalAirportCode = arrivalAirportCode;
    }

    public Long getArcraftId() {
        return arcraftId;
    }

    public void setArcraftId(Long arcraftId) {
        this.arcraftId = arcraftId;
    }

    public FlightStatus getStatus() {
        return status;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(id, flight.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", flightNo='" + flightNo + '\'' +
                ", depatureDate=" + depatureDate +
                ", depatureAirportCode='" + depatureAirportCode + '\'' +
                ", arrivalDate=" + arrivalDate +
                ", arrivalAirportCode='" + arrivalAirportCode + '\'' +
                ", arcraftId=" + arcraftId +
                ", status=" + status +
                '}';
    }
}
