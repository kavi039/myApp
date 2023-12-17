package org.grails.guides

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class ModelServiceSpec extends Specification implements ServiceUnitTest<ModelService> {

     void "test something"() {
        expect:
        service.doSomething()
     }
}
