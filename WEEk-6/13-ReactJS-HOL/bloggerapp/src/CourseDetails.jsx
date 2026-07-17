import React from "react";
import { Courses } from "./data/Course";
export default function CourseDetails() {
  const DisplayBlogs = (
    <ul>
      {Courses.map((course) => {
        return (
          <div key={course.id}>
            <h2>{course.name}</h2>
            <p>{course.duration}</p>
          </div>
        );
      })}
    </ul>
  );
  return (
    <div>
      <h1>Course Details</h1>
      {DisplayBlogs}
    </div>
  );
}
