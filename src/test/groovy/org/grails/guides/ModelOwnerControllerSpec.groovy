package org.grails.guides

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class ModelOwnerControllerSpec extends Specification implements ControllerUnitTest<ModelOwnerController> {

     void "test index action"() {
        when:
        controller.index()

        then:
        status == 200

     }
}
