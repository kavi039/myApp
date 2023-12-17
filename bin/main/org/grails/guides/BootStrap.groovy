package org.grails.guides

import org.springframework.beans.factory.annotation.Autowired

class BootStrap {

    @Autowired
    ContactService contactService

    def init = { servletContext ->
        for(int i=0;i<=10;i++){
            contactService.save(99999, "name"+i)
        }
    }
    def destroy = {
    }
}