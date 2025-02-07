package com.example.springboot_tabelog_kadai.form;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReservationRegisterForm {
    private Integer storeId;
    
    private Integer userId;    
        
    private Date reservationDay;        
    
    private Integer numberOfPeople;
}
