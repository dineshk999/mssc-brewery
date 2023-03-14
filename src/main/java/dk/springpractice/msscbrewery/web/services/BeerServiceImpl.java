package dk.springpractice.msscbrewery.web.services;

import dk.springpractice.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService{
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(beerId).
                beerName("Galaxy Cat").beerStyle("Pale Ale").build();
    }

    @Override
    public BeerDto saveBeerDto(BeerDto beerdto) {
        return BeerDto.builder().id(UUID.randomUUID()).beerStyle("Heineken").build();
    }

    @Override
    public void updateBeerDto(UUID beerId, BeerDto beerdto) {

    }

    @Override
    public void deleteBeerById(UUID beerId) {
        log.debug("Deleting beer");
    }


}
