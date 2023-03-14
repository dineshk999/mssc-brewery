package dk.springpractice.msscbrewery.web.services;

import dk.springpractice.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto getCustomerInfoById(UUID customerId) {
        return CustomerDto.builder().customerId(customerId).
                customerName("Dinesh Kandimalla").build();
    }

    @Override
    public CustomerDto saveCustomerDto(CustomerDto customerdto) {
        return CustomerDto.builder().customerId(UUID.randomUUID()).build();
    }

    @Override
    public void updateCustomerDto(UUID beerId, CustomerDto beerdto) {

    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        log.debug("Deleting a customer");
    }


}
