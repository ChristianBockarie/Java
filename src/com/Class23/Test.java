package com.Class23;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("---Creating Employee object--");
		Employee emp = new Employee();
		emp.work();
		emp.salary = 90000;
		emp.getPaid();
		System.out.println();
		
		System.out.println("---Creating ScrumTeam object---");
		ScrumTeam st = new ScrumTeam();
		st.salary = 100000;
		st.getPaid();
		st.artifacts = "Product Backlog, Sprint Backlog, BurnDown Chart";
		st.ceremonies = "Sprint Grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retrospective";
		st.attendScrumMeetings();
		st.workOnArtifacts();
		System.out.println();
		
		System.out.println("---Creating Developer object---");
		Developer dev = new Developer();
		dev.salary = 120000;
		dev.getPaid();
		dev.artifacts = "Sprint Backlog";
		dev.ceremonies = "Sprint Grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retrospective";
		dev.attendScrumMeetings();
		dev.code();
		System.out.println();
		
		System.out.println("---Creating Tester object---");
		Tester qa = new Tester();
		qa.salary = 100000;
		qa.getPaid();
		qa.artifacts = "Sprint Backlog";
		qa.ceremonies = "Sprint Grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retrospective";
		qa.attendScrumMeetings();
		qa.test();
		System.out.println();
		
		System.out.println("---Creating Business Analyst object---");
		BusinessAnalyst ba = new BusinessAnalyst();
		ba.salary = 85000;
		ba.getPaid();
		ba.artifacts = "Sprint Backlog, Product Backlog";
		ba.ceremonies = "Sprint Grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retrospective";
		ba.workOnArtifacts();
		ba.attendScrumMeetings();
		ba.writeUserStories();
		System.out.println();
		
		System.out.println("---Creating Scrum Master object---");
		ScrumMaster sm = new ScrumMaster();
		sm.salary = 90000;
		sm.getPaid();
		sm.artifacts = "Burn Down Chart";
		sm.ceremonies = "Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		sm.workOnArtifacts();
		sm.attendScrumMeetings();
		sm.driveScrumMeetings();
		System.out.println();
		
		System.out.println("---Creating Product Owner object---");
		ProductOwner po = new ProductOwner();
		po.salary = 150000;
		po.getPaid();
		po.artifacts = "Sprint backlog, Product Backlog";
		po.ceremonies = "Sprint grooming, Sprint Planning, Sprint Demo";
		po.workOnArtifacts();
		po.attendScrumMeetings();
		po.prioritizeBacklog();
		po.talkToTheClient();
		System.out.println();
		
		System.out.println("---Creating FrontEnd Developers object---");
		FrontEnd fe = new FrontEnd();
		fe.salary = 121000;
		fe.getPaid();
		fe.artifacts = "Sprint Backlog";
		fe.ceremonies = "Sprint Grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retrospective";
		fe.attendScrumMeetings();
		fe.code();
		fe.doHtml();
		System.out.println();
		
		System.out.println("---Creating FrontEnd Developers object---");
		BackEnd be = new BackEnd();
		be.salary = 121000;
		be.getPaid();
		be.artifacts = "Sprint Backlog";
		be.ceremonies = "Sprint Grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retrospective";
		be.attendScrumMeetings();
		be.code();
		be.doSql();
		System.out.println();
		
		System.out.println("---Creating Manual Tester object---");
		ManualTester mt = new ManualTester();
		mt.salary = 110000;
		mt.getPaid();
		mt.artifacts = "Sprint Backlog";
		mt.ceremonies = "Sprint Grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retrospective";
		mt.attendScrumMeetings();
		mt.test();
		mt.testManually();
		System.out.println();
		
		System.out.println("---Creating Manual Tester object---");
		AutomationTester at = new AutomationTester();
		at.salary = 110000;
		at.getPaid();
		at.artifacts = "Sprint Backlog";
		at.ceremonies = "Sprint Grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retrospective";
		at.attendScrumMeetings();
		at.test();
		at.codeInJava();
	}

}
