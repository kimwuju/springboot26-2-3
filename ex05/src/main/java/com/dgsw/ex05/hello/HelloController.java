package com.dgsw.ex05.hello;

import com.dgsw.ex05.computer.Computer;
import com.dgsw.ex05.computer.MacBook;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class HelloController {

    @Autowired
    private Computer computer;

    private final MacBook macBook;
    public HelloController(MacBook macBook) {
        this.macBook = macBook;
    }

    @GetMapping("macBook")
    public String macBook() {
        System.out.println("macBook" + macBook);
        return "Hello MacBook!";
    }

    @GetMapping("computer")
    public String computer() {
        computer.turnOn();
        return "computer";
    }

    @GetMapping("api/product")
    @Operation(summary = "상품명과 상품 갯수를 보내주시면 출력합니다", description = "설명")
    public Map<String, Integer> product(
            @Parameter(description = "상품명과 상품 갯수 입력")
            @RequestParam String product,
            @RequestParam int productNum) {
        return Map.of(product, productNum);
    }

    @GetMapping("api/hello")
    @Operation(summary = "이름을 보내시면 인사합니다", description = "설명하고 싶은 거 적는 거")
    public Map<String, Object> hello(
            @Parameter(description = "이름 보내시면 돠는 파라메터", example = "홍길동")
            @RequestParam(defaultValue = "익명") String name) {
        System.out.println("hello, " + name);
        return Map.of("message", "Hello World!");
    }

    @PostMapping("api/data")
    public Map<String, Object> data(@RequestBody Map<String, Object> body) {
        System.out.println("data: " + body);
        return Map.of("message", "api/data");
    }
}
