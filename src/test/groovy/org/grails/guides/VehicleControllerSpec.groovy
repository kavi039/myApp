package org.grails.guides

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class VehicleControllerSpec extends Specification implements ControllerUnitTest<VehicleController> {

     void "test index action"() {
        when:
        controller.index()

        then:
        status == 200

     }
}
