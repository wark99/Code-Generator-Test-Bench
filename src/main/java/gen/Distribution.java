package gen;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "distribution")
public class Distribution {
    private Long id;
    private Asset asset;
    private Long scheduleId;
    private Channel channel;
    private Account account;
    private Double priority;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private String created;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private String updated;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private String requiredBy;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private String slaDate;
    private String state;
    private List<Transfer> fileTransfers;
    private String message;
    private Integer retries;
}
