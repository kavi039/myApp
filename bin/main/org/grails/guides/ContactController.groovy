package org.grails.guides

class ContactController {

    def index() {
        def contacts = Contact.findAll()
        //redirect action: "list"
        println("..........index.............${contacts.size()}...............")
        render ([view :"list",contacts: contacts])

    }
    def create = {
        println("..........index............................")
        render ([view :"create"])
    }

    def save() {
        def contact = new Contact(params)
        contact.save flush: true, failOnError: true
        redirect action: "show", id: contact.id

    }

    def edit() {
        def contact = Contact.get(params.id)
        render ([view :"edit",contact: contact])
    }

    def update() {
        def contact = Contact.get(params.id)
        contact.properties = params
        contact.save flush: true, failOnError: true
        redirect action: "show", id: params.id
    }

    def show() {
        def contact = Contact.get(params.id)
        render ([view :"show",contact: contact])

    }

    def list() {
        println("......................................")
        def contacts = Contact.findAll()
      //  [contacts: contacts]
        render ([view :"list",contacts: contacts])
    }

    def delete() {
        def contact = Contact.get(params.id)
        contact.delete flush: true, failOnError: true
        redirect action: "index"

    }
}
