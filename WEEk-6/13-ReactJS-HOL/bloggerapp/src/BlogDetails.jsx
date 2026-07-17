import React from "react";
import { Blogs } from "./data/Blog";
export default function BlogDetails() {
  const DisplayBlog = (
    <ul>
      {Blogs.map((blog) => {
        return (
          <div key={blog.id}>
            <h2>{blog.headLine}</h2>
            <p>{blog.desc}</p>
          </div>
        );
      })}
    </ul>
  );
  return (
    <div style={{ borderRight: "2px solid green" }}>
      <h1>Blog Details</h1>
      {DisplayBlog}
    </div>
  );
}
