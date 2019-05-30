package com.capgemini.hackathon.search.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.capgemini.hackathon.search.models.StatusRequest;
import com.capgemini.hackathon.search.models.StatusResponse;
import com.capgemini.hackathon.search.models.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/searchapi")
public class SearchController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method = RequestMethod.GET, value = "/search")
    public List<User> search(@RequestParam(value="query", defaultValue="") String query) {
        List<User> userList = new ArrayList();

        User user1 = new User(Long.toString(counter.incrementAndGet()),
                "Sonia");

        User user2 = new User(Long.toString(counter.incrementAndGet()),
                "Anna");
        userList.add(user1);
        userList.add(user2);

        return userList;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user")
    public User user(@RequestParam(value="id", defaultValue="") String id) {
        return new User(id, "Sonia");
    }

    @RequestMapping(method = RequestMethod.POST, value = "/status")
    public StatusResponse user(@RequestBody StatusRequest request) {

        StatusResponse response = new StatusResponse();
        response.setStatusId(Long.toString(counter.incrementAndGet()));
        response.setSuccessful(true);
        return response;
    }
}
