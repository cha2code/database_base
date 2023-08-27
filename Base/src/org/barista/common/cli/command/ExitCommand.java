package org.barista.common.cli.command;

import org.barista.common.Input;
import org.barista.common.cli.ui.Application;

public class ExitCommand implements Command {
	
	private Application app;

	public ExitCommand(Application app) {
		
		super();
		this.app = app;
	}

	@Override
	public void execute() {
		
		String answer = Input.read("종료하시겠습니까? (Y/N) : ");
		
		if(answer.equalsIgnoreCase("y")) {
			System.out.println("종료합니다.");
			app.cleanUp(); // open해서 사용했던 함수들 close
			System.exit(0); // 시스템 종료
		}
	}

}
