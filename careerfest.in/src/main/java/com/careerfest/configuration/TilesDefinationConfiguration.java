package com.careerfest.configuration;

import java.util.HashMap;
import java.util.Map;

import org.apache.tiles.Attribute;
import org.apache.tiles.Definition;
import org.apache.tiles.definition.DefinitionsFactory;
import org.apache.tiles.request.Request;

public final class TilesDefinationConfiguration implements DefinitionsFactory {
	private static final Map<String, Definition> tilesdefinitions = new HashMap<String, Definition>();
	private static final Attribute BASE_TEMPLATE = new Attribute("/WEB-INF/layout/Baselayout.jsp");
	private static final Attribute BASE_TEMPLATE_Body = new Attribute("/WEB-INF/layout/Baselayoutwithbody.jsp");

	public Definition getDefinition(String name, Request tilescontext) {
		System.out.println("3 inside getdefination in tilesdefinationconfig");
		return tilesdefinitions.get(name);
	}

	private static void addDefaultLayoutDef(String name, String title, String body) {
		System.out.println("inside addDefaultLayoutdef method"+name+" - "+title+" - "+body);
		Map<String, Attribute> attributes = new HashMap<String, Attribute>();
		attributes.put("title", new Attribute(title));
		attributes.put("cssheader", new Attribute("/WEB-INF/layout/siteheader.jsp"));
		attributes.put("header", new Attribute("/WEB-INF/layout/innerheader.jsp"));
		attributes.put("body", new Attribute(body));
		attributes.put("footer", new Attribute("/WEB-INF/layout/innerfooter.jsp"));
		attributes.put("cssfooter", new Attribute("/WEB-INF/layout/sitefooter.jsp"));
		if(name.equalsIgnoreCase("home"))
			tilesdefinitions.put(name, new Definition(name, BASE_TEMPLATE_Body, attributes));
		else
			tilesdefinitions.put(name, new Definition(name, BASE_TEMPLATE, attributes));
	}

	public static void addDefinitions() {
		// addDefaultLayoutDef("index", "Home", "/WEB-INF/index.jsp");
		System.out.println("inside adddefinations");
		addDefaultLayoutDef("home", "Home", "/WEB-INF/jsp/home.jsp");
		addDefaultLayoutDef("jobseekerRegister", "Registration", "/WEB-INF/jsp/jobseekerRegister.jsp");
		addDefaultLayoutDef("employerRegister", "EmployerRegistration", "/WEB-INF/jsp/employerRegister.jsp");
		addDefaultLayoutDef("jobseekerLanding", "JobseekerLanding", "/WEB-INF/jsp/jobseekerLanding.jsp");
		addDefaultLayoutDef("jobseekerDashboard", "JobseekerDashboard", "/WEB-INF/jsp/jobseekerDashboard.jsp");
		addDefaultLayoutDef("employerDashboard", "EmployerDashboard", "/WEB-INF/jsp/employerDashboard.jsp");
	}
}
