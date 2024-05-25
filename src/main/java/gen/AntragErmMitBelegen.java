package gen;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class AntragErmMitBelegen extends AntragKopfdaten {
    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate zeitraum_von;
    private String unterlagenstatus;
    private Boolean kennzeichen_individuelle_festsetzung;
    private List<Geschwisterkind> geschwisterkinder;

    @Data
    public static class Geschwisterkind {
        private String nachname;
        private String vorname;
        @JsonFormat(pattern = "dd.MM.yyyy")
        private LocalDate geburtsdatum;
        private Boolean wohnt_im_selben_haushalt;
        private String kindergeldberechtigte;
        private Boolean kind_anerkannt;
    }
}

