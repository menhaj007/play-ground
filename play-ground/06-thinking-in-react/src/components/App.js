import randomColor from "randomcolor";
import React, {useState, useEffect} from "react";
const data = [{id: 1, firstName: "Kim"}, {id: 2, firstName: "Joni"}, {id: 3, firstName: "Khalid"}];
function App() {
  const [count, setCount] = useState(0);
  const [color, setColor] = useState("");
  const [customer, setCustomer] = useState(data);
  

  function increment() {
    setCount(count +1);
  }
  function decrement() {
    setCount(prevCount => prevCount < 1? prevCount=0: prevCount-1);
  }
  useEffect(()=> {
    setColor(randomColor);
  },[count])
  return (
    <div className="container">
      <button className="col" onClick={increment}>+</button>
        <h1 className="col" style={{color:color}}> {count} </h1>
      <button className="col" onClick={decrement}>-</button>
      <div>
        
      </div>
    </div>
  );
}

export default App;
