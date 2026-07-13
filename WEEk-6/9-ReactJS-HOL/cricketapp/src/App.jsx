import React from "react";
import "./App.css";
import ListOfPlayer from "./ListOfPlayers";
import IndianPlayers from "./IndianPlayers";
function App() {
  const flag = false;
  if (flag) {
    return (
      <>
        <ListOfPlayer />
      </>
    );
  } else {
    return (
      <>
        <IndianPlayers />
      </>
    );
  }
}

export default App;
