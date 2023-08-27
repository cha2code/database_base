package org.barista.common.cli.ui;

import org.barista.common.cli.command.ExitCommand;

// Template Method Pattern
// 구현이 안 되어 있거나 수정이 필요한 부분만 자식이 구현
// 부모 클래스로만 사용하기 위해 추상클래스로 선언
public abstract class Application {
	
	private Menu menu;
	
	// 메뉴 생성 - 프로그램마다 메뉴 구성이 다르기 때문에 상속 받는 클래스에서 구현
	public void createMenu(Menu menu) {
		
	}
	
	// 모든 프로그램에서 사용 - 종료
	public void init() {
		
		menu.add(new MenuItem("종료", new ExitCommand(this))); // 자기 자신을 종료
	}
	
	// Connection close : 종료 시 닫을 함수들 (프로그램마다 다름)
	public void cleanUp() {
		
	}
	
	// 실행 (Application의 부모 역할 method)
	public void run() {
		
		init(); // 초기화
		
		while(true) {
			
			menu.print(); // 메뉴 출력
			MenuItem item = menu.select();
			
			if(item != null) {
				item.execute();
			}
		}
	}

}
