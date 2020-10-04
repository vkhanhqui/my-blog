$(document).ready(function(){

	var editor = "";
		$(document).ready(function() {
			editor = CKEDITOR.replace('content');
		});
	
	$('.menu-toggle').on('click', function(){
		$('.nav').toggleClass('showing');
		$('.nav ul').toggleClass('showing');
	});

	$('.post-wrapper').slick({
  		slidesToShow: 3,
  		slidesToScroll: 1,
  		autoplay: true,
  		autoplaySpeed: 2000,
  		nextArrow: $('.nextt'),
  		prevArrow: $('.prevv'),
  		responsive: [
    		{
     			breakpoint: 1024,
     			 settings: {
		        slidesToShow: 3,
		        slidesToScroll: 3,
		        infinite: true,
		        dots: true
		      }
		    },
		    {
		      breakpoint: 600,
		      settings: {
		        slidesToShow: 2,
		        slidesToScroll: 2
		      }
		    },
		    {
		      breakpoint: 480,
		      settings: {
		        slidesToShow: 1,
		        slidesToScroll: 1
		      }
		    }
		  ]
	});
});