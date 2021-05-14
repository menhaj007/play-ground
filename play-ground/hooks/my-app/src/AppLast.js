
import React from "react";
import { useState, useEffect } from "react";
import './App.css';

function AppLast() {
  const [resourceType, setResourceType] = useState("posts");
  const [items, setItems] = useState([]);
  // useEffect(() => {
  //   console.log("render")
  // }, [resourceType]);

  // useEffect(() => {
  //   console.log("render")
  // }, [])

  useEffect(() => {
    fetch(`https://jsonplaceholder.typicode.com/${resourceType}`)
    .then(response => response.json())
    .then(json => setItems(json))
  },[resourceType])


  return (
    <>
      <div className="App">
        <button onClick={ () => setResourceType("posts")}>Posts</button>
        <button onClick={ () => setResourceType("users")}>Users</button>
        <button onClick={ () => setResourceType("comments")}>Comments</button>
        
      </div>
      <h1>{resourceType}</h1>
      {items.map( item => {
        return <pre>{JSON.stringify(item)}</pre>
      })}
    </>
  );
}

export default App;


// const [count, setCount] = useState(() => 4);
  // const [state, setState] = useState( {count: 4, theme: "blue"} );

  // const decrement = () => {
  //   setState(prevState => {
  //     return {...prevState, count: prevState.count -1}
  //   });
  // }
  // const increment = () => {
  //   setState(prevState => {
  //     return {...prevState, count: prevState.count +1}
  //   });
  // }