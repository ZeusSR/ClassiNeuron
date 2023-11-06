package in.neuralnet.main;

import in.neuralnet.dao.IInsurancePolicy;
import in.neuralnet.dao.InsurancePolicydao;
import in.neuralnet.util.HibernateUtil;

public class MainApp {

	public static void main(String[] args) {

		IInsurancePolicy dao = null;
		
		dao = new InsurancePolicydao();
		Integer result = dao.transferPremiumPolicies(3);
		System.out.println(result);
		HibernateUtil.closeSessionFactory();
	}
}	