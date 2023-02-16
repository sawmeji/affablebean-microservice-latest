package com.example.affabblebeanui.ds;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@ToString
public  class TransPortInfoEntity {

        @JsonProperty("customer_name") private Set<String> customerName;
        private String email;
        private List<ProductDto> products;
        @JsonProperty("total_amount")
        private List<Double> totalAmount;

        public TransPortInfoEntity(){

        }

        public TransPortInfoEntity(Set<String> customerName, String email, List<ProductDto> products, List<Double> totalAmount) {
                this.customerName = customerName;
                this.email = email;
                this.products = products;
                this.totalAmount = totalAmount;
        }
}
