package org.grails.guides

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ModelSpec extends Specification implements DomainUnitTest<Model> {

     void "test domain constraints"() {
        when:
        Model domain = new Model()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
