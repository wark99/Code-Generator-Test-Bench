package gen;

import lombok.Data;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement(name = "fileTransfer")
public class Transfer {
    private Long id;
    private String uri;
    private String state;
    private String message;
}

