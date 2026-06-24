CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department IN VARCHAR2,
    p_bonus_percentage IN NUMBER
) AS
BEGIN
    UPDATE employees
    SET salary = salary + (salary * (p_bonus_percentage / 100))
    WHERE department = p_department;
    
    DBMS_OUTPUT.PUT_LINE('Bonus applied to employees in department: ' || p_department);
    COMMIT;
EXCEPTION
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error updating employee bonus: ' || SQLERRM);
END UpdateEmployeeBonus;
/

-- EXEC UpdateEmployeeBonus('Sales', 10);