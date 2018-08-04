<!-- Employeer Registration -->

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page import="org.springframework.util.StringUtils" %>
<%@ page import="java.util.List" %>

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
				<form:form role="form" id="empregisterform" method="post" action="/employerRegister" commandName="employer">
					<% String alreadyRegisteredMessage=(String)request.getAttribute("alreadyRegisteredMessage");
					
					List citylist = (List)request.getAttribute("citylist");
					List companylist = (List)request.getAttribute("companylist");
					List industrylist = (List)request.getAttribute("industrylist");
					List countrylist = (List)request.getAttribute("countrylist");
					List statelist = (List)request.getAttribute("statelist");
					
				
					%>
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
											<input type='file' id="proImg" name="ePhoto"/>
										</span>
									</div>
								</div>
							</div>
							<div class="line-separator"></div>
						</div>
						<div class="col-xs-12 col-sm-12">
						    <form:errors path="eFullname" class="text-danger"></form:errors>
							<input type="text" class="form-control" id="eFullname" name="eFullname" placeholder="Full Name">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
					     <div id="alreadyRegisteredMessage" class="text-danger"><%=StringUtils.isEmpty(alreadyRegisteredMessage)!=true?alreadyRegisteredMessage:""%></div>
						 <form:errors path="eEmail" class="text-danger"></form:errors>
						 <input type="email" class="form-control" id="eEmail" name="eEmail" placeholder="Email">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
						    <form:errors path="ePassword" class="text-danger"></form:errors>
							<input type="password" class="form-control" id="ePassword"  name="ePassword" placeholder="Password">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
						    <form:errors path="eMobileno" class="text-danger"></form:errors>
							<input type="text" class="form-control" id="eMobileno" name="eMobileno" placeholder="Mobile">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
						    <form:errors path="eCompanyname" class="text-danger"></form:errors>
							<form:select path="eCompanyname" id="eCompanyname" name="eCompanyname" class="selectpicker form-control" title="Company" data-placeholder="Company Name">
							<option></option>
							<form:options items="${companylist}" itemValue="companyname" itemLabel="companyname" />
							</form:select>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
						    <form:errors path="eIndustry" class="text-danger"></form:errors>
							<form:select path="eIndustry"  class="selectpicker form-control" name="eIndustry" id="eIndustry" title="Industry Type" data-placeholder="Industry Type">
							<option></option>
							<form:options items="${industrylist}" itemValue="industryname" itemLabel="industryname" />
							</form:select>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
							<div class="row checkrow">
								<div class="right col-sm-12">
									<label class="radiocontainer">Company
										<input value="Company" type="radio" checked="checked" class="form-control" name="eType">
										<span class="radiocheckmark"></span>
									</label>
									<label class="radiocontainer">Consultant
										<input value="Consultant" type="radio" class="form-control" name="eType">
										<span class="radiocheckmark"></span>
									</label>
								</div>
							</div>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
						    <form:errors path="eContactperson" class="text-danger"></form:errors>
							<input type="text" class="form-control" id="eContactperson" name="eContactperson" placeholder="Contact Person's Name">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
						    <form:errors path="eDesignation" class="text-danger"></form:errors>
							<input type="text" class="form-control" id="eDesignation" name="eDesignation" placeholder="Designation">
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-12">
						     <form:errors path="eOfficeaddress" class="text-danger"></form:errors>
							<textarea class="form-control" id="eOfficeaddress" name="eOfficeaddress" placeholder="Office Address"></textarea>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-6">
						    <form:errors path="eCountry" class="text-danger"></form:errors>
							<form:select path="eCountry" id="eCountry" name="eCountry" class="selectpicker form-control" title="country" data-placeholder="Country">
							<option></option>
							<form:options items="${countrylist}" itemValue="countryname" itemLabel="countryname" />
							</form:select>
						</div>
						<div class="col-xs-12 col-sm-6">
						   <form:errors path="eState" class="text-danger"></form:errors>
							 <form:select  path="eState" id="eState" name="eState" class="selectpicker form-control" title="state" data-placeholder="State">
							<option></option>
							<form:options items="${statelist}" itemValue="statecode" itemLabel="statecode" />
						</form:select>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12 col-sm-6">
						    <form:errors path="eCity" class="text-danger"></form:errors>
							<form:select path="eCity" id="eCity" name="eCity" class="selectpicker form-control" title="city" data-placeholder="City">
								<option></option>
								<form:options items="${citylist}" itemValue="cityname" itemLabel="cityname" />
							</form:select>
						</div>
						<div class="col-xs-12 col-sm-6">
						   <form:errors path="ePincode" class="text-danger"></form:errors>
							<input type="text" class="form-control" id="ePincode" name="ePincode" placeholder="Pincode">
						</div>
					</div>
					<div class="clearfix"></div>
					<div class="col-xs-10 col-sm-6 col-sm-offset-3">
						<button type="submit" class="btn btn-default">Register Now</button>
					</div>
				</form:form>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
</section>

