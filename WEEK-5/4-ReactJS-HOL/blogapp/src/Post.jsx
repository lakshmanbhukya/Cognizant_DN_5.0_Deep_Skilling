const Post = (props) => {
  return (
    <div style={{borderBottom:'2px solid black'}}>
      <h3>{props.title}</h3>
      <p>{props.body}</p>
    </div>
  );
};

export default Post;
