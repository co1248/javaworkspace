package exam;

public class MySqlDao extends DataAccessObjectImpl implements DataAccessObject {
	DataAccessObjectImpl dao = new DataAccessObjectImpl();
	
	@Override
	public void select() {
		// TODO Auto-generated method stub
//		System.out.println("MySql DB���� �˻�");
		dao.select();
	}
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub
//		System.out.println("MySql DB�� ����");
		dao.insert();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
//		System.out.println("MySql DB�� ����");
		dao.update();
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
//		System.out.println("MySql DB���� ����");
		dao.delete();
	}

}
