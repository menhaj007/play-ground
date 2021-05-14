import React, {useEffect, useState} from "react";

export default function App3() {
const [resourceType, setResourceType] = useState("posts");
 
useEffect(() => {
    console.log("ReSource Change")
    return () => {
        // cleanup
        console.log("Return from resource changed")
    }
}, [resourceType])

  return (
    <>
      <div className="App">
        <button onClick={ () => setResourceType("posts")}>Posts</button>
        <button onClick={ () => setResourceType("users")}>Users</button>
        <button onClick={ () => setResourceType("comments")}>Comments</button>
        
      </div>
      <h1>{resourceType}</h1>
      
    </>
  );
}