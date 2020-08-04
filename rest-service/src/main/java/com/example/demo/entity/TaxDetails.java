package com.example.demo.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "taxdetails_august")
@NoArgsConstructor
@AllArgsConstructor
public class TaxDetails {

	 @Id
	 String panNumber;
	 String entityName;
	 String entityType;
	 String aadharNumber;
	 
}
