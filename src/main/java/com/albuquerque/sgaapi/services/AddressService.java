package com.albuquerque.sgaapi.services;

import com.albuquerque.sgaapi.entities.Address;
import com.albuquerque.sgaapi.repositories.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressService {

    private final AddressRepository repository;

    public Address save(Address address) {
        return repository.save(address);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
