package com.usbank.cash.Entitlement.controller


import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

import java.time.Instant
import java.time.format.DateTimeFormatter

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup

class EntitlementControllerSpec extends Specification {

    MockMvc mockMvc
    EntitlementServiceController entitlementController

    def setup() {

        entitlementController = new EntitlementServiceController()
        mockMvc = standaloneSetup(entitlementController).build()
    }

    def 'fetchrecordsByDate returns OK'() {
        given:
		String id = "1"

        when:
        def result = mockMvc.perform(get("/entitlements/${id}")
                .contentType(MediaType.APPLICATION_JSON))
                .andReturn() response

        then:
        result.status == HttpStatus.OK.value()
    }
}