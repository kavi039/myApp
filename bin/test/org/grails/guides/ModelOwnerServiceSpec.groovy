package org.grails.guides

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class ModelOwnerServiceSpec extends Specification implements ServiceUnitTest<ModelOwnerService> {

     void "test something"() {
        expect:
        service.doSomething()
     }
}
