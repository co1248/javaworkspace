package exam;

public class OracleDao extends DataAccessObjectImpl implements DataAccessObject {
	DataAccessObjectImpl dao = new DataAccessObjectImpl();
	
	@Override
	public void select() {
		// TODO Auto-generated method stub
//		System.out.println("Oracle DB���� �˻�");
		dao.select();
	}
	
	@Override
	public void insert() {
		// TODO Auto-generated method stub
//		System.out.println("Oracle DB�� ����");
		dao.insert();
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
//		System.out.println("Oracle DB�� ����");
		dao.update();
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
//		System.out.println("Oracle DB���� ����");
		dao.delete();
	}

}
