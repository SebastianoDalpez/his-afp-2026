package com.sio.backend.resources.pathologies;


import java.time.Instant;

public record PathologiesDTO(
    @NotBlank
    String code,

    @NotBlank
    String description
) {}
    
