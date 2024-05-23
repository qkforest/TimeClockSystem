package com.group.TimeClockSystem.domain.team;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Team {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;

        public Long getId() {
                return id;
        }

        public String getName() {
                return name;
        }

        public String getManager() {
                return manager;
        }

        public int getEmployeeCount() {
                return EmployeeCount;
        }

        private String manager;
        private int EmployeeCount;

        public void increaseEmployeeCount() {
                EmployeeCount++;
        }

        public void registerManager(String manager) {
                this.manager = manager;
        }
}
