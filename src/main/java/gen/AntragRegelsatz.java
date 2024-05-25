package gen;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AntragRegelsatz extends AntragKopfdaten {
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate zeitraum_von;
}
