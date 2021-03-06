package com.korea.kivescript.session;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.korea.kivescript.session.service.UserSessionService;

public class DBSessionManager implements SessionManager {
	
	private static Logger logger = LoggerFactory.getLogger(DBSessionManager.class);
	
	private UserSessionService service;
	
	public DBSessionManager() {
		// TODO Auto-generated constructor stub
		logger.info("DBSessionManager initialize !");
		init();
	}
	
	/**
	 * DBSessionManager 초기화
	 */
	private void init() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.korea.kivescript.session");
		context.refresh();
		service = context.getBean(UserSessionService.class);
		logger.info("UserSessionRepository :::: {}",service.toString());
	}
	
	@Override
	public UserData init(String username) {
		// TODO Auto-generated method stub
		logger.debug("DBSessionManager.init() :::: {}","No Action");
		return null;
	}

	@Override
	public void set(String username, String name, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void set(String username, Map<String, String> vars) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addHistory(String username, String input, String reply) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setLastMatch(String username, String trigger) {
		// TODO Auto-generated method stub

	}

	@Override
	public String get(String username, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserData get(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, UserData> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLastMatch(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public History getHistory(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear(String username) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clearAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void freeze(String username) {
		// TODO Auto-generated method stub

	}

	@Override
	public void thaw(String username, ThawAction action) {
		// TODO Auto-generated method stub

	}

}
