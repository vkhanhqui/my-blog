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
<link rel="stylesheet" href="../../css/style.css">
<!-- custom style -->
<link rel="stylesheet" href="../../css/admin.css">
<title>Add Users</title>
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
<!-- admin page wrapper -->
<div class="admin-wrapper">
	<div class="left-sidebar">
		<ul>
			<li><a href="../posts/index.html">Manage Posts</a></li>
			<li><a href="index.html">Manage Users</a></li>
		</ul>
	</div>

	<div class="admin-content">
		<div class="button-group">
			<a href="create.html" class="btn btn-big">Add User</a>
			<a href="index.html" class="btn btn-big">Manage User</a>
		</div>

		<div class="content">
			<h2 class="page-title">Create User</h2>
			<form action="#" method="post">
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
		        	<label>Role</label>
		        	<select name="role" class="text-input">
		        		<option value="Creator">Creator</option>
		        		<option value="Admin">Admin</option>
		        	</select>
		        </div>
				<div>
					<button type="submit" class="btn btn-big">Add User</button>
				</div>
				
			</form>
		</div>
	</div>
</div>
<!-- /admin page wrapper -->


<!-- jquery -->
<script src="../../js/jquery-3.2.1.min.js"></script>
<!-- custom js -->
<script src="../../js/custom.js"></script>
</body>

</html>