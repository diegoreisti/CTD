const myArray = [1, 2, 4, 8];

let sum = 0;


for (let i = 0; i < myArray.length; i++) {
    if (i == 0) {
        console.log(myArray[i]);
        sum += myArray[i];
    } 
    else
    {   
        console.log(`${sum} + ${myArray[i]} = ${sum + myArray[i]}`);
        sum += myArray[i];
    }
    
}