const express = require("express");
const app = express();
const bodyParser = require('body-parser');



// app.use(express.static())

// app.get("/", (req, res) => {
// 	return res.send("<h1> Registration </h1>")
// })


app.use(bodyParser.urlencoded({extends: false}))

app.post("/register",(req, res, next) => {
	res.send('<h1>User: ' + req.body.username + '</h1>')
})

app.get("/" ,(req, res, next) => {
	res.send(
		'<form action="/register" method="POST"> <input type="text" name="username"><button type="sumbit">submit</button>')
})





app.listen(8000);