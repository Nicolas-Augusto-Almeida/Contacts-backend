package br.gov.sp.fatec.itu.contacts_backend.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.itu.contacts_backend.Entities.Contact;
import br.gov.sp.fatec.itu.contacts_backend.services.ContactService;

@RestController
@RequestMapping("contacts")
public class ContactsController {
    
    @Autowired
    private ContactService service;

    @GetMapping
    public ResponseEntity<List<Contact>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    public ResponseEntity<Contact> save(@RequestBody Contact contact){
        return ResponseEntity.created(null).body(service.save(contact));
    }

    @PutMapping("{id}")
    public ResponseEntity<Void> update(@RequestBody Contact contact, long id){
        service.update(contact, id);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable long id){
        service.delete(id);

        return ResponseEntity.noContent().build();
    }
}
