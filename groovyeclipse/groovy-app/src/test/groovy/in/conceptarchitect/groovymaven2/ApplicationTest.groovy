package io.osnz

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit4.SpringRunner

/**
 * @author Kefeng Deng (deng@51any.com)
 */
@RunWith(SpringRunner)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApplicationTest {

  @Autowired
  TestRestTemplate restTemplate

  @Test
  void shouldReturnCorrectResponseBody() {
    def body = restTemplate.getForObject('/', String)
    Assert.assertEquals('Hello World', body)
  }

 @Test
  public void shouldReturnUpStatus() {
    def body = this.restTemplate.getForObject("/actuator/health", String.class)
    Assert.assertEquals("{\"status\":\"UP\"}", body);
  }

}
