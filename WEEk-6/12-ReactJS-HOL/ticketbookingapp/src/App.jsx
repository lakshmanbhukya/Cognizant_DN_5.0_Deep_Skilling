import { useState } from "react";
import GuestGreeting from "./GuestGreeting";
import UserGreeting from "./UserGreeting";
import "./App.css";

function App() {
  const [logged, IsLogged] = useState(false);

  const handleLogin = () => {
    IsLogged(true);
  };

  const handleLogout = () => {
    IsLogged(false);
  };
  let PageToDisplay;
  if (logged) {
    PageToDisplay = <UserGreeting onLogout={handleLogout} />;
  } else {
    PageToDisplay = <GuestGreeting onLogin={handleLogin} />;
  }
  return <>{PageToDisplay}</>;
}

export default App;
