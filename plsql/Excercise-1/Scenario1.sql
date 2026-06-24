BEGIN
    -- The loop automatically grabs the IDs of anyone over 60
    FOR record IN (SELECT customer_id FROM customers WHERE age > 60) LOOP
        
        UPDATE loans
        SET interest_rate = interest_rate - 1
        WHERE customer_id = record.customer_id;
        
    END LOOP;
    
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Interest rate discounts applied successfully.');
END;
/