package br.gov.sp.fatec.itu.contacts_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.fatec.itu.contacts_backend.Entities.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>{
    
}
