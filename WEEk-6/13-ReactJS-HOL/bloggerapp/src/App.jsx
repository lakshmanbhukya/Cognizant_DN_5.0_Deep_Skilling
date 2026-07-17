import "./App.css";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {
  return (
    <>
      <div style={{ display: "flex", gap: "20px" }}>
        <BookDetails />
        <BlogDetails />
        <CourseDetails />
      </div>
    </>
  );
}

export default App;
