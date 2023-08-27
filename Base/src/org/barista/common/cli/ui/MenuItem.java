package org.barista.common.cli.ui;

import org.barista.common.cli.command.Command;

public class MenuItem implements Command {

	private String title; // 메뉴명
	private Command cmd; // 실행 명령
	
	
	// 생성자
	public MenuItem(String title, Command cmd) {
		
		super();
		this.title = title;
		this.cmd = cmd;
	}

	// getter - 클래스의 필드에 직접 접근 방지
	// 내부 동작을 숨기고 부품의 사용법만 오픈
	public String getTitle() {
		return title;
	}

	@Override
	public void execute() {
		
		if(cmd != null) {
			cmd.execute();
		}
	}
}
