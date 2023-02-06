package com.Raisetech.Task7.original;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DobController {

 @GetMapping("/dobs")
     public Map<String,String> getNames(@RequestParam("date_of_birthday") String date_of_birthday) {
         return Map.of("aoki","1989/10/31");
     }
 }


