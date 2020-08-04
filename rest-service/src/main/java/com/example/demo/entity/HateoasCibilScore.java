package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.hateoas.RepresentationModel;
import org.yaml.snakeyaml.representer.Representer;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "cibilscore")
public class HateoasCibilScore extends RepresentationModel<HateoasCibilScore>  {
	


		 @Id
		 int  id;
		 String panNumber;
		 String firstName;
		 double score;

}