package com.development.task_springboot.dto;

import com.development.task_springboot.enums.TaskStatus;
import lombok.Data;

import java.util.Date;

@Data
public class TaskDto {
    private Long id;
    private String title;
    private String description;
    private Date dueDate;
    private String priority;
    private TaskStatus taskStatus;
    private Long employeeId;
    private String employeeName;
}
