import React from "react";

export default function GuestGreeting({ onLogin }) {
  return (
    <>
      <h1>Please Sign Up</h1>
      <button onClick={onLogin}>login</button>
    </>
  );
}
