// const couponLocations = [
//     { room: 'Living room', amount: 5 },
//     { room: 'Kitchen', amount: 2 },
//     { room: 'Bathroom', amount: 1 },
//     { room: 'Master bedroom', amount: 7 }
//   ];
//   function ourReducer(arr, cb, init) {
//       let accum = init;
//       for (const element of arr) {
//           accum = cb(accum, element);
//       };
//       return accum;
//   }
//   function couponCounter(totalAmount, location) {
//       return totalAmount + location.amount;
//   }
//   console.log(ourReducer(couponLocations, couponCounter, 0));

// function add() {
//     let y = 0;
//     return function(x) {
//         y++;
//         return x * y;
//     }
// }
// const result = add();
// console.log(result(2));
// console.log(result(2));
// console.log(result(2));
// console.log(result(2));
// console.log(result(2));

const add = (x) => (y) => x + y;
console.log(add(10)(20));




