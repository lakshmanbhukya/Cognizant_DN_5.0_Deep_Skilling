import { useState } from "react";
import CurrencyConverter from "./components/CurrencyConveter";
import "./App.css";

function App() {
  const [count, setCount] = useState(0);
  const increment = () => {
    setCount(count + 1);
    alert("Hello !! this is a static message");
  };
  const decrement = () => {
    setCount(count - 1);
  };
  const welcome = (message) => {
    alert("this is a static msg with paramter " + message);
  };

  const onPress = () => {
    alert("I was clicked");
  };

  return (
    <>
      <h2>{count}</h2>
      <button onClick={increment}>increment</button>
      <button onClick={decrement}>decrement</button>
      <button onClick={() => welcome("CTS")}>Say Welcome</button>
      <button onClick={onPress}>Click me</button>
      <br />
      <br />
      <CurrencyConverter />
    </>
  );
}

export default App;
