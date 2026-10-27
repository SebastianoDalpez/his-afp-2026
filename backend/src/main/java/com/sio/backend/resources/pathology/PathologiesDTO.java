import java.time.Instant;

public record PathologiesDTO(
    @NotBlank
    String code,

    @NotBlank
    String description
) {}
    
