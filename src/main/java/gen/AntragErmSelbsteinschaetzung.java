package gen;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AntragErmSelbsteinschaetzung extends AntragKopfdaten {
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate zeitraum_von;
    private Integer einkommenInCent;
    private String einkommensjahr;
    private Boolean bezugSozialleistungen;
    private Integer anzahlAeltererGeschwisterkinder;
}
