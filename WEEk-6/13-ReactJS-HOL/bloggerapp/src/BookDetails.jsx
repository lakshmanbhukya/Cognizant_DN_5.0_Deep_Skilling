import React from "react";
import { Books } from "./data/Book";
export default function BookDetails() {
  const DisplayBooks = (
    <ul>
      {Books.map((book) => {
        return (
          <div key={book.id}>
            <h2> Name : {book.title}</h2>
            <p>Price : {book.price}</p>
            {book.saleCount >= 100 && (
              <span
                style={{
                  fontStyle: "italic",
                  fontSize: "20px",
                  color: "orangered",
                }}
              >
                Best Seller
              </span>
            )}
          </div>
        );
      })}
    </ul>
  );
  return (
    <div style={{ borderRight: "2px solid green" }}>
      <h1>Book Details</h1>
      {DisplayBooks}
    </div>
  );
}
