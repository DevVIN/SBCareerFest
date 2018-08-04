<!-- Global Sections which will be used on any page -->
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div id="login-form" class="container" title="Welcome on Careerfest" style="display: none">
	<form>
		<fieldset>
			<div class="form-group row">
				<div class="col-xs-12 col-sm-10 col-sm-offset-1" id="errorMessage"></div>
				<div class="col-xs-12 col-sm-10 col-sm-offset-1">
					<input type="text" name="loginEmail" id="loginEmail" placeholder="Enter your Email ID" class="text ui-widget-content ui-corner-all">
				</div>
			</div>
			<div class="form-group row">
				<div class="col-xs-12 col-sm-10 col-sm-offset-1 left-align">
					<input type="password" name="loginPassword" id="loginPassword" placeholder="Enter your Password" class="text ui-widget-content ui-corner-all">
					<a target="_blank" href="#" class="linkbtnstyle">Forgot Password?</a>
				</div>
			</div>
			<div class="form-group row">
				<div class="col-xs-12 col-sm-6 col-sm-offset-3">
					<button type="button" id="loginsubmit" class="btn btn-default" value="Login">Login</button>
				</div>
			</div>
			<div class="form-group row">
				<div class="col-xs-12 col-sm-10 col-sm-offset-1">
					<div>Not a member yet? <a href="/jobseekerRegister" class="linkbtnstyle">Register Now</a></div>
					<!-- Allow form submission with keyboard without duplicating the dialog button -->
					<input type="submit" tabindex="-1" style="position:absolute; top:-1000px">
				</div>
			</div>
		</fieldset>
	</form>
</div> 

<div class="test-popup-link" style="display: none">
	<img src="images/website_under_maintenance.png" title="website_under_maintenance"/>
</div>

<!-- javascript libraries for website -->

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery-ui.min.js"></script>
<script type="text/javascript" src="js/popper.min.js"></script>
<script type="text/javascript" src="js/jquery.appear.js"></script>
<script type="text/javascript" src="js/smooth-scroll.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/select2.js"></script>
<!-- wow animation -->
<script type="text/javascript" src="js/wow.min.js"></script>
<!-- owl carousel -->
<script type="text/javascript" src="js/owl.carousel.min.js"></script>        
<!-- images loaded -->
<script type="text/javascript" src="js/imagesloaded.pkgd.min.js"></script>
<!-- isotope -->
<script type="text/javascript" src="js/jquery.isotope.min.js"></script> 
<!-- magnific popup -->
<script type="text/javascript" src="js/jquery.magnific-popup.min.js"></script>
<!-- navigation -->
<script type="text/javascript" src="js/jquery.nav.js"></script>
<!-- equalize -->
<script type="text/javascript" src="js/equalize.min.js"></script>
<!-- fit videos -->
<script type="text/javascript" src="js/jquery.fitvids.js"></script>
<!-- number counter -->
<script type="text/javascript" src="js/jquery.countTo.js"></script>
<!-- time counter  -->
<script type="text/javascript" src="js/counter.js"></script>
<!-- twitter Fetcher  -->
<script type="text/javascript" src="js/twitterFetcher_min.js"></script>
<!-- main -->
<script type="text/javascript" src="js/main.js"></script>
<script type="text/javascript">
$("#Industry").change(function() {
    var Industryname = $(this).val();
    $.ajax({
        async: true,
        type: 'POST',
        url: '/fetchFunctional',
        data: {
        	Industryname : Industryname,
        },
        error: function() { 
            alert("Error");
        },
        success: function(functional) {
        	$("#Functional").html('');
        	$('<option>').appendTo('#Functional');
        	$.each( functional, function(i) {
                  	$('<option>').val(functional[i].functionalname).text(functional[i].functionalname).appendTo('#Functional');

        		});

        	
        }
    });
});

$('#terms').change(function(){
    if ($(this).is(':checked'))
    {
        $("#registersubmit").removeAttr("disabled");
    }
    else
    {
        $("#registersubmit").attr( "disabled", "disabled" );
    }               
});
</script>


