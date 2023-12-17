package org.grails.guides

class UrlMappings {
    static mappings = {

        "/index"(action: "index", controller: "contact")
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
