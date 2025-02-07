package com.example.springboot_tabelog_kadai.form;

import java.time.LocalDate;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ReservationInputForm {
	
    @NotBlank(message = "予約希望日を選択してください。")
    private String reservationDate;  

    @NotBlank(message = "予約希望時間を選択してください。")
    private String reservationTime;

    @NotNull(message = "人数を入力してください。")
    @Min(value = 1, message = "人数は1人以上に設定してください。")
    private Integer numberOfPeople;
    
    public LocalDate getReservationDay() {
        return getReservationDay();
    }
       
}
