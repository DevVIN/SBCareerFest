<!-- Employeer Registration -->

<section class="builder-bg" id="contact-section9">
	<div class="container pad-top-btm-lrg">
		<div class="row">
			<div class="col-xs-12 col-sm-7 pad-top">
				<div class="info-text bg-light-pink">
					<div class="head">After you register, you can</div>
					<ul>
						<li>- Find better with careerfest</li>
						<li>- Get more relevant responses by candidates.</li>
						<li>- Get spotted easily in the pool of recruiters..</li>
						<li>- Trusted more by jobseekers.</li>
						<li>- Create Ready to hire talent pipeline for your sourcing needs</li>
					</ul>
					<div class="orSec"><span class="ortext">OR</span></div>
					<div class="col-sm-6 col-sm-offset-3">
						<div class="employerLogin alreadymemeber">Already a member Sign In here</div>
					</div>
				</div>
			</div>
			<div class="upload-resume col-xs-12 col-sm-5 bg-light-gray padtopbtm">
				<div class="head">New Employer/Recruiter Registration!</div>
				<form role="form" id="registerform" method="post" action="/employerRegister">
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
							<div class="row">
								<div class="col-xs-12 col-sm-4">
									<div class="prevphoto">
										<img id="propic" src="images/proimg124x124.png" alt="Profile image" />
									</div>
								</div>
								<div class="prevphotoinfo col-xs-12 col-sm-8">
									<ul>
										<li>Max file upload size: 2 MB.</li>
										<li>You can upload picture in ".jpg, .jpeg, .png, bmp, tif." formats.</li>
										<li>The image file name should not contain special characters</li>
									</ul>
									<div class="uploadphoto">
										<span class="inputwrapper btnstyleblue btn btn-default">Upload Photo
											<input type='file' id="proImg" value="Upload Photo" />
										</span>
									</div>
								</div>
							</div>
							<div class="line-separator"></div>
						</div>
						<div class="col-xs-12 col-sm-12">
							<input type="text" class="form-control" id="fullname" name="fullname" placeholder="Full Name">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
							<input type="email" class="form-control" id="email" name="email" placeholder="Email">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
							<input type="password" class="form-control" id="rpassword"  name="rpassword" placeholder="Password">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
							<input type="text" class="form-control" id="mobileno" name="mobileno" placeholder="Mobile">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
							<select class="selectpicker form-control" title="Company" data-placeholder="Company Name">
								<option></option>
								<option value="Infosys">Infosys</option>
								<option value="Tech Mahendra">Tech Mahendra</option>
								<option value="Isobar commerce">Isobar commerce</option>
								<option value="Swiftwin">Swiftwin</option>
								<option value="IBM">IBM</option>
								<option value="Accenture">Accenture</option>
							</select>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
							<select class="selectpicker form-control" name="Industry" id="Industry" title="Industry Type" data-placeholder="Industry Type">
								<option></option>
								<option  value="Automotive/ Ancillaries">Automotive/ Ancillaries</option>
								<option value="Banking/ Financial Services">Banking/ Financial Services</option>
								<option value="Construction & Engineering">Construction & Engineering</option>
								<option value="ITES/BPO">ITES/BPO</option>
								<option value="IT/ Computers - Hardware">IT/ Computers - Hardware</option>
								<option value="IT/ Computers - Software">IT/ Computers - Software</option>
								<option value="KPO/Analytics">KPO/Analytics</option>
							</select>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
							<div class="row checkrow">
								<div class="right col-sm-12">
									<label class="radiocontainer">Company
										<input type="radio" checked="checked" class="form-control" name="radio">
										<span class="radiocheckmark"></span>
									</label>
									<label class="radiocontainer">Consultant
										<input type="radio" class="form-control" name="radio">
										<span class="radiocheckmark"></span>
									</label>
								</div>
							</div>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
							<input type="text" class="form-control" id="contactname" name="contactname" placeholder="Contact Person's Name">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
							<input type="text" class="form-control" id="designation" name="designation" placeholder="Designation">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
							<textarea class="form-control" id="officeaddress" name="officeaddress" placeholder="Office Address"></textarea>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-6">
							<select id="country" name="country" class="selectpicker form-control" title="country" data-placeholder="Country">
								<option></option>
								<option value="Argentina">Argentina</option>
								<option value="Brazil">Brazil</option>
								<option value="Croatia">Croatia</option>
								<option value="Denmark">Denmark</option>
								<option value="England">England</option>
								<option value="France">France</option>
								<option value="Germany">Germany</option>
								<option value="Hungary">Hungary</option>
								<option value="India">India</option>
							</select>
						</div>
						<div class="col-xs-12 col-sm-6">
							<select id="state" name="state" class="selectpicker form-control" title="state" data-placeholder="State">
								<option></option>
								<option value="MH">MH</option>
								<option value="NH">NH</option>
								<option value="AP">AP</option>
								<option value="MP">MP</option>
								<option value="UP">UP</option>
							</select>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-6">
							<select id="city" name="city" class="selectpicker form-control" title="city" data-placeholder="City">
								<option></option>
								<option value="Mumbai">Mumbai</option>
								<option value="Pune">Pune</option>
								<option value="Delhi">Delhi</option>
								<option value="Banglore">Banglore</option>
								<option value="Hyderabad">Hyderabad</option>
								<option value="Kolkata">Kolkata</option>
							</select>
						</div>
						<div class="col-xs-12 col-sm-6">
							<input type="text" class="form-control" id="pincode" name="pincode" placeholder="Pincode">
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

