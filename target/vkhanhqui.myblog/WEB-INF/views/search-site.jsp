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
<!-- back to top -->
<link rel="stylesheet" href="css/backtotop.css">

<title>Search by keywords</title>
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
<!-- page wrapper -->
<div class="page-wrapper">
	<!-- content -->
	<div class="content clearfix">
		<!-- main content -->
		<div class="main-content">
			<h1 class="recent-post-title">Recent Posts</h1>

			<div class="pagination">
                <a href="#" class="btn-paginate prev"><i class="fa fa-chevron-left"></i></a>
                <ul class="paginate">
                    <li><a class="active" href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                </ul>
                <a href="#" class="btn-paginate prev"><i class="fa fa-chevron-right"></i></a>
            </div>
            
			<div class="post">
				<img src="images/image_1.jpg" alt="" class="post-image">
				<div class="post-preview">
					<h2><a href="single.html">All you want to know about industrial laws</a></h2>
					<i class="far fa-user">Khanh Qui</i>
					&nbsp;
					<i class="far calendar">Sep 13, 2020</i>
					<p class="preview-text">
						A small river named Duden flows by their place and supplies it with the necessary regelialia
					</p>
					<a href="single.html" class="btn read-more">Read More</a>
				</div>
			</div>

			
			<div class="pagination">
                <a href="" class="btn-paginate prev"><i class="fa fa-chevron-left"></i></a>
                <ul class="paginate">
                    <li><a class="active" href="">1</a></li>
                    <li><a href="">2</a></li>
                    <li><a href="">3</a></li>
                    <li><a href="">4</a></li>
                </ul>
                <a href="" class="btn-paginate prev"><i class="fa fa-chevron-right"></i></a>
            </div>
		</div>
		<!-- /main content -->

		<!-- sidebar -->
		<div class="sidebar single">
			<div class="section">
				<h2 class="section-title">Search</h2>
				<form action="#" method="get">
					<input type="text" name="search-term" class="text-input" placeholder="Search...">
				</form>
			</div>

			<div class="section popular">
				<h2 class="section-title">Popular</h2>

				<div class="post clearfix">
					<img src="images/image_1.jpg" alt="">
					<a href="#" class="title"><h4>How to overcome your fears?</h4></a>
				</div>

				<div class="post clearfix">
					<img src="images/image_2.jpg" alt="">
					<a href="#" class="title"><h4>How to overcome your fears?</h4></a>
				</div>

				<div class="post clearfix">
					<img src="images/image_3.jpg" alt="">
					<a href="#" class="title"><h4>How to overcome your fears?</h4></a>
				</div>
			</div>

			<div class="section topics">
				<h2 class="section-title">Categories</h2>
				<ul>
					<li><a href="#">Poems</a></li>
					<li><a href="#">Quotes</a></li>
					<li><a href="#">Fiction</a></li>
					<li><a href="#">Biography</a></li>
					<li><a href="#">Motivation</a></li>
					<li><a href="#">Inspiration</a></li>
					<li><a href="#">Life Lessons</a></li>
				</ul>
			</div>
		</div>
		<!-- /sidebar -->

	</div>
	<!-- /content -->
</div>
<!-- /page wrapper -->

<!-- footer -->

<div class="footer">
	<div class="footer-content">
		<div class="footer-section about">
			<h1 class="logo-text"><span>Khanh</span>Qui</h1>
			<p>
				Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts.
			</p>
			<div class="contact">
				<span><i class="fas fa-phone"></i> &nbsp; 123-456-789</span>
				<span><i class="fas fa-envelope"></i> &nbsp; info@gmail.com</span>
			</div>
			<div class="socials">
				<a href="#"><i class="fab fa-facebook"></i></a>
				<a href="#"><i class="fab fa-google-plus"></i></a>
				<a href="#"><i class="fab fa-github"></i></a>
			</div>
		</div>
		<div class="footer-section links">
			<h2>Quick Links</h2>
			<br>
			<ul>
				<a href="#"><li>Events</li></a>
				<a href="#"><li>Team</li></a>
				<a href="#"><li>Mentores</li></a>
				<a href="#"><li>Gallery</li></a>
				<a href="#"><li>Terms and Conditions</li></a>
			</ul>
		</div>	
		<div class="footer-section contact-form">
			<h2>Contact us</h2>
			<br>
			<form action="#" method="get">
				<input type="email" name="email" class="text-input contact-input" placeholder="Your email address...">
				<textarea name="message" class="text-input contact-input" placeholder="Your message..."></textarea>
				<button type="submit" class="btn btn-big">
				<i class="fas fa-envelope"></i>
				Send
				</button>
			</form>
		</div>	
	</div>	
</div>

<!-- /footer -->
<a href="#" class="back-to-top" ></a>

<!-- jquery -->
<script src="js/jquery-3.2.1.min.js"></script>
<!-- custom js -->
<script src="js/custom.js"></script>
<!-- back to top -->
<script src="js/backtotop.js"></script>
</body>

</html>