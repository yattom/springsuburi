package jp.yattom.sbs.hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
@RequestMapping("/hello")
public class SampleController {

    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}

