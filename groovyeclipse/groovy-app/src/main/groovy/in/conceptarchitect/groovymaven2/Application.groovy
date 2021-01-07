package io.osnz

import lombok.extern.log4j.Log4j2;
import groovy.transform.CompileStatic
import org.springframework.boot.Banner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Kefeng Deng (deng@51any.com)
 */
@SpringBootApplication
@RestController
@CompileStatic
@EnableWebMvc
@Log4j2
class Application {

  static void main(String[] args) {
    SpringApplication app = new SpringApplication(Application)
    app.bannerMode = Banner.Mode.OFF
    app.run(args)
  }

  @GetMapping(path = '/')
  String index() {
    return 'Hello World'
  }

}
