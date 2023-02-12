package com.Raisetech.Task7.original;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DobController {

    @GetMapping("/dobs")
    public String getUserByDateOfBirth(@Validated UserDateFormat form, BindingResult result, @RequestParam("date_of_birth") String dateOfBirth) {
        if (result.hasErrors()) {
        }
        return "20字以上の文字や空文字及び、yyy/MM/dd様式以外の生年月日は入力は出来ません";
    }
}
