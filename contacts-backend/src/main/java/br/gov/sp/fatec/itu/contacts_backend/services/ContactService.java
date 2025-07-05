package br.gov.sp.fatec.itu.contacts_backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.itu.contacts_backend.Entities.Contact;
import br.gov.sp.fatec.itu.contacts_backend.repositories.ContactRepository;
import jakarta.persistence.EntityNotFoundException;

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

    public void update(Contact contact, long id){
        Contact aux = repository.getReferenceById(id);
        
        aux.setEmail(contact.getEmail());
        aux.setName(contact.getName());
        aux.setPhone(contact.getPhone());
        aux.setAddress(contact.getAddress());
        aux.setBirthday(contact.getBirthday());
        aux.setTitle(contact.getTitle());
        aux.setCompany(contact.getCompany());
        aux.setCategory(contact.getCategory());
        aux.setFavorite(contact.isFavorite());

        repository.save(aux);
    }

    public void delete(long id){
        if(repository.existsById(id))
        {
            repository.deleteById(id);
        }
        else
        {
            throw new EntityNotFoundException("contato não cadastrado");
        }
    }

}
