package org.barista.common.cli.ui;

import java.util.ArrayList;
import java.util.List;

import org.barista.common.Input;

// 메뉴 생성 : 얼마든지 추가가 가능하도록 list로 생성
public class Menu {

	List<MenuItem> list; // generic : MenuItem
	
	// 메뉴 생성자
	public Menu() {
		
		list = new ArrayList<MenuItem>();
	}
	
	// 메뉴 추가
	public void add(MenuItem item) {
		
		list.add(item);
	}
	
	// 리스트에 저장 된 메뉴 출력
	public void print() {
		
		for(int i = 0; i < list.size(); i++) {
			System.out.printf("%d) %s\t", (i + 1), list.get(i).getTitle());
		}
		
		System.out.println();
	}
	
	// 메뉴 번호 선택
	public MenuItem select() {
		
		int answer = Input.readInt("메뉴 선택 > ") -1; // 배열에 저장하기 위함 (메뉴는 1부터, 배열은 0부터 시작)
		
		// 번호에 따라 선택 가능 (switch/다중 if문 대체)
		if(answer < list.size()) {
			return list.get(answer);
		}
		
		return null;
	}
}
