package com.oskarbay.http.dto;

import lombok.*;

import java.util.Objects;
@Value // похож как @Data, можно убрать модификаторы
public class FlightDto {
      Long id;
      String description;
}
