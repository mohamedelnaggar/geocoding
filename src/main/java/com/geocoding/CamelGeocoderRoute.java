package com.geocoding;

import com.geocoding.domain.CamelGeoModel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;


/**
 * apache camel component that creates th rest and integrate with google coding out of the box
 */
@Component
public class CamelGeocoderRoute extends RouteBuilder{

    /**
     * rest request used to get address information
     * @throws Exception
     */
    @Override
    public void configure() throws Exception {

        rest("/geocoder").description("Geocoder REST service")
                .consumes("application/json")
                .produces("application/json")

                // TODO : return type not binding successfully
                .get().description("Geocoder address lookup").outTypeList(CamelGeoModel.class)
                .param().name("address").type(RestParamType.query).description("The address to lookup").dataType("string").endParam()
                .responseMessage().code(200).message("Geocoder successful").endResponseMessage()
                // call the geocoder to lookup details from the provided address
                .toD("geocoder:address:${header.address}");

    }
}
