package com.member;

import java.util.Objects;

public class Member {
	
	public String id;

	public Member(String id) {
		super();
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {//맴버변수인id를 비교하는 것으로 재정의
		
		if(obj instanceof Member) {
			Member other = (Member) obj;
			return this.id.equals(other.id);
		}
		return false;
		
		
	}

	@Override
	public int hashCode() {
//		return id.hashCode();//문자열타입의 해쉬코드를 오버라이딩해서 씀
		return Objects.hash(id); //해쉬코드생성
	}
}
