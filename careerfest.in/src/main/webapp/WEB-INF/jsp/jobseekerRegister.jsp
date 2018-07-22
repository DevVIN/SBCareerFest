<!-- Jobseeker Registration -->

<section class="builder-bg contact-form-style1" id="contact-section9">
	<div class="container pad-top-btm-lrg">
		<div class="row">
			<div class="col-xs-12 col-sm-7 pad-top">
				<div class="info-text bg-light-pink">
					<div class="head">After you register, you can</div>
					<ul>
						<li>- Find better with careerfest</li>
						<li>- Apply to top jobs from the site while keeping your resume hidden from all recruiters.</li>
						<li>- Mark yourself as a 'passive jobseeker' if you are not actively looking for a job.</li>
						<li>- To get noticed, keep your resume and profile updated, always</li>
						<li>- Create customized alerts for the type of jobs you want to apply for</li>
					</ul>
					<div class="orSec"><span class="ortext">OR</span></div>
					<div class="col-sm-6 col-sm-offset-3">
						<div class="JobseekerLogin alreadymemeber">Already a member Sign In here</div>
					</div>
				</div>
			</div>
			<div class="upload-resume col-xs-12 col-sm-5 bg-light-gray padtopbtm">
				<div class="head">Register and Upload resume with us!</div>
				<form role="form" id="registerform" method="post" action="/jobseekerRegister">
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
							<input type="text" class="form-control" id="fullname" name="fullname" placeholder="Full Name">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
							<input type="email" class="form-control" id="email" name="email" placeholder="Email">
						</div>
					</div>
					<div class="clearfix"></div>
					<div class="form-group row"> 
						<div class="col-xs-12 col-sm-12">
							<input type="password" class="form-control" id="password"  name="password" placeholder="Password">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
							<input type="text" class="form-control" id="mobileno" name="mobileno" placeholder="Mobile">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
							<select id="Location" name="Location" class="selectpicker form-control" data-live-search="true" title="Location">
								<option data-tokens="Mumbai">Mumbai</option>
								<option data-tokens="Pune">Pune</option>
								<option data-tokens="Delhi">Delhi</option>
								<option data-tokens="Banglore">Banglore</option>
								<option data-tokens="Hyderabad">Hyderabad</option>
								<option data-tokens="Kolkata">Kolkata</option>
							</select>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
							<select id="Experience"  name="Experience" class="selectpicker form-control" data-live-search="true" title="Experience">
								<option  data-tokens="0/Fresher">0/Fresher</option>
								<option data-tokens="1">1</option>
								<option data-tokens="2">2</option>
								<option data-tokens="3">3</option>
								<option data-tokens="4">4</option>
							</select>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
							<input type="text" class="form-control" name="skills" id="skills" placeholder="Key Skills">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
							<select class="selectpicker form-control" data-live-search="true" name="Industry" id="Industry" title="Industry">
								<option  data-tokens="Automotive/ Ancillaries">Automotive/ Ancillaries</option>
								<option data-tokens="Banking/ Financial Services">Banking/ Financial Services</option>
								<option data-tokens="Construction & Engineering">Construction & Engineering</option>
								<option data-tokens="ITES/BPO">ITES/BPO</option>
								<option data-tokens="IT/ Computers - Hardware">IT/ Computers - Hardware</option>
								<option data-tokens="IT/ Computers - Software">IT/ Computers - Software</option>
								<option data-tokens="KPO/Analytics">KPO/Analytics</option>
							</select>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">                                  
							<select class="selectpicker form-control" data-live-search="true" name="Functional" id="Functional" title="Function">
								<option  data-tokens="Admin/Secretarial">Admin/Secretarial</option>
								<option data-tokens="Customer Service/ Call Centre/ BPO">Customer Service/ Call Centre/ BPO</option>
								<option data-tokens="Finance & Accounts">Finance & Accounts</option>
								<option data-tokens="Human Resources">Human Resources</option>
								<option data-tokens="IT">IT</option>
								<option data-tokens="Marketing & Communicationse">Marketing & Communicationse</option>
							</select>
						</div>
					</div>
					<div class="clearfix"></div>
					<div class="form-group row">
						<label class="col-sm-4 col-form-label" for="mobile">Upload Resume:</label>
						<div class="col-sm-8">  
							<input type="file" id="Resume" name="Resume" class="form-control">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-10 col-sm-offset-1">  
							<input type="checkbox" class="form-check-input">
							<div class="fright">I have read and agree to Careerfest's  <a class="frm_lnk" linkindex="1" tabindex="13" id="privacy_id" href="#" target="_blank">Terms and Conditions.</a></div>
						</div>
					</div>
					<div class="clearfix"></div>
					<div class="col-xs-10 col-sm-6 col-sm-offset-3">
						<button type="submit" class="btn btn-default">Register Now</button>
					</div>
				</form>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
</section>

