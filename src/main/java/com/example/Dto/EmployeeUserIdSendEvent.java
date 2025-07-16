package com.example.Dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class EmployeeUserIdSendEvent {
    private Integer userId;

    public EmployeeUserIdSendEvent(Integer userId) {
        this.userId = userId;
    }
}