package org.grails.guides

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ModelOwnerSpec extends Specification implements DomainUnitTest<ModelOwner> {

     void "test domain constraints"() {
        when:
        ModelOwner domain = new ModelOwner()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
