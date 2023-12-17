package org.grails.guides

import org.springframework.stereotype.Service

import javax.transaction.Transactional

@Service
@Transactional
class ContactService {

    def save(int number,String name)  {
        new Contact(phoneNumber: number, name:  name).save()
    }
}
