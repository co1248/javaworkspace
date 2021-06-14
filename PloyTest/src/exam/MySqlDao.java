package exam;

public class MySqlDao extends DataAccessObjectImpl implements DataAccessObject {
	DataAccessObjectImpl dao = new DataAccessObjectImpl();
	
	@Override
	public void select() {
		// TODO Auto-generated method stub
//		System.out.println("MySql DB에서 검색");
		dao.select();
	}
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub
//		System.out.println("MySql DB에 삽입");
		dao.insert();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
//		System.out.println("MySql DB를 수정");
		dao.update();
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
//		System.out.println("MySql DB에서 삭제");
		dao.delete();
	}

}
