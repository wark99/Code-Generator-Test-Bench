package com.mastercard.openbanking.client.api;

import com.mastercard.openbanking.client.ApiException;
import com.mastercard.openbanking.client.model.ConsumerUpdate;
import com.mastercard.openbanking.client.test.BaseTest;
import com.mastercard.openbanking.client.test.utils.ConsumerUtils;
import com.mastercard.openbanking.client.test.ModelFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ConsumersApiTest extends BaseTest {

    private final static ConsumersApi api = new ConsumersApi(apiClient);
    private static String existingConsumerId;

    @BeforeAll
    protected static void beforeAll() {
        try {
            existingConsumerId = ConsumerUtils.getOrCreateDefaultConsumer(api, CUSTOMER_ID);
        } catch (ApiException e) {
            fail(e);
        }
    }

    @Test
    void createConsumerTest() {
        try  {
            var customer = customersApi.addTestingCustomer(ModelFactory.newCustomer());
            createdCustomerIds.add(customer.getId());
            var consumer = api.createConsumer(customer.getId(), ModelFactory.newConsumer());
            assertNotNull(consumer.getId());
            assertNotNull(consumer.getCreatedDate());
            assertEquals(customer.getId(), String.valueOf(consumer.getCustomerId()));
        } catch (ApiException e) {
            fail(e);
        }
    }

    @Test
    void createConsumerTest_AlreadyCreated() {
        try  {
            api.createConsumer(CUSTOMER_ID, ModelFactory.newConsumer());
            fail();
        } catch (ApiException e) {
            // {"code":11000,"message":"A consumer already exists for customer 5025024821"}
            logApiException(e);
            assertErrorCodeEquals(11000, e);
            assertErrorMessageEquals("A consumer already exists for customer " + CUSTOMER_ID, e);
        }
    }

    @Test
    void getConsumerTest() {
        try  {
            var consumer = api.getConsumer(existingConsumerId);
            assertNotNull(consumer);
        } catch (ApiException e) {
            fail(e);
        }
    }

    @Test
    void getConsumerTest_NonExistingId() {
        try  {
            api.getConsumer("1234");
            fail();
        } catch (ApiException e) {
            // {"code":10100,"message":"Cannot find consumer with id 1234."}
            logApiException(e);
            assertErrorCodeEquals(10100, e);
            assertErrorMessageEquals("Cannot find consumer with id 1234.", e);
        }
    }

    @Test
    void getConsumerForCustomerTest() {
        try {
            var consumer = api.getConsumerForCustomer(CUSTOMER_ID);
            assertNotNull(consumer.getId());
        } catch (ApiException e) {
            fail(e);
        }
    }

    @Test
    void getConsumerForCustomerTest_NonExistingId() {
        try  {
            api.getConsumerForCustomer("1234");
            fail();
        } catch (ApiException e) {
            // {"code":14001,"message":"Resource not found."}
            logApiException(e);
            assertErrorCodeEquals(14001, e);
            assertErrorMessageEquals("Resource not found.", e);
        }
    }

    @Test
    void modifyConsumerTest() {
        try  {
            var request = new ConsumerUpdate().firstName("New first name");
            api.modifyConsumer(existingConsumerId, request);
        } catch (ApiException e) {
            fail(e);
        }
    }

    @Test
    void modifyConsumerTest_NonExistingId() {
        try  {
            var request = new ConsumerUpdate().firstName("New first name");
            api.modifyConsumer("1234", request);
            fail();
        } catch (ApiException e) {
            // {"code":10100,"message":"Cannot find consumer with id 1234."}
            logApiException(e);
            assertErrorCodeEquals(10100, e);
            assertErrorMessageEquals("Cannot find consumer with id 1234.", e);
        }
    }
}
