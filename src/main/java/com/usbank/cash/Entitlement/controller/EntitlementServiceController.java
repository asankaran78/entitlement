package com.usbank.cash.Entitlement.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.usbank.cash.Entitlement.model.EntitlementResponse;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class EntitlementServiceController {
	


	EntitlementServiceController()
    {
       
    }

    @ApiOperation(value = "Gets the product and price information by product id")
    @ApiResponses(
            value = {@ApiResponse(code = 200, message = "Success response"),
                    @ApiResponse(code = 404, message = "Product not found")})
    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    ResponseEntity<EntitlementResponse> getEntitlementId(@PathVariable("id") String entitlementId) {

    	EntitlementResponse entitlementResponse = new EntitlementResponse();
    	entitlementResponse.setFeatureName("Pivot");
    	entitlementResponse.setFeatureType("Cash");
        return new ResponseEntity<>(entitlementResponse,HttpStatus.OK);
    }
	

}
