package org.grails.guides

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class VehicleServiceSpec extends Specification implements ServiceUnitTest<VehicleService> {

     void "test something"() {
        expect:
        service.doSomething()
     }
}
