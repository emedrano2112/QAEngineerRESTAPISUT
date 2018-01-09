package com.instacarrogenderize.io;
/*
 * Instacarro QA Automation Test
 * Author: Rafael E. Medrano
 * Date: 1/8/2018
 */

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class RestAPIConfig
{
    public String ExecuteAPIForSingle(String URL, String Parameter)
    {
        RestAssured.baseURI = URL;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, Parameter);
        String responseBody = response.getBody().asString();
        return responseBody;
    }

    public String ExecuteAPIForThree(String URL, String Parameter1, String Parameter2, String Parameter3)
    {
        RestAssured.baseURI = URL;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, Parameter1+Parameter2+Parameter3);
        String responseBody = response.getBody().asString();
        return responseBody;
    }

    public String ExecuteAPIForSingleAndLocationID(String URL, String Parameter1, String Parameter2)
    {
        RestAssured.baseURI = URL;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, Parameter1+Parameter2);
        String responseBody = response.getBody().asString();
        return responseBody;
    }
}
