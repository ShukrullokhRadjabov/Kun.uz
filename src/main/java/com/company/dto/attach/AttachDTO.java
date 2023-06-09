package com.company.dto.attach;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sun.security.auth.module.JndiLoginModule;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
@Setter
public class AttachDTO {
    private String id;
    private String originalName;
    private String path;
    private Long size;
    private String extension;
    private LocalDateTime createdData;
    private String url;
}
