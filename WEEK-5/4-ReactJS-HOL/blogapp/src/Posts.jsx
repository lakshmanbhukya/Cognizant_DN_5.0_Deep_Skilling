import React, { Component } from 'react';
import Post from './Post';

class Posts extends Component {
  // Step 5: Initialize state with an empty list of posts
  constructor(props) {
    super(props);
    this.state = {
      posts: []
    };
  }

  // Step 6: Create loadPosts method using Fetch API
  loadPosts = () => {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(data => {
        this.setState({
          posts: data
        });
      })
      .catch(error => {
        console.error("Error fetching posts:", error);
        throw error; // Throw error to trigger componentDidCatch if needed
      });
  };

  // Step 7: Implement componentDidMount to call loadPosts
  componentDidMount() {
    this.loadPosts();
  }

  // Step 9: Implement componentDidCatch for error handling
  componentDidCatch(error, errorInfo) {
    alert("An error occurred while loading posts: " + error.message);
    console.log("Error Info:", errorInfo);
  }

  // Step 8: Render the list of posts
  render() {
    return (
      <div>
        <h1>Blog Posts</h1>
        {this.state.posts.map(post => (
          <Post key={post.id} title={post.title} body={post.body} />
        ))}
      </div>
    );
  }
}

export default Posts;
