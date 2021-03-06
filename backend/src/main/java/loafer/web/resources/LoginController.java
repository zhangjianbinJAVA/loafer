package loafer.web.resources;

import loafer.web.models.UserVM;
import loafer.web.models.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by w on 2017/4/24.
 */
@RestController
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

//    @PreAuthorize("isAuthenticated()")
    @PostMapping("/login")
    public Result login(@RequestBody UserVM formUser) {
        logger.info(formUser.toString());
        return new Result(true, formUser);
    }

    @GetMapping("/hello")
    public String say(){
        return "Hello, World";
    }

    @GetMapping("/api/hello")
    public String loginSay(){
        return "Hello, World";
    }

}
