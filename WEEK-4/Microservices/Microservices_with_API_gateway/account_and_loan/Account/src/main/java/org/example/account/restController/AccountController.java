package org.example.account.restController;

import org.example.account.model.Account;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/account")
public class AccountController {
    public static List<Account> account=new ArrayList<Account>();
    static {
        account.add(new Account("00987987973432","savings",234343));
        account.add(new Account("00987987573432","savings",234345));
        account.add(new Account("00987987673432","savings",234346));
        account.add(new Account("00987987473432","savings",234347));
        account.add(new Account("00987987073432","savings",234348));
    }

    @GetMapping("/{account_id}")
    public ResponseEntity<Account> getAccountById(@PathVariable String account_id){
        for(Account a : account){
            if(a.getAccount_id().equals(account_id)){
                return ResponseEntity.ok(a);
            }
        }
        return ResponseEntity.status(HttpStatusCode.valueOf(204)).build();
    }


}
