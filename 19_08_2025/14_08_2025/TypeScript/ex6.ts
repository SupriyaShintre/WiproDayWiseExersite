function pair<T, U>(first: T, second: U): [T, U] {
    return [first, second];
}

let numberStringPair = pair<number, string>(1, "Hello");
console.log(numberStringPair);  

let booleanStringPair = pair<boolean, string>(true, "TypeScript");
console.log(booleanStringPair); 
let mixedPair = pair<number, boolean>(42, false);
console.log(mixedPair); 
