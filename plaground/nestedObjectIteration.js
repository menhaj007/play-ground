 function recurseCalls(target) {
      if (Array.isArray(target)) {
          for (const element of target) {
              recurseCalls(element);
            }
        } else if (typeof target === "object") {
            for (const key in target) {
                recurseCalls(target[key]);
            }
        } else {
            console.log(target);
        }

//     if (Array.isArray(target)) {
//       for (const element of target) {
//         deepIterator(element);
//       }
//     } else if (typeof target === 'object') {
//       for (const key in target) {
//         deepIterator(target[key]);
//       }
//     } else {
//       console.log(target);
//     }
    }
