Feature: Cover Loans API expected behaviour
  Scenario: positive_scenario_where_all_parameters_are_valid_should_return_200
    Given url 'http://localhost:8080/loans'
    And request {"name":"Elissa","surname":"Momo","idNumber":"9105125376081","bankAccount":{"bankName":"ICONIC_BANK","accountNumber":"1234567898"}}
    When method POST
    And header Accept = 'application/json'
    Then status 200

  Scenario: request_should_fail_on_invalid_idNumber
    Given url 'http://localhost:8080/loans'
    And request {"name":"Elissa","surname":"Momo","idNumber":"910512537608","bankAccount":{"bankName":"ICONIC_BANK","accountNumber":"1234567898"}}
    When method POST
    And header Accept = 'application/json'
    Then status 200
    And match response contains {errors: '#[] #string'}
    And match response.errors[0] == 'ID Number must be a valid South African ID number (13 digits)'


  Scenario: request_should_fail_on_client_being_too_young
    Given url 'http://localhost:8080/loans'
    And request {"name":"Elissa","surname":"Momo","idNumber":"0401185376081","bankAccount":{"bankName":"ICONIC_BANK","accountNumber":"1234567898"}}
    When method POST
    And header Accept = 'application/json'
    Then status 200
    And match response contains {errors: '#[] #string'}
    And match response.errors[0] == 'The client must be 18 years or older'


  Scenario: Name must not have any special characters and digits
    Given url 'http://localhost:8080/loans'
    And request {"name":"Eli_$%_ssa","surname":"Momo","idNumber":"9105125376081","bankAccount":{"bankName":"ICONIC_BANK","accountNumber":"1234567898"}}
    When method POST
    And header Accept = 'application/json'
    Then status 200
    And match response contains {errors: '#[] #string'}
    And match response.errors[0] == 'Name must not have any special characters and digits'


  Scenario: request_should_fail_on_client_surname_containing_special_chars
    Given url 'http://localhost:8080/loans'
    And request {"name":"Elissa","surname":"Momo$%^","idNumber":"9105125376081","bankAccount":{"bankName":"ICONIC_BANK","accountNumber":"1234567898"}}
    When method POST
    And header Accept = 'application/json'
    Then status 200
    And match response contains {errors: '#[] #string'}
    And match response.errors[0] == 'Surname must not have any special characters and digits'


  Scenario: request_should_return_refer_to_compliance_if_molewa_bank_was_selected
    Given url 'http://localhost:8080/loans'
    And request {"name":"Elissa","surname":"Momo","idNumber":"9105125376081","bankAccount":{"bankName":"MOLEWA_BANK","accountNumber":"1234567898"}}
    When method POST
    And header Accept = 'application/json'
    Then status 200
    And match response contains {errors: '#[] #string'}
    And match response.warnings[0] == 'Refer to compliance'


  Scenario: request_should_fail_when_account_numbers_is_NOT_ten_digits
    Given url 'http://localhost:8080/loans'
    And request {"name":"Elissa","surname":"Momo","idNumber":"9105125376081","bankAccount":{"bankName":"ICONIC_BANK","accountNumber":"123456"}}
    When method POST
    And header Accept = 'application/json'
    Then status 200
    And match response contains {errors: '#[] #string'}
    And match response.errors[0] == 'Bank account number must be 10 digits'

