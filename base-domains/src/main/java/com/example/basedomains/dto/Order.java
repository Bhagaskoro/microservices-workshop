package com.example.basedomains.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * @author Dian Bhagaskoro
 * @created 28/05/2023-14:32
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private BigInteger orderId;
    private String name;
    private int qty;
    private double price;
}
