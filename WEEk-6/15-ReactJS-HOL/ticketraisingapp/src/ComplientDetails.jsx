import React, { useState } from "react";

function ComplaintRegister() {
  // 1. Define state for controlled components
  const [employeeName, setEmployeeName] = useState("");
  const [complaint, setComplaint] = useState("");

  // 2. Handle form submission
  const handleSubmit = (e) => {
    // Prevent default form reload behavior
    e.preventDefault();

    // Generate a random reference number (e.g., REF-1678901234567)
    const referenceNumber = `REF-${Date.now()}`;

    // Show the alert box with the reference number and details
    alert(
      `Complaint Registered Successfully!\n\n` +
        `Reference Number: ${referenceNumber}\n` +
        `Employee Name: ${employeeName}\n` +
        `Complaint: ${complaint}\n\n` +
        `Please save the Reference Number for further follow-ups.`,
    );

    // Optional: Clear the form fields after submission
    setEmployeeName("");
    setComplaint("");
  };

  // 3. Render the form with various input controls
  return (
    <div>
      <h2>Raise a Complaint</h2>

      <form onSubmit={handleSubmit}>
        <div style={{ marginBottom: "15px" }}>
          <label htmlFor="empName">Employee Name:</label>
          <input
            type="text"
            id="empName"
            value={employeeName}
            onChange={(e) => {
              setEmployeeName(e.target.value);
        }}
            required
          />
        </div>

        {/* Textarea for Complaint */}
        <div style={{ marginBottom: "15px" }}>
          <label htmlFor="complaintText">Complaint Details:</label>
          <textarea
            id="complaintText"
            value={complaint}
            onChange={(e) => setComplaint(e.target.value)}
            rows="5"
            required
          />
        </div>

        {/* Button to Submit Form */}
        <button type="submit">Submit Complaint</button>
      </form>
    </div>
  );
}

export default ComplaintRegister;
