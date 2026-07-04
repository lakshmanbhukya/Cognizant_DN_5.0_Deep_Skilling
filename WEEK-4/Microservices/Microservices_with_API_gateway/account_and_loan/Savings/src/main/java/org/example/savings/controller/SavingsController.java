package org.example.savings.controller;

import org.example.savings.model.Savings;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/savings")
public class SavingsController {
    private static List<Savings> list=new ArrayList<Savings>();
    static{
        list.add(new Savings("00987987973432", "savings", "0", "0", "0"));
            list.add(new Savings("H00987987972342", "car", "400000", "3258", "18"));
        list.add(new Savings("H00564312987453", "home", "5000000", "42000", "240"));
        list.add(new Savings("00341298765432", "savings", "0", "0", "0"));
        list.add(new Savings("H00129843765129", "personal", "150000", "5300", "36"));
    }

    @GetMapping("/{accountnumber}")
    public ResponseEntity<Savings> getSavings(@PathVariable("accountnumber") String accountnumber){
        for(Savings savings: list){
            if(savings.getAccount_number().equals(accountnumber)){
                return ResponseEntity.ok(savings);
            }
        }
        return ResponseEntity.notFound().build();
    }
}
