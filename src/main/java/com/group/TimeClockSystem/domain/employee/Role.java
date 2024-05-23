package com.group.TimeClockSystem.domain.employee;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@Getter
@RequiredArgsConstructor
public enum Role {
    MANAGER("ROLE_MANAGER"),
    MEMBER("ROLE_MEMBER");

    private final String value;
}
