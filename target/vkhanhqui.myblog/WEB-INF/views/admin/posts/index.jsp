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
<title>Manage Posts</title>
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
			<li><a href="index.html">Magage Posts</a></li>
			<li><a href="../users/index.html">Magage Users</a></li>
		</ul>
	</div>

	<div class="admin-content">
		<div class="button-group">
			<a href="create.html" class="btn btn-big">Add Post</a>
			<a href="index.html" class="btn btn-big">Manage Posts</a>
		</div>

		<div class="content">
			<h2 class="page-title">Manage Posts</h2>
			<table>
				<thead>
					<th>ID</th>
					<th>Title</th>
					<th>Creator</th>
					<th colspan="3">Action</th>
				</thead>
				<tbody>
					<tr>
						<td>1</td>
						<td>this is the first post</td>
						<td>Khanh Qui</td>
						<td><a href="#" class="edit">edit</a></td>
						<td><a href="#" class="delete">delete</a></td>
						<td><a href="#" class="publish">publish</a></td>
					</tr>
					<tr>
						<td>2</td>
						<td>this is the second post</td>
						<td>Khanh Qui</td>
						<td><a href="#" class="edit">edit</a></td>
						<td><a href="#" class="delete">delete</a></td>
						<td><a href="#" class="publish">publish</a></td>
					</tr>
					<tr>
						<td>3</td>
						<td>this is the third post</td>
						<td>Khanh Qui</td>
						<td><a href="#" class="edit">edit</a></td>
						<td><a href="#" class="delete">delete</a></td>
						<td><a href="#" class="publish">publish</a></td>
					</tr>
				</tbody>
			</table>
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