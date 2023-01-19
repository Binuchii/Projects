    var x = document.getElementById("login");
    var y = document.getElementById("register");
    var z = document.getElementById("btn");

function register(){
    x.style.left = "-400px";
    y.style.left = "50px";
    z.style.left = "110px";
}

function login(){
    x.style.left = "50px";
    y.style.left = "450px";
    z.style.left = "0px";
}

function checkPassword(){
    
    let password= document.getElementById("pass1").value;
    let Cpassword = document.getElementById("pass2").value;
    let submitBtn = document.getElementById("submit-btn2");
    console.log(password, Cpassword);
    let register = document.getElementById("register");
    const errorElement = document.getElementById("error");

    register.addEventListener("submit-btn2", (e) => {
    let message = document.getElementById("message");

    if(password.length != 0){
        if(password == Cpassword){
            message.textContent = "Passwords match";
            errorElement.innerText = message.join(', ');
            // submitBtn.disabled = false;
        }
        else{
            message.textContent = "Password doesnt match";
            e.preventDefault();
            // submitBtn.disabled = true;
        }
    }
})

} 