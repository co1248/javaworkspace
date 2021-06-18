package com.exception1;

public class InstallExceptionTest {

	public static void main(String[] args) {
		try {
			startInstall();
		} catch(SpaceException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("������ Ȯ���ϰ� �ٽ� ��ġ���ּ���.");
		} catch(MemoryException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("������ Ȯ���ϰ� �ٽ� ��ġ���ּ���.");
		} finally {
			deleteFile();
		}
		
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) {
			throw new SpaceException("��ġ������ �����մϴ�.");
		}
		if(!enoughMemory()) {
			throw new MemoryException("��ġ������ �����մϴ�.");
		}
	}
	
	static boolean enoughSpace() {
		return false;
	}
	
	static boolean enoughMemory() {
		return true;
	}
	
	static void deleteFile() {
		System.out.println("������ ���� �Ǿ����ϴ�.");
	}

}
