package com.example.model;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "studenta_1")
public class Student implements Serializable {
	@EmbeddedId
	private StudentID studentId;
	
	private int schoolId;
	private int score;
}
