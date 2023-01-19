function checkPassword() {
  let password = document.getElementById("pass1").value;
  let Cpassword = document.getElementById("pass2").value;
  let form = document.querySelector("#register");

  console.log(password, Cpassword);
  let message = document.getElementById("message");

  if (password.length != 0) {
    if (password == Cpassword) {
      console.log("Passwords match");
    } else {
      message.textContent = "Password doesn't match";
      form.onsubmit(event.preventDefault());
    }
  }
}

let config = {
  apiKey: "AIzaSyDrx_DycY7ZUDwprsigoQu9STIgPuAyYFc",
  authDomain: "du-hast.firebaseapp.com",
  projectId: "du-hast",
  storageBucket: "du-hast.appspot.com",
  messagingSenderId: "832222328313",
  appId: "1:832222328313:web:0e48f4a0226520d51eb928",
  measurementId: "G-QCP7QSXVSC",
};

firebase.initializeApp(config);
function loginWithGoogle() {
  let provider = new firebase.auth.GoogleAuthProvider();

  firebase
    .auth()
    .signInWithPopup(provider)
    .then(() => {
      console.log("login successful");
      window.location.assign("/FPS/index.html");
    })
    .catch(function (error) {
      let errorCode = error.code;
      let errorMessage = error.message;
      window.alert("Error : " + errorMessage);
    });
}

function createAccount() {
  let userEmail = document.getElementById("email").value;
  let userPass = document.getElementById("pass1").value;
  firebase
    .auth()
    .createUserWithEmailAndPassword(userEmail, userPass)
    .catch((error) => {
      let errorCode = error.code;
      let errorMessage = error.message;
    })
    .then(() => {
      console.log("registration successful");
      window.location.assign("/Login.html");
    });
}

function login() {
  let userEmail = document.getElementById("email").value;
  let userPass = document.getElementById("pass1").value;
  firebase
    .auth()
    .signInWithEmailAndPassword(userEmail, userPass)
    .then(() => {
      console.log("Login successful");
      window.location.assign("/FPS/index.html");
    })
    .catch(function (error) {
      // Handle Errors here.
      let errorCode = error.code;
      let errorMessage = error.message;
      window.alert("Error : " + errorMessage);
    });
}
