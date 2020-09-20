$(document).ready(function(){
	$('.menu-toggle').on('click', function(){
		$('.nav').toggleClass('showing');
		$('.nav ul').toggleClass('showing');
	});

	$('.post-wrapper').slick({
  		slidesToShow: 3,
  		slidesToScroll: 1,
  		autoplay: true,
  		autoplaySpeed: 2000,
  		nextArrow: $('.next'),
  		prevArrow: $('.prev'),
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

CKEDITOR
				.replace(
						'content',
						{
							filebrowserBrowseUrl : 'ckfinder/ckfinder.html',
							filebrowserImageBrowseUrl : 'ckfinder/ckfinder.html?type=Images',
							filebrowserFlashBrowseUrl : 'ckfinder/ckfinder.html?type=Flash',
							filebrowserUploadUrl : 'ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Files',
							filebrowserImageUploadUrl : 'ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Images',
							filebrowserFlashUploadUrl : 'ckfinder/core/connector/java/connector.java?command=QuickUpload&type=Flash'
						});
		/*Avatar start*/
		function BrowseServer(startupPath, functionData) {
			// You can use the "CKFinder" class to render CKFinder in a page:
			var finder = new CKFinder();

			// The path for the installation of CKFinder (default = "/ckfinder/").
			finder.basePath = '../';

			//Startup path in a form: "Type:/path/to/directory/"
			finder.startupPath = startupPath;

			// Name of a function which is called when a file is selected in CKFinder.
			finder.selectActionFunction = SetFileField;

			// Additional data to be passed to the selectActionFunction in a second argument.
			// We'll use this feature to pass the Id of a field that will be updated.
			finder.selectActionData = functionData;

			// Name of a function which is called when a thumbnail is selected in CKFinder. Preview img
			// finder.selectThumbnailActionFunction = ShowThumbnails;

			// Launch CKFinder
			finder.popup();
		}

		// This is a sample function which is called when a file is selected in CKFinder.
		function SetFileField(fileUrl, data) {
			document.getElementById(data["selectActionData"]).innerHTML = this
					.getSelectedFile().name;
			document.getElementById("imgpreview").src = fileUrl;
		}
		/*Avatar end*/
