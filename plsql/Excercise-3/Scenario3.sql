CREATE OR REPLACE PROCEDURE TransferFunds (
    sender_id IN INT,
    reciver_id IN INT,
    transfer_amount IN INT
) AS
    sender_balance INT; 
BEGIN
    -- 1. Fetch the sender's current balance
    SELECT balance INTO sender_balance
    FROM accounts
    WHERE account_id = sender_id; 

    -- 2. Check if the sender has enough money
    IF sender_balance >= transfer_amount THEN

        -- Credit the receiver's account
        UPDATE accounts
        SET balance = balance + transfer_amount
        WHERE account_id = reciver_id;

        -- Debit the sender's account
        UPDATE accounts
        SET balance = balance - transfer_amount
        WHERE account_id = sender_id;
        
    END IF;
    
    -- 3. Save the changes
    COMMIT;
END TransferFunds;
/

--EXEC TransferFunds(102, 101, 2000.00);