import React from "react";

export default function UserGreeting({ onLogout }) {
  return (
    <div>
      <h1>Welcome Back!</h1>
      <button onClick={onLogout}>logout</button>
    </div>
  );
}
