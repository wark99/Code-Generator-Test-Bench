package gen;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AntragKopfdaten extends AntragGemeinsamePflichtfelder {
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private LocalDateTime timestamp;
    private String kind_kibig_id;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate antragsdatum;
    private Integer antragsnummer;
}
