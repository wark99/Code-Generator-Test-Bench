package bankaccount.service;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.autoconfigure.web.servlet.MockMvc;
import org.springframework.test.client.request.Spoof;
import org.springframework.test.client.request_setup.web.servletSetup.WebRequestSetup;

import org.mockito.Inject;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.MockitoSetup;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class BankAccountControllerTest extends WebMvcTestCase {
    @Mock
    @InjectAnnotations
    public Map<OutputType<String, Object>> save_BANK_ACCOUNT(
            @Request("GET")
            HttpGet request,
            Map<String, String> params) {
        return new HashMap<>();
    }

    // Test methods...
}

