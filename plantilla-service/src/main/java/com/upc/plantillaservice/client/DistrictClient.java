package com.upc.plantillaservice.client;

import com.upc.plantillaservice.model.District;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "geographics-service", fallback = DistrictHystrixFallbackFactory.class)
//@RequestMapping(value = "/geographics/districts"
public interface DistrictClient {
    @GetMapping(value = "/geographics/districts/{id}")
    public ResponseEntity<District> getDistrict(@PathVariable("id") long id);
}
