import React, { useState } from "react";

export default function CurrencyConverter() {
  const [INR, setINR] = useState(0);
  const [Euro, setEuro] = useState(0);
  const handleSubmit = (e) => {
    e.preventDefault();
    const conversionRate = 90;
    const convertedAmount = (INR / conversionRate).toFixed(2);
    setEuro(convertedAmount);
  };
  return (
    <>
      <h1 style={{ color: "green" }}>Currency Convertor !!!</h1>
      Amount :
      <input
        type="number"
        id="amount"
        onChange={(e) => setINR(e.target.value)}
      />
      <br></br>
      <button onClick={handleSubmit}>submit</button>
      <br></br>
      currency : <input type="number" id="current" value={Euro} />
    </>
  );
}
