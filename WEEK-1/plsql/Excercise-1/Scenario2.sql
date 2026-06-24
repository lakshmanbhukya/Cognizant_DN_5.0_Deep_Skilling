BEGIN
    -- The loop finds everyone with a balance > 10,000
    FOR record IN (SELECT customer_id FROM customers WHERE balance > 10000) LOOP
        
        UPDATE customers
        SET is_vip = 'TRUE'
        WHERE customer_id = record.customer_id;
        
    END LOOP;
    
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('VIP promotions applied successfully.');
END;
/