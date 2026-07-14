import image from "./assets/360.png";
export default function RentalShowCase() {
  const name = "oggy";
  const price = 12000;
  const location = "vijayawada";

  return (
    <>
      <h1>Rental Homes</h1>
      <img src={image} alt="360" />
      <h2>{name}</h2>
      <h3 className={price > 10000 ? "font-red" : ""}>{price}</h3>
      <h4>{location}</h4>
    </>
  );
}
