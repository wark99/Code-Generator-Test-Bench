package za.co.loans.restassuredIT;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import org.joda.time.Years;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import za.co.loans.domain.BankAccount;
import za.co.loans.domain.Banks;
import za.co.loans.domain.LoanRequest;
import za.co.loans.service.utils.IdNumberUtils;

import java.time.Year;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.containsString;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestAssuredIntegrationTests {

    @LocalServerPort
    private int port;

    @Before
    public void setUp() {
        RestAssured.port = port;
    }

    //https://www.toolsqa.com/rest-assured/post-request-using-rest-assured/
    //https://semaphoreci.com/community/tutorials/testing-rest-endpoints-using-rest-assured
    @Test
    public void positive_scenario_where_all_parameter_are_valid_should_return_200() {

        String postPayload = getApplicationPayload("9105125376081", "Elissa", "Momo", Banks.ICONIC_BANK, "1234567898");

        RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(postPayload)
                .when()
                .post("/loans") //prepare the call
                .then()
                .statusCode(200);

    }

    @Test
    public void request_should_fail_on_invalid_idNumber() {

        String postPayload = getApplicationPayload("910512537608", "Elissa", "Momo", Banks.ICONIC_BANK, "1234567898");

        RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(postPayload)
                .when()
                .post("/loans")
                .then()
                .statusCode(200)
                .body(containsString("ID Number must be a valid South African ID number (13 digits)"));

    }

    @Test
    public void request_should_fail_on_client_being_too_young() {

        String postPayload = getApplicationPayload("0401185376081", "Elissa", "Momo", Banks.ICONIC_BANK, "1234567898");

        RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(postPayload)
                .when()
                .post("/loans")
                .then()
                .statusCode(200)
                .body(containsString("The client must be 18 years or older"));

    }

    @Test
    public void request_should_fail_on_client_name_containing_special_chars() {

        String postPayload = getApplicationPayload("9208310742085", "Eli!@ssa", "Momo", Banks.ICONIC_BANK, "1234567898");

        RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(postPayload)
                .when()
                .post("/loans")
                .then()
                .statusCode(200)
                .body(containsString("Name must not have any special characters and digits"));

    }

    @Test
    public void request_should_fail_on_client_surname_containing_special_chars() {

        String postPayload = getApplicationPayload("9208310742085", "Elissa", "Morolong!@", Banks.ICONIC_BANK, "1234567898");

        RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(postPayload)
                .when()
                .post("/loans")
                .then()
                .statusCode(200)
                .body(containsString("Surname must not have any special characters and digits"));

    }

    @Test
    public void request_should_return_refer_to_compliance_if_molewa_bank_was_selected() {

        String postPayload = getApplicationPayload("9208310742085", "Elissa", "Morolong", Banks.MOLEWA_BANK, "1234567898");

        RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(postPayload)
                .when()
                .post("/loans") //prepare the call
                .then()
                .statusCode(200) //inspect the result status code
                .body(containsString("Refer to compliance"));

    }

    @Test
    public void request_should_fail_when_account_numbers_is_NOT_ten_digits() {

        String postPayload = getApplicationPayload("9208310742085", "Elissa", "Morolong", Banks.MOLEWA_BANK, "123456");

        RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(postPayload)
                .when()
                .post("/loans") //prepare the call
                .then()
                .statusCode(200) //inspect the result status code
                .body(containsString("Refer to compliance"));

    }

    private String getApplicationPayload(String idNumber, String firstName, String lastName, Banks banks, String accNumber) {
        try {
            LoanRequest loanRequest = LoanRequest
                    .builder()
                    .name(firstName)
                    .surname(lastName)
                    .idNumber(idNumber)
                    .bankAccount(BankAccount
                            .builder()
                            .accountNumber(accNumber)
                            .bankName(banks)
                            .build())
                    .build();

            return new ObjectMapper().writeValueAsString(loanRequest);
        } catch (Exception ex) {
            return null;
        }
    }

}
