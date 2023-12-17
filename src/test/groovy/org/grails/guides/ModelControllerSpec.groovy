package org.grails.guides

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class ModelControllerSpec extends Specification implements ControllerUnitTest<ModelController> {

     void "test index action"() {
        when:
        controller.index()

        then:
        status == 200

     }
}
