import React from "react";

export default function ListOfPlayer() {
  const players = [
    { name: "Virat Kohli", score: 90 },
    { name: "Rohit Sharma", score: 80 },
    { name: "Shubman Gill", score: 65 },
    { name: "KL Rahul", score: 55 },
    { name: "Hardik Pandya", score: 72 },
    { name: "Ravindra Jadeja", score: 68 },
    { name: "R Ashwin", score: 75 },
    { name: "Mohammed Shami", score: 60 },
    { name: "Jasprit Bumrah", score: 85 },
    { name: "Siraj", score: 50 },
    { name: "Ishan Kishan", score: 95 },
  ];

  const below70 = players.filter((player) => player.score < 70);

  return (
    <>
      <h1>List of Players</h1>
      <ul>
        {players.map((player) => (
          <li key={player.name}>
            {" "}
            {player.name} - {player.score}{" "}
          </li>
        ))}
      </ul>
      <h1>List of players below 70</h1>
      <ul>
        {below70.map((player) => (
          <li key={player.name}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </>
  );
}
