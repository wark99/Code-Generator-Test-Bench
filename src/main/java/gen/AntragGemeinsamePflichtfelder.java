package gen;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AntragGemeinsamePflichtfelder {
    private Integer id;
    private String kf_kind_id;
    private String nachname;
    private String vorname;
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate geburtsdatum;
    private String kf_kita_id;
    private String kita_kibig_id;
    private String einrichtungsjahr;
}
