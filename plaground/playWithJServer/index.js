const BASE_URL = "http://localhost:3000/employees/";
getData(BASE_URL);
handleSubmit(BASE_URL);
deleteObj(BASE_URL);
readDataForDelete(BASE_URL);

function getData(url) {
    fetch(url).then(r => r.json()).then(data => data.forEach(element => {
        display(element);
    }))
}
function display(data) {
    const firstName = document.createElement("h3");
    const lastName = document.createElement("h3");
    const email = document.createElement("email");
    const image = document.createElement("img");
    const btn = document.createElement("button");
    
    
    firstName.innerText = data.first_name;
    lastName.innerText = data.last_name;
    email.innerText = data.email;
    // image.src = data.image;
    btn.id = data.id;
    btn.innerText = data.id;
    

    document.getElementById("displayData").append(firstName, lastName, email, btn)
}


function handleSubmit(BASE_URL) {
    document.getElementById("register-form").addEventListener("submit", e => {
        e.preventDefault();
        console.log(e.target.firstName.value);
        // debugger

        let tmpObj = {
            first_name: e.target.firstName.value,
            last_name: e.target.lastName.value,
            email: e.target.email.value,
        }
        
          const reqObj = {
            headers: {"Content-Type": "application/json"},
            method: "POST",
            body: JSON.stringify(tmpObj)
        }
        fetch(BASE_URL, reqObj).then(res => res.json()).then(console.log);

        e.target.reset();
    })
}

function readDataForUpdate(url) {
        fetch(url).then(r => r.json()).then(data => data.forEach(element => {
            // updateObj(element);
        }))
}

// deleteObj();
function deleteObj() {
    const displayData = document.getElementById("displayData");
    displayData.addEventListener("click", e => {
        let id = e.target.id;
        // console.log(id);
        // debugger
        fetch(BASE_URL + id, {
        method: 'DELETE',})
        .then(res => res.text()) // or res.json()
        .then(res => console.log(res))
        

    })

}
function updateObj() {
    const displayData = document.getElementById("displayData");
    displayData.addEventListener("click", e => {
        let id = e.target.id;
        // console.log(id);
        // debugger
        fetch(BASE_URL + id, {
        method: 'DELETE',})
        .then(res => res.text()) // or res.json()
        .then(res => console.log(res))
        

    })

}

// const data = { username: 'example' };

// fetch('https://example.com/profile', {
//   method: 'POST', // or 'PUT'
//   headers: {
//     'Content-Type': 'application/json',
//   },
//   body: JSON.stringify(data),
// })
// .then(response => response.json())
// .then(data => {
//   console.log('Success:', data);
// })
// .catch((error) => {
//   console.error('Error:', error);
// });

// fetch('https://example.com/delete-item/' + id, {
//   method: 'DELETE',
// })
// .then(res => res.text()) // or res.json()
// .then(res => console.log(res))