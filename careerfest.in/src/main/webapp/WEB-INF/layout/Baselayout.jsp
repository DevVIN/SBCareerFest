<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!doctype html>
<html class="no-js" lang="en">
	<head>
	    <meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1" />
	    <!-- title -->
	    <title>Job Search | Job Vacancies | Job Opportunities in India | CareerFest</title>
	    <meta name="description" content="Search for job opportunities including government jobs, fresher jobs, banking jobs etc. on  CareerFest India. Post your resume to apply for job vacancies across top companies." />
	    <meta name="keywords" content="Freshers Job, Experiance Jobs, Government Jobs, Back office jobs, IT jobs, banking Jobs" />
	    <meta name="author" content="lgauthor">
	    <!-- favicon -->
	    <link rel="shortcut icon" href="images/icon/favicon.png">
	    <tiles:insertAttribute name="cssheader"></tiles:insertAttribute>
    </head>
    <body>
    	<tiles:insertAttribute name="innerheader"></tiles:insertAttribute>
		<tiles:insertAttribute name="body"></tiles:insertAttribute>
		<tiles:insertAttribute name="innerfooter"></tiles:insertAttribute>
		<tiles:insertAttribute name="cssfooter"></tiles:insertAttribute>
	</body>
</html>
