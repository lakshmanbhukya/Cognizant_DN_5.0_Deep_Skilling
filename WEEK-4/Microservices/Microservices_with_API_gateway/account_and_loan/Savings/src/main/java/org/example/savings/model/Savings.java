package org.example.savings.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Savings {
    private String account_number;
    private String type;
    private String loan;
    private String emi;
    private String tenure;
}
