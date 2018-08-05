<!-- Jobseeker Landing -->
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<section class="builder-bg contact-form-style1" id="contact-section9">
	<div class="container pad-top-btm-lrg">
		<form:form role="form" commandName="jobSeekerLanding">
			<div class="row rowline">
				<div class="col-xs-12 col-sm-4 pad-top">
					<div class="head">Tell us more abut yourself</div>
					<div class="personal-info-img"></div>
				</div>
				<div class="col-xs-12 col-sm-8 padtopbtm upload-resume bg-light-gray">
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
						<div class="col-xs-12 col-sm-10">
							<input type="text" class="form-control" id="resumetitle" placeholder="Resume Title">
						</div>
						<div class="col-xs-12 col-sm-6">
							<select class="selectpicker form-control" title="Job Type" data-placeholder="Job Type">
								<option></option>
								<option value="Full Time">Full Time</option>
								<option value="Part Time">Part Time</option>
								<option value="Contract">Contract</option>
								<option value="Freelance">Freelance</option>
							</select>
						</div>
						<div class="col-xs-12 col-sm-6">
							<form:errors path="preferredlocation" class="error"></form:errors>
							<form:select path="preferredlocation" name="preferredlocation" class="selectpicker preferredjob form-control"  title="Preferred Job Location" data-placeholder="Preferred Job Location" multiple="multiple">
								<option></option>
								<form:options items="${locationlist}" itemValue="cityname" itemLabel="cityname" />
							</form:select>
						</div>
						<div class="col-xs-12 col-sm-6">
							<form:errors path="role" class="error"></form:errors>	
							<form:select path="role" name="role" class="selectpicker form-control"  title="Role" data-placeholder="Role">
								<option></option>
								<form:options items="${roleList}" itemValue="rolename" itemLabel="rolename" />
							</form:select>
						</div>
						<div class="col-xs-12 col-sm-6">
							<input type="text" id="dateofbirth" class="form-control" placeholder="Date of Birth"/>
						</div>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<div class="row rowline">
				<div class="col-xs-12 col-sm-4 pad-top">
					<div class="educational-info-img"></div>
				</div>
				<div class="col-xs-12 col-sm-8 padtopbtm upload-resume bg-light-gray">
					<div class="form-group row">
						<div class="col-xs-12 col-sm-6">
							<select class="selectpicker form-control" title="Highest Qualification" data-placeholder="Highest Qualification">
								<option></option>
								<option value="Doctorate/Phd">Doctorate/Phd</option>
								<option value="Masters/Post-Graduation">Masters/Post-Graduation</option>
								<option value="Graduation/Diploma">Graduation/Diploma</option>
								<option value="12th">12th</option>
								<option value="10th">10th</option>
								<option value="Below 10th">Below 10th</option>
							</select>
						</div>
						<div class="col-xs-12 col-sm-6">
							<select class="selectpicker form-control"  title="Course" data-placeholder="Course">
								<option></option>
								<option value="BA">BA</option>
								<option value="B.Arch">B.Arch</option>
								<option value="B.Des">B.Des</option>
								<option value="BCA">BCA</option>
								<option value="B.Com">B.Com</option>
								<option value="B.Tech/BE">B.Tech/BE</option>
							</select>
						</div>
						<div class="col-xs-12 col-sm-6">
							<select class="selectpicker form-control" title="Specialization" data-placeholder="Specialization">
								<option></option>
								<option value="Agriculture">Agriculture</option>
								<option value="Automobile">Automobile</option>
								<option value="Chemical">Chemical</option>
								<option value="Civil">Civil</option>
								<option value="Computers">Computers</option>
								<option value="Electronics/Telecommunication">Electronics/Telecommunication</option>
							</select>
						</div>
						<div class="col-xs-12 col-sm-6">
							<form:errors path="college" class="error"></form:errors>	
							<form:select path="college" name="college" class="selectpicker form-control" title="University/College" data-placeholder="University/College">
								<option></option>
								<form:options items="${collegelist}" itemValue="collegename" itemLabel="collegename" />
							</form:select>
						</div>
						<div class="col-xs-12 col-sm-6">
							<div class="row checkrow">
								<label class="left col-sm-4">Course Type</label>
								<div class="right col-sm-8">
									<label class="checkcontainer">Full Time
										<input type="checkbox" checked="checked" class="form-control">
										<span class="checkmark"></span>
									</label>
									<label class="checkcontainer">Part Time
										<input type="checkbox" class="form-control">
										<span class="checkmark"></span>
									</label>
								</div>
							</div>
						</div>
						<div class="col-xs-12 col-sm-6">
							<input type="text" class="datepickerfromto form-control" placeholder="Passing Year"/>
						</div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="row rowline">
				<div class="col-xs-12 col-sm-4 pad-top">
					<div class="educational-info-img"></div>
				</div>
				<div class="col-xs-12 col-sm-8 padtopbtm upload-resume bg-light-gray">
					<div class="form-group row">
						<div class="col-xs-12 col-sm-6">
							<input type="text" class="form-control" id="designation" name="designation" placeholder="Designation">
						</div>
						<div class="col-xs-12 col-sm-6">
							<form:errors path="company" class="error"></form:errors>	
							<form:select path="company" name="company" class="selectpicker form-control" title="Company" data-placeholder="Company">
								<option></option>
								<form:options items="${companylist}" itemValue="companyname" itemLabel="companyname" />
							</form:select>
						</div>
						<div class="col-xs-12 col-sm-6">
							<input type="text" id="datepickerfrom" class="datepickerfromto form-control" placeholder="From"/>
							<input type="text" id="datepickerto" class="datepickerfromto form-control" placeholder="To"/>
						</div>
						<div class="col-xs-12 col-sm-6">
							<select class="selectpicker form-control" title="Salary" data-placeholder="Salary">
								<option></option>
								<option><1 Lac</option>
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
								<option value="5">5</option>
								<option value="6">6</option>
								<option value="7">7</option>
								<option value="8">8</option>
								<option value="9">9</option>
								<option value="10">10</option>
								<option value="11">11</option>
								<option value="12">12</option>
							</select>
						</div>
						<div class="col-xs-12 col-sm-6">
							<div class="row checkrow">
								<div class="right col-sm-2">
									<label class="checkcontainer">
										<input type="checkbox" checked="checked" class="form-control">
										<span class="checkmark"></span>
									</label>
								</div>
								<label class="left col-sm-5">Current Employer</label>
							</div>
						</div>
						<div class="col-xs-12 col-sm-6">
							<select class="selectpicker form-control" title="Notice Period" data-placeholder="Notice Period">
								<option></option>
								<option value="Immediately">Immediately</option>
								<option value="15 Days">15 Days</option>
								<option value="30 Days">30 Days</option>
								<option value="45 Days">45 Days</option>
								<option value="60 Days">60 Days</option>
								<option value="90 Days">90 Days</option>
							</select>
						</div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>
			<div class="row rowline">
				<div class="col-xs-12 col-sm-4 pad-top">
				</div>
				<div class="col-xs-12 col-sm-8 padtopbtm upload-resume bg-light-gray">
					<div class="form-group row">
						<div class="col-xs-12 col-sm-6">
							<button type="submit" class="btn btn-default">Save & Continue</button>
						</div>
					</div>
				</div>
			</div>
		</form:form>>
	</div>
</section>