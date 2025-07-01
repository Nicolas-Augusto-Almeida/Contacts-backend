package br.gov.sp.fatec.itu.contacts_backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.itu.contacts_backend.Entities.Contact;
import br.gov.sp.fatec.itu.contacts_backend.repositories.ContactRepository;

@Service
public class ContactService {
    
    @Autowired
    private ContactRepository repository;

    public List<Contact> getAll(){
        return repository.findAll();
    }

    public Contact save(Contact contact){
        return repository.save(contact);
    }

}
