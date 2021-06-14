package exam;

public class DataAccessObjectImpl implements DataAccessObject {
	
	@Override
	public void select() {
		// TODO Auto-generated method stub
		System.out.println("DB에서 검색");
	}
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("DB에 삽입");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("DB를 수정");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("DB에서 삭제");
	}

}
