package dk.springpractice.msscbrewery.web.services;

import dk.springpractice.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
     public CustomerDto getCustomerInfoById(UUID customerId);

    CustomerDto saveCustomerDto(CustomerDto customerdto);

    void updateCustomerDto(UUID beerId, CustomerDto beerdto);

    void deleteCustomerById(UUID customerId);
}
