package exam;

public class OracleDao extends DataAccessObjectImpl implements DataAccessObject {
	DataAccessObjectImpl dao = new DataAccessObjectImpl();
	
	@Override
	public void select() {
		// TODO Auto-generated method stub
//		System.out.println("Oracle DB에서 검색");
		dao.select();
	}
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub
//		System.out.println("Oracle DB에 삽입");
		dao.insert();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
//		System.out.println("Oracle DB를 수정");
		dao.update();
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
//		System.out.println("Oracle DB에서 삭제");
		dao.delete();
	}

}
