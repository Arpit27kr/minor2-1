package com.upes.devopsproj.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;


@Entity
@Table(name = "workers")
@Data
public class Workers {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Long id;

	    @Column(name = "name")
	    private String name;

	    @Column(name = "description")
	    private String description;

	    @Column(name = "unit_price")
	    private Double unitPrice;

	    @Column(name = "image_url")
	    private String imageUrl;

	    @Column(name = "active")
	    private boolean active;

	    @Column(name = "units_in_stock")
	    private int unitsInStock;

	    @Column(name = "date_joined")
	    private LocalDate dateJoined;

	    @Column(name = "phone_number")
	    private String phoneNumber;

	    // Constructors, getters and setters

	    
	}


