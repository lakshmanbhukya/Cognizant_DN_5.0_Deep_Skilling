CREATE TABLE customers (
    customer_id NUMBER PRIMARY KEY,
    customer_name VARCHAR2(100),
    age NUMBER,
    balance NUMBER(12, 2),
    is_vip VARCHAR2(5) DEFAULT 'FALSE'
);

CREATE TABLE loans (
    loan_id NUMBER PRIMARY KEY,
    customer_id NUMBER,
    loan_amount NUMBER(12, 2),
    interest_rate NUMBER(5, 2),
    due_date DATE,
    CONSTRAINT fk_customer FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

INSERT INTO customers (customer_id, customer_name, age, balance, is_vip) VALUES (1, 'Alice Smith', 65, 5000.00, 'FALSE');
INSERT INTO customers (customer_id, customer_name, age, balance, is_vip) VALUES (2, 'Bob Jones', 45, 12500.00, 'FALSE');
INSERT INTO customers (customer_id, customer_name, age, balance, is_vip) VALUES (3, 'Charlie Brown', 70, 15000.00, 'FALSE');
INSERT INTO customers (customer_id, customer_name, age, balance, is_vip) VALUES (4, 'Diana Prince', 32, 2500.00, 'FALSE');

INSERT INTO loans (loan_id, customer_id, loan_amount, interest_rate, due_date) 
VALUES (101, 1, 50000.00, 6.50, SYSDATE + 15);

-- Bob: High balance, loan due in 45 days
INSERT INTO loans (loan_id, customer_id, loan_amount, interest_rate, due_date) 
VALUES (102, 2, 20000.00, 5.00, SYSDATE + 45);

-- Charlie: Over 60, high balance, loan due in 10 days
INSERT INTO loans (loan_id, customer_id, loan_amount, interest_rate, due_date) 
VALUES (103, 3, 80000.00, 7.00, SYSDATE + 10);

-- Diana: Young, low balance, loan due in 60 days
INSERT INTO loans (loan_id, customer_id, loan_amount, interest_rate, due_date) 
VALUES (104, 4, 10000.00, 5.50, SYSDATE + 60);

COMMIT;

-- 1. Customer: Over 60, High Balance. Loan: Due in 5 days (Triggers Scenario 1, 2, and 3)
INSERT INTO customers (customer_id, customer_name, age, balance, is_vip) VALUES (5, 'Edward Elric', 62, 25000.00, 'FALSE');
INSERT INTO loans (loan_id, customer_id, loan_amount, interest_rate, due_date) VALUES (105, 5, 15000.00, 5.25, SYSDATE + 5);

-- 2. Customer: Under 60, High Balance. Loan: Due in 12 days (Triggers Scenario 2 and 3)
INSERT INTO customers (customer_id, customer_name, age, balance, is_vip) VALUES (6, 'Fiona Gallagher', 29, 11000.00, 'FALSE');
INSERT INTO loans (loan_id, customer_id, loan_amount, interest_rate, due_date) VALUES (106, 6, 5000.00, 4.50, SYSDATE + 12);

-- 3. Customer: Over 60, Low Balance. Loan: Due in 40 days (Triggers Scenario 1 only)
INSERT INTO customers (customer_id, customer_name, age, balance, is_vip) VALUES (7, 'George Miller', 67, 1500.00, 'FALSE');
INSERT INTO loans (loan_id, customer_id, loan_amount, interest_rate, due_date) VALUES (107, 7, 35000.00, 6.00, SYSDATE + 40);

-- 4. Customer: Under 60, Low Balance. Loan: Due in 20 days (Triggers Scenario 3 only)
INSERT INTO customers (customer_id, customer_name, age, balance, is_vip) VALUES (8, 'Hannah Abbott', 41, 4500.00, 'FALSE');
INSERT INTO loans (loan_id, customer_id, loan_amount, interest_rate, due_date) VALUES (108, 8, 12000.00, 5.75, SYSDATE + 20);

-- 5. Customer: Under 60, Low Balance. Loan: Due in 90 days (Will not trigger any scenarios—perfect for control testing)
INSERT INTO customers (customer_id, customer_name, age, balance, is_vip) VALUES (9, 'Ian Malcolm', 35, 8000.00, 'FALSE');
INSERT INTO loans (loan_id, customer_id, loan_amount, interest_rate, due_date) VALUES (109, 9, 45000.00, 6.20, SYSDATE + 90);

-- Save the changes to the database
COMMIT;

