package com.jit.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.Table;

@Entity
@Table
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name="firstProcedure",
			procedureName="getAllProductData"),
	@NamedStoredProcedureQuery(name="secondProcedure",
	procedureName="getAllCustomerDetailsProductData"),
    @NamedStoredProcedureQuery(name="thirdProcedure",
    procedureName="getProductCustomerDetailsById")})

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String name;
private Double price;
private String description;
private String photo;
private String quantity;
private boolean featured;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
public boolean isFeatured() {
	return featured;
}
public void setFeatured(boolean featured) {
	this.featured = featured;
}

}
