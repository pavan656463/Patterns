let person = {
    name: "Pavan",
    age: 21,
    isMarried: false ,
    run: ()=> {
        console.log("kumar");
    }
};

let p = {
    run: () => {
        console.log("Pavan123");
    }
};

person.__proto__ = p;

person.run();
