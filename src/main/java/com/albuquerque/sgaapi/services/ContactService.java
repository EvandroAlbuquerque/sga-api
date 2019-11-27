package com.albuquerque.sgaapi.services;

import com.albuquerque.sgaapi.entities.Contact;
import com.albuquerque.sgaapi.repositories.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContactService {

    private final ContactRepository repository;

    public Contact save(Contact contact) {
        return repository.save(contact);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
