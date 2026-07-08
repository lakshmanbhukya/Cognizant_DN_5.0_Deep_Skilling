import "./App.css";
import CalculatorScore from "./components/CalculatorScore";
function App() {
  return (
    <>
    <h1>School Score</h1>
      <CalculatorScore
        name={"playerone"}
        school={"pvpsit"}
        total={284}
        goal={3}
      />
    </>
  );
}

export default App;
