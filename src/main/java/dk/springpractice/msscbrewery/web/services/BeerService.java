package dk.springpractice.msscbrewery.web.services;

import dk.springpractice.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveBeerDto(BeerDto beerdto);

    void updateBeerDto(UUID beerId, BeerDto beerdto);

    void deleteBeerById(UUID beerId);
}
