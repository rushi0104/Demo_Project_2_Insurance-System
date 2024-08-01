package com.rushikesh_demo_project_2.insurance_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {

	@Autowired
	PolicyRepository policyRepository;

	public Policy CreatePolicy() {

		Policy policy = generateDummyPolicy();

		return policyRepository.save(policy);

	}

	public Policy updatePolicy() {

		return null;
	}

	public Policy deletePolicy() {

		return null;
	}

	public Policy searchPolicy() {

		return null;
	}

	public Policy generateDummyPolicy() {
		return new Policy(1, "Rushikesh", "Individual", 10000, "10-Sep-2021", "10-Sep-2022");
	}

	public Policy registerPolicy(Policy policy) {
		// TODO Auto-generated method stub
		return policyRepository.save(policy);
	}

	public Policy getPolicyDetails(int policyId) {
		// TODO Auto-generated method stub
		return policyRepository.findById(policyId).get();
	}

}
