package com.rushikesh_demo_project_2.insurance_system;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class InsuranceSystemApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testCreatePolicy() {
		Policy policy = new Policy(1, "Rushikesh", "Individual", 10000, "10-Sep-2021", "10-Sep-2022");
		PolicyService pService = new PolicyService();
		// Policy outputPolicy = pService.CreatePolicy();
		assertEquals(policy.getPolicyId(), pService.generateDummyPolicy().getPolicyId());

	}

	@Test
	void testSearchPolicy() {
		PolicyService pService = new PolicyService();
		assertEquals(null, pService.searchPolicy());
	}

}
