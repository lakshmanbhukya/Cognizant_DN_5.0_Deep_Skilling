import "../css/calscore.css";

function CalculatorScore({ name, school, total, goal }) {
  const PercentToDecimal = (val) => {
    return val.toFixed(2) + "%";
  };
  const calScore = (total, goal) => {
    return PercentToDecimal(total / goal);
  };

  return (
    <div>
      <h1>Name : {name}</h1>
      <h2>School : {school}</h2>
      <h2>Total :{total}</h2>
      <h2>Goal :{goal}</h2>
      <h2>score {calScore(total, goal)}</h2>
    </div>
  );
}
export default CalculatorScore;
