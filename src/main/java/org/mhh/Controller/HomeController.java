package org.mhh.Controller;

import org.mhh.DTO.UserDTO;
import org.mhh.DTO.UserRespDTO;
import org.mhh.Service.HomeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class HomeController {

    private final HomeService homeService;

    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping("/{name}")
    public ResponseEntity<String> index(@PathVariable String name) {
        return ResponseEntity.ok(homeService.sayHello(name));

    }

    @GetMapping("/error")
    public String error() {
        throw new RuntimeException("This is a demo exception");
    }

    @PostMapping("/hello1")
    public ResponseEntity<String> sayHello_1(@RequestBody UserDTO userDTO) {
        return ResponseEntity.ok(homeService.sayHello(userDTO));

    }

    @PostMapping("/hello2")
    public ResponseEntity<UserRespDTO> sayHello_2(@RequestBody UserDTO userDTO) {
        return ResponseEntity.ok(homeService.sayHello2(userDTO));

    }

}