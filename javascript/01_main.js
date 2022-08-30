// alert('hello from javascript!!')
// document.getElementById("massage").innerHTML="this is from JavaScript"
// function greet(){
//     document.getElementById("massage").innerHTML="happy ganesh chaturthi"
// }

//  

//  x=10;
//  let y=10;
// console.log("value of x ="+x);
// console.log("value of y ="+y);
// {
//      x=20;
//      let y=20;

//     console.log("value of x ="+x);
//     console.log("value of y ="+y);
// }
// console.log("value of x ="+x);
// console.log("value of y ="+y);

// function greetuser(){
//     let username=document.getElementById("username").value;
//     document.getElementById("massage").innerHTML="hello "+username;
// }

// function add(){
//     var no1=parseInt(document.getElementById("input1").value);
//     var no2=parseInt(document.getElementById("input2").value);
//     var add=no1+no2;
//     document.getElementById("massage").innerHTML="addtion is "+add;
// }
// function multiply(){
//     var no1=document.getElementById("input1").value;
//     var no2=document.getElementById("input2").value;
//     var multiply=no1*no2;
//     document.getElementById("massage").innerHTML="product is "+multiply;
// }
// function substract(){
//     var no1=document.getElementById("input1").value;
//     var no2=document.getElementById("input2").value;
//     var substract=no1-no2;
//     document.getElementById("massage").innerHTML="substraction is "+substract;

// }
// function divide(){
//     var no1=document.getElementById("input1").value;
//     var no2=document.getElementById("input2").value;
//     var divide=no1/no2;
//     document.getElementById("massage").innerHTML="division is "+divide;

// }

// const cars=['getz prime', 'honda amaze','i20','brezza'];
// document.getElementById("massage").innerHTML=cars;

// var date=new Date();
// document.getElementById("fulldate").innerHTML=date;
// switch(date.getDay()){
//     case 1:
//         document.getElementById("day").innerhtml='monday';
//         break;
//     case 2:
//         document.getElementById("day").innerHTML='tuesday';
//         break;
// }

// document.getElementById("month").innerHTML=month;
// switch(date.getMonth()){
//     case 0:
//         document.getElementById("month").innerHTML='January';
//         break;
//     case 1:
//     document.getElementById("month").innerHTML='feb';
//     break;
//     case 2:
//         document.getElementById("month").innerHTML='march';
//         break;
//     case 3:
//         document.getElementById("month").innerHTML='april';
//         break;
//     case 4:
//         document.getElementById("month").innerHTML='may';
//         break;  
//     case 5:
//         document.getElementById("month").innerHTML='june';
//         break;
//     case 6:
//         document.getElementById("month").innerHTML='july';
//         break;
//     case 7:
//         document.getElementById("month").innerHTML='august';
//         break;
//     case 8:
//         document.getElementById("month").innerHTML='sept';
//         break;
//     case 9:
//         document.getElementById("month").innerHTML='oct';
//         break;
//     case 10:
//         document.getElementById("month").innerHTML='nov';
//         break;
//     case 11:
//         document.getElementById("month").innerHTML='dec';
//         break;
// }
// // document.getElementById("day").innerHTML=date.getDate();
// // document.getElementById("month").innerHTML=date.getMonth() +1;
// document.getElementById("year").innerHTML=date.getFullYear()+1;
// document.getElementById("hours").innerHTML=date.getHours();
// document.getElementById("minutes").innerHTML=date.getMinutes();
// document.getElementById("seconds").innerHTML=date.getSeconds();

// let text="";
// for (let i = 0; i < 10; i++) {
//     text = text+"number is " +i+"<br>";
// }
// document.getElementById("massage").innerHTML=text;

// const cars=['getz prime', 'honda amaze','i20','brezza'];
// let text="";
// let length=cars.length
// for (let i = 0; i < length; i++) {
//     text = text+"car is " +cars[i]+"<br>";
// }
// document.getElementById("massage").innerHTML=text;

// const cars=['getz prime', 'honda amaze','i20','brezza'];
// let text="";

// for (let i in  cars) {
//     text=text+"car is "+ cars[i]+"<br>";          
//     }
//     document.getElementById("massage").innerHTML=text;

// const cars=['getz prime', 'honda amaze','i20','brezza'];
// let text="";
// for (let car of cars) {
//     text=text+"car is "+ car+"<br>";
// }
// document.getElementById("massage").innerHTML=text;

function validate(){
    alert("validate() is called ")
    if (document.userdetails.username.value =="") {
        alert("please provide a username!!")
        document.userdetails.username.focus();
        return false;
    }
   
    if(document.userdetails.email.value ==""){
        alert("please provide a email!!")
        document.userdetails.email.focus();
        return false;
    }
    
    if(document.userdetails.zipcode.value ==""){
        alert("please provide a zipcode!!")
        document.userdetails.zipcode.focus();
        return false;
    }
    if(document.userdetails.country.value =="-1"){
        alert("please select a country!!")
        document.userdetails.country.focus();
        return false;
    }
    return true;
}
