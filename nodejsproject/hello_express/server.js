const express = require("express");
const app = express();



app.use(express.static(__dirname + "/static"));

app.set("views", __dirname + "/views");
app.set("view engine", "ejs");

app.get("/", (req, res) => (
    res.sendFile(
        "/index.html"
    )
));

app.get("/h", (req, res) => (
    res.sendFile("/static/helloworld")
))


console.log(__dirname)

app.get("/users", function(req, res) {
    const users_array = [
        {name: "Michael", email: "michael@codingdojo.com"}, 
        {name: "Jay", email: "jay@codingdojo.com"}, 
        {name: "Brendan", email: "brendan@codingdojo.com"}, 
        {name: "Andrew", email: "andrew@codingdojo.com"}
    ];

    res.render("users", {users: users_array});
})




const port = 8000;
app.listen(port, () => {
    console.log("Sever is running on port "+ port);
});