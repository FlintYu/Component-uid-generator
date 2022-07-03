package com.flint.bootdistributedid;

import com.baidu.fsg.uid.UidGenerator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class BootDistributedIdApplicationTests {

	@Resource(name = "cachedUidGenerator")
	private UidGenerator uidGenerator;

	@Test
	void contextLoads() {
		long uid = uidGenerator.getUID();
		System.out.println(uidGenerator.parseUID(uid));
	}

}
