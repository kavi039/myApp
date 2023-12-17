package org.grails.guides

import grails.gorm.transactions.Transactional
import org.springframework.stereotype.Controller

@Controller
class ContactController {

    def index() {
        def contacts = Contact.findAll()
        //redirect action: "list"
        println("..........index.............${contacts.size()}...............")
        render (view :"list",model:[contacts: contacts])

    }
    def create = {
        println("..........index............................")
        render (view :"create")
    }

    def save() {
        def contact = new Contact(params)
        contact.save ()
        println(">>>>>>>>>>>>>>>>>>>>>>>>Save ${contact}")
        redirect (action: "show", id: contact.id)

    }

    def edit() {
        def contact = Contact.get(params.id)
        render (view :"edit",model:[contact: contact])
    }

    @Transactional
    def update() {
        def contact = Contact.findById(params.id)
        contact.properties = params
        contact = contact.save()
        //render (view: "show", model:[contact: contact])
        redirect action: "show", id: params.id
    }

    def show() {
        def contact = Contact.get(params.id)
        render (view :"show",model:[contact: contact])

    }

    def list() {
        println("......................................")
        def contacts = Contact.findAll()
      //  [contacts: contacts]
        render (view :"list",model:[contacts: contacts])
    }

    @Transactional
    def delete() {
        def contact = Contact.findById(params.id)
        contact.delete()
        redirect action: "index"

    }
}
