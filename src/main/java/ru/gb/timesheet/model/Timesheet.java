package ru.gb.timesheet.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Описание структуры json-ответа на REST-запросы.
 * Т.е. запросы, ответ на которые - JSON.
 */
@Setter
@Getter
@Data
public class Timesheet {

// Геттеры и сеттеры
  private Long id;
  private Long projectId;
  private String projectName;
  private int minutes;
  private LocalDate createdAt;


}
