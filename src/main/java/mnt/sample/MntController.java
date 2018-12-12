package mnt.sample;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hello")
public class MntController {

    @Get
    public String hello() {

        return "hello world!!!";
    }
}