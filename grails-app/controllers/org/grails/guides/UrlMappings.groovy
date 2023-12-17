package org.grails.guides

class UrlMappings {
    static mappings = {

        "/index"(action: "index", controller: "contact")
        "/contact/create"(action: "create", controller: "contact")
        "/contact/show"(action: "show", controller: "contact")
        "/contact/save"(action: "save", controller: "contact")
        "/contact/edit"(action: "edit", controller: "contact")
        "/contact/update"(action: "update", controller: "contact")
        "/contact/delete"(action: "delete", controller: "contact")
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
