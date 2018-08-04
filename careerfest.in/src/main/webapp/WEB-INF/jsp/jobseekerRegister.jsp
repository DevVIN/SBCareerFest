<!-- Jobseeker Registration -->
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page import="org.springframework.util.StringUtils" %>
<%@ page import="java.util.List" %>

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
				<form:form role="form" id="registerform" method="post" action="/jobseekerRegister" commandName="user" enctype="multipart/form-data">
				<% 
				String alreadyRegisteredMessage=(String)request.getAttribute("alreadyRegisteredMessage");
				String uploadResumeFail=(String)request.getAttribute("uploadResumeFail");
				List citylist = (List)request.getAttribute("citylist");
				List skillslist = (List)request.getAttribute("skillslist");
				List industrylist = (List)request.getAttribute("industrylist");
				List functionallist = (List)request.getAttribute("functionallist");
				%>
			
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
						    <form:errors path="fullname" class="error"></form:errors>	
						    <input type="text" class="form-control" id="fullname" name="fullname" placeholder="Full Name">
                        </div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
						    <div id="alreadyRegisteredMessage" class="error"><%=StringUtils.isEmpty(alreadyRegisteredMessage)!=true?alreadyRegisteredMessage:""%></div>
						    <form:errors path="email" class="error"></form:errors>
						    <input type="email" class="form-control" id="email" name="email" placeholder="Email">
						</div>
					</div>
					<div class="clearfix"></div>
					<div class="form-group row"> 
						<div class="col-xs-12 col-sm-12">                            
						    <form:errors path="rpassword" class="error"></form:errors>	   
							<input type="password" class="form-control" id="rpassword"  name="rpassword" placeholder="Password">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
						     <form:errors path="mobileno" class="error"></form:errors>	
						     <input type="text" class="form-control" id="mobileno" name="mobileno" placeholder="Mobile"  minlength="10" maxlength="10">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
						    <form:errors path="location" class="error"></form:errors>	
						    
						    
						     <form:select path="location" id="Location" name="Location" class="selectpicker form-control" title="Location" data-placeholder="Location">
								<option></option>
								<form:options items="${citylist}" itemValue="cityname" itemLabel="cityname" />
							</form:select> 
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
						    <form:errors path="experience" class="error"></form:errors>
						    <select id="Experience"  name="Experience" class="selectpicker form-control" title="Experience" data-placeholder="Experience">
								<option></option>
								<option value="0/Fresher">0/Fresher</option>
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
							</select>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
						    <form:errors path="skills" class="error"></form:errors>	
						    <form:select path="skills" class="selectpicker form-control" name="skills" id="skills" title="Key Skills" data-placeholder="Key Skills" multiple="multiple">
								<option></option>
								<form:options items="${skillslist}" itemValue="skillname" itemLabel="skillname" />
							</form:select>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
						    <form:errors path="industry" class="error"></form:errors>	
						    <form:select  path="industry" class="selectpicker form-control" name="Industry" id="Industry" title="Industry" data-placeholder="Industry">
								<option></option>
								<form:options items="${industrylist}" itemValue="industryname" itemLabel="industryname" />
							</form:select>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
						    <form:errors path="functional" class="error"></form:errors>
						    <form:select path="functional" class="selectpicker form-control" name="Functional" id="Functional" title="Function" data-placeholder="Function">
								<option></option>
								<form:options items="${functionallist}" itemValue="functionalname" itemLabel="functionalname" />
							</form:select>
						</div>
					</div>
					<div class="clearfix"></div>
					<div class="form-group row">
						<label class="col-sm-4 col-form-label" for="mobile">Upload Resume:</label>
						<div class="col-sm-8">
						    <div id="uploadResumeFail" class="error"><%=StringUtils.isEmpty(uploadResumeFail)!=true?uploadResumeFail:""%></div>
						     <form:errors path="resume" class="error"></form:errors>
							 <input type="file" id="Resumefile" name="Resumefile" class="form-control">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-10 col-sm-offset-1">  
							<input type="checkbox" class="form-check-input" id="terms">
							<div class="fright">I have read and agree to Careerfest's  <a class="frm_lnk" linkindex="1" tabindex="13" id="privacy_id" href="#" target="_blank">Terms and Conditions.</a></div>
						</div>
					</div>
					<div class="clearfix"></div>
					<div class="col-xs-10 col-sm-6 col-sm-offset-3">
						<button id="registersubmit" type="submit" class="btn btn-default" disabled>Register Now</button>
					</div>
				</form:form>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
</section>

