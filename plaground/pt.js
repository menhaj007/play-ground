// function getName() {
//     console.log("Test"); //On screen output.
//     return "James";
// }
// const student1 =  getName();
// console.log("Student name is: " +student1);

function multp(interest,loanAmount) {
    console.log("Result from Console.log " +(interest * loanAmount)); //it only prints.
    return (interest * loanAmount); //it result the product
}

const testLoan = multp(0.05, 1000);
console.log("Calcuted return: " + testLoan);
// const jamesLoan = multp(0.05, 200);
// console.log("Calcuted return: " + jamesLoan);

//part3

function fullName(firstName, lastName) {
        console.log(firstName + " " + lastName);// is for dev to see the result. troubleshooting
        return firstName + " " + lastName; //return value
    }
fullName();
const peoples =  fullName("James", "Jackson");
console.log(peoples); //just to see the result for yourself.

//secondversion
function multip(interest,loanAmount) {
    let product = (interest * loanAmount);
    console.log(product);
    
    return product;
}

const testLoan1 = multip(0.05, 1000);
console.log("Calcuted return1: " + testLoan1);

