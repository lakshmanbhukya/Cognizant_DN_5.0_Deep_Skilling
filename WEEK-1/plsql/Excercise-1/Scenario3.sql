BEGIN
    DBMS_OUTPUT.PUT_LINE('--- LOAN DUE REMINDERS ---');

    -- The loop pulls customer and loan info for anything due in 30 days
    FOR record IN (
        SELECT l.loan_id, c.customer_name, l.due_date, l.loan_amount
        FROM loans l
        JOIN customers c ON l.customer_id = c.customer_id
        WHERE l.due_date BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        
        -- 'record' dynamically holds the columns from our SELECT query
        DBMS_OUTPUT.PUT_LINE('Reminder: Dear ' || record.customer_name || 
                             ', your loan ' || record.loan_id || 
                             ' of $' || record.loan_amount || 
                             ' is due on ' || TO_CHAR(record.due_date, 'YYYY-MM-DD') || '.');
    END LOOP;
END;
/