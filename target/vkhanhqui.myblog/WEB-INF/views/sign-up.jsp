<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<!-- icon -->
<link rel="icon" type="image/png"
      href="images/icons/fox.ico" />
<!-- font awesome -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.7.2/css/all.min.css"  />
<!-- google font -->
<link href="https://fonts.googleapis.com/css?family=Candal|Lora" rel="stylesheet">
<!-- custom style -->
<link rel="stylesheet" href="css/style.css">
<title>Sign up</title>
</head>

<body>
<!-- header -->
<header>
<div class="logo">
    <h1 class="logo-text"><span>Khanh</span>Qui</h1>
</div>
    <i class="fa fa-bars menu-toggle"></i>
    <ul class="nav">
    <li>
        <a href="#">Home</a>
    </li>
    <li><a href="#">Posts</a></li>
    <li><a href="#">About</a></li>
        <li>
            <a href="#">
                <i class="fa fa-user"></i>
                Khanh Qui
                <i class="fa fa-chevron-down" style="font-size: .8em;"></i>
            </a>
            <ul>
                <li><a href="#">Dashboard</a></li>
                <li><a href="#" class="logout">Logout</a></li>
            </ul>
        </li>
    </ul>
</header>
<!-- /header -->

<div class="auth-content">
    <form action="#" method="post">
        <h2 class="form-title">Sign up</h2>

     <!--    <div class="msg success">
            <li>Username required</li>
        </div> -->

        <div>
            <label>Username</label>
            <input type="text" name="username" class="text-input">
        </div>
        <div>
            <label>Email</label>
            <input type="text" name="email" class="text-input">
        </div>
        <div>
            <label>Password</label>
                <input type="password" name="password" class="text-input">
        </div>
        <div>
            <label>Password Confirmation</label>
                <input type="password" name="passwordConfirmation" class="text-input">
        </div>
        <div>
            <button type="submit" name="register-btn" class="btn btn-big">Register</button>
        </div>
        <p>Or <a href="sign-in.html">Sign In</a></p>
    </form>
</div>

<!-- jquery -->
<script src="js/jquery-3.2.1.min.js"></script>
<!-- custom js -->
<script src="js/custom.js"></script>
</body>

</html>