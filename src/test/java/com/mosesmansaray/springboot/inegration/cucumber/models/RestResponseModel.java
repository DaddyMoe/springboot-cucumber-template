package com.mosesmansaray.springboot.inegration.cucumber.models;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
@Scope("cucumber-glue")
@Data
public class RestResponseModel {

    private ResponseEntity response;

}
