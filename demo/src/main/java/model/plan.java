package model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
    @RequiredArgsConstructor
    public class plan {
        private final int id;
        private final String name;
    }

/*<img th:src="@{images/tata.jpg}" />*/