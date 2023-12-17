package org.grails.guides

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class ModelOwnerServiceServiceSpec extends Specification implements ServiceUnitTest<ModelOwnerServiceService> {

     void "test something"() {
        expect:
        service.doSomething()
     }
}
