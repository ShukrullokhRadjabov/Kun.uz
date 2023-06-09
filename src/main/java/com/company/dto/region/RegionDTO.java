package com.company.dto.region;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
public class RegionDTO {
    private Integer id;
    private String name;
    private String nameUZ;
    private String nameRU;
    private String nameEN;
    private Boolean visible;
    private LocalDateTime createdDate;
}
