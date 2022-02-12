
package com.estudoscx.spring.cx.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "Product")
@SuppressWarnings("serial")
public class ProductModel implements Serializable {  
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String price;
    
    @Column(nullable = false)
    private boolean availableOnline;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isAvailableOnline() {
        return availableOnline;
    }

    public void setAvailableOnline(boolean availableOnline) {
        this.availableOnline = availableOnline;
    }
    
}
