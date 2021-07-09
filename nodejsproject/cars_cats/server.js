const express = require('express');
const app = express();

app.get("/", (req, res) => (
    res.send("<h1>Hello world.</h1>")
));

app.use(express.static(__dirname + "/static"));




app.listen(8000, () => {
    console.log("Hello from 8000")
})