package com.exception1;

public class InstallExceptionTest {

	public static void main(String[] args) {
		try {
			startInstall();
		} catch(SpaceException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("공간을 확보하고 다시 설치해주세요.");
		} catch(MemoryException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("공간을 확보하고 다시 설치해주세요.");
		} finally {
			deleteFile();
		}
		
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) {
			throw new SpaceException("설치공간이 부족합니다.");
		}
		if(!enoughMemory()) {
			throw new MemoryException("설치공간이 부족합니다.");
		}
	}
	
	static boolean enoughSpace() {
		return false;
	}
	
	static boolean enoughMemory() {
		return true;
	}
	
	static void deleteFile() {
		System.out.println("파일이 삭제 되었습니다.");
	}

}
