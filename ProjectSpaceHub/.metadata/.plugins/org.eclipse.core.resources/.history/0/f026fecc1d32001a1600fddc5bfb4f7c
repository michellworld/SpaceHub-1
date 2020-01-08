/**
 * 
 */
package com.project.product.entity;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author gbemisola
 *
 */
@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="product_plan")
	private String productPlan;
	
	@Column(name="product_price")
	private double productPrice;
	
	@Lob
	@Column(name="product_photo")
	private byte[] productPhoto;
	
	
	public Product() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPlan() {
		return productPlan;
	}

	public void setProductPlan(String productPlan) {
		this.productPlan = productPlan;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	
	

	public byte[] getProductPhoto() {
		return productPhoto;
	}

	public void setProductPhoto(byte[] productPhoto) {
		this.productPhoto = productPhoto;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productPlan=" + productPlan + ", productPrize="
				+ productPrice + ", productPhoto=" + Arrays.toString(productPhoto) + "]";
	}

	
	
	
	
	
	
	

}
