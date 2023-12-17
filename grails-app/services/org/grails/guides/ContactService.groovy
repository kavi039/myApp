package org.grails.guides

import grails.gorm.transactions.Transactional
import org.springframework.stereotype.Service


@Service
class ContactService {

    def save(int number, String name) {
        new Contact(phoneNumber: number, name: name).save()
    }

    @Transactional
    def delete(Long id) {
        def contact = Contact.findById(id)
        contact.delete()
    }
}
