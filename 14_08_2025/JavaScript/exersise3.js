class Util {
    getDate() {
        let d = new Date();
        return d.getDate() + "-" + (d.getMonth() + 1) + "-" + d.getFullYear();
    }

    getPIValue() {
        return Math.PI;
    }

    convertC2F(c) {
        return (c * 9/5) + 32;
    }

    getFibonacci(n) {
        let fib = [0, 1];
        for (let i = 2; i < n; i++) {
            fib.push(fib[i-1] + fib[i-2]);
        }
        return fib.slice(0, n);
    }
}

// Example
let util = new Util();
console.log("Date:", util.getDate());
console.log("PI:", util.getPIValue());
console.log("25°C in F:", util.convertC2F(25));
console.log("Fibonacci (5):", util.getFibonacci(5));
