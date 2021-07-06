package com.collection2;

public class Member {
	
	public String name;
	public int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//�ߺ��� ���� �����͸� ���� ���� �Ʒ� 2 �޼ҵ带 �������̵� �ؾ��Ѵ�.

	@Override
	public int hashCode() { //�̸��� ���̰� �Ȱ��� ���¶��(���� ���ڿ��̶��) ������ �ڵ尡 ���������.
		// TODO Auto-generated method stub
		return (name + age).hashCode();//"ȫ�浿10".hashCode(); - ��Ʈ��Ÿ��
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Member m = (Member) obj;
		
		boolean result = (this.name == m.name) && (this.age == m.age);
		return result;
	}
}
