package dk.springpractice.msscbrewery.web.controller;

import dk.springpractice.msscbrewery.web.model.BeerDto;
import dk.springpractice.msscbrewery.web.model.CustomerDto;
import dk.springpractice.msscbrewery.web.services.CustomerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomerInfo(@PathVariable UUID customerId){
        return new ResponseEntity<>(customerService.getCustomerInfoById(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CustomerDto> handlePost(@RequestBody CustomerDto customerdto){
        CustomerDto savedDto = customerService.saveCustomerDto(customerdto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", "/api/v1/customer/" + savedDto.getCustomerId().toString());
        return new ResponseEntity(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    public ResponseEntity updateBeer(@PathVariable UUID customerId, @RequestBody CustomerDto customerDto){
        customerService.updateCustomerDto(customerId, customerDto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable UUID customerId){
        customerService.deleteCustomerById(customerId);
    }

}
