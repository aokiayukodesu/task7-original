package com.Raisetech.Task7.original;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class User {

    @NotBlank
    @NotNull
    @Size(min = 1, max = 20)
    private String name;

    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private LocalDate birthday;

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
