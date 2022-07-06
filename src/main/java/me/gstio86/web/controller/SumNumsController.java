package me.gstio86.web.controller;

import me.gstio86.web.obj.Data;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class SumNumsController {

    @RequestMapping(value = "sumTwoNums", method = RequestMethod.POST , consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> sumTwoNums(@RequestBody Data req) {
        return ResponseEntity.ok().body(req.getSum2Json());
    }
}
