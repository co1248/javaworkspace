package com.member;

import java.util.Objects;

public class Member {
	
	public String id;

	public Member(String id) {
		super();
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {//�ɹ�������id�� ���ϴ� ������ ������
		
		if(obj instanceof Member) {
			Member other = (Member) obj;
			return this.id.equals(other.id);
		}
		return false;
		
		
	}

	@Override
	public int hashCode() {
//		return id.hashCode();//���ڿ�Ÿ���� �ؽ��ڵ带 �������̵��ؼ� ��
		return Objects.hash(id); //�ؽ��ڵ����
	}
}
