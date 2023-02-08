package debut;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void test1() {
		System.out.println("test 1");
	}

	@Test
	void test2() {
		System.out.println("test 2");
	}

	void pasUnTest() {
		System.out.println("pas un test");
	}

	@BeforeEach
	void beforeEach() {
		System.out.println("\nbefore each");
	}

	@AfterEach
	void afterEach() {
		System.out.println("after each");
	}

	@BeforeAll
	static void beforeAll() {
		System.out.println("before all");
	}

	@AfterAll
	static void afterAll() {
		System.out.println("after all");
	}

}
